import javax.swing.JOptionPane;

public class Ejercicio10App {
	public static void main(String[] args) {
		//se solicita al usuario el valor total de las ventas realizadas, y se inicializa la cantidad total a 0
		String val = JOptionPane.showInputDialog("Introduce el numero total de ventas realizadas: ");
		int totalVent = Integer.parseInt(val);
		
		int totalAmount = 0;
		
		//se solicita al usuario el valor de cada venta (lo hace tantas veces como ventas haya)
		//y se añaden a la cantidad total en cada iteracion
		for(int i = 0; i<totalVent; i++) {
			String tmp = JOptionPane.showInputDialog("Introduce la cantidad total que recogio la venta "+(i+1)+" : ");
			int valVent = Integer.parseInt(tmp);
			totalAmount+=valVent;
		}
		//se muestra la cantidad total recogida por pantalla
		JOptionPane.showMessageDialog(null, "El precio total de todas las ventas realizadas es: "+totalAmount);
	}
}
