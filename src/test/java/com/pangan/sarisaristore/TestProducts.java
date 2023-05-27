package com.pangan.sarisaristore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestProducts {

	@Test
	public void whenGetIsCalled_shouldReturnEquals() {
		var productController = new ProductController();
		var result = productController.getAllProducts();
		var expected = "Products";
		assertEquals(expected, result);
	}

}
