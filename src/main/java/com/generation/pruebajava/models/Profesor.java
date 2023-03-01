package com.generation.pruebajava.models;


public class Profesor {
    String materia;
    Integer sueldo;
    
    
    
    
    
    
    
    public Profesor() {
  
    }
    
    
    public Profesor(String nombre, Integer edad, String materia, Integer sueldo) {
        this.materia = materia;
        this.sueldo = sueldo;


        
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public Integer getSueldo() {
        return sueldo;
    }
    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    @Override
    public String toString() {
        return "Profesor [materia=" + materia + ", sueldo=" + sueldo + "]";
    }

    //MÉTODOS

    // public void ingresarNotas(ArrayList<Alumno> alumnos) {
    //     Scanner scanner = new Scanner(System.in);
    //     for (Alumno alumno : alumnos) {
    //       ArrayList<Double> notas = new ArrayList<Double>();
    //       System.out.println("Ingrese las notas del alumno " + alumno.getNombre());
    //       for (Materia materia : alumno.getMateria()) {
    //         System.out.print("Nota de " + materia.getNombre() + ": ");
    //         notas.add(scanner.nextDouble());
    //       }
    //       alumno.setNotas(notas);
    //     }
    //   }
    
    //   public void getPromedios(ArrayList<Alumno> alumnos) {
    //     for (Alumno alumno : alumnos) {
    //       System.out.println("El promedio de " + alumno.getNombre() + " es " + alumno.getPromedio());
    //     }
    //   }

    
}
