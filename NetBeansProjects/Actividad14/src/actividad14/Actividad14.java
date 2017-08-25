/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad14;

import javax.swing.JOptionPane;

/**
 *
 * @author andga
 */
public class Actividad14
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		double vRentaLiquida, vPatrimonio, vValorCredito, valorTotal;
		int numCreditos, repInicio;
		String nomEstudiante;

		do {
			nomEstudiante = JOptionPane.showInputDialog("Ingresa su nombre completo:");
			
			do 
			{
				numCreditos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa cantidad los créditos:"));
				if (numCreditos <= 0) 
				{
					JOptionPane.showMessageDialog(null, "Por favor ingresa los numeros desde 1 credito. No existe los números negativos");
				}
			}while (numCreditos <= 0);

			do 
			{
				vPatrimonio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa cantidad su patrimonio:"));
				if (vPatrimonio < 0) 
				{
					JOptionPane.showMessageDialog(null, "Por favor ingresa valor real. No existe los números negativos");
				}
			}
			while (vPatrimonio < 0);
			
			do 
			{
			vRentaLiquida = Double.parseDouble(JOptionPane.showInputDialog("Ingresa cantidad su renta liquida:"));
				if (vRentaLiquida < 0) {
					JOptionPane.showMessageDialog(null, "Por favor ingresa valor real. No existe los números negativos");
				}
			}
			while (vRentaLiquida < 0);

			vValorCredito = calcularValorCredito(vPatrimonio, vRentaLiquida);

			valorTotal = vValorCredito * numCreditos;

			JOptionPane.showMessageDialog(null, "Nombre: " + nomEstudiante + "\nCréditos: " + numCreditos + "\nValor de cada crédito: $" + vValorCredito + "\nValor total a pagar por concepto de marticula: $" + valorTotal);

			repInicio = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresa otro estudiante para calcular?\nSi marca 1.\nNo marca cualquier"));
		}
		while (repInicio == 1);

	}//Fin Main

	public static double calcularValorCredito(double vPatrimonio, double vRentaLiquida)
	{
		double valorCredito;		
		
		if (vRentaLiquida <= 25000 || vPatrimonio <= 100000) {
			valorCredito = 130;
		}
		else if (vRentaLiquida <= 30000 || vPatrimonio <= 150000) {
			valorCredito = 200;
		}
		else if (vRentaLiquida <= 40000 || vPatrimonio <= 210000) {
			valorCredito = 280;
		}
		else {
			valorCredito = 315;
		}

		return (double) valorCredito;
	}//Fin calcularValorCredito()

}
