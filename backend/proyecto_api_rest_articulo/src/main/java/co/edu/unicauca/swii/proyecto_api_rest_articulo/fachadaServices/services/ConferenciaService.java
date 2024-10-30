package co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO.ArticuloConConferencia.ConferenciaDTO;
import reactor.core.publisher.Mono;

@Service
public class ConferenciaService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    public List<ConferenciaDTO> listarConferenciasDeArticulo (Integer idArticulo) {
        String url = "http://localhost:2110/api/conferencias/articulos/" + idArticulo;

        Mono<ConferenciaDTO[]> response = webClientBuilder.build()
            .get()
            .uri(url)
            .retrieve()
            .bodyToMono(ConferenciaDTO[].class);

        ConferenciaDTO[] conferencias = response.block();
        return conferencias != null ? List.of(conferencias) : List.of();
    }
    
}
