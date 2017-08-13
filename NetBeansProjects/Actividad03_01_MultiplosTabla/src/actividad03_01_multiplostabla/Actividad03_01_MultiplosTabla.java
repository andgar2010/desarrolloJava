/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad03_01_multiplostabla;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Felipe García 
 * * Created in 2017-08-26
 */

public class Actividad03_01_MultiplosTabla {

	public static void main(String[] args) {
		int n, opcion, inicio;
		
		do {
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"Que desea elegir programa:\nMarcar:"
					+ "\n1. Ejectuar Tabla de Multiplicacion"
					+ "\n2. Ejectuar la suma de los primeros n números naturales"
					+ "\n3. Ejectuar la multiplicación de los primeros hasta n números naturales"));
			} while (opcion > 3 || opcion <= 0);

			switch (opcion) {
				case 1:
					n = Integer.parseInt(JOptionPane.showInputDialog(
							"Por favor ingresa que desea numero multiplos en tabla"));
					generarTabla(n);
					break;
				//Fin Case 1 generarTabla()
					
				case 2:
					n = Integer.parseInt(JOptionPane.showInputDialog(
							"Por favor ingresa que desea numero limite para suma de los primeros al limite"));
					generarSuma1_n(n);
					break;
				//Fin Case 2 generarSuma1_n()
					
				case 3:

					break;
				//Fin Case 3 ()
			}//Fin Switch Opcion -> Ejecutar 
			
			inicio = Integer.parseInt(
				JOptionPane.showInputDialog("Desea nuevamente ejecutar inicio?\nSi Marcar 1.\nNo, Cualquier tecla"));

		} while (inicio == 1);
	}//Fin main

	public static void generarSuma1_n(int n) {
		int result = 0;
		String tempN = "";
		
		for (int c = 0; c <= n; c++) {
			result = c + result;
			tempN += c + " + ";
		}

		String msg = "La suma hasta numero " + n  + "\nresultado: " + tempN + " = " + result;

		JOptionPane.showMessageDialog(null, msg);
	}//Fin genrarSuma1_n

	public static void generarTabla(int n) {
		String mensaje = "Multiplicacion tabla de " + n + " es: \n";
		int c = 1;

		for (; c <= 10; c++) {
			mensaje += n + " X " + c + " = " + (n * c) + "\n";
		}
		JOptionPane.showMessageDialog(null, mensaje);
	}//Fin generarTabla	
}
