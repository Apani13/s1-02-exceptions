package io.andreapan.level02.exercise1.exceptions;

public class InputMismatchCharException extends Exception {
    public InputMismatchCharException() {
        super("You must enter a char");
    }
}
