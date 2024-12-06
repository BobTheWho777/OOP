package org.example;

import junit.framework.TestCase;
import org.junit.*;

public class CategoryTest {
    private Category category;
    private Product product;

    @Before
    public void setUp(){
        Product product = new Product("Планшет", "test", 1000, 1);
        category = new Category("Электроника", "Различные электронные устройства");

    }

    @Test
    public void testInit() {
        Category category = new Category("Электроника", "Различные электронные устройства");
        Assert.assertEquals("Электроника", category.getName());
        Assert.assertEquals("Различные электронные устройства", category.getDescription());

    }

    @Test
    public void getTotalUniqueProductCount() {
        category.addProduct(product);
        Assert.assertEquals(1, category.getTotalUniqueProductCount());
    }

    @Test
    public void getTotalCategoryCount() {
        Category category = new Category("Мебель", "Всякая мебель");
        Assert.assertEquals(2, category.getTotalCategoryCount());
    }
}