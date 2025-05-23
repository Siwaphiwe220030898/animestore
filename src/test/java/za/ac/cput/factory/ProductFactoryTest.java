package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductFactoryTest {
    @Test
    void testCreateProduct() {
        Product product = ProductFactory.createProduct("P001", "Manga Book", 199.99, 50);
        assertNotNull(product);
        assertEquals("P001", product.getProductId());
        assertEquals("Manga Book", product.getName());
        assertEquals(199.99, product.getPrice());
        assertEquals(50, product.getStock());
    }
}
