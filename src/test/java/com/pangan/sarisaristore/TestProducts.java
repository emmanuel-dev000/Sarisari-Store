package com.pangan.sarisaristore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestProducts {

	@Test
	public void whenGetIsCalled_shouldReturnEquals() {
		var productServiceMySql = new ProductServiceMySql();
		var result = productServiceMySql.getAllProducts();
		assertNotEquals(0, result);
	}

}
