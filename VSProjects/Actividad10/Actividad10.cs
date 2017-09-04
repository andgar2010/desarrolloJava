using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad10
{
	class Actividad10
	{
		static void Main(string[] args)
		{
			int num1, num2, opcionMenu, repInicio;
			double desposito;

			do
			{
				Console.WriteLine("Selecciona ejercicio:\n1. Mayor o menor\n2. Banco bonificación?");
				opcionMenu = Int32.Parse(Console.ReadLine());

				switch (opcionMenu)
				{
					case 1:
						Console.WriteLine("Ingresa numero 1");
						num1 = Int32.Parse(Console.ReadLine());
						Console.WriteLine("Ingresa numero 2");
						num2 = Int32.Parse(Console.ReadLine());
						numeroMayor_Menor(num1, num2);
						break; //Fin CASE 1 numeroMayor_Menor

					case 2:
						Console.WriteLine("Ingresa valor para deposito");
						desposito = Int32.Parse(Console.ReadLine());
						calcularSaldo(desposito);
						break; //Fin CASE 2 calcularSaldo
				} //Fin menu	

				Console.WriteLine("\nQue desea repetir desde menu?\nSelecciona\n1. Si\n2. No");
				repInicio = Int32.Parse(Console.ReadLine());

			} while (repInicio == 1);
		} //Fin Main

		public static void numeroMayor_Menor(int num1, int num2)
		{
			int resultado;

			resultado = num1 + num2;

			if (resultado % 2 == 0)
			{
				if (num1 == num2)
				{
					Console.WriteLine("Usted Ingresa numero \"" + num1 + "\" en 1 y 2 son iguales");
				}
				else if (num1 > num2)
				{
					Console.WriteLine("Usted Ingresa numero " + num1 + " es mayor");
				}
				else
				{
					Console.WriteLine("Usted Ingresa numero " + num2 + " es mayor");
				}
			}
			else
			{
				if (num1 == num2)
				{
					Console.WriteLine("Usted Ingresa numero \"" + num1 + "\" en 1 y 2 son iguales");
				}
				else if (num1 < num2)
				{
					Console.WriteLine("Usted Ingresa numero " + num1 + " es menor");
				}
				else
				{
					Console.WriteLine("Usted Ingresa numero " + num2 + " es menor");
				}
			}
		} //Fin numeroMayor_Menor()

		public static void calcularSaldo(double deposito)
		{
			double saldo = 0;

			saldo += deposito;

			Console.WriteLine((saldo > 100000)
				? ("\nUsted desposita valor $" + deposito
				   + ".\nBonficicación:                $" + (saldo * 0.2)
				   + "\nActual saldo:                 $" + (saldo *= 1.2))
				: ("Usted desposita valor $" + deposito + ".\nActual saldo :$" + saldo));
		} //Fin CalcularSaldo()
	}
}
