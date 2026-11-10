package tests;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.CuentaBancaria;


public class CuentaBancariaTest {
	private CuentaBancaria cuenta;
	
	@BeforeEach
	public void setUp() {
		this.cuenta = new CuentaBancaria(500000);
	}
	
	@Test
	public void depositTest() throws Exception{
		this.cuenta.depositar(200000);
		assertEquals(700000, this.cuenta.getSaldo());
	}
	
	@Test
	public void negativeDepositTest() throws Exception{
		
		Exception excepcion = assertThrows(
				Exception.class,
				() -> this.cuenta.depositar(-100)
				);

		assertEquals("Monto invalido", excepcion.getMessage());

	}
	
	@Test
	public void retirarInvalido() throws Exception{
		
		Exception excepcion = assertThrows(
				Exception.class,
				() -> this.cuenta.retirar(600000)
				);

		assertEquals("Fondos insuficientes", excepcion.getMessage());
		assertEquals(500000, this.cuenta.getSaldo());

	}
	
	
	
	

}
