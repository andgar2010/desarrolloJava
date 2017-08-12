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
		
		int elemVector;	
		int campo;

		// Ingresa cantidad elemento en vector
		elemVector = Integer.parseInt(
			JOptionPane.showInputDialog("Por favor ingresa cantidad elemento de vector"));
		
		//Crear vector por elemento
		int vector[] = new int[elemVector];
		
		// Ingresa los números por cada posición en vector
		llenarVector(vector);
		
		// Ingresa número campo para busqueda igual inicializar vector
		campo=ingresarCampo();
		
		// Inicia Busqueda igual numero entre campo y vector y  Muestra ventana mensaje al usuario
		if (buscarComparativa(vector, campo)) 
		{
			JOptionPane.showMessageDialog(null, "El número "+campo+" fue Encontrado");
		} else {
			JOptionPane.showMessageDialog(null, "No encontrado número que usted ingresa: "+ campo);
		}	
		
 	}//Fin Main
	
	public static void llenarVector(int vector[])
	{
		for (int i = 0; i < vector.length; i++) 
		{
			vector[i] = Integer.parseInt(
				JOptionPane.showInputDialog(
				"Ingresa los números por cada un espacio\nDigite el número en posición " + (i+1)));
		}
		
	}//Fin ingresa los números por cada posición en vector
	
	public static int ingresarCampo()
	{
		// Ingresa número campo para busqueda igual inicializar vector
		int campo;
		campo = Integer.parseInt(
					JOptionPane.showInputDialog(
						"Por favor ingresa número para busqueda en un vector")
				);
		return campo;
	}//Fin Ingresar un numero campo()
	
	public static boolean buscarComparativa(int vector[], int campo){
		boolean encontrado = false;
		for (int i = 0; i < vector.length; i++) 
		{
			if (vector[i] == campo)
			{
				encontrado = true;
			}
		}
		return encontrado;
	}//Fin buscarComparativa()
}