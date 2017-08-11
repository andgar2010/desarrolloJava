/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad03_01_multiplostabla;

import java.util.Scanner;

/**
 *
 * @author andga
 */
public class Actividad03_01_MultiplosTabla {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int n;
		int c = 1;
		System.out.println("Por favor ingresa que desea numero multiplos en tabla");
		
		Scanner ingresa = new Scanner(System.in);
		
		n = ingresa.nextInt();
		
		System.out.println("Multiplicacion tabla de " + n + " es: ");
		
		for (; c <= 10; c++) {
		 System.out.println(n + " X " + c + " = " + (n*c));	
		}
	}
	
}
