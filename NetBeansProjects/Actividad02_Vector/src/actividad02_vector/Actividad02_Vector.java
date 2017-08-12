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
	public static void main(String[] args) 
	{
		int elemVector;		

		// Ingresa cantidad elemento en vector
		elemVector = Integer.parseInt(
			JOptionPane.showInputDialog("Por favor ingresa cantidad elemento de vector"));
		
		//Crear vector por elemento
		int vector[] = new int[elemVector];
		
		// Ingresa los números por cada posición en vector
		llenarVector(vector);
		 		
		// Muestra ventana los números en un vector
		imprimir(vector);		
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
	
	
	public static void imprimir(int vector[])
	{	
		String temp = "";
		
		for (int i = 0; i < vector.length; i++) 
		{			
			temp += " | " + vector[i];
		}
		
		JOptionPane.showMessageDialog(null,
			"Guardado los números en vector son\n" + temp + " |");
		
	}//Fin Muestra ventana los números en un vector
}