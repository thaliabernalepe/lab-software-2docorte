package co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO.ArticuloConConferencia;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ConferenciaDTO {
    private Integer idConferencia;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private float costoInscripcion;
    private Integer cantMaxArticulos;

    public ConferenciaDTO(){

    }
}
