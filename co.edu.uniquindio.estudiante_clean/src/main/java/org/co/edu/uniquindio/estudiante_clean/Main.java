package org.co.edu.uniquindio.estudiante_clean;

import org.co.edu.uniquindio.estudiante_clean.Model.Curso;
import org.co.edu.uniquindio.estudiante_clean.Model.Docente;
import org.co.edu.uniquindio.estudiante_clean.Model.Estudiante;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = crearEstudiante("Juan", 17, "juan@mail.com", 3, 3, 3.5, 4.5);
        Estudiante estudiante2 = crearEstudiantePorConstructor("María", 15, "pepita@mail.com", 1, 2, 2.5, 4.5);
        Estudiante estudiante3 = crearEstudiante("Pepe", 20, "pepe@mail.com", 4, 4, 2.5, 4.5);
        Docente docente = new Docente("Carlos", 35, "CarlosMiron@mail.com");
        Curso curso = new Curso("Programación 1", 2, "2N", 3, "Nocturna");
        curso.setEstudiante1(estudiante1);
        curso.setEstudiante2(estudiante2);
        curso.setEstudiante3(estudiante3);
        curso.setDocente(docente);
    }

    private static Estudiante crearEstudiante(String nombre, int edad, String correo, int semestre, double nota1, double nota2, double nota3){
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setEdad(edad);
        estudiante.setCorreo(correo);
        estudiante.setSemestre(semestre);
        estudiante.setNota1(nota1);
        estudiante.setNota2(nota2);
        estudiante.setNota3(nota3);

        return estudiante;
    }

    private static Estudiante crearEstudiantePorConstructor(String nombre, int edad, String correo, int semestre, double nota1, double nota2, double nota3){
        Estudiante estudiante = new Estudiante(nombre, edad, correo, semestre, nota1, nota2, nota3);
        return estudiante;
    }
}