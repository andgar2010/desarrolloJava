using System;

namespace Actividad15
{
	internal class Actividad15
	{
		public static void Main(String[] args)
		{
			int inicio, dia, mes, anio, inicioAnio, finAnio, opcionMenu;
			String nomMes = "";
			bool validaDiaMes, diasBisieto, siAnioBisiesto;

			Console.WriteLine("Bienvienido Actividad #15\nBy Andrés García");

			do
			{
				Console.WriteLine("Elegir opcion:\n1. Ejercicio Comprobrar fecha correcta \n2. Ejercicio Mostrar años bisietos\n3. Ejercicio 3");
				opcionMenu = Int32.Parse(Console.ReadLine());

				switch (opcionMenu)
				{
					case 1:
						ejecutarEjericio1();
						break; //Fin Case 1 Ejercicio

					case 2:
						ejecutarEjericio2();
						break;//Fin Case 2 Ejercicio

					case 3:
						ejecutarEjericio3();
						break;//Fin Case 3 Ejercicio

				}//Fin Switch OpcionMenu
				Console.WriteLine("\nQue desea repetir desde menu?\nSelecciona"
								+ "\n1. Si\n2. No");
				inicio = Int32.Parse(Console.ReadLine());
			}
			while (inicio == 1);
		}//Fin Main

		public static void ejecutarEjericio1()
		{
			int dia, mes, anio;
			String nomMes = "";
			bool validaDiaMes, diasBisieto;

			do
			{
				Console.WriteLine("\nIngresa día:");
				dia = Int32.Parse(Console.ReadLine());
				if (dia <= 0)
				{
					Console.WriteLine("Incorrecta\nNo existe día negativo de fecha");
				}
				else if (dia > 31)
				{
					Console.WriteLine("Incorrecta\nNo existe más 31 días de mes");
				}
			}
			while (dia <= 0 || dia > 31);

			do
			{
				Console.WriteLine("Ingresa numero de mes:");
				mes = Int32.Parse(Console.ReadLine());
				if (mes <= 0)
				{
					Console.WriteLine("Incorrecta\nNo existe mes negativo");
				}
				else if (mes > 12)
				{
					Console.WriteLine("Incorrecta\nNo existe más 12 mes de fecha");
				}
			}
			while (mes <= 0 || mes > 12);

			do
			{
				Console.WriteLine("Ingresa año");
				anio = Int32.Parse(Console.ReadLine());
				if (anio < 1200 || anio > 2200)
				{
					Console.WriteLine("Lo siento, no puede ingresa, porque usted fuera de rango año");
				}
			}
			while (anio < 1200 || anio > 2200);

			diasBisieto = verificarBisiesto(anio);

			nomMes = convertirNumMes_NombreMes(mes);

			validaDiaMes = VerificarFechaCorrecta(dia, mes, anio, diasBisieto);

			if (validaDiaMes == true)
			{
				Console.WriteLine(dia + " " + nomMes + " de " + anio + "----> Correcta");
			}
			else
			{
				Console.WriteLine("Usted ingresa " + dia + " " + nomMes + " de " + anio + " \nEs fecha incorrecta");
			}
		}//Fin ejecutarEjericio1()


		public static void ejecutarEjericio2()
		{
			int inicioAnio, finAnio;
			String nomMes = "", msgAnio = "";
			bool siAnioBisiesto;

			do
			{
				Console.WriteLine("\nIngresa inicio año");
				inicioAnio = Int32.Parse(Console.ReadLine());
				if (inicioAnio < 1200 || inicioAnio > 2200)
				{
					Console.WriteLine("Lo siento, no puede ingresa, porque usted fuera de rango año");
				}
			}
			while (inicioAnio < 1200 || inicioAnio > 2200);

			do
			{
				Console.WriteLine("Ingresa fin año");
				finAnio = Int32.Parse(Console.ReadLine());
				if (finAnio < inicioAnio || finAnio > 2200)
				{
					Console.WriteLine("Lo siento, no puede ingresa, porque usted fuera de rango año");
				}
			}
			while (finAnio < inicioAnio || finAnio > 2200);

			int count = 0;

			Console.WriteLine("\nAño Inicio " + inicioAnio + "\nFin año " + finAnio + "\nSi tiene año bisiesto:");

			for (int i = inicioAnio; i <= finAnio; i++)
			{
				siAnioBisiesto = verificarBisiesto(i);

				if (siAnioBisiesto)
				{
					msgAnio += i + " | ";

					count++;
				}

				if (count == 10)
				{
					Console.WriteLine("{0}", msgAnio);
					Console.ReadKey(true);
					count = 0;
					msgAnio = "";
				}
			}

			Console.WriteLine("{0}", msgAnio);

		}//Fin ejecutarEjericio2

		public static void ejecutarEjericio3()
		{
			int totalDMA = 0 , dia, mes, anio;
			String nomMes = "";

			do
			{
				Console.WriteLine("\nIngresa día:");
				dia = Int32.Parse(Console.ReadLine());
				if (dia <= 0)
				{
					Console.WriteLine("Incorrecta\nNo existe día negativo de fecha");
				}
				else if (dia > 31)
				{
					Console.WriteLine("Incorrecta\nNo existe más 31 días de mes");
				}
			}
			while (dia <= 0 || dia > 31);

			do
			{
				Console.WriteLine("Ingresa numero de mes:");
				mes = Int32.Parse(Console.ReadLine());
				if (mes <= 0)
				{
					Console.WriteLine("Incorrecta\nNo existe mes negativo");
				}
				else if (mes > 12)
				{
					Console.WriteLine("Incorrecta\nNo existe más 12 mes de fecha");
				}
			}
			while (mes <= 0 || mes > 12);

			do
			{
				Console.WriteLine("Ingresa año");
				anio = Int32.Parse(Console.ReadLine());
				if (anio < 1200 || anio > 2200)
				{
					Console.WriteLine("Lo siento, no puede ingresa, porque usted fuera de rango año");
				}
			}
			while (anio < 1200 || anio > 2200);

			totalDMA = dia + mes + anio;// 1967

			int resultMod, resultSum = 0, digTotalDMA, digResultSum;
			String sTotalDMA = "", sResultSum = "";
			do
			{
				resultMod = totalDMA % 10;
				Console.WriteLine("\ntotalDMA  %10  = ResultMod sum1");
				Console.WriteLine(totalDMA + "\t%10\t=" + resultMod);

				resultSum = resultSum + resultMod;
				Console.WriteLine("\nAntSum + resultModSum1 = NueSum:\n" + (resultSum - resultMod) + " + " + resultMod + " = " + resultSum);

				Console.WriteLine("\ntotalDMA / 10\n" + totalDMA + "/ 10 =" + (totalDMA / 10));
				totalDMA = totalDMA / 10;

				sTotalDMA = Convert.ToString(totalDMA);
				digTotalDMA = sTotalDMA.Length;

				sResultSum = Convert.ToString(resultSum);
				digResultSum = sResultSum.Length;

				if (digResultSum >= 1)
				{
					totalDMA = resultSum;
				}
			} while (digResultSum == 1);

			Console.WriteLine("totalDMA menos 10 digitos: " + totalDMA);
		}//Fin ejectuarEjercicio3

		public static String convertirNumMes_NombreMes(int mes)
		{
			String nomMes = "";

			switch (mes)
			{
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

		public static bool verificarBisiesto(int aino)
		{
			bool diasBisieto;
			if ((aino % 400 == 0) || ((aino % 4 == 0) && (aino % 100 != 0)))
			{
				diasBisieto = true;
			}
			else
			{
				diasBisieto = false;
			}
			return diasBisieto;
		}//Fin verificarBisiesto()

		public static bool VerificarFechaCorrecta(int dia, int mes, int anio, bool diasBisieto)
		{
			bool validaDiaMes = false;
			int numDiasBisieto;

			if (diasBisieto == true)
			{
				numDiasBisieto = 29;
			}
			else
			{
				numDiasBisieto = 28;
			}

			if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			{
				if (30 >= dia)//4,6,9,11 meses son 30 Dias
				{
					validaDiaMes = true;
				}

			}
			else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
			{
				if (31 >= dia) //1,3,5,7,8,10,12 meses son 31 Dias
				{
					validaDiaMes = true;
				}
			}
			else if (mes == 2)
			{
				if (numDiasBisieto >= dia)
				{
					validaDiaMes = true;
				}

			}
			return validaDiaMes;
		}//Fin verificarFechaCorrecta()
	}//Fin Class
}