
package igu;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import logica.Controladora;



public class Principal extends javax.swing.JFrame {

    Controladora control;//variable global para conectar con la lógica
    FondoFrame fondo = new FondoFrame();//creo una instancia de la clase creada para el fondo
    
    public Principal(Controladora control) {
        
         this.control= control;//traigo la instancia de controladora del main
        
        this.setContentPane(fondo);//indico que coloque de fondo el objeto fondo creado arriba
       
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblNumCliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblAlergico = new javax.swing.JLabel();
        lblAtencionEspecial = new javax.swing.JLabel();
        lblNombreDuenio = new javax.swing.JLabel();
        lblCelDuenio = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        txtNumCliente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        cmbAlergico = new javax.swing.JComboBox<>();
        cmbAtencionEspecial = new javax.swing.JComboBox<>();
        txtNombreDuenio = new javax.swing.JTextField();
        txtCelDuenio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAObservaciones = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(0, 0, 204, 20));

        lblTitulo.setFont(new java.awt.Font("Manjari Bold", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 51, 153));
        lblTitulo.setText("PELUQUERÍA CANINA");
        lblTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitulo.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0, 0));

        lblNumCliente.setFont(new java.awt.Font("Manjari Regular", 1, 8)); // NOI18N
        lblNumCliente.setText("Cliente N°");

        lblNombre.setFont(new java.awt.Font("Manjari Regular", 1, 8)); // NOI18N
        lblNombre.setText("Nombre");

        lblRaza.setFont(new java.awt.Font("Manjari Regular", 1, 8)); // NOI18N
        lblRaza.setText("Raza");

        lblColor.setFont(new java.awt.Font("Manjari Regular", 1, 8)); // NOI18N
        lblColor.setText("Color");

        lblAlergico.setFont(new java.awt.Font("Manjari Regular", 1, 8)); // NOI18N
        lblAlergico.setText("Alérgico");

        lblAtencionEspecial.setFont(new java.awt.Font("Manjari Regular", 1, 8)); // NOI18N
        lblAtencionEspecial.setText("Atención  Especial");

        lblNombreDuenio.setFont(new java.awt.Font("Manjari Regular", 1, 8)); // NOI18N
        lblNombreDuenio.setText("Nombre dueño");

        lblCelDuenio.setFont(new java.awt.Font("Manjari Regular", 1, 8)); // NOI18N
        lblCelDuenio.setText("Cel Dueño");

        lblObservaciones.setFont(new java.awt.Font("Manjari Regular", 1, 8)); // NOI18N
        lblObservaciones.setText("Observaciones");

        txtNumCliente.setBackground(new java.awt.Color(204, 255, 255));
        txtNumCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNumCliente.setBorder(null);
        txtNumCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumClienteActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(204, 255, 255));
        txtNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombre.setBorder(null);

        txtRaza.setBackground(new java.awt.Color(204, 255, 255));
        txtRaza.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtRaza.setBorder(null);

        txtColor.setBackground(new java.awt.Color(204, 255, 255));
        txtColor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtColor.setBorder(null);

        cmbAlergico.setBackground(new java.awt.Color(204, 255, 255));
        cmbAlergico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));
        cmbAlergico.setAutoscrolls(true);

        cmbAtencionEspecial.setBackground(new java.awt.Color(204, 255, 255));
        cmbAtencionEspecial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No", " " }));
        cmbAtencionEspecial.setAutoscrolls(true);

        txtNombreDuenio.setBackground(new java.awt.Color(204, 255, 255));
        txtNombreDuenio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombreDuenio.setBorder(null);

        txtCelDuenio.setBackground(new java.awt.Color(204, 255, 255));
        txtCelDuenio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCelDuenio.setBorder(null);

        txtAObservaciones.setBackground(new java.awt.Color(204, 255, 255));
        txtAObservaciones.setColumns(6);
        txtAObservaciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtAObservaciones.setBorder(null);
        jScrollPane1.setViewportView(txtAObservaciones);

        btnLimpiar.setBackground(new java.awt.Color(255, 0, 102));
        btnLimpiar.setFont(new java.awt.Font("Manjari Bold", 1, 8)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setAlignmentY(0.0F);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAtencionEspecial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRaza, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblColor)
                            .addComponent(lblAlergico)
                            .addComponent(lblNombreDuenio)
                            .addComponent(lblCelDuenio)
                            .addComponent(lblObservaciones))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRaza)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNombre)
                    .addComponent(txtNumCliente)
                    .addComponent(txtColor)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(222, 222, 222))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0, 0));

        lblImagen.setForeground(new java.awt.Color(204, 153, 255));
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/baño_perro _redim.png"))); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(51, 51, 255));
        btnGuardar.setFont(new java.awt.Font("Manjari Bold", 1, 10)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //Hice doble click sin querer, este método no iba pero no se como sacarlo 
    private void txtNumClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumClienteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //setteo los valores de todos los campos del formulario en vacío, en el caso de los combobox lo setteo en el indice cero
        txtNumCliente.setText("");
        txtNombre.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtencionEspecial.setSelectedIndex(0);
        txtNombreDuenio.setText("");
        txtCelDuenio.setText("");
        txtAObservaciones.setText("");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        
        int num_cliente= Integer.parseInt(txtNumCliente.getText());
        String nombre_perro= txtNombre.getText();
        String raza= txtRaza.getText();
        String color= txtColor.getText();
        //inicializo las variables booleanas en false
        boolean alergico= false;
        boolean atencion_especial= false;
        //pregunto el numero de indice seleccionado para saber si el valor ingresado es true o false, si es 1 modifico la variable a true
        if(cmbAlergico.getSelectedIndex()==1){
            alergico= true;
        }
        if(cmbAtencionEspecial.getSelectedIndex()==1){
            atencion_especial= true;
        }
        String nombre_duenio= txtNombreDuenio.getText();
        String cel_duenio= txtCelDuenio.getText();
        String observaciones= txtAObservaciones.getText();
        
        try{
            control.crearMascota(num_cliente, nombre_perro, raza, color, alergico, atencion_especial, nombre_duenio, cel_duenio, observaciones);
        } 
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error al guardar los datos", "ERROR", JOptionPane.ERROR_MESSAGE );
        }
        
        JOptionPane.showMessageDialog(rootPane, "Cliente guardado correctamente", "Nuevo cliente", JOptionPane.INFORMATION_MESSAGE );
    }//GEN-LAST:event_btnGuardarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencionEspecial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlergico;
    private javax.swing.JLabel lblAtencionEspecial;
    private javax.swing.JLabel lblCelDuenio;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreDuenio;
    private javax.swing.JLabel lblNumCliente;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAObservaciones;
    private javax.swing.JTextField txtCelDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNumCliente;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables

    class FondoFrame extends JPanel {//creo una clase para hacer el fondo
        
        private Image imagen;//defino imagen para fondo del jframe
        
        @Override
        public void paint(Graphics g){//sobreescribe el metodo paint para poder insertar la imagen de fondo
            
            imagen = new ImageIcon(getClass().getResource("/img/bg2.jpg")).getImage();//asigno la imagen elegida al objeto imagen
            
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);//indica como debe mostrarse la imagen en el jframe
            
            setOpaque(false);//quita el fondo opaco del frame para que se pueda ver la imagen que esta debajo
            
            super.paint(g);
            
            
        }
    }

}
