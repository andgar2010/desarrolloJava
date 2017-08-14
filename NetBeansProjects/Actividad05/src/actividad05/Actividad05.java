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
		
		int inicio=0, marca;
		
		do {
			marca = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa un numero"));
			JOptionPane.showMessageDialog(null ,(marca >= -3 && marca <= 3 )?"El número digitado está entre -3 y 3":"El número no digitado está entre -3 y 3");
			
			inicio = Integer.parseInt(
				JOptionPane.showInputDialog(
				"Que desea repetir?\nSelecciona\n1. Si\n2. No"));
		} while (inicio == 1);
		
	}
	
}