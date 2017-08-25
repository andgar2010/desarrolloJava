using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad14
{
	class Program
	{
		static void Main(string[] args)
		{
			double vRentaLiquida, vPatrimonio, vValorCredito, valorTotal;
			int numCreditos, repInicio;
			String nomEstudiante;

			do
			{
				Console.WriteLine("Ingresa su nombre completo:");
				nomEstudiante = Console.ReadLine();

				do
				{
					Console.WriteLine("Ingresa cantidad los créditos:");
					numCreditos = Int32.Parse(Console.ReadLine());
					if (numCreditos <= 0)
					{
						Console.WriteLine("Por favor ingresa los numeros desde 1 credito. No existe los números negativos");
					}
				} while (numCreditos <= 0);

				do
				{
					Console.WriteLine("Ingresa cantidad su patrimonio:");
					vPatrimonio = Double.Parse(Console.ReadLine());
					if (vPatrimonio < 0)
					{
						Console.WriteLine("Por favor ingresa valor real. No existe los números negativos");
					}
				} while (vPatrimonio < 0);

				do
				{
					Console.WriteLine("Ingresa cantidad su renta liquida:");
					vRentaLiquida = Double.Parse(Console.ReadLine());
					if (vRentaLiquida < 0)
					{
						Console.WriteLine("Por favor ingresa valor real. No existe los números negativos");
					}
				} while (vRentaLiquida < 0);

				vValorCredito = calcularValorCredito(vPatrimonio, vRentaLiquida);

				valorTotal = vValorCredito * numCreditos;

				Console.WriteLine(
					"Nombre: " + nomEstudiante + "\nCréditos: " + numCreditos + "\nValor de cada crédito: $" + vValorCredito +
					"\nValor total a pagar por concepto de marticula: $" + valorTotal);
				Console.WriteLine("Desea ingresa otro estudiante para calcular?\nSi marca 1.\nNo marca cualquier");
				repInicio = Int32.Parse(Console.ReadLine());
			} while (repInicio == 1);
		} //Fin Main

		public static double calcularValorCredito(double vPatrimonio, double vRentaLiquida)
		{
			double valorCredito;

			if (vRentaLiquida <= 25000 || vPatrimonio <= 100000)
			{
				valorCredito = 130;
			}
			else if (vRentaLiquida <= 30000 || vPatrimonio <= 150000)
			{
				valorCredito = 200;
			}
			else if (vRentaLiquida <= 40000 || vPatrimonio <= 210000)
			{
				valorCredito = 280;
			}
			else
			{
				valorCredito = 315;
			}

			return (double) valorCredito;
		} //Fin calcularValorCredito()
	}
}