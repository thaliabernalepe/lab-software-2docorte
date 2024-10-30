package co.edu.unicauca.mvc.test;

import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Revisor;
import co.edu.unicauca.mvc.modelos.EstadoRevision;
import co.edu.unicauca.mvc.vistas.adminConferencia.VtnPrincipalAdmin;
import co.edu.unicauca.mvc.vistas.asistente.VtnPrincipalAsistente;
import co.edu.unicauca.mvc.vistas.autorPublicacion.VtnPrincipalAutor;
import javax.swing.UIManager;



public class Test {

    
    public static void main(String[] args) {
        
        
        seleccionarLookAndField();
                
//        RepositorioConferenciaMemoriaArrayList objRepositorio1=
//                new RepositorioConferenciaMemoriaArrayList();
//        
//        ServicioAlmacenamientoConferencias objServicio1
//                = new   ServicioAlmacenamientoConferencias(objRepositorio1);  
//        
//        RepositorioArticuloMemoriaArrayList objRepositorio2=
//                new RepositorioArticuloMemoriaArrayList();
//        
//        ServicioAlmacenamientoArticulos objServicio2
//                = new ServicioAlmacenamientoArticulos(objRepositorio2);
//        
//        RepositorioRevisorMemoriaArrayList objRepositorio3 =
//                new RepositorioRevisorMemoriaArrayList();
//        
//        ServicioAlmacenamientoRevisor objServicio3 =
//                new ServicioAlmacenamientoRevisor(objRepositorio3);
        
//        Revisor revisor1 = new Revisor(1,"Revisor 1","a 1");
//        Revisor revisor2 = new Revisor(2,"Revisor 2","b 2");
//        objServicio2.addObserver(revisor1);
//        objServicio2.addObserver(revisor2);
//        Articulo articulo1 = new Articulo("Artículo 1", "w");
//        Articulo articulo2 = new Articulo("Artículo 2", "s");
//        objServicio2.almacenarArticulo(articulo1);
//        objServicio2.almacenarArticulo(articulo2);
//        objServicio2.cambiarEstadoArticulo(1, EstadoRevision.EN_REVISION);
//        objServicio2.cambiarEstadoArticulo(2, EstadoRevision.EN_REVISION);
//        
//        VtnPrincipalAsistente objVtnAsistente=new VtnPrincipalAsistente();
//        VtnPrincipalAutor objVtnAutor= new VtnPrincipalAutor();
//        
//        objServicio1.addObserver(objVtnAsistente);
//        objServicio1.addObserver(objVtnAutor);
//        
//        VtnPrincipalAdmin objVtnPrincipal= new VtnPrincipalAdmin();    
//        objVtnPrincipal.asociarServios(objServicio1,objServicio2, objServicio3);
//        
//        Revisor revisorPrueba = new Revisor(1, "Juan", "Perez");
//        objServicio3.almacenarRevisor(revisorPrueba);
//        Revisor revisorPrueba1 = new Revisor(2, "Pablo", "Gomez");
//        objServicio3.almacenarRevisor(revisorPrueba1);
//        Revisor revisorPrueba2 = new Revisor(3, "Ana", "Lopez");
//        objServicio3.almacenarRevisor(revisorPrueba2);
//        Revisor revisorPrueba3 = new Revisor(4, "Maria", "Santos");
//        objServicio3.almacenarRevisor(revisorPrueba3);
        
//        objVtnPrincipal.setVisible(true);
//        objVtnAsistente.setVisible(true);
//        objVtnAutor.setVisible(true);
    }
    
    private static void seleccionarLookAndField()
    {
        for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(laf.getName()))
                try {
                UIManager.setLookAndFeel(laf.getClassName());
                 } catch (Exception ex) {
            }
        }
    }
    
    
    
}
