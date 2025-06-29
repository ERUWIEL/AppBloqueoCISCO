/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion_portero.vistas;

import javax.swing.JFrame;

/**
 *
 * @author angel
 */
public class VentanaConfirmacionIdentidad extends javax.swing.JPanel {
    private JFrame frame;
    /**
     * Creates new form VentanaRecervacion
     * @param frame
     */
    public VentanaConfirmacionIdentidad(JFrame frame) {
        initComponents();
        this.frame = frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProceso = new javax.swing.JPanel();
        pnlContenedor = new presentacion_portero.componentes.PanelRound();
        procesoUno = new presentacion_portero.componentes.PanelRound();
        lblUno = new javax.swing.JLabel();
        procesoDos = new presentacion_portero.componentes.PanelRound();
        lblDos = new javax.swing.JLabel();
        procesoTres = new presentacion_portero.componentes.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        conectorUnoDos = new javax.swing.JPanel();
        conectorDosTres = new javax.swing.JPanel();
        lblConfirmar = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        psfContraseña = new javax.swing.JPasswordField();
        pnlReglas = new presentacion_portero.componentes.PanelRound();
        lblReglamento = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReglas = new javax.swing.JTextArea();
        pnlBotones = new javax.swing.JPanel();
        btnRegresar = new presentacion_portero.componentes.PanelRound();
        lblRegresar = new javax.swing.JLabel();
        btnContinuar = new presentacion_portero.componentes.PanelRound();
        lblContinuar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 30, 69));
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlProceso.setBackground(new java.awt.Color(16, 20, 65));

        pnlContenedor.setBackground(new java.awt.Color(32, 39, 116));
        pnlContenedor.setRoundBottomLeft(30);
        pnlContenedor.setRoundBottomRight(30);
        pnlContenedor.setRoundTopLeft(30);
        pnlContenedor.setRoundTopRight(30);
        pnlContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        procesoUno.setBackground(new java.awt.Color(25, 50, 178));
        procesoUno.setRoundBottomLeft(200);
        procesoUno.setRoundBottomRight(200);
        procesoUno.setRoundTopLeft(200);
        procesoUno.setRoundTopRight(200);

        lblUno.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        lblUno.setForeground(new java.awt.Color(255, 255, 255));
        lblUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUno.setText("1");

        javax.swing.GroupLayout procesoUnoLayout = new javax.swing.GroupLayout(procesoUno);
        procesoUno.setLayout(procesoUnoLayout);
        procesoUnoLayout.setHorizontalGroup(
            procesoUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUno, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        procesoUnoLayout.setVerticalGroup(
            procesoUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUno, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        pnlContenedor.add(procesoUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        procesoDos.setBackground(new java.awt.Color(105, 111, 153));
        procesoDos.setRoundBottomLeft(200);
        procesoDos.setRoundBottomRight(200);
        procesoDos.setRoundTopLeft(200);
        procesoDos.setRoundTopRight(200);

        lblDos.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        lblDos.setForeground(new java.awt.Color(255, 255, 255));
        lblDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDos.setText("2");

        javax.swing.GroupLayout procesoDosLayout = new javax.swing.GroupLayout(procesoDos);
        procesoDos.setLayout(procesoDosLayout);
        procesoDosLayout.setHorizontalGroup(
            procesoDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDos, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        procesoDosLayout.setVerticalGroup(
            procesoDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDos, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        pnlContenedor.add(procesoDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        procesoTres.setBackground(new java.awt.Color(105, 111, 153));
        procesoTres.setRoundBottomLeft(200);
        procesoTres.setRoundBottomRight(200);
        procesoTres.setRoundTopLeft(200);
        procesoTres.setRoundTopRight(200);

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("3");

        javax.swing.GroupLayout procesoTresLayout = new javax.swing.GroupLayout(procesoTres);
        procesoTres.setLayout(procesoTresLayout);
        procesoTresLayout.setHorizontalGroup(
            procesoTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        procesoTresLayout.setVerticalGroup(
            procesoTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        pnlContenedor.add(procesoTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        conectorUnoDos.setBackground(new java.awt.Color(105, 111, 153));

        javax.swing.GroupLayout conectorUnoDosLayout = new javax.swing.GroupLayout(conectorUnoDos);
        conectorUnoDos.setLayout(conectorUnoDosLayout);
        conectorUnoDosLayout.setHorizontalGroup(
            conectorUnoDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        conectorUnoDosLayout.setVerticalGroup(
            conectorUnoDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnlContenedor.add(conectorUnoDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 120, 10));

        conectorDosTres.setBackground(new java.awt.Color(105, 111, 153));

        javax.swing.GroupLayout conectorDosTresLayout = new javax.swing.GroupLayout(conectorDosTres);
        conectorDosTres.setLayout(conectorDosTresLayout);
        conectorDosTresLayout.setHorizontalGroup(
            conectorDosTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        conectorDosTresLayout.setVerticalGroup(
            conectorDosTresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnlContenedor.add(conectorDosTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        javax.swing.GroupLayout pnlProcesoLayout = new javax.swing.GroupLayout(pnlProceso);
        pnlProceso.setLayout(pnlProcesoLayout);
        pnlProcesoLayout.setHorizontalGroup(
            pnlProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProcesoLayout.createSequentialGroup()
                .addGap(495, 495, 495)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(495, Short.MAX_VALUE))
        );
        pnlProcesoLayout.setVerticalGroup(
            pnlProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProcesoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(pnlProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 120));

        lblConfirmar.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfirmar.setText("CONFIRMAR IDENTIDAD DE AAAA");
        add(lblConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1440, 40));

        lblContraseña.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContraseña.setText("contraseña del alumno");
        add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1440, 40));

        psfContraseña.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        psfContraseña.setForeground(new java.awt.Color(153, 153, 153));
        psfContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        psfContraseña.setBorder(null);
        add(psfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 400, 40));

        pnlReglas.setBackground(new java.awt.Color(16, 20, 65));
        pnlReglas.setRoundBottomLeft(15);
        pnlReglas.setRoundBottomRight(15);
        pnlReglas.setRoundTopLeft(15);
        pnlReglas.setRoundTopRight(15);

        lblReglamento.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblReglamento.setForeground(new java.awt.Color(255, 255, 255));
        lblReglamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReglamento.setText("REGLAMENTO DEL LABORATORIO");

        jScrollPane2.setBorder(null);

        jScrollPane1.setBorder(null);

        txtReglas.setEditable(false);
        txtReglas.setBackground(new java.awt.Color(16, 20, 65));
        txtReglas.setColumns(20);
        txtReglas.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        txtReglas.setForeground(new java.awt.Color(255, 255, 255));
        txtReglas.setRows(5);
        txtReglas.setText("lista de reglas");
        txtReglas.setBorder(null);
        txtReglas.setFocusable(false);
        jScrollPane1.setViewportView(txtReglas);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout pnlReglasLayout = new javax.swing.GroupLayout(pnlReglas);
        pnlReglas.setLayout(pnlReglasLayout);
        pnlReglasLayout.setHorizontalGroup(
            pnlReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReglasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReglasLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblReglamento, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        pnlReglasLayout.setVerticalGroup(
            pnlReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReglasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblReglamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(pnlReglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 570, 480));

        pnlBotones.setBackground(new java.awt.Color(16, 20, 65));
        pnlBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setBackground(new java.awt.Color(212, 82, 82));
        btnRegresar.setRoundBottomLeft(10);
        btnRegresar.setRoundBottomRight(10);
        btnRegresar.setRoundTopLeft(10);
        btnRegresar.setRoundTopRight(10);
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
        });

        lblRegresar.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegresar.setText("regresar");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        pnlBotones.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 49, -1, -1));

        btnContinuar.setBackground(new java.awt.Color(25, 50, 178));
        btnContinuar.setRoundBottomLeft(10);
        btnContinuar.setRoundBottomRight(10);
        btnContinuar.setRoundTopLeft(10);
        btnContinuar.setRoundTopRight(10);
        btnContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContinuarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContinuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContinuarMouseExited(evt);
            }
        });

        lblContinuar.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblContinuar.setForeground(new java.awt.Color(255, 255, 255));
        lblContinuar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContinuar.setText("continuar");
        lblContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnContinuarLayout = new javax.swing.GroupLayout(btnContinuar);
        btnContinuar.setLayout(btnContinuarLayout);
        btnContinuarLayout.setHorizontalGroup(
            btnContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );
        btnContinuarLayout.setVerticalGroup(
            btnContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        pnlBotones.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, -1));

        add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 880, 1440, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        // TODO add your handling code here:
        btnRegresar.setBackground(new java.awt.Color(200, 46, 46));
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        // TODO add your handling code here:
        btnRegresar.setBackground(new java.awt.Color(212, 82, 82));
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:
        presentacion_portero.Controlador.mostrarVentanaBienvenida(frame);
    }//GEN-LAST:event_btnRegresarMouseClicked

    
    
    
    private void btnContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseEntered
        // TODO add your handling code here:
        btnContinuar.setBackground(new java.awt.Color(4, 40, 215));
    }//GEN-LAST:event_btnContinuarMouseEntered

    private void btnContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseExited
        // TODO add your handling code here:
        btnContinuar.setBackground(new java.awt.Color(25, 50, 178));
    }//GEN-LAST:event_btnContinuarMouseExited

    private void btnContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseClicked
        // TODO add your handling code here:
        presentacion_portero.Controlador.mostrarVentanaSeleccion(frame);
    }//GEN-LAST:event_btnContinuarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private presentacion_portero.componentes.PanelRound btnContinuar;
    private presentacion_portero.componentes.PanelRound btnRegresar;
    private javax.swing.JPanel conectorDosTres;
    private javax.swing.JPanel conectorUnoDos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblContinuar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblDos;
    private javax.swing.JLabel lblReglamento;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblUno;
    private javax.swing.JPanel pnlBotones;
    private presentacion_portero.componentes.PanelRound pnlContenedor;
    private javax.swing.JPanel pnlProceso;
    private presentacion_portero.componentes.PanelRound pnlReglas;
    private presentacion_portero.componentes.PanelRound procesoDos;
    private presentacion_portero.componentes.PanelRound procesoTres;
    private presentacion_portero.componentes.PanelRound procesoUno;
    private javax.swing.JPasswordField psfContraseña;
    private javax.swing.JTextArea txtReglas;
    // End of variables declaration//GEN-END:variables
}
