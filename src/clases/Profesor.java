package clases;

public class Profesor extends Persona {
    private String codigo;
    private String especialidad;

    public Profesor(String nombre, String apellido, String codigo, String especialidad) {
        super(nombre, apellido);
        this.codigo = codigo;
        this.especialidad = especialidad;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    @Override
    public void mostrarInformacion() {
        System.out.println("Codigo Prof.: " + codigo);
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("-------------------------");
    }
}