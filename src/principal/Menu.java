package principal;

import java.util.ArrayList;
import java.util.Scanner;
import clases.Estudiante;
import clases.Profesor;
import clases.Materia;
import logica.GestorAcademico;

public class Menu {

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Materia> materias = new ArrayList<>();

        while (true) {
            System.out.println("\n====================================");
            System.out.println("   SISTEMA DE GESTION ACADEMICA");
            System.out.println("====================================");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar profesor");
            System.out.println("3. Registrar materia");
            System.out.println("4. Asignar materia a estudiante");
            System.out.println("5. Registrar calificacion");
            System.out.println("6. Buscar estudiante");
            System.out.println("7. Mostrar estudiantes");
            System.out.println("8. Mostrar materias");
            System.out.println("9. Mostrar reporte de promedios");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = sc.nextInt();

            if (opcion == 10) {
                System.out.println("\nSaliendo del sistema... ¡Muchas Gracias Por Utilizarlo!\n");
                System.out.println("\nCreado por: Jeison Amparo Abreu ;)...\n");
                break;
            }

            switch (opcion) {
                case 1:
                    GestorAcademico.registrarEstudiante(sc, estudiantes);
                    break;
                case 2:
                    GestorAcademico.registrarProfesor(sc, profesores);
                    break;
                case 3:
                    GestorAcademico.registrarMateria(sc, materias);
                    break;
                case 4:
                    GestorAcademico.asignarMateria(sc, estudiantes, materias);
                    break;
                case 5:
                    GestorAcademico.registrarCalificacion(sc, estudiantes);
                    break;
                case 6:
                    GestorAcademico.buscarEstudiante(sc, estudiantes);
                    break;
                case 7:
                    GestorAcademico.mostrarEstudiantes(estudiantes);
                    break;
                case 8:
                    GestorAcademico.mostrarMaterias(materias);
                    break;
                case 9:
                    GestorAcademico.mostrarReportePromedios(estudiantes);
                    break;
                default:
                    System.out.println("\nOpcion no valida.");
                    break;
            }
        }
        sc.close();
    }
}