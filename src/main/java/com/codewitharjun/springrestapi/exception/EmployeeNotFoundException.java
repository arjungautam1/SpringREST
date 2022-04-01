package com.codewitharjun.springrestapi.exception;
/* Created by Arjun Gautam */

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find employee "+id);
    }
}
