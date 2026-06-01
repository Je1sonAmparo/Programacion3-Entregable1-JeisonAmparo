package logica;

import java.util.ArrayList;
import java.util.Scanner;
import clases.Estudiante;
import clases.Materia;
import clases.Profesor;
import clases.Calificacion;

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

    public static void asignarMateria(Scanner sc, ArrayList<Estudiante> estudiantes, ArrayList<Materia> materias) {
        if (estudiantes.isEmpty() || materias.isEmpty()) {
            System.out.println("\nDebe haber estudiantes y materias registradas para realizar una asignacion.");
            return;
        }

        sc.nextLine();
        System.out.print("\nIngrese la matricula del estudiante: ");
        String matricula = sc.nextLine();

        for (Estudiante e : estudiantes) {
            if (e.getMatricula().equalsIgnoreCase(matricula)) {

                System.out.print("Ingrese el codigo de la materia a asignar: ");
                String codMateria = sc.nextLine();

                for (Materia m : materias) {
                    if (m.getCodigo().equalsIgnoreCase(codMateria)) {
                        e.asignarMateria(m);
                        System.out.println("\nMateria asignada correctamente al estudiante.");
                        return;
                    }
                }

                System.out.println("Materia no encontrada.");
                return;
            }
        }

        System.out.println("Estudiante no encontrado.");
    }

    public static void registrarCalificacion(Scanner sc, ArrayList<Estudiante> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("\nNo hay estudiantes registrados.");
            return;
        }

        sc.nextLine();
        System.out.print("\nIngrese la matricula del estudiante: ");
        String matricula = sc.nextLine();

        for (Estudiante e : estudiantes) {
            if (e.getMatricula().equalsIgnoreCase(matricula)) {

                ArrayList<Calificacion> listaCalificaciones = e.getCalificaciones();
                if (listaCalificaciones.isEmpty()) {
                    System.out.println("El estudiante no tiene materias asignadas.");
                    return;
                }

                System.out.println("\n--- Materias del estudiante ---");
                for (Calificacion c : listaCalificaciones) {
                    System.out.println("- " + c.getMateria().getCodigo() + " : " + c.getMateria().getNombreMateria());
                }

                System.out.print("\nIngrese el codigo de la materia para calificar: ");
                String codMateria = sc.nextLine();

                for (Calificacion c : listaCalificaciones) {
                    if (c.getMateria().getCodigo().equalsIgnoreCase(codMateria)) {
                        System.out.print("Ingrese la calificación (0-100): ");
                        double nota = sc.nextDouble();
                        c.setNota(nota);
                        System.out.println("\nCalificacion registrada correctamente.");
                        return;
                    }
                }

                System.out.println("Materia no asignada a este estudiante.");
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }

    public static void buscarEstudiante(Scanner sc, ArrayList<Estudiante> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("\nNo hay estudiantes registrados.");
            return;
        }

        sc.nextLine();
        System.out.print("\nIngrese la matricula o el nombre a buscar: ");
        String busqueda = sc.nextLine().toLowerCase();

        int coincidencias = 0;

        System.out.println("\n=== RESULTADO DE BUSQUEDA ===");
        System.out.println("-------------------------");

        for (Estudiante e : estudiantes) {
            if (e.getMatricula().toLowerCase().equals(busqueda) || e.getNombre().toLowerCase().contains(busqueda)) {
                e.mostrarInformacion();
                coincidencias++;
            }
        }

        if (coincidencias == 0) {
            System.out.println("No se encontro ningun estudiante.");
        }
    }

    public static void mostrarEstudiantes(ArrayList<Estudiante> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("\nNo hay estudiantes registrados.");
        } else {
            System.out.println("\n=== ESTUDIANTES REGISTRADOS ===");
            System.out.println("-------------------------");
            for (Estudiante e : estudiantes) {
                e.mostrarInformacion();
            }
        }
    }

    public static void mostrarMaterias(ArrayList<Materia> materias) {
        if (materias.isEmpty()) {
            System.out.println("\nNo hay materias registradas.");
        } else {
            System.out.println("\n=== MATERIAS REGISTRADAS ===");
            System.out.println("-------------------------");
            for (Materia m : materias) {
                m.mostrarMateria();
            }
        }
    }

    public static void mostrarReportePromedios(ArrayList<Estudiante> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("\nNo hay estudiantes registrados.");
            return;
        }

        System.out.println("\n=== REPORTE DE PROMEDIOS ===");
        System.out.println("-------------------------");
        for (Estudiante e : estudiantes) {
            double suma = 0;
            int contNotas = 0;

            for (Calificacion c : e.getCalificaciones()) {
                if (c.getNota() != -1) {
                    suma += c.getNota();
                    contNotas++;
                }
            }

            double promedio = (contNotas > 0) ? (suma / contNotas) : 0;
            String estado = (promedio >= 70) ? "Aprobado" : "Reprobado";

            System.out.println("Matricula: " + e.getMatricula());
            System.out.println("Nombre: " + e.getNombre() + " " + e.getApellido());
            System.out.printf("Promedio General: %.2f\n", promedio);

            if (contNotas > 0) {
                System.out.println("Estado: " + estado);
            } else {
                System.out.println("Estado: Sin calificaciones asignadas");
            }
            System.out.println("-------------------------");
        }
    }
}