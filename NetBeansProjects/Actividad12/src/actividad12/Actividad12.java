/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad12;

import javax.swing.JOptionPane;

/**
 *
 * @author andga
 */
public class Actividad12
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		int numInput, digitos, resultPowMax, ultDig1_resultPot, ultDig2_resultPot, ultimos2Dig, cantDigResultPot;
		String numInputText, resultPotText, sResultPot, ultimos2DigitosResPot = "";
		boolean igualDigito, automorfico;
		long resultPot;

		numInput = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
		resultPowMax = (int) Math.pow(numInput, numInput);
		numInputText = String.valueOf(numInput);
		resultPotText = String.valueOf(resultPowMax);
		digitos = numInputText.length();
		
		//CalcularPotencia()
		System.out.println("Base | Exponente | Resultado ");
		for (int i = 1; i <= numInput; i++) {
			resultPot = (long) Math.pow(numInput, i);
			sResultPot = String.valueOf(resultPot);
			System.out.print(numInput + "    | " + i + "\t | " + resultPot + " |");

			if (digitos == 1) {
				//Cantidad digitos de Resultado Potencia
				cantDigResultPot = sResultPot.length();

				//Extraer ultima digito de Resultado Potencia "String" a variable ultDig_resultPot
				ultDig1_resultPot = Character.getNumericValue(sResultPot.charAt(cantDigResultPot - 1));

				//Comparativa inputUserNum == Ultima digito de resultado potencia
				System.out.println((igualDigito = numInput == ultDig1_resultPot) ? ("Es automórfico") : ("No es automórfico"));
			}
			else //digitos == 2
			{
				//Cantidad digitos de Resultado Potencia
				cantDigResultPot = sResultPot.length();

				//Extraer ultima digito de Resultado Potencia "String" a variable int ultDig_resultPot
				ultDig1_resultPot = Character.getNumericValue(sResultPot.charAt(cantDigResultPot - 1));

				//Extraer pentiultima digito de Resultado Potencia "String" a variable int ultDig_resultPot
				ultDig2_resultPot = Character.getNumericValue(sResultPot.charAt(cantDigResultPot - 2));

				// Int ultDig1_resultPot y ultDig2_resultPot a String variable ultimos2DigitosResPot
				ultimos2DigitosResPot = String.valueOf(ultDig2_resultPot + "" + ultDig1_resultPot);

				//String a int ultimos2Dig
				ultimos2Dig = Integer.parseInt(ultimos2DigitosResPot);

				//Comparativa inputUserNum == Ultima digito de resultado potencia
				System.out.println((igualDigito = numInput == ultimos2Dig) ? ("Es automórfico") : ("No es automórfico"));
			}

			if (sResultPot.length() >= 19) {
				System.out.println("\nLo siento, no puede mostrar más " + i + " de exponente. Digitos esta fuera de limite");
				break;
			}
		}
	}

}
