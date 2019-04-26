package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio2Test {
	@ParameterizedTest (name = "{index} => username: ({0}), password: ({1}) => ({2})")
	@CsvSource({
			", pass, false", 
			"user, , false",
			"abcdefghijklmnopqrstuvwxyz123456, pass, false",
			"user, abcdefghijklmnopqrstuvwxyz123456, false", 
			"usuario, pass, false",
			"user, password, false",
			"user, pass, true"})
	void testLogin(String username, String password, boolean b) {
		Ejercicio2 c = new Ejercicio2();
		assertEquals(b, c.login(username, password));
	}

}
