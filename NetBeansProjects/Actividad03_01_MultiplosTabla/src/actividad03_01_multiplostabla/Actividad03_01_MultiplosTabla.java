/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad03_01_multiplostabla;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Felipe García Created in 2017-08-26
 */
public class Actividad03_01_MultiplosTabla {

	public static void main(String[] args) {
		int n, opcion;

		opcion = Integer.parseInt(JOptionPane.showInputDialog(
				"Que desea elegir programa:\nMarcar:"
				+ "\n1. Ejectuar Tabla de Multiplicacion"
				+ "\n2. Ejectuar la suma de los primeros n números naturales"
				+ "\n3. Ejectuar la multiplicación de los primeros hasta n números naturales"));

		switch (opcion) {
			case 1:
				n = Integer.parseInt(JOptionPane.showInputDialog(
						"Por favor ingresa que desea numero multiplos en tabla"));
				generarTabla(n);
				break;
			case 2:
				String tempN = "";
				
				n = Integer.parseInt(JOptionPane.showInputDialog(
						"Por favor ingresa que desea numero limite para suma de los primeros al limite"));
				
				int result = generarSuma1_n(n);

				for (int c = 0; c <= n; c++) {
					tempN += c + " + ";
					//System.out.println(tempN);
				}

				String msg = "La suma hasta numero " + n  + "\nresultado: " + tempN + " = " + result;

				JOptionPane.showMessageDialog(null, msg);
				break;
			case 3:

				break;
		}//Fin Switch Opcion -> Ejecutar 
	}//Fin main

	public static int generarSuma1_n(int n) {
		int result = 0;

		for (int c = 0; c <= n; c++) {
			result = c + result;
			//System.out.println(result);
		}
		
		return result;
	}//Fin genrarSuma1_n

	public static void generarTabla(int n) {
		String mensaje;
		int c = 1;

		mensaje = "Multiplicacion tabla de " + n + " es: \n";

		for (; c <= 10; c++) {
			mensaje += n + " X " + c + " = " + (n * c) + "\n";
		}

		JOptionPane.showMessageDialog(null, mensaje);
	}//Fin generarTabla	
}
