package io.andreapan.level01.exercise1.storeapp;

import io.andreapan.level01.exercise1.exceptions.EmptySaleException;
import io.andreapan.level01.exercise1.model.Sale;

public class StoreService {

    private final Sale sale;

    public StoreService(Sale sale) {
        this.sale = sale;
    }

    public String checkEmptyArray() {
        String message = "";

        try {
            sale.calculateTotalPrice();

        } catch (EmptySaleException e) {

            message = "Empty Sale Exception: " + e.getMessage();

        }

        return message;
    }

    public String checkIndexOutOfBounds(int index) {

        String message = "";

        try {
            sale.getProducts().get(index);
        } catch (IndexOutOfBoundsException e) {

            message = "Index out of bounds exception: " + e.getMessage();
        }

        return message;
    }



}
