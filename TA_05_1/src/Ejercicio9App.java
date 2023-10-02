
public class Ejercicio9App {
	public static void main(String[] args) {
		
		//bucle for mostrando el recorrido total del programa
		for(int n = 1;n<=100; n++) {
			//si el valor de N en la iteracion es divisible entre 2 lo muestra por pantalla
			if((n%2)==0) {
				System.out.println(n);
			//si el valor de N en la iteracion es divisible entre 3 lo muestra por pantalla
			}else if((n%3)==0) {
				System.out.println(n);
			}
		}
	}
}
