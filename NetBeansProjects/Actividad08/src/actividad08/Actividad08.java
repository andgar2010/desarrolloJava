/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08;

import javax.swing.JOptionPane;

/**
 *
 * @author andga
 */
public class Actividad08 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		int inicio = 0, marca;
		char inputUserChar;
		int resultChar;
		String msg = "", inputUserWord, invertidaPalabra;

		JOptionPane.showMessageDialog(null, "Bienvenido Actividad #8\nPor Andrés García Ficha 1320652-2");

		do {

			int menu = Integer.parseInt(
					JOptionPane.showInputDialog("Selecciona ejercicio:\n1. Invertir palabra\n2. Letras o números"));

			switch (menu) {
				case 1:
					invertidaPalabra = invertirPalabra(inputUserWord = JOptionPane.showInputDialog("Por favor ingresa una palabra"));
					JOptionPane.showMessageDialog(null, "Palabra " + inputUserWord + " ----->  " + invertidaPalabra);
					break;//Fin CASE 1 InvertirPalabra
				
				case 2:
					resultChar = verificarTipoCaracter(
							inputUserChar = (JOptionPane.showInputDialog(
									"Por favor digita cualquier tecla")).charAt(0));

					switch (resultChar) {
						case 1:
							msg = " es Numero";
							break;
						case 2:
							msg = " es Simbolo";
							break;
						case 3:
							msg = " es Letra";
							break;
					}

					JOptionPane.showMessageDialog(null, inputUserChar + msg);

					break;//Fin CASE 2 verificarTipoCaracter
			}

			inicio = Integer.parseInt(
					JOptionPane.showInputDialog(
							"Que desea repetir desde menu?\nSelecciona\n1. Si\n2. No"));

		} while (inicio == 1);
	}//Fin Main

	public static int verificarTipoCaracter(char inputUserChar) {

		char[] numero = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		char[] simbolo = {'.', ',', '[', ']', '\\', '=', '-', '`', '/', '-', '*', '+', '<', '>', '?', '"', '}', '{', '|', '_', ')', '(', '*', '&', '&', '^', '%', '$', '#', '@', '!', '~', '¬'};
		int result = 0;

		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == inputUserChar) {
				result = 1;//Es Numero
				break;
			}
			
			for (int j = 0; j < simbolo.length; j++) {
				if (simbolo[j] == inputUserChar) {
					result = 2;//Es Simbolo
					break;
				} else {
					result = 3;//Es letra
				}
			}
		}

		return result;
	}//Fin verificarTipoCaracter()

	public static String invertirPalabra(String inputUserWord) {
		
		int countChar;
		String invertidaPalabra = "";
		
		countChar = inputUserWord.length();
		
		for (int i = (countChar-1); i >=0; i--) 
		{			
			invertidaPalabra+= inputUserWord.charAt(i);	
		}
		
		return invertidaPalabra;
		
	}// Fin invertirPalabra()
}
