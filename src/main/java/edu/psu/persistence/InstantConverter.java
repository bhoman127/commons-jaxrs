package edu.psu.persistence;

import java.time.Instant;
import java.util.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class InstantConverter implements AttributeConverter<Instant, Date> {

	@Override
	public Date convertToDatabaseColumn(Instant attribute) {
		if (attribute == null) {
			return null;
		}
	    return Date.from(attribute);
	}

	@Override
	public Instant convertToEntityAttribute(Date dbData) {
		if (dbData == null) {
			return null;
		}
	    return dbData.toInstant();
	}

}