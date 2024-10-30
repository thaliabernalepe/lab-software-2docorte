package co.edu.unicauca.swii.proyecto_api_rest_conferencia.capaAccesoADatos.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.swii.proyecto_api_rest_conferencia.capaAccesoADatos.models.ArticuloEntity;
import co.edu.unicauca.swii.proyecto_api_rest_conferencia.capaAccesoADatos.models.ConferenciaEntity;

@Repository
public class ConferenciaRepository {

    ArrayList<ConferenciaEntity> listaConferencias;

    public ConferenciaRepository() {
        this.listaConferencias = new ArrayList<ConferenciaEntity>();
        cargarConferencias();
    }

    public ConferenciaEntity save(ConferenciaEntity conferencia) {
        System.out.println("Invocando a guardar una conferencia");
        ConferenciaEntity objConferencia = null;
        if(this.listaConferencias.add(conferencia)){
            objConferencia = conferencia;
        }
        return objConferencia;
    }

    public ArrayList<ConferenciaEntity> findAll() {
        System.out.println("Invocando a listar conferencias");
        return this.listaConferencias;
    }

    public boolean exist(Integer id){
        System.out.println("Invocando a si existe una conferencia");
        boolean bandera = false;

        for(int i=0; i < this.listaConferencias.size(); i++){
            if(this.listaConferencias.get(i).getId() == id){
                bandera = true;
                break;
            }
        }
        return bandera;
    }
    
    public Integer cantidadArticulosConferencia(Integer id){
        System.out.println("Invocando a consultar cantidad de articulos enviados a una conferencia");
        Integer cantidad = 0;
        for (int i = 0; i < this.listaConferencias.size(); i++){
            List<ArticuloEntity> listaArticulos = this.listaConferencias.get(i).getListaArticulos();
            cantidad = listaArticulos.size();
        }

        return cantidad;
    }

    public List<ConferenciaEntity> ListarConferenciasArticulo(Integer idArticulo){
        System.out.println("Invocando a listar conferencias de un articulo");
        ArrayList<ConferenciaEntity> listaConferencias = new ArrayList<>();
        for (int i = 0; i < this.listaConferencias.size(); i++){
            List<ArticuloEntity> listaArticulos = this.listaConferencias.get(i).getListaArticulos();
            for ( int j=0; j < listaArticulos.size(); j++){
                if(listaArticulos.get(j).getId() == idArticulo){
                    listaConferencias.add(this.listaConferencias.get(i));
                    break;
                }
            }
        }
        return listaConferencias;
    }

    private void cargarConferencias(){
        ArrayList<ArticuloEntity> listaArticulosConferencia1 = new ArrayList<>();
        ArticuloEntity objArticulo1 = new ArticuloEntity();
        objArticulo1.setId(1);
        listaArticulosConferencia1.add(objArticulo1);

        ArrayList<ArticuloEntity> listaArticulosConferencia2 = new ArrayList<>();
        ArticuloEntity objArticulo2 = new ArticuloEntity();
        objArticulo2.setId(1);
        listaArticulosConferencia2.add(objArticulo2);

        ArrayList<ArticuloEntity> listaArticulosConferencia3 = new ArrayList<>();
        ArticuloEntity objArticulo3 = new ArticuloEntity();
        objArticulo3.setId(1);
        listaArticulosConferencia3.add(objArticulo3);

        ConferenciaEntity objConferencia1 = new ConferenciaEntity(1, "IA", 10, listaArticulosConferencia1);
        this.listaConferencias.add(objConferencia1);
        ConferenciaEntity objConferencia2 = new ConferenciaEntity(2, "Analisis de Datos", 20, listaArticulosConferencia2);
        this.listaConferencias.add(objConferencia2);
        ConferenciaEntity objConferencia3 = new ConferenciaEntity(3, "CiberSeguridad", 30, listaArticulosConferencia3);
        this.listaConferencias.add(objConferencia3);
    }
}