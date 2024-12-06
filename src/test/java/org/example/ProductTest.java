package org.example;

import junit.framework.TestCase;
import org.junit.*;

public class ProductTest extends TestCase {

    @Test
    public void testProduct() {

        Product product = new Product();
        product.setName("test");
        product.setPrice(100);
        assertEquals("test", product.getName());
        assertEquals(100, product.getPrice());
    }
}