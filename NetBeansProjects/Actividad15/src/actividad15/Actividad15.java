package actividad15;

import javax.swing.JOptionPane;

/**
 * <h2>Componente JAVA Actividad N°15 Comprobar fecha</h2>
 * <p> 
 * <b>Andrés Felipe García Ramirez</b>
 * <a href="mailto:afgarcia0479@misena.edu.co">&lt;afgarcia0479@misena.edu.co&gt;</a>
 * <br><i>Estudiante Tecnología en Análisis y Desarrollo de Sistemas de Información (ADSI) 
 * - Ficha 1320652-2</i> 
 * <p>
 * COMPONENTE JAVA (FASE III) - Instructora Sandra Peñaranda
 * <br>CENTRO ELECTRICIDAD, ELECTRÓNICA Y TELECOMUNICACIONES (CEET) - 
 * SENA REGIONAL DISTRITO CAPITAL, COLOMBIA.
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
		int inicio, dia, mes, anio;
		String nomMes = "";
		boolean validaDiaMes, diasBisieto;

		JOptionPane.showMessageDialog(null, "Bienvienido Actividad #15\nBy Andrés García");

		do {
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

			validaDiaMes = verificarFechaCorrecta(dia, mes, anio, diasBisieto, nomMes);

			if (validaDiaMes == true) {
				JOptionPane.showMessageDialog(null, dia + " " + nomMes + " de " + anio + "----> Correcta");
			}
			else {
				JOptionPane.showMessageDialog(null, "Usted ingresa " + dia + " " + nomMes + " de " + anio + " \nEs fecha incorrecta");
			}

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

	public static boolean verificarFechaCorrecta(int dia, int mes, int anio, boolean diasBisieto, String nomMes)
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

}
