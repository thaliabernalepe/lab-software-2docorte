package co.edu.unicauca.swii.proyecto_api_rest_correo.DTO.ArticuloConConferencias;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ConferenciaDTO {
    private Integer id;
    private String nombre;
    private Integer cantMaxArticulos;

    public ConferenciaDTO() {
        
    }
}
