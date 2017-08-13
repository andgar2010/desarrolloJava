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
 * Created in 2017-08-26
 */
public class Actividad03_01_MultiplosTabla {

	public static void main(String[] args) {
		int n, denom, opcion, inicio;

		do {
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(
						"Que desea elegir programa:\nMarcar:"
						+ "\n1. Ejectuar Tabla de Multiplicar"
						+ "\n2. Ejectuar la suma de los primeros numeros hasta n números naturales"
						+ "\n3. Ejectuar la suma de fracciones de los primeros numeros naturales hasta n números naturales"));
				if (opcion > 3)
				{
					JOptionPane.showMessageDialog(null, "Incorrecta numero, por favor elegir numero 1 - 3");
				}
				else if (opcion <= 0)
				{
					JOptionPane.showMessageDialog(null, "No existe negativo numero para elegir opcion, por favor elegir numero 1 - 3");
				}
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

					int result = generarSuma1_n(n);
					imprimirResultadoSum1_n(n, result);
					break;
				//Fin Case 2 generarSuma1_n()

				case 3:
					n = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresar que desea limite numero de serie"));
					denom = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresar que desea numero denominador"));

					int resultltadoNumerador = generarSuma1_n(n);
					imprimirFraccionSuma(n, denom, resultltadoNumerador);
					break;
				//Fin Case 3 FraccionSuma
			}//Fin Switch Opcion -> Ejecutar 

			inicio = Integer.parseInt(
					JOptionPane.showInputDialog("Desea nuevamente ejecutar inicio?\nSi Marcar 1.\nNo, Cualquier tecla"));
		} while (inicio == 1);
	}//Fin main

	public static void imprimirFraccionSuma(int n, int denom, int resultadoNumerador)
	{
		int num = 0;
		double resultadoFraccion;
		String linNumerador = "", linFraccion = "", linDenominador = "";

		resultadoFraccion = (double) (resultadoNumerador / denom);

		//Dibujar linea NUMERADOR a STRING	
		for (int i = 0; i <= n; i++)
		{
			num = i;
			linNumerador += num + "      ";
		}//Fin Dibujar linea NUMERADOR a STRING

		//Dibujar linea Fraccion a STRING
		for (int i = 0; i <= n; i++)
		{
			linFraccion += "--- + ";
		}//Fin Dibujar linea Fraccion a STRING

		//Dibujar linea DENOMINADOR a STRING
		for (int i = 0; i <= n; i++)
		{
			linDenominador += denom + "      ";
		}//Fin Dibujar linea DENOMINADOR

		JOptionPane.showMessageDialog(null,
			"Numero de serie es " + n
			+ "\nDenominador es " + denom + "\n"
			+ //Dibujar linea NUMERADOR		
			"\n" + linNumerador + "   " + resultadoNumerador
			+ //Dibujar linea Fraccion
			"\n" + linFraccion + "= ---"
			+ //Dibujar linea DENOMINADOR
			"\n" + linDenominador + "    " + denom
			+ //Linea Resultado
			"\n\nResultado es " + resultadoFraccion);
	}//Fin dibujarFraccionSuma()

	public static void imprimirResultadoSum1_n(int n, int result)
	{
		String tempN = "";

		for (int i = 0; i <= n; i++)
		{
			tempN += i + " + ";
		}

		String msg = "La suma hasta numero " + n + "\nresultado: " + tempN + " = " + result;

		JOptionPane.showMessageDialog(null, msg);
	}//Fin imprimirResultadoSum1_n

	public static int generarSuma1_n(int n)
	{
		int result = 0;

		for (int c = 0; c <= n; c++)
		{
			result += c;
		}

		return result;
	}//Fin genrarSuma1_n()

	public static void generarTabla(int n)
	{
		String mensaje = "Multiplicacion tabla de " + n + " es: \n";
		int c = 1;

		for (; c <= 10; c++) {
			mensaje += n + " X " + c + " = " + (n * c) + "\n";
		}
		JOptionPane.showMessageDialog(null, mensaje);
	}//Fin generarTabla()
}