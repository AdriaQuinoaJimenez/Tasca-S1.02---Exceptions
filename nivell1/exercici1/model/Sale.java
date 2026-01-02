package exercici1.model;

import exercici1.exceptions.EmptySaleException;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private double totalPrice;
    private List<Product> products;

    public Sale() {
        this.totalPrice = 0;
        this.products = new ArrayList<>();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void calculateTotal(){
        if (products.isEmpty()) {
            throw new EmptySaleException("Per fer una venda primer has d’afegir productes");
        }

        totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }
}
