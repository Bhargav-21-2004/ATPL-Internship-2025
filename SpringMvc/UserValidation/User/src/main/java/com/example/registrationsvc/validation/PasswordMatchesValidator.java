package com.example.registrationsvc.validation;

import com.example.registrationsvc.dto.PasswordMatches;
import com.example.registrationsvc.dto.UserRegistration;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, UserRegistration> {

    @Override
    public boolean isValid(UserRegistration user, ConstraintValidatorContext context) {
        if (user == null) return true; 

        String p = user.getPassword();
        String cp = user.getConfirmPassword();

        boolean matches = (p != null && p.equals(cp));
        if (!matches) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Passwords do not match")
                   .addPropertyNode("confirmPassword")
                   .addConstraintViolation();
        }
        return matches;
    }
}