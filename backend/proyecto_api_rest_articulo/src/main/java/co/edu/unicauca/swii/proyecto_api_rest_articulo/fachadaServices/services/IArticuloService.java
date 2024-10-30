package co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.services;

import java.util.List;
import co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO.ArticuloDTO;
import co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO.ArticuloConConferencia.ArticuloConConferenciasDTO;
import co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO.ArticuloConConferencia.ConferenciaDTO;

public interface IArticuloService {
    
    public List<ArticuloDTO> listarArticulos();
    public ArticuloDTO findById(Integer id);
    public ArticuloDTO save(ArticuloDTO articulo);
    public ArticuloDTO update(Integer id, ArticuloDTO articulo);
    public boolean delete(Integer id);
    public boolean exist(Integer id);
    public List<ConferenciaDTO> listarConferenciasDeArticulo(Integer idArticulo);
    public ArticuloConConferenciasDTO listarArticulosConConferencias(Integer idArticulo);
}
