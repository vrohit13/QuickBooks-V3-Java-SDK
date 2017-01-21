package com.intuit.ipp.compression;

import com.intuit.ipp.exception.CompressionException;
import com.intuit.ipp.util.StringUtils;

/**
 * Factory class to get the corresponding CompressionFactory/Compressor class for the given compress format.
 *
 */
public final class CompressorFactory {

	/**
	 * variable GZIP_COMPRESS_FORMAT
	 */
	public static final String GZIP_COMPRESS_FORMAT = "gzip";
	
	/**
	 * variable DEFLATE_COMPRESS_FORMAT
	 */
	public static final String DEFLATE_COMPRESS_FORMAT = "deflate";
	
	/**
	 * Constructor to have private modifier as it has only static methods
	 */
	private CompressorFactory() {
	}

	/**
	 * Method to get the CompressorFactory instance
	 * 
	 * @return CompressorFactory
	 */
	public static CompressorFactory getInstance() {
		return new CompressorFactory();
	}
	
	/**
	 * Method to get the corresponding compressor class for the given compress format
	 * 
	 * @param compressFormat the format of the compressor to decide the compressor 
	 * @return ICompressor
	 * @throws CompressionException the compression exception
	 */
	public static ICompressor getCompressor(final String compressFormat) throws CompressionException {
		
		ICompressor compressor = null;
		if (isValidCompressFormat(compressFormat)) {
			if (compressFormat.equalsIgnoreCase(GZIP_COMPRESS_FORMAT)) {
				compressor = new GZIPCompressor();
			} else if (compressFormat.equalsIgnoreCase(DEFLATE_COMPRESS_FORMAT)) {
				compressor = new DeflateCompressor();
			}
		}
		return compressor;
	}
	
	/**
	 * Method to validate whether the given compression format is valid
	 * 
	 * @param compressFormat the compress format
	 * @return returns boolean
	 * @throws CompressionException the compression exception
	 */
	public static boolean isValidCompressFormat(final String compressFormat) throws CompressionException {
		if (!StringUtils.hasText(compressFormat)) {
			throw new CompressionException("Compress format is either null or empty!");
		} else if (compressFormat.equalsIgnoreCase(GZIP_COMPRESS_FORMAT) || compressFormat.equalsIgnoreCase(DEFLATE_COMPRESS_FORMAT)) {
			return true;
		} else {
			throw new CompressionException("There is no compression technique for the given compress format : " + compressFormat);
		}
	}
}
