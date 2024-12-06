package org.example;
import java.util.*;
public class Category {
    private String name;
    private String description;
    private List<Product> products;
    private static List<Category> categories;
    private static int UniqueProductCount = 0;
    private static List<Category> totalCategories;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        this.products.add(product);
        UniqueProductCount++;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public static int getTotalCategories() {
        return categories.size();
    }


    public static int getTotalUniqueProductCount() {
        return UniqueProductCount;
    }
}