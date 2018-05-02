package test;

import static org.junit.Assert.*;
import org.junit.Test;

import appAlumno.Alumno;

public class TestAlumno {

	@Test
	public void comprobarPromedio() {
		
		Alumno alumno = new Alumno("001", "Juan Pablo Quiñones Giraldo", 18.0, 16.00);	
		
		
		double resultado = alumno.calcularPromedio();
		
		
		assertEquals((18+16)/2, resultado, 0.00);
		
		
//		fail("Resultado Erroneo");
	}

}
