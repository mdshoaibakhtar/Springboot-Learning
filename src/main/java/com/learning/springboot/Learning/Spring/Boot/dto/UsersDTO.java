package com.learning.springboot.Learning.Spring.Boot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersDTO {
    private String username;
    private String password;
    private String email;
    private boolean isActive;

/*
    # We will use Lombok dependency to avoid all this steps
    public UsersDTO(String username, String password, String email, boolean isActive) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.isActive = isActive;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return isActive;
    }
 */
}
