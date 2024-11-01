package co.edu.unicauca.mvc.modelos;

import java.util.ArrayList;
import java.util.Date;

public class Conferencia {

    private int idConferencia;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private float costoInscripcion;
    private int cantMaxArticulos;

    private ArrayList<Articulo> articulosEnviados;
    private ArrayList<Revisor> revisores;
    
    public Conferencia(){
        
    }

    public Conferencia(String nombre, Date fechaInicio, Date fechaFin, float costoInscripcion, int cantMaxArticulos) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoInscripcion = costoInscripcion;
        this.cantMaxArticulos = cantMaxArticulos;
        this.articulosEnviados = new ArrayList<>();
        this.revisores = new ArrayList<>();
    }

    public int getIdConferencia() {
        return idConferencia;
    }

    public void setIdConferencia(int idConferencia) {
        this.idConferencia = idConferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getCostoInscripcion() {
        return costoInscripcion;
    }

    public void setCostoInscripcion(float costoInscripcion) {
        this.costoInscripcion = costoInscripcion;
    }

    public ArrayList<Articulo> getArticulosEnviados() {
        return articulosEnviados;
    }
    
    public void setCantMaxArticulos(int cantMaxArticulos) {
        this.cantMaxArticulos = cantMaxArticulos;
    }
    
    public int getCantMaxArticulos(){
        return cantMaxArticulos;
    }

    public void setArticulosEnviados(ArrayList<Articulo> articulosEnviados) {
        this.articulosEnviados = articulosEnviados;
    }

    public ArrayList<Revisor> getRevisores() {
        return revisores;
    }

    public void setRevisores(ArrayList<Revisor> revisores) {
        this.revisores = revisores;
    }

    public boolean agregarArticuloAConferencia(Articulo articulo) {
        return articulosEnviados.add(articulo);
    }

    public boolean agregarRevisoresAConferencia(Revisor revisor) {
        return revisores.add(revisor);
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
