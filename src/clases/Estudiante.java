package clases;

import java.util.ArrayList;

public class Estudiante extends Persona {
    private String matricula;
    private int edad;
    private String carrera;
    private String fechaInscripcion;
    private ArrayList<Calificacion> calificaciones;

    public Estudiante(String nombre, String apellido, String matricula, int edad, String carrera, String fechaInscripcion) {
        super(nombre, apellido);
        this.matricula = matricula;
        this.edad = edad;
        this.carrera = carrera;
        this.fechaInscripcion = fechaInscripcion;
        this.calificaciones = new ArrayList<>();
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public String getFechaInscripcion() { return fechaInscripcion; }
    public void setFechaInscripcion(String fechaInscripcion) { this.fechaInscripcion = fechaInscripcion; }

    public ArrayList<Calificacion> getCalificaciones() { return calificaciones; }

    public void asignarMateria(Materia materia) {
        this.calificaciones.add(new Calificacion(materia));
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Fecha de Inscripcion: " + fechaInscripcion);
        System.out.println("-------------------------");
    }
}