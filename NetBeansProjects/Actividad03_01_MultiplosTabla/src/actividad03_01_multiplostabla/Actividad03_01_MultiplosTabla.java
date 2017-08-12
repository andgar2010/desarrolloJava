/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad03_01_multiplostabla;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author andga
 */
public class Actividad03_01_MultiplosTabla {

	public static void main(String[] args) 
	{
		int n;
		
		
		n = Integer.parseInt(JOptionPane.showInputDialog(
			"Por favor ingresa que desea numero multiplos en tabla"));
		generarTabla(n);
		
	}//Fin main
	
	
	
	public static void generarTabla(int n)
	{
		String mensaje;
		int c = 1;
		
		mensaje="Multiplicacion tabla de " + n + " es: \n";
		
		for (; c <= 10; c++) {
		mensaje+=n + " X " + c + " = " + (n*c)+"\n";	
		}
		
		JOptionPane.showMessageDialog(null,mensaje);
	}//Fin generarTabla	
}
