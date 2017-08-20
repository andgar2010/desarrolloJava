/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad05;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres Felipe Garcia Ramirez
 * Created in 2017-08-04
 */
public class Actividad05 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		int inicio = 0, marca;
		char caracter;
		boolean resultVocal;

		JOptionPane.showMessageDialog(null, "Bienvenido Actividad #5");

		do {

			int menu = Integer.parseInt(
				JOptionPane.showInputDialog("Selecciona ejercicio:\n1. Vocales\n2. Posicion numero"));

			switch (menu) {
				case 1:					
					resultVocal = verificarVocales(
						caracter = (JOptionPane.showInputDialog(
							"Por favor ingresa un letra para verificar vocal")).charAt(0));
					
					JOptionPane.showMessageDialog(null ,
						(resultVocal == true) ? (caracter + " Si es vocal"): (caracter + " No es vocal"));
				
					break;//Fin CASE 1 VOCAL//Fin CASE 1 VOCAL

				case 2:
					posicionNumero(marca = Integer.parseInt(
						JOptionPane.showInputDialog("Por favor ingresa un numero")));
					break;//Fin CASE 2 POSICION NUMERO
			}

			inicio = Integer.parseInt(
					JOptionPane.showInputDialog(
						"Que desea repetir desde menu?\nSelecciona\n1. Si\n2. No"));

		} while (inicio == 1);
	}//Fin Main

	public static boolean verificarVocales(char caracter) {
		
		char[] vocales = {'A','E','I','O','U','a','e','i','o','u'};
		boolean resultVocales = false;
		
		for (int i = 0; i < vocales.length; i++) {
			if (vocales[i] == caracter) {
				resultVocales = true;
			}
		}		
		
		return resultVocales;
	}//Fin verificarVocales()

	public static void posicionNumero(int marca) {

		JOptionPane.showMessageDialog(null,
			(marca >= -3 && marca <= 3) 
			? "El número digitado está entre -3 y 3" : "El número no digitado está entre -3 y 3");
	}// Fin posicionNumero()

}//Fin Class
