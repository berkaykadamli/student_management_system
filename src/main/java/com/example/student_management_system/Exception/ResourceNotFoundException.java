package com.example.student_management_system.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * Created by Berkay KADAMLI
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
    private static final long SerialVersionUID=1L;

    public ResourceNotFoundException(String s) {
        super(s);
    }
}
