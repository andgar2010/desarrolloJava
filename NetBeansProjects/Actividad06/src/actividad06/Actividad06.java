/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad06;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Felipe García 
 * Created in 2017-08-03
 */
public class Actividad06 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
	
		int n, rep;

		do {
			
			n = Integer.parseInt(JOptionPane.showInputDialog(
					"Por favor ingresa que desea numero multiplos en tabla"));
			generarTabla(n);

			rep = Integer.parseInt(
					JOptionPane.showInputDialog("Desea repetir ejecutar ?\nSi, Marcar 1.\nNo, Cualquier tecla"));
			
		} while (rep == 1);
		
	}//Fin main

	public static void generarTabla(int n)
	{
		
		String mensaje = "Multiplicacion tabla de " + n + " es: \n";
		int c = 1;

		for (; c <= 10; c++)
		{
			mensaje += n + " X " + c + " = " + (n * c) + "\n";
		}
		
		JOptionPane.showMessageDialog(null, mensaje);
		
	}//Fin generarTabla()

}