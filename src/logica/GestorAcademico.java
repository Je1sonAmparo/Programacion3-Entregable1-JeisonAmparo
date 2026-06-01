package logica;

import java.util.ArrayList;
import java.util.Scanner;
import clases.Estudiante;
import clases.Materia;
import clases.Profesor;

public class GestorAcademico {

    public static void registrarEstudiante(Scanner sc, ArrayList<Estudiante> estudiantes) {
        sc.nextLine();
        System.out.print("\nIngrese la matricula: ");
        String matricula = sc.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese la carrera: ");
        String carrera = sc.nextLine();

        System.out.print("Ingrese fecha de inscripcion (Ej. 31/05/2026): ");
        String fechaInscripcion = sc.nextLine();

        estudiantes.add(new Estudiante(nombre, apellido, matricula, edad, carrera, fechaInscripcion));
        System.out.println("\nEstudiante registrado correctamente.");
    }

    public static void registrarProfesor(Scanner sc, ArrayList<Profesor> profesores) {
        sc.nextLine();
        System.out.print("\nIngrese el codigo del profesor: ");
        String codigo = sc.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Ingrese la especialidad: ");
        String especialidad = sc.nextLine();

        profesores.add(new Profesor(nombre, apellido, codigo, especialidad));
        System.out.println("\nProfesor registrado correctamente.");
    }

    public static void registrarMateria(Scanner sc, ArrayList<Materia> materias) {
        sc.nextLine();
        System.out.print("\nIngrese el codigo de la materia: ");
        String codigo = sc.nextLine();

        System.out.print("Ingrese el nombre de la materia: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese cantidad de creditos: ");
        int creditos = sc.nextInt();

        materias.add(new Materia(codigo, nombre, creditos));
        System.out.println("\nMateria registrada correctamente.");
    }

}