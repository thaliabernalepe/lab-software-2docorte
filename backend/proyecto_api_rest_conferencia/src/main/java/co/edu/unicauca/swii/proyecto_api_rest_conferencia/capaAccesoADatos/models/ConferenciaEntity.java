package co.edu.unicauca.swii.proyecto_api_rest_conferencia.capaAccesoADatos.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ConferenciaEntity {
    private Integer idConferencia;
    private String nombre;
    private Integer cantMaxArticulos;
    private List<ArticuloEntity> listaArticulos;

    public ConferenciaEntity() {

    }
}
