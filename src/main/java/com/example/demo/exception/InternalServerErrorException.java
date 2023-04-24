package com.example.demo.exception;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InternalServerErrorException extends RuntimeException {
    public InternalServerErrorException(String msg)
    {
        super(msg);
    }
};
