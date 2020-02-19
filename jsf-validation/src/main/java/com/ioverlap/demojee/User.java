package com.ioverlap.demojee;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Named
@RequestScoped
public class User {
    
    @NotNull(message = "username cannot be null")
    private String username;
    
    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$", message = "Email should be valid")
    private String email;
    
    @NotNull
    @Min(value = 0, message = "Grade should not be less than 0")
    @Max(value = 100, message = "Grade should not be greater than 100")
    private Double grade;
    
    @NotNull(message = "Password cannot be null")
    @Size(min = 6, max = 16)
    private String password;

    public User() {
    }

    public User(String username, String email, Double grade, String password) {
        this.username = username;
        this.email = email;
        this.grade = grade;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", email=" + email + ", grade=" + grade + ", password=" + password + '}';
    }
    
}
