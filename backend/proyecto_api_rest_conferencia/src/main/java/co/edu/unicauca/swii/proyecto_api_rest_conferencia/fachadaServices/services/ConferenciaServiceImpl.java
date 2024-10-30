package co.edu.unicauca.swii.proyecto_api_rest_conferencia.fachadaServices.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.swii.proyecto_api_rest_conferencia.capaAccesoADatos.models.ConferenciaEntity;
import co.edu.unicauca.swii.proyecto_api_rest_conferencia.capaAccesoADatos.repositories.ConferenciaRepository;
import co.edu.unicauca.swii.proyecto_api_rest_conferencia.fachadaServices.DTO.ConferenciaDTO;

@Service
public class ConferenciaServiceImpl implements IConferenciaService{

    @Autowired
    private ConferenciaRepository servicioAccesdoDatos;

    @Autowired
    private ModelMapper modelMapper;

    public ConferenciaServiceImpl(ConferenciaRepository servicioAccesdoDatos, ModelMapper modelMapper) {
        this.servicioAccesdoDatos = servicioAccesdoDatos;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ConferenciaDTO> findAll() {
        List<ConferenciaEntity> conferenciasEntity = this.servicioAccesdoDatos.findAll();
        List<ConferenciaDTO> conferenciasDTO = this.modelMapper.map(conferenciasEntity, new TypeToken<List<ConferenciaDTO>>(){
        }.getType());
        return conferenciasDTO;
    }

    @Override
    public ConferenciaDTO save(ConferenciaDTO conferencia) {
        ConferenciaEntity conferenciaEntity = this.modelMapper.map(conferencia, ConferenciaEntity.class);
        ConferenciaEntity objConferenciaEntity = this.servicioAccesdoDatos.save(conferenciaEntity);
        ConferenciaDTO conferenciaDTO = this.modelMapper.map(objConferenciaEntity, ConferenciaDTO.class);
        return conferenciaDTO;
    }

    @Override
    public boolean exist(Integer id) {
        return this.servicioAccesdoDatos.exist(id);
    }

    @Override
    public Integer cantidadArticulos(Integer id) {
        return this.servicioAccesdoDatos.cantidadArticulosConferencia(id);
    }

    @Override
    public List<ConferenciaDTO> listarConferenciasArticulo (Integer id){
        List<ConferenciaEntity> conferenciasEntity = this.servicioAccesdoDatos.ListarConferenciasArticulo(id);
        List<ConferenciaDTO> conferenciasDTO = this.modelMapper.map(conferenciasEntity, new TypeToken<List<ConferenciaDTO>>(){
        }.getType());
        return conferenciasDTO;
    }
    
}