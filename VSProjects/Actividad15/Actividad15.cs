using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad15
{
	class Actividad15
	{
		public static void Main(String[] args)
		{
			int inicio, dia, mes, anio;
			String nomMes = "";
			bool validaDiaMes, diasBisieto;

			Console.WriteLine("Bienvienido Actividad #15\nBy Andrés García");

			do
			{
				do
				{
					Console.WriteLine("\nIngresa día:");
					dia = Int32.Parse(Console.ReadLine());
					if (dia < 0)
					{
						Console.WriteLine("Incorrecta\nNo existe día negativo de fecha");
					}
				}
				while (dia < 0);

				do
				{
					Console.WriteLine("Ingresa numero de mes:");
					mes = Int32.Parse(Console.ReadLine());
					if (mes < 0)
					{
						Console.WriteLine("Incorrecta\nNo existe mes negativo");
					}
				}
				while (mes < 0);

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

				validaDiaMes = verificarFechaCorrecta(dia, mes, anio, diasBisieto, nomMes);

				if (validaDiaMes == true)
				{
					Console.WriteLine("\n"+ dia + " " + nomMes + " de " + anio + " ----> Correcta");
				}
				else
				{
					Console.WriteLine("\nUsted ingresa " + dia + " " + nomMes + " de " + anio + " \nEs fecha incorrecta");
				}

				Console.WriteLine("\nQue desea repetir desde menu?\nSelecciona"
						+ "\n1. Si\n2. No");
				inicio = Int32.Parse(Console.ReadLine());

			}
			while (inicio == 1);

		}//Fin Main

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
		}

		public static bool verificarFechaCorrecta(int dia, int mes, int anio, bool diasBisieto, String nomMes)
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
				else
				{
					validaDiaMes = false;
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
				else
				{
					validaDiaMes = false;
				}
			}
			else
			{
				validaDiaMes = false;
			}

			return validaDiaMes;

		}//Fin verificarFechaCorrecta()
	}
}
