package org.iesalandalus.programacion.modelo.dominio;
/*
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.iesalandalus.programacion.gestionusuarios.modelo.dominio.Empresa;
import org.junit.Test;
*/
public class EmpresaTest {
/*	
	private static final String NOMBRE = "Pepe";
	private static final String IDENTIFICADOR = "pepe";
	private static final String PASSWORD = "p3p3";
	private static final String CIF = "A11223344";
	
	private static final String ERROR_EXCEPCION = "Debería haber saltado la excepción.";

	@Test
	public void constructorValidoTest() {
		Empresa empresa = new Empresa(NOMBRE, IDENTIFICADOR, PASSWORD, CIF);
		assertEquals(NOMBRE, empresa.getNombre());
		assertEquals(IDENTIFICADOR, empresa.getIdentificador());
		assertEquals(PASSWORD, empresa.getPassword());
		assertEquals(CIF, empresa.getCif());
		assertEquals("Empresa [nombre=Pepe, identificador=pepe, cif=A11223344]", empresa.toString());
	}
	
	public void constructorNombreNoValidoTest() {
		Empresa empresa = null;
		try {
			empresa = new Empresa(null, IDENTIFICADOR, PASSWORD, CIF);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(empresa);
			assertEquals("El nombre de un usuario no puede ser nulo.", e.getMessage());
		}
		try {
			empresa = new Empresa("", IDENTIFICADOR, PASSWORD, CIF);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(empresa);
			assertEquals("El nombre de un usuario no puede estar vacío.", e.getMessage());
		}
		try {
			empresa = new Empresa("   ", IDENTIFICADOR, PASSWORD, CIF);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(empresa);
			assertEquals("El nombre de un usuario no puede estar vacío.", e.getMessage());
		}
	}
	
	@Test
	public void constructorIdentificadorNoValidoTest() {
		Empresa empresa = null;
		try {
			empresa = new Empresa(NOMBRE, null, PASSWORD, CIF);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(empresa);
			assertEquals("El identificador de un usuario no puede ser nulo.", e.getMessage());
		}
		try {
			empresa = new Empresa(NOMBRE, "", PASSWORD, CIF);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(empresa);
			assertEquals("El identificador de un usuario no puede estar vacío.", e.getMessage());
		}
		try {
			empresa = new Empresa(NOMBRE, "   ", PASSWORD, CIF);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(empresa);
			assertEquals("El identificador de un usuario no puede estar vacío.", e.getMessage());
		}
	}
	
	@Test
	public void constructorPasswordNoValidoTest() {
		Empresa empresa = null;
		try {
			empresa = new Empresa(NOMBRE, IDENTIFICADOR, null, CIF);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(empresa);
			assertEquals("El password de un usuario no puede ser nulo.", e.getMessage());
		}
		try {
			empresa = new Empresa(NOMBRE, IDENTIFICADOR, "", CIF);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(empresa);
			assertEquals("El password de un usuario no puede estar vacío.", e.getMessage());
		}
		try {
			empresa = new Empresa(NOMBRE, IDENTIFICADOR, "    ", CIF);
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(empresa);
			assertEquals("El password de un usuario no puede estar vacío.", e.getMessage());
		}
	}
	
	@Test
	public void constructorCifNoValidoTest() {
		Empresa empresa = null;
		try {
			empresa = new Empresa(NOMBRE, IDENTIFICADOR, PASSWORD, null);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(empresa);
			assertEquals("El CIF de una empresa no puede ser nulo.", e.getMessage());
		}
		try {
			empresa = new Empresa(NOMBRE, IDENTIFICADOR, PASSWORD, "");
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(empresa);
			assertEquals("El formato del CIF no es correcto.", e.getMessage());
		}
		try {
			empresa = new Empresa(NOMBRE, IDENTIFICADOR, PASSWORD, "A1234");
			fail(ERROR_EXCEPCION);
		} catch (IllegalArgumentException e) {
			assertNull(empresa);
			assertEquals("El formato del CIF no es correcto.", e.getMessage());
		}
	}
	
	@Test
	public void constructorCopiaTest() {
		Empresa empresa1 = new Empresa(NOMBRE, IDENTIFICADOR, PASSWORD, CIF);
		Empresa empresa2 = new Empresa(empresa1);
		assertEquals(NOMBRE, empresa2.getNombre());
		assertEquals(IDENTIFICADOR, empresa2.getIdentificador());
		assertEquals(PASSWORD, empresa2.getPassword());
		assertEquals(CIF, empresa2.getCif());
		assertFalse(empresa1 == empresa2);
	}
	
	@Test
	public void constructoCopiaNoValidoTest() {
		Empresa empresa = null;
		try {
			empresa = new Empresa(null);
			fail(ERROR_EXCEPCION);
		} catch (NullPointerException e) {
			assertNull(empresa);
			assertEquals("No puedo copiar un usuario nulo.", e.getMessage());
		}
	}
	
	@Test
	public void hashCodeEqualsTest() {
		Empresa empresa1 = new Empresa(NOMBRE, IDENTIFICADOR, PASSWORD, CIF);
		Empresa empresa2 = new Empresa(NOMBRE, IDENTIFICADOR, PASSWORD, CIF);
		Empresa empresa3 = new Empresa(NOMBRE, "pepepe", PASSWORD, CIF);
		assertEquals(empresa1, empresa2);
		assertEquals(empresa1.hashCode(), empresa2.hashCode());
		assertNotEquals(empresa1, empresa3);
		assertNotEquals(empresa1.hashCode(), empresa3.hashCode());
	}
*/
}
