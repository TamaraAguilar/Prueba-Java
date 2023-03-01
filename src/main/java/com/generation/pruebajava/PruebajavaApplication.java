package com.generation.pruebajava;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.pruebajava.models.Alumno;
import java.util.Scanner;
import java.util.ArrayList;

/* INSTRUCCIONES:
 * Te contactaron desde un colegio municipal para que los ayudes a generar un software
pensando en ordenar su funcionamiento, este colegio siempre a funcionado de manera análoga
por 20 años y esto ha generado errores de pérdidas de datos de alumnos antiguos,
documentos estropeados y nula posibilidad de generar estadísticas de rendimiento del colegio.
En esta instancia tu tarea será generar los objetos necesarios para cubrir las necesidades del
colegio, utilizando herencia.
Además debes generar 3 funciones distintas que te ayudarán a los distintos procesos del
colegio
Puntos a considerar:
● El colegio cuenta con distintos cursos, profesores, materias y alumnos
● Se debe crear una función que permita al profesor ingresar notas por estudiante y que
luego permita obtener el promedio de cada estudiante.
● Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
alumnos por curso y que luego los muestre.
● Se debe crear una función que dado un arreglo de notas obtenga la mejor nota, la peor
nota y el promedio de notas.
 */


 /* PASOS A SEGUIR:

 OBJETOS
  * Crear objeto materia (padre) ✓
  * Crear objeto ciencias, matemática, lenguaje (hijo) ✓
  * Crear objeto curso (padre) ✓
  * Crear 1° Medio, 2° Medio, 3° Medio, 4° Medio (hijos) ✓
  * Crear objeto alumno ✓
  * Crear objeto profesor ✓

  FUNCIONES
  * Función que permita ingresar notas por alumno y permita obtener promedio de cada estudiante ✓
  * Función que permita guardar un arreglo de una cierta cantidad de alumnos por curso y que luego los muestre ✓
  * Se debe crear una función que dado un arreglo de notas obtenga la mejor nota, la peor nota y el promedio de notas ✓
  */


  

@SpringBootApplication
public class PruebajavaApplication {
  

  /*---------------------------------------PROMEDIO------------------------------------------------*/
  public static Double promedioNotas(ArrayList<Double> notas){
    Double suma = 0.0;
    for (int i = 0; i < notas.size(); i++) {
      suma += notas.get(i);
    }
    return suma/notas.size();
  }
  /* (Calcular el promedio no es del todo necesario, porque ya viene en la función de las estadísticas)
   * (Sin embargo, voy a incluirlo de todos modos)   */

  /*---------------------------------------ESTADÍSTICAS------------------------------------------------*/
  public static void obtenerDatosNotas(ArrayList<Double> notas) {
    double mejorNota = notas.get(0);
    double peorNota = notas.get(0);
    double suma = 0.0;
    for (double nota : notas) {
        if (nota > mejorNota) {
            mejorNota = nota;
        }
        if (nota < peorNota) {
            peorNota = nota;
        }
        suma += nota;
    }
    double promedio = suma / notas.size();

    System.out.println("Las estadísticas del alumno son las siguientes:");
    System.out.println("Mejor nota: " + mejorNota);
    System.out.println("Peor nota: " + peorNota);
    System.out.println("Promedio de notas: " + promedio);
}


	public static void main(String[] args) {

 

    /*-------------------------------------VARIABLES--------------------------------------*/
    Scanner teclado = new Scanner(System.in);
    String nombre;
    String apellido;
    Double promedio;
    String curso;
    int cantidadAlumnos;
    int cantidadNotas;


    /*---------------------------------------CURSO------------------------------------------------*/

    do{
    System.out.println("Ingrese el curso al que desea ingresar las notas: ");
    curso = teclado.nextLine();
    if(curso == null){
      System.out.print("Error: Por favor ingrese el curso.");
    }
    }while(curso == null || curso.isEmpty());
    
    /*---------------------------------------ALUMNOS------------------------------------------------*/

    do{
    System.out.print("Ingrese la cantidad de alumnos del curso: ");
    cantidadAlumnos = teclado.nextInt();
    teclado.nextLine();
    if(cantidadAlumnos <= 0 || cantidadAlumnos == null || cantidadAlumnos.isEmpty()){
      System.out.print("Error: La cantidad de alumnos debe ser mayor a cero, por favor intente de nuevo.");
    }
    }while(cantidadAlumnos <= 0);


    /*---------------------------------------NOTAS POR ALUMNO------------------------------------------------*/


    do{
			System.out.print("Indique la cantidad de notas por alumnos: ");
			cantidadNotas = teclado.nextInt();
      teclado.nextLine();
			if(cantidadNotas <= 0){
				System.out.print("Error: La cantidad de notas debe ser mayor a cero, por favor intente de nuevo.");
			}
		}while(cantidadNotas <= 0);
    
    /*---------------------------------------ARRAY DE ALUMNOS------------------------------------------------*/
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>(cantidadAlumnos);
    

       for (int i = 0; i < cantidadAlumnos; i++) {
        System.out.println("Alumno #" + (i+1));
        System.out.print("Ingrese el nombre del alumno: ");
        nombre = teclado.next();
    
        System.out.print("Ingrese el apellido del alumno: ");
        apellido = teclado.next();
    
    /*---------------------------------------ARRAY DE NOTAS------------------------------------------------*/

        ArrayList <Double> notasAlumnos = new ArrayList<Double>();
    
        // Ingresar las notas
        for (int x = 0; x < cantidadNotas; x++) {
          double nota;
          do {
              System.out.print("Ingrese la nota #" + (x+1) + " de " + nombre + " " + apellido + ": ");
              nota = teclado.nextDouble();
              if (nota < 1 || nota > 7) {
                  System.out.println("Error: La nota debe ser un número entre 1 y 7.");
              }
          } while (nota < 1 || nota > 7);
          notasAlumnos.add(nota);
      }

      
          promedio = promedioNotas(notasAlumnos);
  
    
    /*---------------------------------------CREAR NUEVO OBJETO ALUMNO------------------------------------------------*/
    /*(Este nuevo objeto 'alumno' contiene los siguientes datos, incluyendo el Array de Notas) */
  Alumno alumno = new Alumno(curso, nombre, apellido, notasAlumnos, promedio);
        // agregar el objeto Alumno al array
        alumnos.add(alumno);
      
    }
  
    /*---------------------------------------MOSTRAR DATOS DEL OBJETO ALUMNO------------------------------------------------*/

    for (Alumno alumno : alumnos) {
        System.out.println(alumno.toString());
        ArrayList<Double> notasAlumnos = alumno.getNotasAlumnos();
      obtenerDatosNotas(notasAlumnos);
        
    }
  
  teclado.close();

}

  

}