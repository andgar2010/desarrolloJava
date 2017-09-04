using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad11
{
	public class Actividad11
	{
		static void Main(string[] args)
		{
			int numIngresa, opcionMenu, repInicio;

			do
			{
				Console.WriteLine("\nSelecciona ejercicio:\n1. Edad\n2. Valor absoluto\n3. Cual posicion número");
				opcionMenu = Int32.Parse(Console.ReadLine());

				switch (opcionMenu)
				{
					case 1:
						Console.WriteLine("\nIngresa su edad:");
						int edad = Int32.Parse(Console.ReadLine());
						Console.WriteLine((edad <= 3 && edad >= 0) ? ("Tu edad es bebé") : ((edad <= 12 && edad >= 4) ? ("Tu edad es Niño") : ((edad <= 17 && edad >= 13) ? ("Tu edad es Adolescente") : ((edad <= 100 && edad >= 18) ? ("Tu edad es Adulto") : ("Tu edad es fuera de limite???")))));
						break;//Fin CASE 1 

					case 2:
						/* JAVA Ejemplo No 2. Operador ternario Calcule el valor absoluto de un número. Para ello utilizar dos variables: numero y valorAbsoluto. Repita con ciclo a su elección.*/
						Console.WriteLine("\nIngresa el numero");
						numIngresa = Int32.Parse(Console.ReadLine());
						Console.WriteLine((numIngresa < 0) ? ("Valor absoluto es " + (numIngresa *= -1)) : ("Valor absoluto es " + numIngresa));
						break;//Fin CASE 2 

					case 3:
						/*JAVA Ejemplo No 3. Operador ternario Lea un número e indique si es +, - , 0. Repita con ciclo a su elección.*/
						Console.WriteLine("\nIngresa el numero");
						numIngresa = Int32.Parse(Console.ReadLine());
						Console.WriteLine((numIngresa == 0) ? ("Es número neturo") : ((numIngresa < 0) ? ("Es número negativo") : ("Es número postivo")));
						break;//Fin CASE 3 
				}//Fin menu	

				Console.WriteLine("\nQue desea repetir desde menu?\nSelecciona\n1. Si\n2. No");
				repInicio = Int32.Parse(Console.ReadLine());
			}
			while (repInicio == 1);
		}//Fin Main
	}
}
