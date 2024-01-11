package mvc.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {
    @NotNull(message = "is required")
    @Size(min = 2, message = "must be at least 2 characters")
    private String firstName;
    private String lastName;
    private String optional;
    private String country;
    private String language;

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
}
