package co.edu.unicauca.mvc.vistas.articulos;

import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Revisor;
import co.edu.unicauca.mvc.utilidades.Utilidades;
import co.edu.unicauca.services.ArticuloServices;
import co.edu.unicauca.services.ConferenciaServices;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class VtnListarArticulos extends javax.swing.JInternalFrame {

    public ArticuloServices servicioArticulo;
    public ConferenciaServices servicioConferencia;
    //public ServicioAlmacenamientoRevisor objServicio3;

    public VtnListarArticulos(
            ArticuloServices servicioArticulo,
            ConferenciaServices servicioConferencia) {
        initComponents();
        this.servicioArticulo = servicioArticulo;
        this.servicioConferencia = servicioConferencia;
        this.jTableListarArticulos.setDefaultRenderer(Object.class, new Render());
        inicializarTabla();
    }

    private void inicializarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Titulo");
        model.addColumn("Autores");
        model.addColumn("Estado");
        //model.addColumn("Revisor");
        model.addColumn("Eliminar");
        model.addColumn("Actualizar");
        //model.addColumn("Asignar Revisor");
        this.jTableListarArticulos.setModel(model);
    }

    public void limpiarTabla() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableListarArticulos.getModel();
        int filas = this.jTableListarArticulos.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
    }

    private void llenarTabla() {
        DefaultTableModel model = (DefaultTableModel) this.jTableListarArticulos.getModel();
        limpiarTabla();
        ArrayList<Articulo> listaArticulos
                = (ArrayList<Articulo>) this.servicioArticulo.listarArticulos();

        JButton JButtonEliminarArticulo = new JButton();
        JButtonEliminarArticulo.setName("Eliminar");
        JButtonEliminarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/remove.png")));

        JButton JButtonActualizarArticulo = new JButton();
        JButtonActualizarArticulo.setName("Actualizar");
        JButtonActualizarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/aplicar.png")));

//        JButton JButtonAsignarRevisor = new JButton();
//        JButtonAsignarRevisor.setName("AsignarRevisor");
//        JButtonAsignarRevisor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/assing.png")));

        for (int i = 0; i < listaArticulos.size(); i++) {
            //Revisor revisor = listaArticulos.get(i).getRevisor();
            //String revisorString = (revisor != null) ? revisor.toString() : "No asignado";
            Object[] fila = {
                listaArticulos.get(i).getIdArticulo(),
                listaArticulos.get(i).getTitulo(),
                listaArticulos.get(i).getAutores(),
                listaArticulos.get(i).getEstadoRevision(),
                //revisorString,
                JButtonEliminarArticulo,
                JButtonActualizarArticulo};
                //JButtonAsignarRevisor};
            model.addRow(fila);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarArticulos = new javax.swing.JTable();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonActalizar = new javax.swing.JButton();
        jButtonEvaluar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Gestionar articulos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(0, 0, 153));

        jTableListarArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableListarArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarArticulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListarArticulos);

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonActalizar.setText("Actualizar");
        jButtonActalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActalizarActionPerformed(evt);
            }
        });

        jButtonEvaluar.setText("Evaluar");
        jButtonEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEvaluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButtonActalizar)
                .addGap(109, 109, 109)
                .addComponent(jButtonEvaluar)
                .addGap(109, 109, 109)
                .addComponent(jButtonRegistrar)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActalizar)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonEvaluar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActalizarActionPerformed
        llenarTabla();
    }//GEN-LAST:event_jButtonActalizarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        VtnRegistrarArticulo1 objVtnRegistrarArticulo = new VtnRegistrarArticulo1(servicioArticulo, servicioConferencia);
        objVtnRegistrarArticulo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objVtnRegistrarArticulo.setVisible(true);
        System.out.println("Mostrando ventana registrar articulo");
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jTableListarArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarArticulosMouseClicked

        int column = this.jTableListarArticulos.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jTableListarArticulos.getRowHeight();

        if (row < jTableListarArticulos.getRowCount() && row >= 0 && column < jTableListarArticulos.getColumnCount() && column >= 0) {
            Object value = jTableListarArticulos.getValueAt(row, column);

            if (value instanceof JButton) {

                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                String idArticulo = jTableListarArticulos.getValueAt(row, 0).toString();
                int idArticuloConvertido = Integer.parseInt(idArticulo);
                if (boton.getName().equals("Eliminar")) {
                    try {
                        if (Utilidades.mensajeConfirmacion("¿ Estás seguro de que quieres eliminar el artículo con identificador " + idArticulo + " "
                                + " ?", "Confirmación") == 0) {
                            boolean bandera = this.servicioArticulo.eliminarArticulo(idArticuloConvertido);
                            if (bandera == true) {
                                Utilidades.mensajeExito("El articulo con identificador " + idArticuloConvertido + " fue eliminado exitosamente", "Articulo eliminado");
                                llenarTabla();
                            } else {
                                Utilidades.mensajeAdvertencia("El artículo con identificador " + idArticuloConvertido + " no fue eliminado", "Error al eliminar");

                            }
                        }
                    } catch (Exception ex) {
                        Utilidades.mensajeError("Error al eliminar usuario. Intentelo de nuevo más tarde", "Error");
                    }
                } else if (boton.getName().equals("Actualizar")) {
                    VtnActualizarArticulo objVtnActualizarArticulo
                            = new VtnActualizarArticulo(servicioArticulo, servicioConferencia);
                    objVtnActualizarArticulo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    objVtnActualizarArticulo.cargarDatos(idArticuloConvertido);
                    objVtnActualizarArticulo.setVisible(true);

                } else if (boton.getName().equals("AsignarRevisor")) {
//                    VtnAsignarRevisor objVtnAsignarRevisor = new VtnAsignarRevisor(servicioArticulo, objServicio3);
//                    objVtnAsignarRevisor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//                    objVtnAsignarRevisor.cargarDatos(idArticuloConvertido);
//                    objVtnAsignarRevisor.setVisible(true);
                }
            }
        }


    }//GEN-LAST:event_jTableListarArticulosMouseClicked

    private void jButtonEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEvaluarActionPerformed
        //Crear instancia de la ventana de evaluación con el servicio necesario
//        VtnEvaluarArticulo ventanaEvaluar = new VtnEvaluarArticulo(servicioArticulo);
//        ventanaEvaluar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        ventanaEvaluar.setVisible(true);
    }//GEN-LAST:event_jButtonEvaluarActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActalizar;
    private javax.swing.JButton jButtonEvaluar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarArticulos;
    // End of variables declaration//GEN-END:variables
}
