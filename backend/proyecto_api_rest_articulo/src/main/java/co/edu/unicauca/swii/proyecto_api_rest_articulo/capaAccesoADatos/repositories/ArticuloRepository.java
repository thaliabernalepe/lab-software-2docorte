package co.edu.unicauca.swii.proyecto_api_rest_articulo.capaAccesoADatos.repositories;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.swii.proyecto_api_rest_articulo.capaAccesoADatos.models.ArticuloEntity;
import co.edu.unicauca.swii.proyecto_api_rest_articulo.capaAccesoADatos.models.EstadoRevision;

@Repository
public class ArticuloRepository {
    
    ArrayList<ArticuloEntity> listaArticulos;

    public ArticuloRepository() {
        this.listaArticulos = new ArrayList<ArticuloEntity>();
        cargarArticulos();
    }

    public ArticuloEntity save(ArticuloEntity articulo){
        System.out.println("Invocando a guardar un articulo");
        articulo.setIdArticulo(listaArticulos.size() + 1);
        articulo.setEstadoRevision(EstadoRevision.PENDIENTE);
        ArticuloEntity objArticulo = null;
        if (this.listaArticulos.add(articulo)) {
            objArticulo = articulo;
        }
        return objArticulo;
    }

    public ArticuloEntity findById(Integer id)
    {
        System.out.println("Invocando a consultar un articulo");
        ArticuloEntity objArticulo = null;

        for(ArticuloEntity articulo : listaArticulos){
            if(articulo.getIdArticulo() == id){
                objArticulo = articulo;
                break;
            }
        }
        return objArticulo;
    }

    public ArrayList<ArticuloEntity> listarArticulos() {
        System.out.println("Invocando a listar artiuculos");
        return this.listaArticulos;
    }

    public ArticuloEntity update(Integer id, ArticuloEntity articulo)
    {
        System.out.println("Invocando a actualizar un articulo");
        ArticuloEntity objArticulo = null;

        for (int i = 0; i < this.listaArticulos.size(); i++){
            if (this.listaArticulos.get(i).getIdArticulo() == id){
                this.listaArticulos.set(i, articulo);
                objArticulo = articulo;
                break;
            }
        }
        return objArticulo;
    }

    public boolean delete(Integer id)
    {
        System.out.println("Invocando a eliminar un articulo");
        boolean bandera = false;

        for (int i = 0; i < this.listaArticulos.size(); i++){
            if (this.listaArticulos.get(i).getIdArticulo() == id){
                this.listaArticulos.remove(i);
                bandera = true;
                break;
            }
        }

        return bandera;
    }

    public boolean exist(Integer id)
    {
        System.out.println("Invocando a existe un articulo");
        boolean bandera = false;

        for (int i = 0; i < this.listaArticulos.size(); i++){
            if (this.listaArticulos.get(i).getIdArticulo() == id){
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    private void cargarArticulos()
    {
        ArticuloEntity objArticulo1 = new ArticuloEntity(1, "IA", "Ana", 1, EstadoRevision.PENDIENTE, 1);
        this.listaArticulos.add(objArticulo1);
        ArticuloEntity objArticulo2 = new ArticuloEntity(2, "Analisis de Datos", "Thalia", 1, EstadoRevision.PENDIENTE, 1);
        this.listaArticulos.add(objArticulo2);
        ArticuloEntity objArticulo3 = new ArticuloEntity(3, "BlockChain", "Maria, Monica", 2, EstadoRevision.PENDIENTE, 2);
        this.listaArticulos.add(objArticulo3);
    }
}
