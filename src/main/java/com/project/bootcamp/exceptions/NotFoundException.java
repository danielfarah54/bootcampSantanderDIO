package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    private String message;

    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }

}