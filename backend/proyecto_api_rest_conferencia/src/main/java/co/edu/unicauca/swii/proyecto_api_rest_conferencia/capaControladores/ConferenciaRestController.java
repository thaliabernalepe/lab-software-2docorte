package co.edu.unicauca.swii.proyecto_api_rest_conferencia.capaControladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.swii.proyecto_api_rest_conferencia.fachadaServices.DTO.ConferenciaDTO;
import co.edu.unicauca.swii.proyecto_api_rest_conferencia.fachadaServices.services.IConferenciaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class ConferenciaRestController {

    @Autowired
    private IConferenciaService conferenciaService;

    @PostMapping("/conferencias")
    public ConferenciaDTO crearConferencia(@RequestBody ConferenciaDTO conferencia) {
        ConferenciaDTO objConferencia = null;
        objConferencia = conferenciaService.save(conferencia);
        return objConferencia;
    }

    @GetMapping("/conferencias")
    public List<ConferenciaDTO> findAll() {
        return conferenciaService.findAll();
    }

    @GetMapping("/conferencias/{id}")
    public Boolean consultarSiExiste(@PathVariable Integer id) {
        Boolean bandera = conferenciaService.exist(id);
        return bandera;
    }

    @GetMapping("/conferencias/conferencia")
    public ConferenciaDTO consultarConferencia(@RequestParam Integer id) {
        ConferenciaDTO objConferencia = conferenciaService.findById(id);
        return objConferencia;
    }

    @GetMapping("/conferencias/articulos")
    public Integer consultarArticulosEnviados(@RequestParam Integer idConferencia) {
        Integer cantidadArtEnviados = conferenciaService.cantidadArticulos(idConferencia);
        return cantidadArtEnviados;
    }

    @GetMapping("/conferencias/articulos/{idArticulo}")
    public List<ConferenciaDTO> ListarConferenciasArticulo(@PathVariable Integer idArticulo) {
        System.out.println("Consumiendo servicios para obtener las confernecias de un articulo con id: " + idArticulo);
        return conferenciaService.listarConferenciasArticulo(idArticulo);
    }

}
