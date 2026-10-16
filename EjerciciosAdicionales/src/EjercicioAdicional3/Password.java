package EjercicioAdicional3;

import java.util.Random;

public class Password {
	private int longitud = 8;
	private String contraseña;
	
	
	
	//Constructor por defecto
	public Password() {
		super();
		this.contraseña = generarPassword();
	}

	//Constructor con la longitud que nosotros le pasemos
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contraseña = generarPassword();
	}
	
	//Metodo para generar la contraseña
	public String generarPassword() {
		
		Random random = new Random();
		
		String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; //Todos los caracteres posibles que va a coger aleatoriamente el bucle
		String password = "";
		
		for (int i = 0; i < longitud; i++) {
			int caracter = random.nextInt(caracteres.length());
			password += caracteres.charAt(caracter);
		}
		
		return this.contraseña = password;
	}
	
	
	

}
