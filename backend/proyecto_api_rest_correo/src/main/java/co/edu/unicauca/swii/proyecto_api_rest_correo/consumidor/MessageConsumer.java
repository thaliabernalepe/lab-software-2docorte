package co.edu.unicauca.swii.proyecto_api_rest_correo.consumidor;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

//import co.edu.unicauca.swii.proyecto_api_rest_correo.DTO.ArticuloDTO;
import co.edu.unicauca.swii.proyecto_api_rest_correo.DTO.ArticuloConConferencias.ArticuloConConferenciasDTO;

@Service
public class MessageConsumer {
    
    @RabbitListener(queues = "colaArticulos")
    public void receiveMessage(ArticuloConConferenciasDTO objArticuloCreado) {
        System.out.println("Datos del articulo recibidos:");
        System.out.println("Enviando correo electrónico");
        System.out.println("Id: " + objArticuloCreado.getObjArticuloDTO().getIdArticulo());
        System.out.println("Titulo: " + objArticuloCreado.getObjArticuloDTO().getTitulo());
        System.out.println("Autores: " + objArticuloCreado.getObjArticuloDTO().getAutores());
       // System.out.println("Conferencias asociadas: " + objArticuloCreado.getListaConferencias());
    }
}
