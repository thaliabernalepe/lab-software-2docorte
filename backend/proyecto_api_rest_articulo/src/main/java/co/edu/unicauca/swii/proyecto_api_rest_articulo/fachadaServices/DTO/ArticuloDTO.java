package co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO;

import co.edu.unicauca.swii.proyecto_api_rest_articulo.capaAccesoADatos.models.EstadoRevision;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArticuloDTO {
    private Integer idArticulo;
    private String titulo;
    private String autores;
    private Integer cantidadAutores;
    private EstadoRevision estadoRevision;
    private Integer idConferencia;

    public ArticuloDTO() {
        
    }
}
