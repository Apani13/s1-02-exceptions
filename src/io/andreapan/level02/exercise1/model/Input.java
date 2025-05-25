package io.andreapan.level02.exercise1.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    //És important que si en algun mètode salta una excepció,
    // la tractem i tornem a demanar la dada a l’usuari/ària
    // fins que aquesta estigui ben introduïda.
    // Per exemple: Si introdueix un float amb un punt en lloc d'una coma,
    // ha de mostrar “Error de format”.
    // Fins que l’usuari/ària no introdueix un float ben format ha de seguir demanant la dada.
    //

    //Tots els mètodes reben un String amb el missatge que es vol mostrar a l’usuari/ària,
    // per exemple: “Introdueix la teva edat”,
    // i retornen la dada oportuna introduïda per l’usuari/ària en cada mètode,
    // per exemple: un byte amb l’edat de l’usuari/ària.

    public static byte readByte(String message) throws InputMismatchException {

        do {
            System.out.println(message);

            try {
                Byte userByte = scanner.nextByte();
                return userByte;

            } catch (InputMismatchException e) {


                scanner.nextLine();

            }

        } while (true);
    }

    public static int readInt(String message) {

    return 0;
    }

    public static float readFloat(String message) {
    return 0;
    }

    public static double readDouble(String message) {
    return 00.00;
    }


}
