package com.example.vegefoods.exceptions;

public class ApiException extends RuntimeException{
    public ApiException(String message){
        super(message);
    }
    public ApiException(){
        super();
    }
}
