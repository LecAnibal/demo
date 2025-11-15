package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	void pruebaMatematicaBasica() {
		int numeroA = 2;
		int numeroB = 3;
		int suma = numeroA + numeroB;

		// Esperamos que la suma sea 5.
		// Estructura: assertEquals(valorEsperado, valorReal);
		assertEquals(5, suma, "La suma de 2 + 3 debería ser 5");
	}

}
