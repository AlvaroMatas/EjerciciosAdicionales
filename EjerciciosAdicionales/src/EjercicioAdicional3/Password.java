package EjercicioAdicional3;

import java.util.Random;

public class Password {
	private int longitud = 8;
	private String contraseña;
	
	//Getters and setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

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
	
	//metodo que devuelve true si la contraseña tiene mas de 5 numeros, mas de 2 mayusculas y mas de 1 minuscula, sino devuelve false
	public boolean esFuerte() {
		//Tenemos que recorrer toda la contraseña e ir sumando si es mayuscula minuscula o numero en variables
		int minusculas = 0;
		int mayusculas = 0;
		int numeros = 0;
		
		boolean esFuerte = true;
		
		for (int i = 0; i < getContraseña().length(); i++) {
			char caracter = getContraseña().charAt(i);
			
			if (Character.isUpperCase(caracter)) {
				mayusculas++;
			}else if (Character.isLowerCase(caracter)) {
				minusculas++;
			}else if (Character.isDigit(caracter)){ //Dice si el caracter es un numero
				numeros++;
			}
		}
		
		if (minusculas > 1 && mayusculas > 2 && numeros > 5) {
			return esFuerte = true;
		}else {
			return esFuerte = false;
		}
		
		
	}
	
	
	

}
