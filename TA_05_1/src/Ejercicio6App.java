import javax.swing.JOptionPane;

public class Ejercicio6App {
	public static void main(String[] args) {
		//se declara el IVA como constante y se solicita al usuario el valor del precio del producto
		final double IVA = 0.21;
		String prec = JOptionPane.showInputDialog("Introduce el precio del producto: ");
		double val = Double.parseDouble(prec);
		
		//Se muestra por ventana emergente el valor total del producto al aplicar el IVA
		JOptionPane.showMessageDialog(null, "El precio total con IVA es: "+(val+(val*IVA)));
	}
}
