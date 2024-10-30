/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.mvc.test;
import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.EstadoRevision;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServiciosArticuloTest {

//    private ServicioAlmacenamientoArticulos servicio;
//    private InterfaceRepositorioArticulo repositorioMock;
//
//     @BeforeEach
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
//                servicio = new ServicioAlmacenamientoArticulos(repositorioMock);
//
//        // Crear un artículo de prueba para usar en las pruebas
//        Articulo articuloPrueba = new Articulo("Título Prueba", "Autores Prueba");
//        articuloPrueba.setIdArticulo(1); // Asignar un ID único al artículo de prueba
//        servicio.almacenarArticulo(articuloPrueba); // Almacenar el artículo de prueba
//    }
//
//    @Test
//    void testAlmacenarArticulo() {
//        // Crear un nuevo artículo
//        Articulo nuevoArticulo = new Articulo("Nuevo Artículo", "Nuevos Autores");
//        nuevoArticulo.setIdArticulo(2);  // Asignar un nuevo ID
//
//        // Llamar al método almacenarArticulo
//        boolean resultado = servicio.almacenarArticulo(nuevoArticulo);
//
//        // Verificar si el artículo fue almacenado correctamente
//        assertTrue(resultado, "El artículo debería haberse almacenado correctamente.");
//        assertEquals(2, servicio.listarArticulos().size(), "Debería haber 2 artículos almacenados.");
//    }
//
//    @Test
//    void testListarArticulos() {
//        // Llamar al método listarArticulos
//        List<Articulo> listaArticulos = servicio.listarArticulos();
//
//        // Verificar si la lista contiene el artículo de prueba
//        assertEquals(1, listaArticulos.size(), "Debería haber 1 artículo almacenado.");
//        assertEquals("Título Prueba", listaArticulos.get(0).getTitulo(), "El título del artículo debería coincidir.");
//    }
//
//    @Test
//    void testEliminarArticulo() {
//        // Eliminar el artículo con ID 1
//        boolean resultado = servicio.eliminarArticulo(1);
//
//        // Verificar si el artículo fue eliminado correctamente
//        assertTrue(resultado, "El artículo debería haberse eliminado correctamente.");
//        assertEquals(0, servicio.listarArticulos().size(), "No debería haber artículos almacenados.");
//    }
//
//    @Test
//    void testConsultarArticulo() {
//        // Consultar el artículo con ID 1
//        Articulo articuloConsultado = servicio.consultarArticulo(1);
//
//        // Verificar si se consultó el artículo correctamente
//        assertNotNull(articuloConsultado, "El artículo debería existir.");
//        assertEquals(1, articuloConsultado.getIdArticulo(), "El ID del artículo debería ser 1.");
//    }
//
//    @Test
//    void testActualizarArticulo() {
//        // Crear un artículo actualizado
//        Articulo articuloActualizado = new Articulo("Título Actualizado", "Autores Actualizados");
//        articuloActualizado.setIdArticulo(1); // Mantener el mismo ID
//
//        // Llamar al método actualizarArticulo
//        boolean resultado = servicio.actualizarArticulo(articuloActualizado);
//
//        // Verificar si el artículo fue actualizado correctamente
//        assertTrue(resultado, "El artículo debería haberse actualizado correctamente.");
//
//        // Consultar el artículo actualizado
//        Articulo articuloConsultado = servicio.consultarArticulo(1);
//
//        // Verificar si los cambios se aplicaron
//        assertEquals("Título Actualizado", articuloConsultado.getTitulo(), "El título del artículo debería haberse actualizado.");
//        assertEquals("Autores Actualizados", articuloConsultado.getAutores(), "Los autores deberían haberse actualizado.");
//    }

}
