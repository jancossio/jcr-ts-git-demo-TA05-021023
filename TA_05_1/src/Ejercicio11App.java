import javax.swing.JOptionPane;

public class Ejercicio11App {
	public static void main(String[] args) {
		//Se solicita al usuario que introduzca un dia de la semana
		String dia = JOptionPane.showInputDialog("Introduce un dia de la semana: ");
		
		//Mediante la función Switch se determina si el dia introducido es festivo o laboral
		switch(dia){
		
		case "Lunes":
			JOptionPane.showMessageDialog(null, "El "+dia+ " es un dia laboral.");
			break;
		case "Martes":
			JOptionPane.showMessageDialog(null, "El "+dia+ " es un dia laboral.");
			break;
		case "Miercoles":
			JOptionPane.showMessageDialog(null, "El "+dia+ " es un dia laboral.");
			break;
		case "Jueves":
			JOptionPane.showMessageDialog(null, "El "+dia+ " es un dia laboral.");
			break;
		case "Viernes":
			JOptionPane.showMessageDialog(null, "El "+dia+ " es un dia laboral.");
			break;
		case "Sabado":
			JOptionPane.showMessageDialog(null, "El "+dia+ " es un dia festivo.");
			break;
		case "Domingo":
			JOptionPane.showMessageDialog(null, "El "+dia+ " es un dia festivo.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "El dia introducido no se reconoce");
		}
	}
}
