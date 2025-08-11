package org.example;

public class User {
    private String password;

    public User() {
        this.password = "default1";
    }

    public String getPassword() {
        return "*".repeat(this.password.length());
    }

    public void setPassword(String password) {
        System.out.printf("Attempting to set short password '%s'...\n", password);
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Error: Password must be at least 8 characters long.");
        }
    }
}