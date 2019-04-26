package ual.hmis.sesion05;

public class Ejercicio3 {
	public String asteriscos(int n) {
		String s = "";
		if (n < 0) return "Número erroneo";
		if (n < 5) n = 5;
		if (n > 12) n = 12;
		for (int i = 0; i < n; i ++) {
			s += "*";
		}
		return s;
	}

}
