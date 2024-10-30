package co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArticuloDTO {
    private Integer id;
    private String nombre;
    private String autores;
    private Integer cantidadAutores;
    private String revista;

    public ArticuloDTO() {
        
    }
}
