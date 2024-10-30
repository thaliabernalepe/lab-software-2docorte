package co.edu.unicauca.mvc.vistas.articulos;

import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.ArticuloReview;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sonhuila
 */
public class VtnEvaluarArticulo extends javax.swing.JFrame {

    //private ServicioAlmacenamientoArticulos servicioAlmacenamiento; // Servicio de manejo de artículos

    /**
     * Creates new form VtnEvaluarArticulo
     *
     * @param servicioAlmacenamiento
     */
//    public VtnEvaluarArticulo(ServicioAlmacenamientoArticulos servicioAlmacenamiento) {
//        this.servicioAlmacenamiento = servicioAlmacenamiento;
//        initComponents();
//        cargarArticulosEnComboBox(); // Cargar artículos disponibles en el ComboBox
//    }

    /**
     * Carga los artículos en el ComboBox al iniciar la ventana.
     */
    private void cargarArticulosEnComboBox() {
//        jComboBoxArticulos.removeAllItems(); // Limpiar ComboBox
//        List<Articulo> listaArticulos = servicioAlmacenamiento.listarArticulos();
//        for (Articulo articulo : listaArticulos) {
//            jComboBoxArticulos.addItem(articulo.getTitulo()); // Agregar el título del artículo al ComboBox
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabelTituloEvaluar = new javax.swing.JLabel();
        jPanelCentral = new javax.swing.JPanel();
        jLabelArticulo = new javax.swing.JLabel();
        jComboBoxArticulos = new javax.swing.JComboBox<>();
        jLabelCalificacion = new javax.swing.JLabel();
        jLabelComentario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaComentario = new javax.swing.JTextArea();
        jTextFieldCalificacion = new javax.swing.JTextField();
        jButtonEvaluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTituloEvaluar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTituloEvaluar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloEvaluar.setText("Evaluar Articulo");
        jLabelTituloEvaluar.setToolTipText("");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(jLabelTituloEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelTituloEvaluar)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jLabelArticulo.setText("Articulo:");

        jComboBoxArticulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelCalificacion.setText("Calificación:");

        jLabelComentario.setText("Comentarios:");

        jTextAreaComentario.setColumns(20);
        jTextAreaComentario.setRows(5);
        jScrollPane1.setViewportView(jTextAreaComentario);

        jButtonEvaluar.setText("Evaluar");
        jButtonEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEvaluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCalificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelComentario, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addGap(26, 26, 26)))
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonEvaluar)
                .addGap(39, 39, 39))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelArticulo))
                .addGap(24, 24, 24)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCalificacion)
                    .addComponent(jTextFieldCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelComentario)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonEvaluar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEvaluarActionPerformed
        evaluarArticulo(); // Método que realiza la acción de evaluación
    }//GEN-LAST:event_jButtonEvaluarActionPerformed

    /**
     * Método que se ejecuta cuando el usuario hace clic en el botón "Evaluar".
     * Realiza la evaluación del artículo y guarda la revisión.
     */
    private void evaluarArticulo() {
        // Obtener el título del artículo seleccionado en el ComboBox
        String tituloArticulo = jComboBoxArticulos.getSelectedItem().toString();

        // Buscar el artículo seleccionado
        Articulo articuloSeleccionado = null;
//        List<Articulo> listaArticulos = servicioAlmacenamiento.listarArticulos();
//        for (Articulo articulo : listaArticulos) {
//            if (articulo.getTitulo().equals(tituloArticulo)) {
//                articuloSeleccionado = articulo;
//                break;
//            }
//        }

        // Validar que el artículo haya sido encontrado
        if (articuloSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "No se pudo encontrar el artículo seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que el campo de calificación no esté vacío
        if (jTextFieldCalificacion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese una calificación.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que el campo de comentarios no esté vacío
        if (jTextAreaComentario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un comentario.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener la calificación y comentario de los campos de texto
        double calificacion;
        try {
            calificacion = Double.parseDouble(jTextFieldCalificacion.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un valor numérico válido para la calificación.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String comentario = jTextAreaComentario.getText();

        // Crear la revisión del artículo sin la referencia a un revisor
        ArticuloReview nuevaRevision = new ArticuloReview(comentario, calificacion);

        // Guardar la revisión en el artículo
        //servicioAlmacenamiento.agregarRevisionArticulo(articuloSeleccionado, nuevaRevision);

        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(this, "El artículo ha sido evaluado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEvaluar;
    private javax.swing.JComboBox<String> jComboBoxArticulos;
    private javax.swing.JLabel jLabelArticulo;
    private javax.swing.JLabel jLabelCalificacion;
    private javax.swing.JLabel jLabelComentario;
    private javax.swing.JLabel jLabelTituloEvaluar;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaComentario;
    private javax.swing.JTextField jTextFieldCalificacion;
    // End of variables declaration//GEN-END:variables
}
