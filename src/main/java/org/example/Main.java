package org.example;
import java.util.*;



public class Main {
    public static void main(String[] args) {

        List<Category> categories = new ArrayList<>();
        int categoryCount;

        Category category1 = new Category("Электроника", "Различные электронные устройства");
        Category category2 = new Category("Одежда", "Мужская и женская одежда");

        categories.add(category1);
        categories.add(category2);

        Product product1 = new Product("Смартфон", "Современный смартфон", 799.99, 10);
        Product product2 = new Product("Наушники", "Беспроводные наушники", 49.99, 25);
        Product product3 = new Product("Рубашка", "Мужская рубашка", 29.99, 50);
        Product product4 = new Product("Платье", "Женское платье", 59.99, 30);


//        categories.get(0).addProduct(product1);
//        categories.get(0).addProduct(product2);
//        categories.get(1).addProduct(product3);
//        categories.get(1).addProduct(product4);
//        categoryCount = categories.size();

        category1.addProduct(product1);
        category1.addProduct(product2);
        category1


        System.out.println("Общее количество категорий: " + categories.size());
        System.out.println("Общее количество уникальных продуктов: " + Category.getTotalUniqueProductCount());

        System.out.println("Товары в категории 1: " + categories.get(0).getProducts());
    }
}