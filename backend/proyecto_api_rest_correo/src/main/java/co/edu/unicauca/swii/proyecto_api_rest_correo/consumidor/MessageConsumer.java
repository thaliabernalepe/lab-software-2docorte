package co.edu.unicauca.swii.proyecto_api_rest_correo.consumidor;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import co.edu.unicauca.swii.proyecto_api_rest_correo.DTO.ArticuloDTO;

@Service
public class MessageConsumer {
    
    @RabbitListener(queues = "colaArticulos")
    public void receiveMessage(ArticuloDTO objArticuloCreado) {
        System.out.println("Datos del articulo recibidos:");
        System.out.println("Enviando correo electrónico");
        System.out.println("Id: " + objArticuloCreado.getId());
        System.out.println("Titulo: " + objArticuloCreado.getNombre());
        System.out.println("Autores: " + objArticuloCreado.getAutores());
        //System.out.println("Conferencias asociadas: " + objArticuloCreado.getListaConferencias());
    }
}
