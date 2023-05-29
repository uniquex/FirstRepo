package com.example.liquibase.Service2;

public class TaxiNotFoundException extends RuntimeException{
    public TaxiNotFoundException(String message) {
        super(message);
    }
}
