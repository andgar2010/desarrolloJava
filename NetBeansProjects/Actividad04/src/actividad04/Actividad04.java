/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres Felipe Garcia Ramirez
 * Created in 2017-08-02
 */
public class Actividad04 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int opcion, inicio = 0;

		do {
			opcion = Integer.parseInt(
					JOptionPane.showInputDialog(
						"Que desea elegir deportes?\n1. Futbol\n2. Baloncesto\n3. Golf\n4. Ciclismo"));

			switch (opcion) {
				case 1:
					JOptionPane.showMessageDialog(null,
						"Equipamiento de los futbolistas"
						+ "\n- Camiseta\n- Botas\n- Pantalonetas\n- Espinilleras"
						+ "\n- Medias\n- Guantes de portero\n- Balón");
					break;
				case 2:
					JOptionPane.showMessageDialog(null,
						"Equipamiento de las baloncestistas\n- Camiseta\n- Zapatillas deportivas para baloncesto"
						+ "\n- Pantalonetas\n- Balon\n- Medias\n- Protector bucal\n- rodilleras"
						+ "\n- tobilleras\n- muñequeras");
					break;
				case 3:
					JOptionPane.showMessageDialog(null,
						"Equipamiento de las golfistas\n- Camiseta\n- Zapato de golf (con tacos)"
						+ "\n- Pantalonetas\n- bola de golf\n- Medias\n- Gafas para sol\n- Palo de golf"
						+ "\n- Guantes para golf");
					break;
				case 4:
					JOptionPane.showMessageDialog(null,
						"Equipamiento de las ciciclistas\n- Camiseta\n- Tennis o Zapato para bici"
						+ "\n- Pantalonetas\n- Bicicleta\n- Medias\n- Gafas para sol\n- Casco"
						+ "\n- Guantes para bici\n- Herramientas para bici");
					break;
			}//Fin Switch opciones

			inicio = Integer.parseInt(
					JOptionPane.showInputDialog(
							"Que desea nuevamente otro deporte? Selecciona\n 1. Si\n2. No"));
		} while (inicio == 1);
	}//Fin Main	
}
