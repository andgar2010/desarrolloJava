/*
* Comentario inicial -----> Enunciado
*/

package edu.andresgarcia.actividad16;

//import --> si es necesario

/**
 * Clase Persona
 * @author Andres Garcia
 * @version 1.0
 */

public class Persona
{
	/*
	 =============
	 * Atributos *
	 =============
	*/
	private String nombre;
	private int edad;
	
	/*
	 ===========
	 * Métodos *
	 ===========
	*/

	/**
	 * Constructor Defecto Atributos:nombre = "Andrés García"edad = 27
	 */
	public Persona()
	{
		nombre = "Andres García";
		edad = 27;
	}	
	
	/**
	 * Constructor por parametros ("variables ingresan a un metodo")
	 * @param nombre Valor para esblecerlo en el atributo nombre
	 * @param edad Valor para esblecerlo en el atributo edad
	 */
	public Persona(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/**
	 * Método get del atributo privado nombre ("Obtener")
	 * @return 
	 */
	public String getNombre()
	{
		return nombre;
	}
	
	/**
	 * Método set del atributo privado nombre ("Modificar o cambios")
	 * @param nombre 
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * Método get del atributo privado edad ("Obtener")
	 * @return 
	 */
	public int getEdad()
	{
		return edad;
	}

	/**
	 * Método set del atributo privado nombre ("Modificar o cambios")
	 * @param edad 
	 */
	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	/**
	 * Sobreescritura (Métodos)
	 * @return Nombre:_nombre_ Edad:_#edad_
	 */
	@Override
	public String toString()
	{
		return "Nombre: " + nombre + "\nEdad: " + edad;
	}	
}
