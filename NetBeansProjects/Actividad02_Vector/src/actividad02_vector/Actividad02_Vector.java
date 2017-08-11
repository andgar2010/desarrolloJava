/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad02_vector;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Felipe García
 * Created in 2017-07-24
 */
public class Actividad02_Vector {

	/**
	 * @param args the command line arguments
	 * 
	 */
	public static void main(String[] args) {
	
		int posVector;

		posVector = Integer.parseInt(
				JOptionPane.showInputDialog("Por favor ingresa cantidad posición de vector"));
		
		int vector[] = new int[posVector];
		
		for (int i = 0; i < posVector; i++) {
			vector[i] = Integer.parseInt(
				JOptionPane.showInputDialog(
				"Ingresa los números por cada un espacio\nDigite el número en posición " + (i+1)
				)
			);
		}
		
		JOptionPane.showMessageDialog(null,
			"Guardado los números en vector son");
		
		for (int i = 0; i < posVector; i++) {
			System.out.println("|"+vector[i] + "|");
			//JOptionPane.showMessageDialog(null, "|"+vector[i] + "|-");
		}	
	}	
}
