package org.example.exception;

public class NotEnoughException extends RuntimeException {

    //自定义的运行时异常
    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}

