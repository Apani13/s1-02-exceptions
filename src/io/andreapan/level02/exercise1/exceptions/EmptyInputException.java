package io.andreapan.level02.exercise1.exceptions;

public class EmptyInputException extends Exception {
    public EmptyInputException() {
        super("You must not leave the input blank");
    }
}
