package io.andreapan.level02.exercise1.exceptions;

public class InputMismatchStringException extends Exception{
    public InputMismatchStringException() {
        super("You must enter a String");
    }
}
