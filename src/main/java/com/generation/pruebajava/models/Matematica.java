package com.generation.pruebajava.models;

public class Matematica extends Materia {
    
    public Matematica() {
        super();
        }
    
        public Matematica(String profesor, Integer horasSemanales) {
            super(profesor, horasSemanales);
        }
    
        @Override
        public String toString() {
            return "Matematica []";
        }
    


}
