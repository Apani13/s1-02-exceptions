package io.andreapan.level02.exercise1.exceptions;

public class InputMismatchYesOrNoException extends Exception{
    public InputMismatchYesOrNoException() {
        super("You must enter the values 's' or 'n' ");
    }
}
