package org.example.module;

public interface placeOrder {
    void processOrder(Product product, int amount);

    Double calculatePrice(Product product, int amount);
}
