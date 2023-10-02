import javax.swing.JOptionPane;

public class Ejercicio4App {
	public static void main(String[] args) {
		//se declara la constante PI y se solicita el valor del radio al usuario
		final double PI = 3.14;
		String num = JOptionPane.showInputDialog("Introduce el radio del círculo: ");
		
		//se convierte el valor introducido de String a Double y se realiza la operacion del area circular
		double radio = Double.parseDouble(num);
		JOptionPane.showMessageDialog(null, "El área del círculo será: "+(Math.pow(radio, 2)*PI));
	}
}
