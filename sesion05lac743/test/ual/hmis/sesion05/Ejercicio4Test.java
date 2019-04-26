package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio4Test {

	@ParameterizedTest (name = "{index} => P1: ({0}), P2: ({1}) => ({2})")
	@CsvSource({
			"casa, no, ''", 
			"oso, coco, oo"})
	void testComparar(String p1, String p2, String res) {
		Ejercicio4 c = new Ejercicio4();
		assertEquals(res, c.comparar(p1, p2));
	}
}
