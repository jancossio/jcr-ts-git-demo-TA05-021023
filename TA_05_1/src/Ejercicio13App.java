import javax.swing.JOptionPane;

public class Ejercicio13App {
	public static void main(String[] args) {
		//Se declaran las 2 variables numericas
		int a = 0;
		int b = 0;
		
		//Se solicita al usuario el valor de las 2 variables numericas
		String tempA = JOptionPane.showInputDialog("Introduce el valor del primer operando: ");
		a = Integer.parseInt(tempA);
		
		String tempB = JOptionPane.showInputDialog("Introduce el valor del segundo operando: ");
		b = Integer.parseInt(tempB);
		
		//Se solicita al usuario el operando a introducir según la operación que quiera realizar
		String operacion = JOptionPane.showInputDialog("Introduce el operando de la operacion que deseas realizar: ");
		
		//Mediante el switch se determina que operacion debe realizar con ambos valores y
		//los muestra por pantalla
		switch(operacion){
		
		case "+":
			JOptionPane.showMessageDialog(null, "El resultado es: "+(a+b));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, "El resultado es: "+(a-b));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, "El resultado es: "+(a*b));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, "El resultado es: "+(a/b));
			break;
		case "^":
			JOptionPane.showMessageDialog(null, "El resultado es: "+(Math.pow(a, b)));
			break;
		case "%":
			JOptionPane.showMessageDialog(null, "El resultado es: "+(a%b));
			break;
		default:
			JOptionPane.showMessageDialog(null, "La operación introducida no se reconoce");
		}
	}
}
