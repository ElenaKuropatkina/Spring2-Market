package com.elenakuropatkina.adminui.exeptions;

public class NotFoundProductException extends RuntimeException {
    public NotFoundProductException(String message) {
        super(message);
    }
}
