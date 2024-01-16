package mvc.entity;

import jakarta.validation.constraints.*;
import mvc.validation.ZipCode;

public class Student {
    @NotNull(message = "not can be null")
    @Size(min = 2, message = "must be at least 2 characters")
    private String firstName;
    private String lastName;
    private String optional;
    private String country;
    private String language;
    @Min(value = 18, message = "must be greater than or equal to 18")
    @Max(value = 60, message = "must be less than or equal to 60")
    private int age;
    @Email(message = "must be a valid email address")
    private String email;
    // @Pattern(regexp = "^[0-9]{5}", message = "must be 5 digits")
    @ZipCode
    private String zipCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
