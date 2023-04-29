package org.example.module;

import static org.example.module.BaseProductList.productList;
import static org.example.module.Product.changeQuantity;

public class Order implements placeOrder{

    Warehouse warehouse = new Warehouse();

    @Override
    public void processOrder(Product product, int amount) {
        if (warehouse.checkForProduct(product.getName())) {
            changeQuantity(product.decreaseQantity(amount), product);
            Double price = calculatePrice(product, amount);
            System.out.println("Ваш заказ рассмотрен");
            System.out.println("Стоимость: " + price);
        }
        else
            System.out.println("Ваш заказ невозможно рассмотреть");
    }

    @Override
    public Double calculatePrice(Product product, int amount) {
        Double price = product.getPrice() * amount;
        return price;
    }


}
