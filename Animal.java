/**
 * clase que crea un animal, dada su edad y su nombre
 *
 *@author Javier Gurpegui
 *@version 1.0
 */

//Definicion de la Clase Animal
  public class Animal{
   //Definicion de los Atributos
   	private String nombre;
   	private int edad;

   //Definicion de los Métodos

 	public void nace(){
   		System.out.print("Hola, he nacido. ");
   	}

   	public String getNombre(){
   		return nombre;
   	}

   	public int getEdad(){
   		return edad;
   	}

   	public void setNombre(String nombre){
   		this.nombre = nombre;
   	}

   	public void setEdad(int edad){
   		this.edad = edad;
   	}

  }