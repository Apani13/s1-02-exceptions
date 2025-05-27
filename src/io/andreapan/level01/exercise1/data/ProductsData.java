package io.andreapan.level01.exercise1.data;

import io.andreapan.level01.exercise1.model.Product;
import io.andreapan.level01.exercise1.model.Sale;

public class ProductsData {

    public void createAndLoadProducts(Sale sale) {

        sale.addProduct( new Product("Chicken", 4.99) );
        sale.addProduct( new Product("Apple", 0.45) );
        sale.addProduct( new Product("Orange Juice", 3.95) );
        sale.addProduct( new Product("Banana", 0.57) );
        sale.addProduct( new Product("Chocolate", 3.49) );

    }


}
