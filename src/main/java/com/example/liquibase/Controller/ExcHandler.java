/*
package com.example.liquibase.Controller;

import com.example.liquibase.Exception.ClubException;
import com.example.liquibase.Exception.PlayerException;
import org.springframework.data.web.config.HateoasAwareSpringDataWebConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExcHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ClubException.class)
    public Map<String,String> exception(ClubException clubException){
        Map<String,String> errorHandler = new HashMap<>();
        errorHandler.put("ErrorMessage", clubException.getMessage());
        return errorHandler;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(PlayerException.class)
    public Map<String,String> excepton(PlayerException playerException){
        Map<String,String> exceptionHandler = new HashMap<>();//dto exception
        exceptionHandler.put("ErrorMessage",playerException.getMessage());
        return exceptionHandler;
    }


}
*/
