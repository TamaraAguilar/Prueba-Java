package com.generation.pruebajava.models;
import java.util.ArrayList;

public class Alumno {
    String curso;
    String nombre;
    String apellido;
    ArrayList<Double> notasAlumnos = new ArrayList<Double>();
    Double promedio;
    // ArrayList<Double> notasAlumnos = new ArrayList<Double>();
    
    public Alumno() {
    }

    public Alumno(String curso, String nombre, String apellido, ArrayList<Double> notasAlumnos, Double promedio) {
        this.curso = curso;
        this.nombre = nombre;
        this.apellido = apellido;
        this.notasAlumnos = notasAlumnos;
        this.promedio = promedio;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Double> getNotasAlumnos() {
        return notasAlumnos;
    }

    public void setNotasAlumnos(ArrayList<Double> notasAlumnos) {
        this.notasAlumnos = notasAlumnos;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "\n---------------------------------" + "\n Curso: " + curso + "\n Nombre de alumno: " + nombre + " " + apellido + "\n Notas: "
                + notasAlumnos + "\n Promedio: " + promedio + "\n";
    }


    

}
