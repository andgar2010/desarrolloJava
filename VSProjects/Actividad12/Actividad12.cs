using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad12
{
	class Actividad12
	{
		static void Main(string[] args)
		{
			int numInput, digitos, ultDig1_resultPot, ultDig2_resultPot, ultimos2Dig, cantDigResultPot, repInicio;
			String numInputText, sResultPot, ultimos2DigitosResPot = "", msg = "";
			long resultPot;

				//Ingresa Usuario
				Console.WriteLine("Ingrese un numero:");
				numInput = Int32.Parse(Console.ReadLine());
				numInputText = numInput + "";
				digitos = numInputText.Length;

				//CalcularPotencia
				msg += "Base | Exponente | Resultado";
				for (int i = 1; i <= numInput; i++)
				{
					resultPot = (long)Math.Pow(numInput, i);
					sResultPot = "" + resultPot;
					msg += "\n" + numInput + "    | " + i + "\t    | " + resultPot + " | ";

					if (digitos == 1)
					{
						//Cantidad digitos de Resultado Potencia
						cantDigResultPot = sResultPot.Length;

						//Extraer ultima digito de Resultado Potencia "String" a variable ultDig_resultPot
						ultDig1_resultPot = (int)char.GetNumericValue((sResultPot[cantDigResultPot - 1]));

						//Comparativa inputUserNum == Ultima digito de resultado potencia
						msg += (numInput == ultDig1_resultPot) ? (" Es automórfico") : (" No es automórfico");

					}
					else //digitos == 2
					{
						//Cantidad digitos de Resultado Potencia
						cantDigResultPot = sResultPot.Length;

						//Extraer ultima digito de Resultado Potencia "String" a variable int ultDig_resultPot
						ultDig1_resultPot = (int)char.GetNumericValue(sResultPot[cantDigResultPot - 1]);

						//Extraer pentiultima digito de Resultado Potencia "String" a variable int ultDig_resultPot
						ultDig2_resultPot = (int)char.GetNumericValue(sResultPot[cantDigResultPot - 2]);

						// Int ultDig1_resultPot y ultDig2_resultPot a String variable ultimos2DigitosResPot
						ultimos2DigitosResPot = ultDig2_resultPot + "" + ultDig1_resultPot;

						//String a int ultimos2Dig
						ultimos2Dig = Int32.Parse(ultimos2DigitosResPot);

						//Comparativa inputUserNum == Ultima digito de resultado potencia
						msg += (numInput == ultimos2Dig) ? (" Es automórfico") : (" No es automórfico");
					}

					if (sResultPot.Length >= 19)
					{
						msg += "\n\nLo siento,\nno puede mostrar más " + i + " de exponente. Digitos esta fuera de limite";
						break;
					}

				}//Fin CalcularPotencia - verificiarAutomorfico
				Console.WriteLine(msg);

			Console.WriteLine("Presione una tecla para continuar...");
			Console.ReadKey(true);
		}

	}
}
