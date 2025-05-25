package io.andreapan.level02.exercise1.exceptions;

public class InputMismatchYesOrNo extends Exception{
    public InputMismatchYesOrNo() {
        super("You must enter the values 's' or 'n' ");
    }
}
