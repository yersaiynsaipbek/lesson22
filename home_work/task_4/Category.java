package Lessons.lesson_22.home_work.task_4;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Product findExpensiveProduct() {
        if (products.isEmpty()) {
            return null;
        }

        Product expensiveProduct = products.get(0);
        for (Product product : products) {
            if (product.getPrice() > expensiveProduct.getPrice()) {
                expensiveProduct = product;
            }
        }
        return expensiveProduct;
    }
}