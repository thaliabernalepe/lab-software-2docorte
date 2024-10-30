
package co.edu.unicauca.services;

import co.edu.unicauca.mvc.modelos.Articulo;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;


/**
 *
 * @author thali
 */
public class ArticuloServices {
    private String endPoint;
    private Client client;

    public ArticuloServices() {
        this.endPoint = "http://localhost:5000/api/articulos";
        this.client = ClientBuilder.newClient().register(new JacksonFeature());
    }
    
    public Articulo registrarArticulo(Articulo objArticuloRegistrar) {
        Articulo objArticulo = null;
        WebTarget target = this.client.target(this.endPoint);
        Entity<Articulo> data = Entity.entity(objArticuloRegistrar, MediaType.APPLICATION_JSON_TYPE);
        Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);
        objArticulo = objPeticion.post(data, Articulo.class);
        return objArticulo;
    }

    // Método para consultar un artículo específico por ID
    public Articulo consultarArticulo(Integer id) {
        WebTarget target = client.target(this.endPoint).path(String.valueOf(id));
        Builder objPeticion = target.request(MediaType.APPLICATION_JSON);
        return objPeticion.get(Articulo.class);
    }

    // Método para listar todos los artículos
    public List<Articulo> listarArticulos() {
        List<Articulo> listaArticulos = null;
        WebTarget target = this.client.target(this.endPoint);
        Builder objPeticion = target.request(MediaType.APPLICATION_JSON);
        listaArticulos = objPeticion.get(new GenericType<List<Articulo>>() {});
        return listaArticulos;
    }
    
    //Metodo para actualizar un articulo
    public Articulo actualizarArticulo (Articulo objArticuloActualizar, Integer id){
        Articulo objArticulo = null;
        WebTarget target = this.client.target(this.endPoint+"/"+id);
        Entity<Articulo> data = Entity.entity(objArticuloActualizar, MediaType.APPLICATION_JSON_TYPE);
        Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);
        objArticulo = objPeticion.put(data, Articulo.class);
        return objArticulo;
    }
    
    //Metodo para eliminar un articulo
    public Boolean eliminarArticulo(Integer id) {
        Boolean bandera = false;
        WebTarget target = this.client.target(this.endPoint+"/"+id);
        Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);
        bandera = objPeticion.delete(Boolean.class);
        return bandera;
    }
}


