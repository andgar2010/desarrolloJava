package actividad15;

import javax.swing.JOptionPane;

/**
 * <h2>Componente JAVA Actividad N°15 Comprobar fecha</h2>
 * <p>
 * <b>Andrés Felipe García Ramirez</b>
 * <a href="mailto:afgarcia0479@misena.edu.co">&lt;afgarcia0479@misena.edu.co&gt;</a>
 * <br><i>Estudiante Tecnología en Análisis y Desarrollo de Sistemas de Información (ADSI) - Ficha 1320652-2</i>
 * <p>
 * COMPONENTE JAVA (FASE III) - Instructora Sandra Peñaranda
 * <br>CENTRO ELECTRICIDAD, ELECTRÓNICA Y TELECOMUNICACIONES (CEET) - SENA REGIONAL DISTRITO CAPITAL, COLOMBIA.
 * <p>
 * <br><b>Descripción:</b>
 * Actividad N°15 Comprobar fecha
 *
 * @author Andrés Felipe García Ramirez <a href="mailto:afgarcia0479@misena.edu.co">&lt;afgarcia0479@misena.edu.co&gt;</a>
 * <br>Estudiante Tecnología en Análisis y Desarrollo de Sistemas de Información (ADSI).
 * @version 0.1 2017-08-24
 * @since 2017-08-24
 * @see <a href="https://www.github.com/andgar2010">Repo's Andrés García - GitHub.com</a>
 */
public class Actividad15
{

	public static void main(String[] args)
	{
		int inicio, dia, mes, anio, inicioAnio, finAnio, opcionMenu;
		String nomMes = "";
		boolean validaDiaMes, diasBisieto, siAnioBisiesto;

		JOptionPane.showMessageDialog(null, "Bienvienido Actividad #15\nBy Andrés García");

		do {
			opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("Elegir opcion:\n1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio"));

			switch (opcionMenu) {
				case 1:
					do {
						dia = Integer.parseInt(
								JOptionPane.showInputDialog("Ingresa día:"));
						if (dia < 0) {
							JOptionPane.showMessageDialog(null, "Incorrecta\nNo existe día negativo de fecha");
						}
					}
					while (dia < 0);

					do {
						mes = Integer.parseInt(
								JOptionPane.showInputDialog("Ingresa numero de mes:"));
						if (mes < 0) {
							JOptionPane.showMessageDialog(null, "Incorrecta\nNo existe mes negativo");
						}
					}
					while (mes < 0);

					do {
						anio = Integer.parseInt(
								JOptionPane.showInputDialog("Ingresa año"));
						if (anio < 1200 || anio > 2200) {
							JOptionPane.showMessageDialog(null, "Lo siento, no puede ingresa, porque usted fuera de rango año");
						}
					}
					while (anio < 1200 || anio > 2200);

					diasBisieto = verficiarBisiesto(anio);

					nomMes = convertirNumMes_NombreMes(mes);

					validaDiaMes = verificarFechaCorrecta(dia, mes, anio, diasBisieto);

					if (validaDiaMes == true) {
						JOptionPane.showMessageDialog(null, dia + " " + nomMes + " de " + anio + "----> Correcta");
					}
					else {
						JOptionPane.showMessageDialog(null, "Usted ingresa " + dia + " " + nomMes + " de " + anio + " \nEs fecha incorrecta");
					}
					break; //Fin Case 1 Ejercicio

				case 2:

					String msgAnio = "";

					do {
						inicioAnio = Integer.parseInt(
								JOptionPane.showInputDialog("Ingresa inicio año"));
						if (inicioAnio < 1200 || inicioAnio > 2200) {
							JOptionPane.showMessageDialog(null, "Lo siento, no puede ingresa, porque usted fuera de rango año");
						}
					}
					while (inicioAnio < 1200 || inicioAnio > 2200);

					do {
						finAnio = Integer.parseInt(
								JOptionPane.showInputDialog("Ingresa fin año"));
						if (finAnio < inicioAnio || finAnio > 2200) {
							JOptionPane.showMessageDialog(null, "Lo siento, no puede ingresa, porque usted fuera de rango año");
						}
					}
					while (finAnio < inicioAnio || finAnio > 2200);

					int count = 0;

					for (int i = inicioAnio; i <= finAnio; i++) {

						siAnioBisiesto = verficiarBisiesto(i);

						if (siAnioBisiesto) {
							msgAnio += (i + " | ");
							count++;
						}

						if (count == 30) {
							JOptionPane.showMessageDialog(null, "Año Inicio " + inicioAnio
																+ "\nFin año " + finAnio + "\n Si tiene año bisiesto: \n"
																+ msgAnio);
							count = 0;
							msgAnio = "";
						}
					}

					break;//Fin Case 2 Ejercicio

				case 3:
					int totalDMA = 0;

					do {
						dia = Integer.parseInt(
								JOptionPane.showInputDialog("Ingresa día:"));
						if (dia < 0) {
							JOptionPane.showMessageDialog(null, "Incorrecta\nNo existe día negativo de fecha");
						}
					}
					while (dia < 0);

					do {
						mes = Integer.parseInt(
								JOptionPane.showInputDialog("Ingresa numero de mes:"));
						if (mes < 0) {
							JOptionPane.showMessageDialog(null, "Incorrecta\nNo existe mes negativo");
						}
					}
					while (mes < 0);

					do {
						anio = Integer.parseInt(
								JOptionPane.showInputDialog("Ingresa año"));
						if (anio < 1200 || anio > 2200) {
							JOptionPane.showMessageDialog(null, "Lo siento, no puede ingresa, porque usted fuera de rango año");
						}
					}
					while (anio < 1200 || anio > 2200);

					totalDMA = dia + mes + anio;// 1967

					int resultMod, resultSum =0, digTotalDMA, digResultSum ;
					String sTotalDMA = "", sResultSum = "";
					do
					{				
						resultMod = totalDMA % 10;
						System.out.println("\ntotalDMA  %10  = ResultMod sum1");
						System.out.println(totalDMA+"\t%10\t=" + resultMod);
						
						resultSum = resultSum + resultMod;						
						System.out.println("\nAntSum + resultModSum1 = NueSum:\n" + (resultSum - resultMod) + " + " + resultMod + " = " + resultSum);
						
						System.out.println("\ntotalDMA / 10\n" + totalDMA + "/ 10 =" + (totalDMA/10));
						totalDMA = totalDMA / 10;
						
						sTotalDMA = String.valueOf(totalDMA);
						digTotalDMA = sTotalDMA.length();
						
						sResultSum = String.valueOf(resultSum);
						digResultSum = sResultSum.length();
						
						if (digResultSum >= 1) {
							totalDMA = resultSum;
						}
						
						
					}while (digResultSum == 1);				
					
					System.out.println("totalDMA menos 10 digitos: " + totalDMA);
					
					
					
					
//					
//					
//					String sTotalDMA = String.valueOf(totalDMA); //"1967"
//					int digtsTotalDMA = sTotalDMA.length(); //4 digits
//					int digtCD, //a digit 1 -> 9 -> 6 -> 7
//					 sumDMA = 0;
//
//					do {
//						for (int i = 0; i < digtsTotalDMA; i++) {
//							digtCD = Character.getNumericValue(sTotalDMA.charAt(i));
//							System.out.println(i + " digtCD: " + digtCD);
//							sumDMA += digtCD;
//							System.out.println(i + " sumDMA: " + sumDMA);
//						}
//						if (sumDMA < 10 && sumDMA > 0) {
//							System.out.println("15. sTotalDMA: " + sTotalDMA);
//						}
//						else
//						{
//							sTotalDMA = String.valueOf(sumDMA);
//							digtsTotalDMA = sTotalDMA.length();
//						}
//					}
//					while (sumDMA < 10 && sumDMA > 0);

					
					/*
					
					String sSumDMA = String.valueOf(sumDMA);
					int sSumLeg = sSumDMA.length(),
					 sumDMA1 = 0;
					sumDMA = 0;

					digtCD = Character.getNumericValue(sSumDMA.charAt(0));
					System.out.println("3. digtCD: " + digtCD);
					sumDMA += digtCD;
					sSumDMA = String.valueOf(sumDMA);
					System.out.println("3. sumDMA: " + sumDMA);

					digtCD = Character.getNumericValue(sSumDMA.charAt(1));
					System.out.println("4. digtCD: " + digtCD);
					sumDMA += digtCD;
					sSumDMA = String.valueOf(sumDMA);
					System.out.println("4. sumDMA: " + sumDMA);
*/

//					
//					int sum = 0, resultModTotalDMA = 0;
//					
//					System.out.println("dia\t+\tmes\t+\tanio\t=totalDMA");
//					System.out.println(dia + "\t+\t" + mes + "\t+\t" + anio + "\t=" + totalDMA);
//					
//					do {
//						resultModTotalDMA = totalDMA % 10;
//						System.out.println("\ntotalDMA  %10  = ResultMod totalDMA");
//						System.out.println(totalDMA+"\t%10\t=" + resultModTotalDMA);
//						
//						sum = sum + resultModTotalDMA;						
//						System.out.println("\nAntSum + ResultModDMA = NueSum:\n" + (sum - resultModTotalDMA) + " + " + resultModTotalDMA + " = " + sum);
//						
//						totalDMA = totalDMA / 10;
//						System.out.println("\ntotalDMA:\n"+totalDMA);
//					}
//					while (totalDMA > 0);					
//
//					System.out.println("sum :"+sum);
//					
//					int sum1 = sum;
//					int resultModSum1 = 0, resSum = 0;
//					
//					do {
//						resultModSum1 = sum1 % 10;
//						System.out.println("\nsum1  %10  = ResultMod sum1");
//						System.out.println(sum1+"\t%10\t=" + resultModSum1);
//						
//						resSum = resSum + resultModSum1;						
//						System.out.println("\nAntSum + resultModSum1 = NueSum:\n" + (resSum - resultModSum1) + " + " + resultModSum1 + " = " + resSum);
//						
//						System.out.println("\nsum1 / 10\n" + sum1 + "/ 10 =" + (sum1/10));
//						sum1 = sum1 / 10;
//					}
//					while (sum1 > 9);
//					
//					System.out.println("sum1 :"+sum1);
//					do {
//
//					String sum1 = sum + "";
//
//					int temp1 = Integer.parseInt("" + sum1.charAt(0));
//					System.out.println("temp1: " + temp1);
//					int temp2 = Integer.parseInt("" + sum1.charAt(1));
//					System.out.println("temp2: " + temp2);
//					int totalNum1 = temp1 + temp2;
//					System.out.println("totalNum: " + totalNum1);
//					
//					
//						
//					}
//					while (totalNum1 < 9);
//					String stotalNum = "" + totalNum1;
//
//					temp1 = Integer.parseInt("" + stotalNum.charAt(0));
//					System.out.println("temp1: " + temp1);
//					temp2 = Integer.parseInt("" + stotalNum.charAt(1));
//					System.out.println("temp2: " + temp2);
//					int totalNum2 = temp1 + temp2;
//					System.out.println("totalNum: " + totalNum2);
//					int num = 321;
//					int sum = 0;
//					while (num > 0) {
//						sum = sum + num % 10;
//						num = num / 10;
//					}
//					System.out.println(sum);
//					
//					if (totalDMA % 1000 > 1000) {
//						
//					}
//					
//					
//					int resulTotalDMA = (totalDMA % 1000 );
//					// 967
//					
//					System.out.println("totalDMA: " + totalDMA + "\nresult mod 1000:" + resulTotalDMA);
//					
//					
//					
//					
//
//					String sTotalDMA = totalDMA + "";
//
//					int totalNum1 = 0,
//					 temp,
//					 temp1,
//					 totalNum2 = 0,
//					 digito = 0;
//
//					do {
//						for (int i = 0; i <= (sTotalDMA.length()-1); i++) {
//							temp = Integer.parseInt("" + sTotalDMA.charAt(i));
//							System.out.println("temp: " + temp);
//							totalNum1 += temp;
//							System.out.println("totalNum1: " +  totalNum1);							
//						}
//
//						String sTotalNum1 = totalNum1 + "";
//						System.out.println("sTotalNum1: " + sTotalNum1);
//					}
//					while (sTotalDMA.length() == digito);
//					
//					for (int i = 0; i < 1; i++) {
//						temp = Integer.parseInt("" + sTotalDMA.charAt(i));
//						System.out.println("temp: " + temp);
//						totalNum2 += temp;
//						System.out.println("totalNum2: " +  totalNum2);							
//					}
//					
//					
//					JOptionPane.showMessageDialog(null, "Resultado: " + totalNum2);
					break;//Fin Case 3 Ejercicio

			}//Fin Switch OpcionMenu
			inicio = Integer.parseInt(
					JOptionPane.showInputDialog(
							"Que desea repetir desde menu?\nSelecciona"
							+ "\n1. Si\n2. No"));

		}
		while (inicio == 1);

	}//Fin Main

	public static String convertirNumMes_NombreMes(int mes)
	{
		String nomMes = "";

		switch (mes) {
			case 1:
				nomMes = "enero";
				break;
			case 2:
				nomMes = "febrero";
				break;
			case 3:
				nomMes = "marzo";
				break;
			case 4:
				nomMes = "abril";
				break;
			case 5:
				nomMes = "mayo";
				break;
			case 6:
				nomMes = "junio";
				break;
			case 7:
				nomMes = "julio";
				break;
			case 8:
				nomMes = "agosto";
				break;
			case 9:
				nomMes = "septiembre";
				break;
			case 10:
				nomMes = "octubre";
				break;
			case 11:
				nomMes = "noviembre";
				break;
			case 12:
				nomMes = "diciembre";
				break;
		}

		return nomMes;
	}//Fin convertirNumMes_NombreMes()

	public static boolean verficiarBisiesto(int aino)
	{
		boolean diasBisieto;
		if ((aino % 400 == 0) || ((aino % 4 == 0) && (aino % 100 != 0))) {
			diasBisieto = true;
		}
		else {
			diasBisieto = false;
		}
		return diasBisieto;
	}

	public static boolean verificarFechaCorrecta(int dia, int mes, int anio, boolean diasBisieto)
	{
		boolean validaDiaMes = false;
		int numDiasBisieto;

		if (diasBisieto == true) {
			numDiasBisieto = 29;
		}
		else {
			numDiasBisieto = 28;
		}

		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (30 >= dia)//4,6,9,11 meses son 30 Dias
			{
				validaDiaMes = true;
			}
			else {
				validaDiaMes = false;
			}
		}
		else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (31 >= dia) //1,3,5,7,8,10,12 meses son 31 Dias
			{
				validaDiaMes = true;
			}
		}
		else if (mes == 2) {
			if (numDiasBisieto >= dia) {
				validaDiaMes = true;
			}
			else {
				validaDiaMes = false;
			}
		}
		else {
			validaDiaMes = false;
		}

		return validaDiaMes;

	}//Fin verificarFechaCorrecta()

}//Fin Class
