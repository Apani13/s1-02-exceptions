package io.andreapan.level02.exercise1.app;

import io.andreapan.level02.exercise1.model.Input;

public class AppController {

    public void run() {

        byte userAge;
        int earthMeasure;
        float userDivisionAnswer;
        double decimalNumber;

        String userString;
        char userChar;
        Boolean yesOrNo;

        userAge = Input.readByte("How old are you?");

        System.out.println("USER IS " + userAge + " YEARS OLD");

        earthMeasure = Input.readInt("How big is the earth?");
        System.out.println("USER SAYS EARTH IS " + earthMeasure + " KM²");

        userDivisionAnswer = Input.readFloat("how much is 5 divided by 2?");
        System.out.println("USER SAYS THAT 5 / 2 EQUALS " + userDivisionAnswer);

        decimalNumber = Input.readDouble("Enter a number with a repeating decimal");
        System.out.println("USER NUMBER CHOICE IS " + decimalNumber);

        userString = Input.readString("Enter a String");
        System.out.println("USER STRING CHOICE: " + userString);

        userChar = Input.readChar("Enter a char: ");
        System.out.println("USER CHAR CHOICE: " + userChar);

        yesOrNo = Input.readYesNo("Do you want to go to the movies?");
        System.out.println("USER ANSWER: " + yesOrNo);

    }

}
