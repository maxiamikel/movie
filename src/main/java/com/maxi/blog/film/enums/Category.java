package com.maxi.blog.film.enums;

public enum Category {
    
    TERROR("Terror"),
    ACTION("Action"),
    ROMANTIC("Romantic");

    private String category;

    private Category(String category){
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    
}
