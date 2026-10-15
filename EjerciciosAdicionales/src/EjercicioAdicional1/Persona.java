package EjercicioAdicional1;

public class Persona {

	private String nombre = "";
	private int edad = 0;
	private static final char sexoPorDefecto = 'H';
	private char sexo = sexoPorDefecto;
	private double peso = 0;
	private double altura = 0;
	private static int numPersonas = 0; //contador de personas
	private String dni = generarDNI();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return comprobarSexo(sexo);
	}

	public void setSexo(char sexo) {
		this.sexo = comprobarSexo(sexo);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public String getDni() {
		return dni;
	}

	public static char getSexopordefecto() {
		return sexoPorDefecto;
	}
	
	//Devolver el numero de personas
	private static int getMostrarNumPersonas() {
		return numPersonas;
	}
	
	//Mostrar el numero de personas
	public static void decirNumPersonas() {
		System.out.println("El número de personas que hay es: " + getMostrarNumPersonas());
	}

	//Constructor vacio
	public Persona() {
		super();
		
		numPersonas++;
	}

	//Constructor con tres atributos
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		
		numPersonas++;
	}

	//Constructor con todos los atributos
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
		
		numPersonas++;
	}
	
	//Devolver booleano si la persona es mayor de edad
	public boolean esMayorDeEdad() {
		boolean mayorEdad = true;
		
		if (this.edad >= 18) {
			return mayorEdad;
		}else {
			mayorEdad = false;
			return mayorEdad;
		}
	}
	
	//Comprobar sexo que sea correcto, si no es correcto sera el por defecto H
	private char comprobarSexo(char sexo) {
		if (sexo == 'H' || sexo == 'M') {
			return sexo;
		}else {
			return sexoPorDefecto; 
		}
	}
	
	//Variables con los valores de los pesos
	public static final int infrapeso = -1;
	public static final int pesoIdeal = 0;
	public static final int sobrepeso = 1;
	
	//Calcular peso ideal y devolver -1 si esta por debajo, 0 si esta bien y 1 si tiene sobrepeso
	public int calcularIMC() {
		
		double imc = peso / (Math.pow(altura, 2));
		
		if (imc < 20) {
			return infrapeso;
		}else if (imc >=20 && imc <= 25) {
			return pesoIdeal;
		}else {
			return sobrepeso;
		}
	}
	
	//Generar numero de 8 cifras DNI
	private int genararNumDNI() {
		return (int)(Math.random() * 90000000) + 10000000;
	}
	
	//Generar letra DNI
	private char generarLetraDNI(int numero) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		return letras.charAt(numero % 23);
	}
	
	//Generar dni
		public String generarDNI() {
			int numeroDNI = genararNumDNI();
			char letraDNI = generarLetraDNI(numeroDNI);
			return numeroDNI + "" + letraDNI;
		}

	//Devolver toda la info de la persona
	@Override
	public String toString() {
		return "Paciente: " + nombre + "\n" +
				"Edad: " + edad + "\n" +
				"Sexo: " + sexo + "\n" +
				"Peso: " + peso + "\n" +
				"Altura: " + altura + " metros" + "\n" +
				"DNI: " + dni;
	}
	
	
	
}
