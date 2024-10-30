package co.edu.unicauca.mvc.test;

import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.ArticuloReview;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sonhuila
 */
class evaluarArticuloTest {

//    private ServicioAlmacenamientoArticulos servicio;
//    private InterfaceRepositorioArticulo repositorioMock;
//
//    @BeforeEach
//    void setUp() {
//        // Inicializar el repositorio simulado
//        repositorioMock = new InterfaceRepositorioArticulo() {
//            private List<Articulo> articulos = new ArrayList<>();
//
//            @Override
//            public boolean almacenarArticulo(Articulo objArticulo) {
//                return articulos.add(objArticulo);
//            }
//
//            @Override
//            public List<Articulo> listarArticulos() {
//                return articulos;
//            }
//
//            @Override
//            public boolean eliminarArticulo(int idArticulo) {
//                return articulos.removeIf(a -> a.getIdArticulo() == idArticulo);
//            }
//
//            @Override
//            public Articulo consultarArticulo(int idArticulo) {
//                return articulos.stream()
//                        .filter(a -> a.getIdArticulo() == idArticulo)
//                        .findFirst()
//                        .orElse(null);
//            }
//
//            @Override
//            public boolean actualizarArticulo(Articulo objArticulo) {
//                for (int i = 0; i < articulos.size(); i++) {
//                    if (articulos.get(i).getIdArticulo() == objArticulo.getIdArticulo()) {
//                        articulos.set(i, objArticulo);
//                        return true;
//                    }
//                }
//                return false;
//            }
//        };
//
//        servicio = new ServicioAlmacenamientoArticulos(repositorioMock);
//        
//        // Crear un artículo para las pruebas
//        Articulo articuloPrueba = new Articulo("Título Prueba", "Autores Prueba");
//        articuloPrueba.setIdArticulo(1); // Asignar un ID
//        servicio.almacenarArticulo(articuloPrueba);
//    }
//
//    @Test
//    void testEvaluarArticulo() {
//        // Obtener el artículo para evaluar
//        Articulo articulo = servicio.listarArticulos().get(0);
//
//        // Crear una revisión
//        ArticuloReview revision = new ArticuloReview("Comentario de prueba", 4.5);
//        
//        // Evaluar el artículo
//        servicio.agregarRevisionArticulo(articulo, revision); // Usar el método de servicio para agregar revisión
//
//        // Verificar que la revisión se haya agregado correctamente
//        List<ArticuloReview> revisiones = servicio.obtenerRevisionesArticulo(articulo);
//        assertNotNull(revisiones);
//        assertEquals(1, revisiones.size());
//        assertEquals("Comentario de prueba", revisiones.get(0).getComentarios());
//        assertEquals(4.5, revisiones.get(0).getCalificacion());
//    }
}

