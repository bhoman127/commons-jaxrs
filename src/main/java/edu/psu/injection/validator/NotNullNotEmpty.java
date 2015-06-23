package edu.psu.injection.validator;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = NotNullNotEmptyValidator.class)
@Target( { METHOD, FIELD, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface  NotNullNotEmpty 
{
  String message() default "String cannot be null or empty";
	 
  Class<?>[] groups() default {};
  
  Class<? extends Payload>[] payload() default {};
}