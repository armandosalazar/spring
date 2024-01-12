package mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ZipCodeValidator implements ConstraintValidator<ZipCode, String> {
    private String zipCodePrefix;

    @Override
    public void initialize(ZipCode constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        zipCodePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s != null) {
            return s.startsWith(zipCodePrefix);
        }
        return false;
    }
}
