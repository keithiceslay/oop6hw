package org.example.module;

public interface Quantity {
    Integer increaseQuantity(int amount);

    Integer decreaseQantity(int amount);

    boolean checkIfPossible(int amount);
}
