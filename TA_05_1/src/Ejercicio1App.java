
public class Ejercicio1App {
	public static void main(String[] args) {
		//se declaran las variables
		int a = 2;
		int b = 1;
		
		//mediante una secuencia de ifs se determina que numero es mayor
		if(a>b) {
			System.out.println("La primera variable es mayor.");
		}else if(a<b) {
			System.out.println("La segunda variable es mayor.");
		}else if(a==b) {
			System.out.println("Ambas variables son iguales.");
		}
	}
}