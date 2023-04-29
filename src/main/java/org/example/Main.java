package org.example;

import org.example.module.Order;
import org.example.module.Product;
import org.example.module.User;
import org.example.module.Warehouse;

import static org.example.module.BaseProductList.printProductList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(new Warehouse(), new Order());
        user1.getWarehouse().addProduct(new Product("Soap", 200, 3.40));
        user1.getWarehouse().addProduct(new Product("Brush", 10, 10.50));
        user1.getWarehouse().addProduct(new Product("Paint", 20, 50.00));
        printProductList();
        Product prod1 = new Product("Soap", 200, 3.40);
        user1.getOrder().processOrder(prod1, 50);
        printProductList();
        user1.getWarehouse().deleteProduct(prod1);
        printProductList();
    }
}