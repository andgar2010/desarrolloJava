/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad02_02_vector;

import javax.swing.JOptionPane;

/**
 *
 * @author @author Andrés Felipe García
 * Created in 2017-07-25
 */
public class Actividad02_02_Vector {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		//Inicializar vector
		int vector[] = {0,2,4,6,7,9};
		int campo;

		// Ingresa número campo para busqueda igual inicializar vector
		campo = Integer.parseInt(
					JOptionPane.showInputDialog(
						"Por favor ingresa número para busqueda en incializar vector 0-9 ")
				);
		
		// Inicia Busqueda igual numero entre campo y vector
		boolean encontrado = false;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == campo)
			{
				encontrado = true;
			}
		}
		
		// Muestra ventana mensaje al usuario 
		if (encontrado) {
			JOptionPane.showMessageDialog(null, "Encontrado número");
		} else {
			JOptionPane.showMessageDialog(null, "No encontrado número que usted ingresa");
		}
 	}
}
