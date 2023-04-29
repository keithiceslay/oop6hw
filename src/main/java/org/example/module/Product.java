package org.example.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static org.example.module.BaseProductList.productList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Quantity {
    String name;
    Integer quantity;
    Double price;

    @Override
    public Integer increaseQuantity(int amount) {
        if (checkIfPossible(amount)) {
            this.quantity = this.quantity + amount;
            return this.quantity;
        }
        else System.out.println("Невозможо добавить отрицательное значение");
        return null;
    }

    @Override
    public Integer decreaseQantity(int amount) {
        if (checkIfPossible(amount)) {
            if (this.quantity > amount) {
                this.quantity = this.quantity - amount;
                return this.quantity;
            }
            else {
                amount = (quantity - amount) * -1;
                System.out.printf("Не хватает %f штук продукта", amount);
            }
        }
        else System.out.println("Невозможно вычесть отрицательное значеине");
        return null;
    }

    @Override
    public boolean checkIfPossible(int amount) {
        if (amount > 0)
            return true;
        return false;
    }

    public boolean prodEquals(Product product) {
        if (product.getName().equals(this.getName()))
            if (product.getPrice().equals(this.getPrice()))
                return true;
        return false;
    }

    protected static void changeQuantity(Integer amount, Product product) {
        for (Product prod: productList) {
            if (prod.prodEquals(product))
                prod.setQuantity(amount);
        }
    }
}
