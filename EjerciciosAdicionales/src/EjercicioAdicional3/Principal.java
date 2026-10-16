package EjercicioAdicional3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int longitudPass;
		
		System.out.print("Dime la longitud de la contraseña: ");
		longitudPass = Integer.parseInt(entrada.readLine());
		
		ArrayList<Password> contrasenyas = new ArrayList<Password>();
		
		Password contrasenya1 = new Password();
		Password contrasenya2 = new Password(longitudPass);
		
		//Añadimos los objetos al arraylist
		contrasenyas.add(contrasenya1);
		contrasenyas.add(contrasenya2);
		
		for (Password a : contrasenyas) {
			System.out.println("La contraseña es: " + a.getContraseña());
		}

	}

}
