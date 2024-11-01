package co.edu.unicauca.mvc.vistas.adminConferencia;

import co.edu.unicauca.mvc.modelos.Conferencia;
import co.edu.unicauca.mvc.utilidades.Utilidades;
import co.edu.unicauca.services.ConferenciaServices;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class VtnRegistrarConferencia extends javax.swing.JFrame {

    private ConferenciaServices servicioConferencia;
    
    public VtnRegistrarConferencia(ConferenciaServices servicioConferencia) {
        initComponents();
        this.servicioConferencia = servicioConferencia;
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
        jLabelTitulo = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelFechaInicio = new javax.swing.JLabel();
        jLabelFechaFin = new javax.swing.JLabel();
        jLabelCosto = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldFechaInicio = new javax.swing.JTextField();
        jTextFieldFechaFin = new javax.swing.JTextField();
        jTextFieldCosto = new javax.swing.JTextField();
        jLabelCantMaxArticulos = new javax.swing.JLabel();
        jTextFieldCantMaxArticulos = new javax.swing.JTextField();

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 204));
        jLabelTitulo.setText("Registrar conferencia");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(167, 167, 167))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelNombre.setText("Nombre:");

        jLabelFechaInicio.setText("Fecha Inicio:");

        jLabelFechaFin.setText("Fecha Fin:");

        jLabelCosto.setText("Costo:");

        jButtonRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(0, 0, 153));
        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/grabar.png"))); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jLabelCantMaxArticulos.setText("Cantidad Maxima de Articulos:");

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegistrar)
                .addGap(31, 31, 31))
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFechaFin)
                    .addComponent(jLabelFechaInicio)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelCantMaxArticulos)
                    .addComponent(jLabelCosto))
                .addGap(70, 70, 70)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCantMaxArticulos)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldFechaInicio)
                    .addComponent(jTextFieldFechaFin)
                    .addComponent(jTextFieldCosto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaInicio)
                    .addComponent(jTextFieldFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaFin)
                    .addComponent(jTextFieldFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantMaxArticulos)
                    .addComponent(jTextFieldCantMaxArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCosto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRegistrar)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        
        String nombre, fechaInicio, fechaFin, costo;
        Date fechaInicioDate = null, fechaFinDate = null;
        float costoInscripcion;
        int cantMaxArticulos;
        boolean bandera;
        
        nombre=this.jTextFieldNombre.getText();
        fechaInicio=this.jTextFieldFechaInicio.getText();
        fechaFin=this.jTextFieldFechaFin.getText();
        costo=this.jTextFieldCosto.getText();
        cantMaxArticulos = Integer.parseInt(this.jTextFieldCantMaxArticulos.getText());
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
                fechaInicioDate=formatter.parse(fechaInicio);
            
            
            try {
                fechaFinDate=formatter.parse(fechaFin);
                
                costoInscripcion=Float.parseFloat(costo);
        
                Conferencia objConferencia= new Conferencia(nombre, fechaInicioDate, fechaFinDate, costoInscripcion, cantMaxArticulos);


                Conferencia conferenciaRegistrada = this.servicioConferencia.registrarConferencia(objConferencia);

                if(conferenciaRegistrada != null)
                    Utilidades.mensajeExito( "El registro de la conferencia fue exitoso","Registro exitoso");
                else
                    Utilidades.mensajeError( "El registro de la conferencia no se realizo","Error en el registro");


            } catch (ParseException ex) {
                Utilidades.mensajeAdvertencia("La fecha de fin no sigue el formato dd/MM/yyyy","Fecha incorrecta");
            }
            
            
        } catch (ParseException ex) {
            Utilidades.mensajeAdvertencia("La fecha de inicio no sigue el formato dd/MM/yyyy","Fecha incorrecta");
        }
        
        
        
        
    }//GEN-LAST:event_jButtonRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabelCantMaxArticulos;
    private javax.swing.JLabel jLabelCosto;
    private javax.swing.JLabel jLabelFechaFin;
    private javax.swing.JLabel jLabelFechaInicio;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField jTextFieldCantMaxArticulos;
    private javax.swing.JTextField jTextFieldCosto;
    private javax.swing.JTextField jTextFieldFechaFin;
    private javax.swing.JTextField jTextFieldFechaInicio;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
