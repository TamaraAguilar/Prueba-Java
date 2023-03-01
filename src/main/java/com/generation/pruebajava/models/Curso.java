package com.generation.pruebajava.models;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Curso {
    Integer cantidadAlumnos;
    String profesorJefe;
    
    
    public Curso() {
    }


    public Curso(Integer cantidadAlumnos, String profesorJefe) {
        this.cantidadAlumnos = cantidadAlumnos;
        this.profesorJefe = profesorJefe;
    }


    public Integer getCantidadAlumnos() {
        return cantidadAlumnos;
    }


    public void setCantidadAlumnos(Integer cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }


    public String getProfesorJefe() {
        return profesorJefe;
    }


    public void setProfesorJefe(String profesorJefe) {
        this.profesorJefe = profesorJefe;
    }



    
}
