import javax.swing.JOptionPane;

public class Ejercicio3App {
	public static void main(String[] args) {
		//se solicita el nombre al usuario
		String name = JOptionPane.showInputDialog("Por favor, introduce tu nombre: ");
		//muestra el mensaje de bienvenida del nombre
		JOptionPane.showMessageDialog(null, "bienvenido "+name);
	}
}
