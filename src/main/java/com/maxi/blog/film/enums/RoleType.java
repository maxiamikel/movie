package com.maxi.blog.film.enums;

public enum RoleType {
    
    ADMIN("Admin"),
    USET("User");

    private String role;

    private RoleType(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
