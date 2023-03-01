package com.generation.pruebajava.models;


public class CuartoMedio extends Curso {
    
    public CuartoMedio() {
        super();
        }

    public CuartoMedio(Integer cantidadAlumnos, String profesorJefe) {
        super(cantidadAlumnos, profesorJefe);
    }

    @Override
    public String toString() {
        return "CuartoMedio []";
    }
    
    
    
}
