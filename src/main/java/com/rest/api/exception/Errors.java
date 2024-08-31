package com.rest.api.exception;

import lombok.Data;

@Data
public class Errors {

    private int code;
    private String source;
    private String description;

}
