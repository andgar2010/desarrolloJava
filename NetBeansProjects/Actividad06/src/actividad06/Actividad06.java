/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad06;

import javax.swing.JOptionPane;
import java.lang.Math;

/**
 *
 * @author Andrés Felipe García
 * Created in 2017-08-03
 */
public class Actividad06 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		int n, rep, opcion;

		do {
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(
						"Que desea elegir programa:\nMarcar:"
						+ "\n1. Ejectuar calcular la Formula de Sandra Peñarada con numeros series"
						+ "\n2. Ejectuar números hasta que se digite el número cero (0). Imprima la cantidad de números digitados."
						+ "\n3. Ejectuar Tabla de Multiplicar"));
				if (opcion > 3) {
					JOptionPane.showMessageDialog(null, "Incorrecta numero, por favor elegir numero 1 - 3");
				} else if (opcion <= 0) {
					JOptionPane.showMessageDialog(null, "No existe negativo numero para elegir opcion, por favor elegir numero 1 - 3");
				}
			} while (opcion > 3 || opcion <= 0);

			switch (opcion) {
				case 1:
					n = Integer.parseInt(JOptionPane.showInputDialog(
							"Por favor ingresa que desea numero de serie limite para calcular Formula al limite"));

					int result = calcularFormula(n);
					imprimirResultado(n, result);
					break;
				//Fin Case 2 calcularFormula()

				case 2:
					JOptionPane.showMessageDialog(null,
							"Disculpas por molestas. Estamos construcción");
					break;
				//Fin Case 2

				case 3:
					n = Integer.parseInt(JOptionPane.showInputDialog(
							"Por favor ingresa que desea numero multiplos en tabla"));
					generarTabla(n);
					break;
				//Fin Case 3 TablaMultiplicar()

			}//Fin Switch Opcion -> Ejecutar 

			rep = Integer.parseInt(
					JOptionPane.showInputDialog("Desea repetir ejecutar ?\nSi, Marcar 1.\nNo, Cualquier tecla"));
		} while (rep == 1);

	}//Fin Main

	public static void imprimirResultado(int n, int result) {

		String msg = "Calcular Formula.\nhasta numero " + n + "\nresultado = " + result;

		JOptionPane.showMessageDialog(null, msg);
	}//Fin imprimirResultado()

	public static int calcularFormula(int n) {
		int result = 0;

		for (int k = 1; k <= n; k++) {
			int kPot = (int) Math.pow(k, 2);
			result+= kPot - (kPot - (2*k) + 1);
		}

		return result;
	}//Fin genrarSuma1_n()

	public static void generarTabla(int n) {

		String mensaje = "Multiplicacion tabla de " + n + " es: \n";
		int c = 1;

		for (; c <= 10; c++) {
			mensaje += n + " X " + c + " = " + (n * c) + "\n";
		}

		JOptionPane.showMessageDialog(null, mensaje);
	}//Fin generarTabla()

}//Fin class
