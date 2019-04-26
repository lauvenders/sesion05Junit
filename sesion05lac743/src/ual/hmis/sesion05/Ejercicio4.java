package ual.hmis.sesion05;

public class Ejercicio4 {

	public String comparar (String p1, String p2) {
		String s = "";
		char[] c1 = p1.toCharArray();
		char[] c2 = p2.toCharArray();
		for (int i = 0; i < c2.length; i++) {
			for (int j = 0; j < c1.length; j++) {
				if (c1[j] == c2[i]) {
					s += c1[j];
					break;
				}
			}
		}
		return s;
	}
}
