package com.devhamzat.customer_application.exceptions;

public class ApplicationError {

    private int code;
    private String message;
    private String details;



    public void setDetails(String details) {
        this.details = details;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }


}
