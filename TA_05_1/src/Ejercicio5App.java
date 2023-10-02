import javax.swing.JOptionPane;

public class Ejercicio5App {
	public static void main(String[] args) {
		//Se pide al usuario que introduzca un numero
		String num = JOptionPane.showInputDialog("Introduce un numero: ");
		//Se convierte el valor de string a integer numero
		int val = Integer.parseInt(num);
		
		//Se determina si es par o no segun si el resultado de su modulo es 0
		if((val%2) == 0)
			JOptionPane.showMessageDialog(null, "El numero introducido: "+val+" es divisible entre 2 (es par).");
		else
			JOptionPane.showMessageDialog(null, "El numero introducido: "+val+" no es divisible entre 2 (es impar).");
	}
}
