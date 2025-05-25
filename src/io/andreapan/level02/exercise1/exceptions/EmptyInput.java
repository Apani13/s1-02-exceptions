package io.andreapan.level02.exercise1.exceptions;

public class EmptyInput extends Exception {
    public EmptyInput() {
        super("You must not leave the input blank");
    }
}
