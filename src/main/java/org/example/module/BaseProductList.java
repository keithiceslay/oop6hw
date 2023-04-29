package org.example.module;

import java.util.ArrayList;
import java.util.List;

public class BaseProductList {
    static List<Product> productList = new ArrayList<>();

    public static void printProductList() {
        for (Product prod: productList)
            System.out.println(prod.toString());
        System.out.println();
    }

}
