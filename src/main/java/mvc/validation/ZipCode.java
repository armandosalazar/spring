package mvc.validation;

import jakarta.validation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ZipCodeValidator.class) // class that implements the validation logic
@Target({ElementType.METHOD, ElementType.FIELD}) // can be used on method and field
@Retention(RetentionPolicy.RUNTIME) // make this annotation accessible at runtime via reflection
public @interface ZipCode {
    // define default value for zip code
    String value() default "49";
    // define default error message
    String message() default "Invalid zip code beginning with 49";
    // define default groups
    Class<?>[] groups() default {};
    // define default payloads
    Class<?>[] payload() default {};
}
