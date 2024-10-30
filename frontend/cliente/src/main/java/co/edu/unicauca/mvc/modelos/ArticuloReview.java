package co.edu.unicauca.mvc.modelos;

/**
 *
 * @author sonhuila
 */
public class ArticuloReview {
    private int idReview; // ID único para cada revisión
    private Articulo articulo; // Referencia al artículo asociado
    private String comentarios; // Comentarios del revisor
    private double calificacion; // Calificación del artículo 
    private Revisor revisor; // Revisor que realizó la evaluación

    // Constructor principal
    public ArticuloReview(String comentarios, double calificacion) {
        this.comentarios = comentarios;
        this.calificacion = calificacion;
    }

    // Getters y Setters
    public int getIdReview() {
        return idReview;
    }

    public void setIdReview(int idReview) {
        this.idReview = idReview;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Revisor getRevisor() {
        return revisor;
    }

    public void setRevisor(Revisor revisor) {
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "ArticuloReview{" +
                "idReview=" + idReview +
                ", articulo=" + articulo.getTitulo() +
                ", comentarios='" + comentarios + '\'' +
                ", calificacion=" + calificacion +
                ", revisor=" + revisor.getNombres() +
                '}';
    }
}