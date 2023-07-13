package com.maxi.blog.film.enums;

public enum Gender {

    MALE("Male"),
    FEMELE("Femele");

    private String sex;

    private Gender(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

}
