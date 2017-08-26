package actividad10;

import javax.swing.JOptionPane;

/**
 * @author Andres Felipe Garcia Ramirez
 * Created in 2017-08-15
 */
public class Actividad10
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		int num1, num2, opcionMenu, repInicio;
		double desposito;

		do {

			opcionMenu = Integer.parseInt(
					JOptionPane.showInputDialog("Selecciona ejercicio:\n1. Mayor o menor\n2. Banco bonificación?"));

			switch (opcionMenu) {
				case 1:
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero 1"));
					num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero 2"));
					numeroMayor_Menor(num1, num2);
					break;//Fin CASE 1 numeroMayor_Menor

				case 2:
					desposito = Integer.parseInt(JOptionPane.showInputDialog("Ingresa valor para deposito"));
					calcularSaldo(desposito);
					break;//Fin CASE 2 calcularSaldo
			}//Fin menu	

			repInicio = Integer.parseInt(JOptionPane.showInputDialog("Que desea repetir desde menu?\nSelecciona\n1. Si\n2. No"));
		}
		while (repInicio == 1);
	}//Fin Main

	public static void numeroMayor_Menor(int num1, int num2)
	{
		int resultado;

		resultado = num1 + num2;

		if (resultado % 2 == 0) {
			if (num1 == num2) {
				JOptionPane.showMessageDialog(null, "Usted Ingresa numero \"" + num1 + "\" en 1 y 2 son iguales");
			}
			else if (num1 > num2) {
				JOptionPane.showMessageDialog(null, "Usted Ingresa numero " + num1 + " es mayor");
			}
			else {
				JOptionPane.showMessageDialog(null, "Usted Ingresa numero " + num2 + " es mayor");
			}
		}
		else {
			if (num1 == num2) {
				JOptionPane.showMessageDialog(null, "Usted Ingresa numero \"" + num1 + "\" en 1 y 2 son iguales");
				}
			else if (num1 < num2) {
				JOptionPane.showMessageDialog(null, "Usted Ingresa numero " + num1 + " es menor");
			}
			else {
				JOptionPane.showMessageDialog(null, "Usted Ingresa numero " + num2 + " es menor");
			}
		}

	}

	public static void calcularSaldo(double deposito)
	{
		double saldo = 0;

		saldo += deposito;

		JOptionPane.showMessageDialog(null, (saldo > 100000)
									  ? ("Usted desposita valor $" + deposito 
										 + ".\nBonficicación:                $" + (saldo * 0.2) 
										 + "\nActual saldo:                  $" + (saldo *= 1.2))
									  : ("Usted desposita valor $" + deposito + ".\nActual saldo :$" + saldo));
	}

}
