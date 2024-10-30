package co.edu.unicauca.swii.proyecto_api_rest_correo.DTO.ArticuloConConferencias;

import java.util.List;

import co.edu.unicauca.swii.proyecto_api_rest_correo.DTO.ArticuloDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArticuloConConferenciasDTO {
    private ArticuloDTO objArticuloDTO;
    private List<ConferenciaDTO> listaConferencias;
}
