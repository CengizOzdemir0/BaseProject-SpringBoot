package com.cengiz.baseproject.base.util.annotation;


import com.cengiz.baseproject.base.util.ValidationUtil;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;



public class TcNoValidator implements ConstraintValidator<TcNo, Long> {

  @Override
  public boolean isValid(Long value, ConstraintValidatorContext context) {

    if (value == null) {
      return true;
    }

    return ValidationUtil.tcNoValidation(value);
  }


}
