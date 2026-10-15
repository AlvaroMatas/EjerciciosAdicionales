package EjercicioAdicional1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
	
	public static void evaluarIMC(Persona p) {
		double imc = p.calcularIMC();
		
		if (imc < 0) {
			System.out.println("El paciente " + p.getNombre() + " está por debajo de su peso ideal");
		}else if (imc == 0) {
			System.out.println("El paciente " + p.getNombre() + " está en su peso ideal");
		}else {
			System.out.println("El paciente " + p.getNombre() + " está por encima de su peso ideal");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String nombre;
		int edad;
		char sexo;
		double peso, altura;
		
		//Pedir datos por teclado
		System.out.print("Nombre: ");
		nombre = entrada.readLine();
		
		System.out.print("Edad: ");
		edad = Integer.parseInt(entrada.readLine());
		
		System.out.print("Sexo: ");
		sexo = entrada.readLine().charAt(0);
		
		System.out.print("Peso: ");
		peso = Double.parseDouble(entrada.readLine());
		
		System.out.print("Altura: ");
		altura = Double.parseDouble(entrada.readLine());
		
		//Creamos tres objetos persona
		Persona pers1 = new Persona(nombre, edad, sexo, peso, altura);
		Persona pers2 = new Persona(nombre, edad, sexo);
		Persona pers3 = new Persona();
		
		//Utilizar set para rellenar esos atributos vacios
		pers2.setPeso(57.7);
		pers2.setAltura(1.63);
		
		pers3.setNombre("Luis");
		pers3.setEdad(47);
		pers3.setSexo('H');
		pers3.setPeso(85.2);
		pers3.setAltura(1.74);
		
		//Comprobar si están en su peso ideal
		Persona[] pacientes = {pers1, pers2, pers3};
		
		for (Persona p : pacientes) {
			evaluarIMC(p);//Evalua el imc de cada persona que vaya recorriendo el bucle
		}
		
		//Indicar si es mayor de edad
		for (Persona p : pacientes) {
			p.esMayorDeEdad();
			
			System.out.println();
			if (p.esMayorDeEdad()) {
				System.out.println("El paciente " + p.getNombre() + " es mayor de edad");
			}else {
				System.out.println("El paciente " + p.getNombre() + " es menor de edad");
			}
		}
		
		System.out.println();
		//Mostrar info de cada objeto
		for (Persona p : pacientes) {
			p.toString();
		}
		
		//Mostrar numero de personas a las que se ha realizado el estudio
		Persona.decirNumPersonas();
		System.out.println(pers3.toString());
	}

}
