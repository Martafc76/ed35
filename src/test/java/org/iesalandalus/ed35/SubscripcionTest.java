package org.iesalandalus.ed35;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class SubscripcionTest {
	@Test
	public void testprecioPorMes() {
		double esperado = 100;
		Subscripcion s = new Subscripcion(200, 2);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}

	@Test
	public void testprecioPorMes2() {
		double esperado = 67;
		Subscripcion s = new Subscripcion(200, 3);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}
	@Test
	public void testprecio0() {
		double esperado =0;
		Subscripcion s = new Subscripcion(0, 3);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}
	@Test
	public void testprecioPeriodo0() {
		double esperado = 0;
		Subscripcion s = new Subscripcion(200, 0);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}
}