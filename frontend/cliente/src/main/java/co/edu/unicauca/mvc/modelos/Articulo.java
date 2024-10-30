package co.edu.unicauca.mvc.modelos;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

public class Articulo {

    private int idArticulo;
    private String titulo;
    private String autores;
    private EstadoRevision estadoRevision;

    private Conferencia objConferencia;
    private Revisor revisor;

    private static final EnumMap<EstadoRevision, EnumSet<EstadoRevision>> transicionesValidas = new EnumMap<>(EstadoRevision.class);

    static {
        transicionesValidas.put(EstadoRevision.PENDIENTE, EnumSet.of(EstadoRevision.EN_REVISION));
        transicionesValidas.put(EstadoRevision.EN_REVISION, EnumSet.of(EstadoRevision.REVISADO));
        transicionesValidas.put(EstadoRevision.REVISADO, EnumSet.noneOf(EstadoRevision.class));  // No puede cambiar una vez revisado
    }    
    
    public Articulo(String titulo, String autores) {
        this.titulo = titulo;
        this.autores = autores;
        this.estadoRevision = EstadoRevision.PENDIENTE; // Estado inicial
    }

    public void setEstadoRevision(EstadoRevision estadoRevision) {
        this.estadoRevision = estadoRevision;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Conferencia getObjConferencia() {
        return objConferencia;
    }

    public void setObjConferencia(Conferencia objConferencia) {
        this.objConferencia = objConferencia;
    }

    public Revisor getRevisor() {
        return revisor;
    }

    public void setRevisor(Revisor revisor) {
        this.revisor = revisor;
    }

    public EstadoRevision getEstadoRevision() {
        return estadoRevision;
    }
    
    public boolean cambiarEstado(EstadoRevision nuevoEstado) {
        // Verificar si la transición es válida
        if (transicionesValidas.get(estadoRevision).contains(nuevoEstado)) {
            setEstadoRevision(nuevoEstado);
            return true; // Cambio de estado exitoso
        } else {
            System.out.println("Transición no válida desde " + estadoRevision + " a " + nuevoEstado);
            return false; // No se permite el cambio de estado
        }
    }
}