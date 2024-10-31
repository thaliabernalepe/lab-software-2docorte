package co.edu.unicauca.swii.proyecto_api_rest_articulo.capaAccesoADatos.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArticuloEntity {
    private Integer idArticulo;
    private String titulo;
    private String autores;
    private Integer cantidadAutores;
    private String estadoRevision;

    public ArticuloEntity() {
        
    }
}
