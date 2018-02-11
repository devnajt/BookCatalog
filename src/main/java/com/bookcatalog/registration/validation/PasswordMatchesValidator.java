package com.bookcatalog.registration.validation;

import com.bookcatalog.registration.model.UserRegistrationDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator
        implements ConstraintValidator<PasswordMatches, UserRegistrationDto> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }

    @Override
    public boolean isValid(UserRegistrationDto userRegistrationDto, ConstraintValidatorContext context) {
        return userRegistrationDto.getPassword().equals(userRegistrationDto.getConfirmPassword());
    }
}