package org.iesalandalus.programacion.modelo.dominio;
/*
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.iesalandalus.programacion.gestionusuarios.modelo.dominio.Administrador;
import org.junit.Test;
*/
public class AdministradorTest {
/*	
	private static final String NOMBRE = "Pepe";
	private static final String IDENTIFICADOR = "pepe";
	private static final String PASSWORD = "p3p3";
	
	private static final String ERROR_EXCEPCION = "Debería haber saltado la excepción.";

	@Test
	public void constructorValidoTest() {
		Administrador administrador = new Administrador(NOMBRE, IDENTIFICADOR, PASSWORD);
		assertEquals(NOMBRE, administrador.getNombre());
		assertEquals(IDENTIFICADOR, administrador.getIdentificador());
		assertEquals(PASSWORD, administrador.getPassword());
		assertEquals("Administrador [nombre=Pepe, identificador=pepe]", administrador.toString());
	}
	
	public void constructorNombreNoValidoTest() {
		Administrador administrador = null;
		try {
			administrador = new Administrador(null, IDENTIFICADOR, PASSWORD);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(administrador);
			assertEquals("El nombre de un usuario no puede ser nulo.", e.getMessage());
		}
		try {
			administrador = new Administrador("", IDENTIFICADOR, PASSWORD);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(administrador);
			assertEquals("El nombre de un usuario no puede estar vacío.", e.getMessage());
		}
		try {
			administrador = new Administrador("   ", IDENTIFICADOR, PASSWORD);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(administrador);
			assertEquals("El nombre de un usuario no puede estar vacío.", e.getMessage());
		}
	}
	
	@Test
	public void constructorIdentificadorNoValidoTest() {
		Administrador administrador = null;
		try {
			administrador = new Administrador(NOMBRE, null, PASSWORD);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(administrador);
			assertEquals("El identificador de un usuario no puede ser nulo.", e.getMessage());
		}
		try {
			administrador = new Administrador(NOMBRE, "", PASSWORD);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(administrador);
			assertEquals("El identificador de un usuario no puede estar vacío.", e.getMessage());
		}
		try {
			administrador = new Administrador(NOMBRE, "   ", PASSWORD);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(administrador);
			assertEquals("El identificador de un usuario no puede estar vacío.", e.getMessage());
		}
	}
	
	@Test
	public void constructorPasswordNoValidoTest() {
		Administrador administrador = null;
		try {
			administrador = new Administrador(NOMBRE, IDENTIFICADOR, null);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(administrador);
			assertEquals("El password de un usuario no puede ser nulo.", e.getMessage());
		}
		try {
			administrador = new Administrador(NOMBRE, IDENTIFICADOR, "");
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(administrador);
			assertEquals("El password de un usuario no puede estar vacío.", e.getMessage());
		}
		try {
			administrador = new Administrador(NOMBRE, IDENTIFICADOR, "    ");
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(administrador);
			assertEquals("El password de un usuario no puede estar vacío.", e.getMessage());
		}
	}
	
	@Test
	public void constructorCopiaTest() {
		Administrador admin1 = new Administrador(NOMBRE, IDENTIFICADOR, PASSWORD);
		Administrador admin2 = new Administrador(admin1);
		assertEquals(NOMBRE, admin2.getNombre());
		assertEquals(IDENTIFICADOR, admin2.getIdentificador());
		assertEquals(PASSWORD, admin2.getPassword());
		assertFalse(admin1 == admin2);
	}
	
	@Test
	public void constructoCopiaNoValidoTest() {
		Administrador admin = null;
		try {
			admin = new Administrador(null);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(admin);
			assertEquals("No puedo copiar un usuario nulo.", e.getMessage());
		}
	}
	
	@Test
	public void hashCodeEqualsTest() {
		Administrador admin1 = new Administrador(NOMBRE, IDENTIFICADOR, PASSWORD);
		Administrador admin2 = new Administrador(NOMBRE, IDENTIFICADOR, PASSWORD);
		Administrador admin3 = new Administrador(NOMBRE, "pepepe", PASSWORD);
		assertEquals(admin1, admin2);
		assertEquals(admin1.hashCode(), admin2.hashCode());
		assertNotEquals(admin1, admin3);
		assertNotEquals(admin1.hashCode(), admin3.hashCode());
	}
*/
}
