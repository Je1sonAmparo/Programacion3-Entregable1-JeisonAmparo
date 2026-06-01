package clases;

public class Materia {
    private String codigo;
    private String nombreMateria;
    private int creditos;

    public Materia() {}

    public Materia(String codigo, String nombreMateria, int creditos) {
        this.codigo = codigo;
        this.nombreMateria = nombreMateria;
        this.creditos = creditos;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombreMateria() { return nombreMateria; }
    public void setNombreMateria(String nombreMateria) { this.nombreMateria = nombreMateria; }

    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }

    public void mostrarMateria() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Materia: " + nombreMateria);
        System.out.println("Creditos: " + creditos);
        System.out.println("-------------------------");
    }
}
