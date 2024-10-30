package co.edu.unicauca.swii.proyecto_api_rest_articulo.capaAccesoADatos.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArticuloEntity {
    private Integer id;
    private String nombre;
    private String autores;
    private Integer cantidadAutores;
    private String revista;

    public ArticuloEntity() {
        
    }
}
