package Actividad01_SalarioTrabajador;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres Felipe Garcia Ramirez
 * Created in 2017-07-18
 */
public class Actividad01_SalarioTrabajador {

	/**
	 * @param args the command line arguments
	 */
	@SuppressWarnings("empty-statement")
	public static void main(String[] args) {
		String identidad;
		String nombre;
		int edad;
		float estatura;
		float salarioHora;
		char genero = 0;
		int rep;
		int[] horasLaboralxSemana = new int[4];
		float valorTotal;
		int horasTotal;
		int antiguedad;

		//Ingresa datos básicos
		do {
			identidad = JOptionPane.showInputDialog("Por favor escriba su número de identidad");
			nombre = JOptionPane.showInputDialog("Digite su nombre");
			edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
			estatura = Float.parseFloat(JOptionPane.showInputDialog("Digite su estatura"));
			//salario = Float.parseFloat(JOptionPane.showInputDialog("Digite su salario"));
			genero = (JOptionPane.showInputDialog(
					"Digite su genero, si es másculino escriba M, sino escriba F.")).charAt(0);
			rep = Integer.parseInt(JOptionPane.showInputDialog("¿Desea continuar? Si marca 1, No marca 2"));
		} while (rep == 1);

		/*  
        int paso1 = 1;
        while (paso1 == 1) {
            paso1 = 0;
        }
		*/

		//Ingresa cantidad horas laborales por cada semana
		horasTotal = 0;
		final int MAX_HORASLABOR = 40;
		for (int i = 0; i < horasLaboralxSemana.length; i++) {
			do {
				horasLaboralxSemana[i] = Integer.parseInt(
						JOptionPane.showInputDialog(
								"Por favor escriba cantidad horas laboral en " + (i + 1) + "° Semana"));
				if (horasLaboralxSemana[i] > MAX_HORASLABOR) {
					JOptionPane.showMessageDialog(null,
							"No puede ingresa el número\nMáximo 40 horas laborado por " + (i + 1) + "° semana");
				}
				else if (horasLaboralxSemana[i] <= 1) {
					JOptionPane.showMessageDialog(null,
							"No puede ingresa el número negativo\ndesde 1 horas laborado por " + (i + 1) + "° semana");
				}
				else {
					horasTotal += horasLaboralxSemana[i];
				}
			} while (horasLaboralxSemana[i] > MAX_HORASLABOR || horasLaboralxSemana[i] <= 1);
		}	

		//Ingresa valor hora laboral
		salarioHora = Integer.parseInt(
				JOptionPane.showInputDialog("Por favor ingresa valor hora")
		);

		//Calcular salario x horas laborado durante mes
		valorTotal = horasTotal * salarioHora;

		// Ingresa fecha de ingreso para bonficación
		antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa cantidad años laborado por antiguedad"));

		if (antiguedad >= 0 && antiguedad <= 3) {
			JOptionPane.showMessageDialog(null, "Antiguedad es 0 años hasta 3 años");
			valorTotal= (float) (valorTotal*1.03);
		} else {
			if (antiguedad >= 4 && antiguedad <= 5) {
				JOptionPane.showMessageDialog(null, "Antiguedad es desde 4 años hasta 5 años");
				valorTotal= (float) (valorTotal*1.05);
			} else {
				if (antiguedad >= 5 && antiguedad <= 10) {
					JOptionPane.showMessageDialog(null, "Antiguedad es desde 5 años hasta menos 10 años");
					valorTotal= (float) (valorTotal*1.07);
				} else {
					JOptionPane.showMessageDialog(null, "Antiguedad es más 10 años");
					valorTotal= (float) (valorTotal*1.1);
				}
			}
		}

		//Muestra ventana contiene datos básicos y total horas laborales x mes
		JOptionPane.showMessageDialog(null,
				"Su identidad es " + identidad + ", Nombre: " + nombre
				+ "\nedad: " + edad + ", genero: " + genero + ", estataura:" + estatura + "cm"
				+ "\n" + horasTotal + " Horas Total laborado durante mes"
				+ "\n$" + valorTotal + " Salario durante mes");
	}
}