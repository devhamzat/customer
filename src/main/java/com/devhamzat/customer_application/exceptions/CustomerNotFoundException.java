package com.devhamzat.customer_application.exceptions;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String error) {

        super(error);
    }
}
