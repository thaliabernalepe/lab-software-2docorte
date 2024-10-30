package co.edu.unicauca.swii.proyecto_api_rest_articulo.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO.ArticuloDTO;
//import co.edu.unicauca.swii.proyecto_api_rest_articulo.fachadaServices.DTO.ArticuloConConferencia.ArticuloConConferenciasDTO;

@Service
public class MessageProducer {
    
    private final AmqpTemplate amqpTemplate;
    private final String exchange = "myExchange";
    private final String routingKey = "myRoutingKey";

    public MessageProducer(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void sendMessage(ArticuloDTO objArticuloCreado) {
        amqpTemplate.convertAndSend(exchange, routingKey, objArticuloCreado);
        System.out.println("Datos del Articulo enviados a la cola");
    }

}
