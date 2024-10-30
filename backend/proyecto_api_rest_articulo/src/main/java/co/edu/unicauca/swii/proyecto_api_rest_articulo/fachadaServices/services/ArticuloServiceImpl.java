package co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.services;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import co.edu.unicauca.swii.proyecto_api_rest_articulo.capaAccesoADatos.models.ArticuloEntity;
import co.edu.unicauca.swii.proyecto_api_rest_articulo.capaAccesoADatos.repositories.ArticuloRepository;
import co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO.ArticuloDTO;
import co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO.ArticuloConConferencia.ArticuloConConferenciasDTO;
import co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO.ArticuloConConferencia.ConferenciaDTO;
import co.edu.unicauca.swii.proyecto_api_rest_articulo.rabbit.MessageProducer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ArticuloServiceImpl implements IArticuloService {

    private ArticuloRepository servicioAccesoDatos;
    private ConferenciaService servicioConsumirObtencionConferencias;

    private ModelMapper modelMapper;
    private final MessageProducer producer;

    @Override
    public List<ArticuloDTO> listarArticulos() {
        List<ArticuloEntity> articulosEntity = this.servicioAccesoDatos.listarArticulos();
        List<ArticuloDTO> articulosDTO = this.modelMapper.map(articulosEntity, new TypeToken<List<ArticuloDTO>>() {
        }.getType());
        return articulosDTO;
    }

    @Override
    public ArticuloDTO findById(Integer id) {
        ArticuloEntity articuloEntity = this.servicioAccesoDatos.findById(id);
        ArticuloDTO articuloDTO = this.modelMapper.map(articuloEntity, ArticuloDTO.class);
        return articuloDTO;
    }

    @Override
    public ArticuloDTO save(ArticuloDTO articulo) {
        ArticuloEntity articuloEntity = this.modelMapper.map(articulo, ArticuloEntity.class);
        ArticuloEntity objArticuloEntity = this.servicioAccesoDatos.save(articuloEntity);
        ArticuloDTO ArticuloDTO = this.modelMapper.map(objArticuloEntity, ArticuloDTO.class);
        ArticuloConConferenciasDTO objArticuloConConferenciasDTO = new ArticuloConConferenciasDTO(ArticuloDTO, null);
        producer.sendMessage(objArticuloConConferenciasDTO);
        return ArticuloDTO;
    }

    @Override
    public ArticuloDTO update(Integer id, ArticuloDTO articulo) {
        ArticuloEntity articuloEntity = this.modelMapper.map(articulo, ArticuloEntity.class);
        ArticuloEntity articuloEntityActualizado = this.servicioAccesoDatos.update(id, articuloEntity);
        ArticuloDTO articuloDTO = this.modelMapper.map(articuloEntityActualizado, ArticuloDTO.class);
        return articuloDTO;
    }

    @Override
    public boolean delete(Integer id) {
        return this.servicioAccesoDatos.delete(id);
    }

    @Override
    public boolean exist(Integer id) {
        return this.servicioAccesoDatos.exist(id);
    }

    @Override
    public List<ConferenciaDTO> listarConferenciasDeArticulo(Integer idArticulo) {
        List<ConferenciaDTO> listaConferenciasDeArticulo;
        listaConferenciasDeArticulo = this.servicioConsumirObtencionConferencias.listarConferenciasDeArticulo(idArticulo);
        return listaConferenciasDeArticulo;
    }

    @Override
    public ArticuloConConferenciasDTO listarArticulosConConferencias(Integer idArticulo) {
        List<ConferenciaDTO> listaConferenciasDeArticulo;
        listaConferenciasDeArticulo = this.servicioConsumirObtencionConferencias.listarConferenciasDeArticulo(idArticulo);
        ArticuloEntity objArticuloEntity = this.servicioAccesoDatos.findById(idArticulo);
        ArticuloDTO objArticuloDTO = this.modelMapper.map(objArticuloEntity, ArticuloDTO.class);
        ArticuloConConferenciasDTO objArticuloConConferenciasDTO = new ArticuloConConferenciasDTO(objArticuloDTO, listaConferenciasDeArticulo);

        return objArticuloConConferenciasDTO;
    }

    
    
}
