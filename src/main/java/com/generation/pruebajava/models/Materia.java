package com.generation.pruebajava.models;

public class Materia {
    String materia;
    String profesor;
    Integer horasSemanales;
    
    
    public Materia() {
    }


    public Materia(String profesor, Integer horasSemanales) {
        this.profesor = profesor;
        this.horasSemanales = horasSemanales;
    }


    public String getProfesor() {
        return profesor;
    }


    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }


    public Integer getHorasSemanales() {
        return horasSemanales;
    }


    public void setHorasSemanales(Integer horasSemanales) {
        this.horasSemanales = horasSemanales;
    }


    @Override
    public String toString() {
        return "Materia [profesor=" + profesor + ", horasSemanales=" + horasSemanales + "]";
    }


    
}
