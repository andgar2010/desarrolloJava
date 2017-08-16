/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad07;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres Felipe Garcia Ramirez
 * Created in 2017-08-08
 */
public class Actividad07 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int menu, inicio = 0, pesoTierra;
		
		JOptionPane.showMessageDialog(null, "Bienvienido Actividad #7");
		
		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Selecciona:\n1. Muestra cuantos tiene dias por mes\n2. Peso en Luna"));
			
			switch(menu)
			{
				case 1:
					calcularDiasMes();
					break;//Fin Case 1
				case 2:
					pesoTierra = Integer.parseInt(JOptionPane.showInputDialog(
					"ingresa su peso en Kilogramos (Kg)"));
					calcularPeso_Luna(pesoTierra);
					break;//Fin Case 2
			}
			
			inicio = Integer.parseInt(
				JOptionPane.showInputDialog(
					"Que desea repetir desde menu?\nSelecciona\n1. Si\n2. No"));
			
		} while (inicio == 1);
		
	}//Fin Main
	
	public static void calcularPeso_Luna(int pesoTierra)
	{
		JOptionPane.showMessageDialog(null , "En luna, su peso efectivo es " + (pesoTierra * 0.17) + "Kg");
	}//Fin calcularPeso_Luna
	
	public static void calcularDiasMes()
	{
		int mes, aino, dias_en_Mes = 0;
		boolean valida = false;
		
		mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero de mes: "));
		
		aino = Integer.parseInt(JOptionPane.showInputDialog("Ingresa año"));
		
		switch (mes) {
            case 2:
                if ((aino % 400 == 0) || ((aino % 4 == 0) && (aino % 100 != 0))) {
                    dias_en_Mes = 29;
                } else {
                    dias_en_Mes = 28;
                }
				valida = true;
                break;
			case 1:
            case 3:
			case 5:
            case 7:
            case 8:
			case 10:
			case 12:
				dias_en_Mes = 31;
				valida = true;
                break;
            case 4:
            case 6:
            case 9:
			case 11:
                dias_en_Mes = 30;
				valida =  true;
                break;
			default:
				valida = false;
		}

		if (valida == true) 
		{
			JOptionPane.showMessageDialog(null, mes + "° Mes de " + aino + " tiene " + dias_en_Mes + " dias");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Usted ingresa numero " + mes + " mes\nIncorrecta numero de mes");
		}   
	}//Fin calcularDiasMes()
	
}//Fin Class
