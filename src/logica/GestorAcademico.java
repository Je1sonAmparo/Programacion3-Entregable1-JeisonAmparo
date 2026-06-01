package logica;

import java.util.ArrayList;
import java.util.Scanner;
import clases.Estudiante;

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

}