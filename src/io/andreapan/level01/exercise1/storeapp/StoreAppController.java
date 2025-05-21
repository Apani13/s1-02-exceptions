package io.andreapan.level01.exercise1.storeapp;

import io.andreapan.level01.exercise1.data.ProductsData;
import io.andreapan.level01.exercise1.model.Sale;

public class StoreAppController {

    public String run() {

        String message = "";
        Sale sale = new Sale();

        StoreService storeService = new StoreService(sale);
        ProductsData productsData = new ProductsData();

        message = "TESTING EXCEPTIONS BEFORE PRODUCTS ARE ADDED TO ARRAY\n\n"
                + storeService.checkEmptyArray() + "\n"
                + storeService.checkIndexOutOfBounds(3) + "\n\n";

        message += "loading products to array..." + "\n\n";

        productsData.CreateAndLoadProducts(sale);

        message += "TESTING EXCEPTIONS AFTER PRODUCTS ARE ADDED TO ARRAY\n\n"
                + storeService.checkEmptyArray() + "\n"
                + storeService.checkIndexOutOfBounds(3);


        return message;
    }
}
