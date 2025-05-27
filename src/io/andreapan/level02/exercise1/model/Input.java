package io.andreapan.level02.exercise1.model;

import io.andreapan.level02.exercise1.exceptions.EmptyInputException;
import io.andreapan.level02.exercise1.exceptions.InputMismatchCharException;
import io.andreapan.level02.exercise1.exceptions.InputMismatchStringException;
import io.andreapan.level02.exercise1.exceptions.InputMismatchYesOrNoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static void scannerClose() {
        scanner.close();
    }


    public static String readNonEmptyLine(String message) throws EmptyInputException {
        System.out.println(message);
        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            throw new EmptyInputException();
        }

        return input;
    }

    public static byte readByte(String message) {
        do {
            try {
                System.out.println(message);
                byte value = scanner.nextByte();
                scanner.nextLine();
                return value;

            } catch (InputMismatchException e) {
                System.out.println("Format error, enter a valid byte value (-128 to 127)");
                scanner.nextLine();
            }
        } while (true);
    }


    public static int readInt(String message) {
        do {
            try {
                System.out.println(message);
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;

            } catch (InputMismatchException e) {
                System.out.println("Format error, enter a valid int value");
                scanner.nextLine();
            }
        } while (true);
    }


    public static float readFloat(String message) {
        do {
            try {
                System.out.println(message);
                float value = scanner.nextFloat();
                scanner.nextLine();
                return value;

            } catch (InputMismatchException e) {
                System.out.println("Format error, enter a valid float value");
                scanner.nextLine();
            }
        } while (true);
    }

    public static double readDouble(String message) {

        do {
            try {
                System.out.println(message);
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;

            } catch (InputMismatchException e) {
                System.out.println("Format error, enter a valid double value");
                scanner.nextLine();
            }
        } while (true);
    }

    public static char readChar(String message) {

        do {
            try {
                String userInput = readNonEmptyLine(message);

                if (userInput.length() != 1) {
                    throw new InputMismatchCharException();
                } else {
                    return userInput.charAt(0);
                }

            } catch (EmptyInputException e) {
                System.out.println("EmptyInput: " + e.getMessage());
            }
            catch (InputMismatchCharException e) {
                System.out.println("InputMismatchChar: " + e.getMessage());

            }
        } while (true);
    }


    public static String readString(String message) {

        do {
            try {
                String userInput = readNonEmptyLine(message);

                if (userInput.trim().length() == 1) {
                    throw new InputMismatchStringException();

                } else {
                    return userInput;
                }

            } catch (EmptyInputException e) {
                System.out.println("EmptyInput: " + e.getMessage());
            } catch (InputMismatchStringException e) {
                System.out.println("InputMismatchString: " + e.getMessage());

            }
        } while (true);

    }


    public static boolean readYesNo(String message) {

        do {
            try {

                char userInput = readChar(message);

                switch (userInput) {
                    case 's', 'S':
                        return true;
                    case 'n', 'N':
                        return false;
                    default:
                        throw new InputMismatchYesOrNoException();
                }

            } catch (InputMismatchYesOrNoException e) {
                System.out.println("InputMismatchYesOrNo: " + e.getMessage());

            }
        } while (true);

    }

}


