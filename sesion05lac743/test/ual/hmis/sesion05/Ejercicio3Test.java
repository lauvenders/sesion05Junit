package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio3Test {

	@ParameterizedTest
	@CsvSource({"-1, Número erroneo",
				"2, *****",
				"7, *******",
				"34, ************"})
	void testTransformar(int n, String resultado) {
		Ejercicio3 c = new Ejercicio3();
		assertEquals(resultado, c.asteriscos(n));
	}
	
}
