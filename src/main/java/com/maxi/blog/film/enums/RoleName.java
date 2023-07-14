package com.maxi.blog.film.enums;

public enum RoleName {
    
    ADMIN("Admin"),
    USET("User");

    private String roleName;

    private RoleName(String roleName){
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
