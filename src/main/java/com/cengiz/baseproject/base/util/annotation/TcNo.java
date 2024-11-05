package com.cengiz.baseproject.base.util.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = TcNoValidator.class)
public @interface TcNo {

  String message() default "VLD_TCNO";

  Field label() default Field.TC_KIMLIK_NO;

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
