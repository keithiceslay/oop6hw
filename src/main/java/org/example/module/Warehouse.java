package org.example.module;

import org.example.module.Product;
import org.example.module.Quantity;
import org.example.module.controlProduct;
import org.example.module.existingProduct;
import static org.example.module.BaseProductList.productList;

public class Warehouse implements controlProduct, existingProduct {
    @Override
    public boolean checkForProduct(String product) {
        Product checkProd = new Product();
        checkProd = findProduct(product);
        if (checkProd == null)
            return false;
        else return true;
    }

    @Override
    public Product findProduct(String product) {
        for (Product prod: productList)
            if (product.equals(prod.getName()))
                return prod;
        return null;
    }

    @Override
    public void deleteProduct(Product product) {
        if (checkForProduct(product.getName()))
            productList.remove(product);
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }


}
