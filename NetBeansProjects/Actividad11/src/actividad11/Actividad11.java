/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11;

import javax.swing.JOptionPane;

/**
 * @author Andres Felipe Garcia Ramirez 
 * Created in 2017-08-16
 */
public class Actividad11
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		int numIngresa, opcionMenu, repInicio;

		do {
			opcionMenu = Integer.parseInt(
					JOptionPane.showInputDialog("Selecciona ejercicio:\n1. Edad\n2. Valor absoluto\n3. Cual posicion número"));

			switch (opcionMenu) {
				case 1:
					int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa su edad:"));
					JOptionPane.showMessageDialog(null, (edad <= 3 && edad >= 0) ? ("Tu edad es bebé") : ((edad <= 12 && edad >= 4) ? ("Tu edad es Niño") : ((edad <= 17 && edad >= 13) ? ("Tu edad es Adolescente") : ((edad <= 100 && edad >= 18) ? ("Tu edad es Adulto") : ("Tu edad es fuera de limite???")))));
					break;//Fin CASE 1 

				case 2:
					/* JAVA Ejemplo No 2. Operador ternario Calcule el valor absoluto de un número. Para ello utilizar dos variables: numero y valorAbsoluto. Repita con ciclo a su elección.*/
					numIngresa = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
					JOptionPane.showMessageDialog(null, (numIngresa < 0) ? ("Valor absoluto es " + (numIngresa *= -1)) : ("Valor absoluto es " + numIngresa));
					break;//Fin CASE 2 

				case 3:
					/*JAVA Ejemplo No 3. Operador ternario Lea un número e indique si es +, - , 0. Repita con ciclo a su elección.*/
					numIngresa = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
					JOptionPane.showMessageDialog(null,(numIngresa == 0)?("Es número neturo"):((numIngresa < 0)?("Es número negativo"):("Es número postivo")));
					break;//Fin CASE 3 
			}//Fin menu	

			repInicio = Integer.parseInt(JOptionPane.showInputDialog("Que desea repetir desde menu?\nSelecciona\n1. Si\n2. No"));
		}
		while (repInicio == 1);
	}//Fin Main

}