import javax.swing.JOptionPane;

public class Ejercicio12App {
	public static void main(String[] args) {
		//Se inicializa la contraseña y los parametros de control de las iteraciones del bucle
		String password="botas";
		boolean found = false;
		int nTries = 3;
		
		//el bucle solicitara al usuario la contraseña mientras no se agote el numero de intentos
		//o no la haya acertado
		do{
			String pass = JOptionPane.showInputDialog("Introduce la contraseña: ");
			if(password.equals(pass)) {
				JOptionPane.showMessageDialog(null, "Bienvenido!");
				found = true;
			}else {
				nTries--;
			}
		}while(nTries>0 && !found);
	}
}
