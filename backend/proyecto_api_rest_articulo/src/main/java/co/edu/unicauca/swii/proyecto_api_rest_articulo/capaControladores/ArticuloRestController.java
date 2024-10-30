package co.edu.unicauca.swii.proyecto_api_rest_articulo.capaControladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.services.IArticuloService;
import co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO.ArticuloDTO;
import co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO.ArticuloConConferencia.ArticuloConConferenciasDTO;
import co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO.ArticuloConConferencia.ConferenciaDTO;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", 
methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ArticuloRestController {

    @Autowired
    private IArticuloService articuloService;

    @PostMapping("/articulos")
    public ArticuloDTO crearArticulo(@RequestBody ArticuloDTO articulo) {
        ArticuloDTO objArticulo = null;
        objArticulo = articuloService.save(articulo);
        return objArticulo;
    }
    
    @GetMapping("/articulos/{id}")
    public ArticuloDTO consultarArticulo(@PathVariable Integer id) {
        ArticuloDTO objArticulo = null;
        objArticulo = articuloService.findById(id);
        return objArticulo;
    }

    @GetMapping("/articulos")
    public List<ArticuloDTO> listarArticulos() {
        return articuloService.listarArticulos();
    }

    @PutMapping("/articulos/{id}")
    public ArticuloDTO actualizarArticulo(@RequestBody ArticuloDTO articulo, @PathVariable Integer id) {
        ArticuloDTO objArticulo = null;
        ArticuloDTO articuloActual = articuloService.findById(id);
        if (articuloActual != null) {
            objArticulo = articuloService.update(id, articulo);
        }
        return objArticulo;
    }
    
    @DeleteMapping("/articulos/{id}")
    public Boolean eliminarArticulo (@PathVariable Integer id) {
        Boolean bandera = false;
        ArticuloDTO articuloActual = articuloService.findById(id);
        if (articuloActual != null) {
            bandera = articuloService.delete(id);
        }
        return bandera;
    }

    @GetMapping("/articulos/existe")
    public Boolean consultarSiExiste(@RequestParam Integer id) {
        Boolean bandera = articuloService.exist(id);
        return bandera;
    }

    @GetMapping("/articulos/conferencias/{idArticulo}")
    public List<ConferenciaDTO> listarConferenciasDeArticulo(@PathVariable Integer idArticulo) {
        return articuloService.listarConferenciasDeArticulo(idArticulo);
    }

    @GetMapping("/articulos/conferenciasyarticulo/{idArticulo}")
    public ArticuloConConferenciasDTO listarArticulosConConferencias(@PathVariable Integer idArticulo) {
        return articuloService.listarArticulosConConferencias(idArticulo);
    }
}