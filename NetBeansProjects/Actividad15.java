/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad15;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public
        class Actividad15
{

    public static
            void main(String[] args)
    {
        int inicio, dia, mes, anio, diasBisieto;
        String nomMes = "";

        JOptionPane.showMessageDialog(null, "Bienvienido Actividad #15\nBy Andrés García");

        do
        {
            do
            {
                dia = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingresa día:"));
                if (dia < 0)
                {
                    JOptionPane.showMessageDialog(null, "Incorrecta\nNo existe nuemero negativo de fecha");
                }
            }
            while (dia < 0);
            
            do
            {
                mes = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingresa numero de mes:"));
                if (mes < 0)
                {
                    JOptionPane.showMessageDialog(null, "Incorrecta\nNo existe mes negativo");
                }
            }
            while (mes < 0);
            
            
            do
            {
                anio = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingresa año"));
                if (anio < 1200 || anio > 2200)
                {
                    JOptionPane.showMessageDialog(null, "Lo siento, no puede ingresa, porque usted fuera de rango año");
                }
            }
            while (anio < 1200 || anio > 2200);

            diasBisieto = verficiarBisiesto(anio);
            
            nomMes = convertirNumaNombre(mes);
            
            verificarFechaCorrecta(dia, mes, anio, diasBisieto, nomMes);

            inicio = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Que desea repetir desde menu?\nSelecciona"
                            + "\n1. Si\n2. No"));

        }
        while (inicio == 1);

    }//Fin Main
            
    public static String convertirNumaNombre(int mes)
    {
        String nomMes = "";
        
        switch(mes)
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
    }
            
    public static int verficiarBisiesto(int aino)
    {
        int diasBisieto;
        if ((aino % 400 == 0) || ((aino % 4 == 0) && (aino % 100 != 0)))
        {
            diasBisieto = 29;
        }
        else
        {
            diasBisieto = 28;
        }
        return diasBisieto;
    }

    public static void verificarFechaCorrecta(int dia, int mes, int anio, int diasBisieto, String nomMes)
    {
        boolean validaDiaMes = false;

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
            if (diasBisieto >= dia)
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
        
        
        if (validaDiaMes == true)
        {
            JOptionPane.showMessageDialog(null, dia + " " + nomMes + " de " + anio + "----> Correcta");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Usted ingresa " + dia + " " + nomMes + " de " + anio + " \nEs fecha incorrecta");
        }
    }//Fin verificarFechaCorrecta()

}
