package co.edu.unicauca.mvc.modelos;

public class Organizador {

    private String nombres;
    private String apellidos;
    private String universidad;

    public Organizador(String nombres, String apellidos, String universidad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.universidad = universidad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
}
