package co.edu.unicauca.swii.proyecto_api_rest_conferencia.fachadaServices.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ConferenciaDTO {
    private Integer idConferencia;
    private String nombre;
    private Integer cantMaxArticulos;

    public ConferenciaDTO() {

    }
}
