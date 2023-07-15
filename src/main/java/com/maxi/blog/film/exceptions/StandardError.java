package com.maxi.blog.film.exceptions;

public class StandardError {
    
    private Integer status;
    private Long moment;
    private String message;
    public StandardError() {
    }
    public StandardError(Integer status, Long moment, String message) {
        this.status = status;
        this.moment = moment;
        this.message = message;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Long getMoment() {
        return moment;
    }
    public void setMoment(Long moment) {
        this.moment = moment;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    

}
