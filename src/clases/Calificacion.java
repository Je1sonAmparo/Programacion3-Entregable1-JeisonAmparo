package clases;

public class Calificacion {
    private Materia materia;
    private double nota;

    public Calificacion(Materia materia) {
        this.materia = materia;
        this.nota = -1; 
    }

    public Materia getMateria() { return materia; }
    public void setMateria(Materia materia) { this.materia = materia; }

    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }
}