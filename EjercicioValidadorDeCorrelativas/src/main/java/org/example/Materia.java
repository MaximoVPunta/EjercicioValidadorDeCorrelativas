package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Materia {
    private String nombre;
    private List<Materia> correlativas = new ArrayList<>();

    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public boolean cumpleCorrelativas(Alumno alumno) {
        return correlativas.stream().allMatch(alumno::aprobo);
    }

}