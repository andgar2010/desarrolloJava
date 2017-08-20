using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad08
{
	class Program
	{
		public static void Main(string[] args)
		{
			int repInicio = 0, marca, resultChar;
			char inputUserChar;
			String msg = "", inputUserWord, outInvertWord;

			Console.WriteLine("Bienvenido Actividad #8 de Componente JAVA\nInstructora Sandra Peñaranda\nPor Andrés García\tFicha 1320652-2");

			do
			{
				Console.WriteLine("\nSelecciona ejercicio:\n1. Invertir letras por una palabra\n2. Letras o números");
				int menu = Int32.Parse(Console.ReadLine());

				switch (menu)
				{
					case 1:
						Console.WriteLine("\nPor favor ingresa una palabra para invertir");
						inputUserWord = Console.ReadLine();
						outInvertWord = Program.invertWord(inputUserWord);
						//if (inputUserWord != null)
						Console.WriteLine("Palabra " + inputUserWord + "-------> " + outInvertWord);
						Console.WriteLine("\nPresiona para continuar...");
						Console.ReadKey(true);
						break;//Fin Case1 InvertWord();

					case 2:
						Console.WriteLine("\nPor favor digita cualquier tecla");
						inputUserChar = Console.ReadKey().KeyChar;
						resultChar = verificarTipoCaracter(inputUserChar);

						switch (resultChar)
						{
							case 1:
								msg = " es numero";
								break;
							case 2:
								msg = " es simbolo";
								break;
							case 3:
								msg = " es letra";
								break;
						}

						Console.WriteLine("\n\nUsted digita una tecla: " + inputUserChar + msg);
						Console.WriteLine("\nPresiona para continuar...");
						Console.ReadKey(true);
						break;//Fin Case2
				}//Fin ListMenu
				Console.WriteLine("\nQue desea repetir desde menu?\nSelecciona\n1. Si\n2. No");
			    repInicio = Int32.Parse(Console.ReadLine());
				} while(repInicio == 1);
			Console.WriteLine("\nGracias por usted ingresa nuestra programa\nPresiona para salir...");
			Console.ReadKey(true);
		}//Fin Main

		public static int verificarTipoCaracter(char inputUserChar)
		{
			char[] numero = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
			char[] simbolo = {'*', '.', ',', '[', ']', '\\', '=', '-', '`', '/', '-', '*', '+', '<', '>', '?', '"', '}', '{', '|', '_', ')', '(', '*', '&', '&', '^', '%', '$', '#', '@', '!', '~', '¬' , '/', '+', '.', '?' , '>', '<', ',' , '.', ']', '\\' };
			int resultChar = 0;

			for (int i = 0; i < numero.Length; i++)
			{
				if (numero[i] == inputUserChar)
				{
					return resultChar = 1; //Es Numero
				}
				for (int j = 0; j < simbolo.Length; j++)
				{
					if (simbolo[i] == inputUserChar)
					{
						return resultChar = 2;//Es simbolo 
					}
					return resultChar = 3;//Es letra
				}
			}
		}//Fin verificarTipoCaracter()

		public static string invertWord(string inputUserWord)
		{
			//int conutChar;
			String resultInvertWord = "";

			for (int i = (inputUserWord.Length-1); i >= 0; i--)
			{
				resultInvertWord += inputUserWord[i];
			}

			return resultInvertWord;
		}//Fin invertWord()
	}
}