package org.iesalandalus.programacion.modelo.dominio;
/*
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.iesalandalus.programacion.gestionusuarios.modelo.dominio.Particular;
import org.junit.Test;
*/
public class ParticularTest {
/*	
	private static final String NOMBRE = "Pepe";
	private static final String IDENTIFICADOR = "pepe";
	private static final String PASSWORD = "p3p3";
	private static final String DNI = "11223344A";
	
	private static final String ERROR_EXCEPCION = "Debería haber saltado la excepción.";

	@Test
	public void constructorValidoTest() {
		Particular particular = new Particular(NOMBRE, IDENTIFICADOR, PASSWORD, DNI);
		assertEquals(NOMBRE, particular.getNombre());
		assertEquals(IDENTIFICADOR, particular.getIdentificador());
		assertEquals(PASSWORD, particular.getPassword());
		assertEquals(DNI, particular.getDni());
		assertEquals("Particular [nombre=Pepe, identificador=pepe, dni=11223344A]", particular.toString());
	}
	
	public void constructorNombreNoValidoTest() {
		Particular particular = null;
		try {
			particular = new Particular(null, IDENTIFICADOR, PASSWORD, DNI);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(particular);
			assertEquals("El nombre de un usuario no puede ser nulo.", e.getMessage());
		}
		try {
			particular = new Particular("", IDENTIFICADOR, PASSWORD, DNI);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(particular);
			assertEquals("El nombre de un usuario no puede estar vacío.", e.getMessage());
		}
		try {
			particular = new Particular("   ", IDENTIFICADOR, PASSWORD, DNI);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(particular);
			assertEquals("El nombre de un usuario no puede estar vacío.", e.getMessage());
		}
	}
	
	@Test
	public void constructorIdentificadorNoValidoTest() {
		Particular particular = null;
		try {
			particular = new Particular(NOMBRE, null, PASSWORD, DNI);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(particular);
			assertEquals("El identificador de un usuario no puede ser nulo.", e.getMessage());
		}
		try {
			particular = new Particular(NOMBRE, "", PASSWORD, DNI);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(particular);
			assertEquals("El identificador de un usuario no puede estar vacío.", e.getMessage());
		}
		try {
			particular = new Particular(NOMBRE, "   ", PASSWORD, DNI);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(particular);
			assertEquals("El identificador de un usuario no puede estar vacío.", e.getMessage());
		}
	}
	
	@Test
	public void constructorPasswordNoValidoTest() {
		Particular particular = null;
		try {
			particular = new Particular(NOMBRE, IDENTIFICADOR, null, DNI);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(particular);
			assertEquals("El password de un usuario no puede ser nulo.", e.getMessage());
		}
		try {
			particular = new Particular(NOMBRE, IDENTIFICADOR, "", DNI);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(particular);
			assertEquals("El password de un usuario no puede estar vacío.", e.getMessage());
		}
		try {
			particular = new Particular(NOMBRE, IDENTIFICADOR, "    ", DNI);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(particular);
			assertEquals("El password de un usuario no puede estar vacío.", e.getMessage());
		}
	}
	
	@Test
	public void constructorDniNoValidoTest() {
		Particular particular = null;
		try {
			particular = new Particular(NOMBRE, IDENTIFICADOR, PASSWORD, null);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(particular);
			assertEquals("El DNI de un particular no puede ser nulo.", e.getMessage());
		}
		try {
			particular = new Particular(NOMBRE, IDENTIFICADOR, PASSWORD, "");
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(particular);
			assertEquals("El formato del DNI no es correcto.", e.getMessage());
		}
		try {
			particular = new Particular(NOMBRE, IDENTIFICADOR, PASSWORD, "1234A");
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(particular);
			assertEquals("El formato del DNI no es correcto.", e.getMessage());
		}
	}
	
	@Test
	public void constructorCopiaTest() {
		Particular particular1 = new Particular(NOMBRE, IDENTIFICADOR, PASSWORD, DNI);
		Particular particular2 = new Particular(particular1);
		assertEquals(NOMBRE, particular2.getNombre());
		assertEquals(IDENTIFICADOR, particular2.getIdentificador());
		assertEquals(PASSWORD, particular2.getPassword());
		assertEquals(DNI, particular2.getDni());
		assertFalse(particular1 == particular2);
	}
	
	@Test
	public void constructoCopiaNoValidoTest() {
		Particular particular = null;
		try {
			particular = new Particular(null);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(particular);
			assertEquals("No puedo copiar un usuario nulo.", e.getMessage());
		}
	}
	
	@Test
	public void hashCodeEqualsTest() {
		Particular particular1 = new Particular(NOMBRE, IDENTIFICADOR, PASSWORD, DNI);
		Particular particular2 = new Particular(NOMBRE, IDENTIFICADOR, PASSWORD, DNI);
		Particular particular3 = new Particular(NOMBRE, "pepepe", PASSWORD, DNI);
		assertEquals(particular1, particular2);
		assertEquals(particular1.hashCode(), particular2.hashCode());
		assertNotEquals(particular1, particular3);
		assertNotEquals(particular1.hashCode(), particular3.hashCode());
	}
*/
}
