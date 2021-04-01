package com.example.demo.controller.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class CustomExceptionAdvice {
    //@ResponseBody
    @ExceptionHandler(CustomExeption.class)
  //  @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> customExceptionHandler(CustomExeption ex) {
        return new ResponseEntity<>(ex.getMessage(),ex.httpStatus) ;
    }

}
