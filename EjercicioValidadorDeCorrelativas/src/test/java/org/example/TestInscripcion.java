package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class TestInscripcion {

    Materia am1 = new Materia("Análisis 1", List.of());  // Sin correlativas
    Materia am2 = new Materia("Análisis 2", List.of(am1));  // Correlativa con Análisis 1
    Alumno pepe  = new Alumno("Pepe", "Gómez", 20);

    @Test
    @DisplayName("Test para verificar que la inscripcion es rechazada")
    void testInscripcionEsRechazada() {
        Inscripcion inscripcion = new Inscripcion(pepe, List.of(am2));
        assertFalse(inscripcion.aprobada(), "La inscripción debería ser rechazada");
    }

    @Test
    void testInscripcionEsAprobada() {
        pepe.agregarMateriaAprobada(am1);
        Inscripcion inscripcion = new Inscripcion(pepe, List.of(am1));
        assertTrue(inscripcion.aprobada(), "La inscripción debería ser aprobada");
    }



}