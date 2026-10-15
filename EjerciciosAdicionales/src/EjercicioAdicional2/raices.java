package EjercicioAdicional2;

public class raices {
	
	private double a;
	private double b;
	private double c;
	
	//Constructor
	public raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void obtenerRaices() {
		double resultado1 = (-b + Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a); // (-b±√((b^2)-(4*a*c)))/(2*a)
		double resultado2 = (-b - Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
		
		System.out.printf("Resultado 1: %.2f", resultado1); System.out.println();
		System.out.printf("Resultado 2: %.2f", resultado2); System.out.println();
	}
	
	//(b^2)-4*a*c
	public double getDiscriminante() {
		return (Math.pow(b, 2)) - 4 * a *c;
	}
	
	//Imprimir unica raiz cuando tenga solo una solucion posible
	public void obtenerRaiz() {
		double x = -b / (2 * a); //Esta es la formula para sacar la unica solución
		System.out.println("x: " + x);
		
	}
	
	//devolver booleano si tiene dos soluciones
	public boolean tieneRaices() {
		boolean dosSoluciones = true;
		
		if (getDiscriminante() > 0) {
			return dosSoluciones = true;
		}else {
			return dosSoluciones = false;
		}
		
	}
	
	//devolver booleano si tiene una única solución
	public boolean tieneRaiz() {
		boolean unicaSolucion = true;
		
		if (getDiscriminante() == 0) {
			return unicaSolucion = true;
		}else {
			return unicaSolucion = false;
		}
	}
	
	//Mostrar todas las soluciones
	public void calcular() {
		
		if (tieneRaices()) {
			obtenerRaices();
		}else if (tieneRaiz()) {
			obtenerRaiz();
		}else {
			System.out.println("No existe una solución posible");
		}
	}

}
