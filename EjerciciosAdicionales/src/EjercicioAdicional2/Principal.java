package EjercicioAdicional2;

public class Principal {

	public static void main(String[] args) {
		
		raices ecuacion = new raices(1, 5, 4);
		raices ecuacion2 = new raices(1, 4, 4);
		
		System.out.println("Resultado de la primera ecuación");
		ecuacion.calcular(); System.out.println();
		System.out.println("Resultado de la segunda ecuación");
		ecuacion2.calcular();

	}

}
