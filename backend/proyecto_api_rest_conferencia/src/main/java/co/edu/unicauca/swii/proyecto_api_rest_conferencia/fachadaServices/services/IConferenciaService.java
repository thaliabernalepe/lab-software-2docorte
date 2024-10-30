package co.edu.unicauca.swii.proyecto_api_rest_conferencia.fachadaServices.services;

import java.util.List;

import co.edu.unicauca.swii.proyecto_api_rest_conferencia.fachadaServices.DTO.ConferenciaDTO;

public interface IConferenciaService {
    
    public List<ConferenciaDTO> findAll();
    public ConferenciaDTO save(ConferenciaDTO conferencia);
    public boolean exist(Integer id);
    public Integer cantidadArticulos(Integer id);
    public List<ConferenciaDTO> listarConferenciasArticulo (Integer id);
    
}
