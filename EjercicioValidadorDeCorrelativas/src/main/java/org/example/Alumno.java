package org.example;
import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private List<Materia> materiasAprobadas = new ArrayList<>();

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public boolean aprobo(Materia materia) {
        return materiasAprobadas.contains(materia);
    }

    public void agregarMateriaAprobada(Materia materia) {
        materiasAprobadas.add(materia);
    }
}

