package ual.hmis.sesion05;

public class Ejercicio2 {
	public boolean login (String username, String password){
		// comprobar que sean distintos de vacio
		// comprobar que la longitud sea < 30
		// llamar al método de la bbdd
		if (username == null || password == null) return false;
		if (username.length() > 30 || password.length() > 30) return false;
		return compruebaLoginEnBD(username, password);
		}
	
		public boolean compruebaLoginEnBD (String username, String password){
		// método mock (simulado)
		if (username.equals("user") && password.equals("pass")) return true;
		return false;
		}
}
