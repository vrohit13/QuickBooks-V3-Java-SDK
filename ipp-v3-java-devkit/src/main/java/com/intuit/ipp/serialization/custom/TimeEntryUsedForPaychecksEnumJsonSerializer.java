package com.intuit.ipp.serialization.custom;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import com.intuit.ipp.data.TimeEntryUsedForPaychecksEnum;

/**
 * Custom JsonSerializer for reading TimeEntryUsedForPaychecksEnum values
 * 
 */
public class TimeEntryUsedForPaychecksEnumJsonSerializer extends JsonSerializer<TimeEntryUsedForPaychecksEnum> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void serialize(TimeEntryUsedForPaychecksEnum value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
		jgen.writeString(value.value());
	}

}
