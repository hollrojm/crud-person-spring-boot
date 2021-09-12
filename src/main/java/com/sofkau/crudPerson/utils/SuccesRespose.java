package com.sofkau.crudPerson.utils;


import java.util.Date;

public final class SuccesRespose {

    private int status;
    private String message;
    private Date timestamp;

    public SuccesRespose(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
