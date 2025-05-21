package io.andreapan.level01.exercise1;

import io.andreapan.level01.exercise1.storeapp.StoreAppController;

public class Main {

    public static void main(String[] args) {

        String message;
        StoreAppController storeAppController = new StoreAppController();

        message = storeAppController.run();

        System.out.println(message);

    }



}
