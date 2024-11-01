
package co.edu.unicauca.services;

import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Conferencia;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;

/**
 *
 * @author thali
 */
public class ConferenciaServices {
    private String endPoint;
    private Client client;

    public ConferenciaServices() {
        this.endPoint = "http://localhost:2110/api/conferencias";
        this.client = ClientBuilder.newClient().register(new JacksonFeature());
    }
    public Conferencia registrarConferencia(Conferencia objConferenciaRegistrar) {
        Conferencia objConferencia = null;
        WebTarget target = this.client.target(this.endPoint);
        Entity<Conferencia> data = Entity.entity(objConferenciaRegistrar, MediaType.APPLICATION_JSON_TYPE);
        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);
        objConferencia = objPeticion.post(data, Conferencia.class);
        return objConferencia;
    }
    
       // Método para listar todos las conferencias
    public List<Conferencia> listarConferencias() {
        List<Conferencia> listaConferencias = null;
        WebTarget target = this.client.target(this.endPoint);
        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);
        listaConferencias = objPeticion.get(new GenericType<List<Conferencia>>() {});
        return listaConferencias;
    }

    // Método para consultar si existe una conferncia específico por ID
    public Boolean consultarsiExiste(Integer id) {
        Boolean bandera = false;
        WebTarget target = client.target(this.endPoint+"/"+id);
        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);
        bandera = objPeticion.get(Boolean.class);
        return bandera;
    }
    
    // Método para consultar un artículo específico por ID
    public Conferencia consultarConferencia(Integer id) {
        WebTarget target = client.target(this.endPoint+"/conferencia?id="+id);
        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON);
        return objPeticion.get(Conferencia.class);
    }

    // Metodo cantidad articulos enviados
    public int cantidadArticulosEnviados(Integer id) {
        int cantidad;
        WebTarget target = client.target(this.endPoint+"/articulos?idConferencia="+id);
        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);
        cantidad = objPeticion.get(Integer.class);
        return cantidad;
    }
}
