package com.generation.pruebajava.models;

public class Ciencias extends Materia {

    public Ciencias() {
    super();
    }

    public Ciencias(String profesor, Integer horasSemanales) {
        super(profesor, horasSemanales);
    }

    @Override
    public String toString() {
        return "Ciencias []";
    }

    
}
