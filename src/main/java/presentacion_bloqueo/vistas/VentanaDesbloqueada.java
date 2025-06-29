
package presentacion_bloqueo.vistas;

import javax.swing.JFrame;

/**
 *
 * @author erwbyel
 */
public class VentanaDesbloqueada extends javax.swing.JPanel {
    private JFrame frame;
    /**
     * Creates new form VentanaDesbloqueada
     * @param frame
     */
    public VentanaDesbloqueada(JFrame frame) {
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

        pnlContenido = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        pnlBoton = new javax.swing.JPanel();
        btnLiberar = new presentacion_bloqueo.componentes.PanelRound();
        lblLiberar = new javax.swing.JLabel();
        imgGato = new javax.swing.JLabel();
        imgGatote = new javax.swing.JLabel();
        imgAmikos = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setPreferredSize(new java.awt.Dimension(1440, 1024));

        pnlContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMensaje.setFont(new java.awt.Font("MS UI Gothic", 1, 35)); // NOI18N
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("USTED ESTA USANDO LA COMPUTADORA");

        pnlBoton.setBackground(new java.awt.Color(16, 20, 65));
        pnlBoton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLiberar.setBackground(new java.awt.Color(25, 50, 178));
        btnLiberar.setRoundBottomLeft(10);
        btnLiberar.setRoundBottomRight(10);
        btnLiberar.setRoundTopLeft(10);
        btnLiberar.setRoundTopRight(10);

        lblLiberar.setFont(new java.awt.Font("MS UI Gothic", 1, 35)); // NOI18N
        lblLiberar.setForeground(new java.awt.Color(255, 255, 255));
        lblLiberar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLiberar.setText("LIBERAR AHORA");
        lblLiberar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLiberar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLiberarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLiberarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLiberarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLiberarLayout = new javax.swing.GroupLayout(btnLiberar);
        btnLiberar.setLayout(btnLiberarLayout);
        btnLiberarLayout.setHorizontalGroup(
            btnLiberarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLiberar, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        btnLiberarLayout.setVerticalGroup(
            btnLiberarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLiberar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        pnlBoton.add(btnLiberar, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 69, -1, -1));

        imgGato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/gato_contador.png"))); // NOI18N

        imgGatote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/gato_dinero.png"))); // NOI18N

        imgAmikos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/gato_perro_contadores.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgGato, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgAmikos, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imgGatote)
                .addGap(235, 235, 235))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(979, 979, 979)
                        .addComponent(pnlContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 1441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(lblMensaje)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgGatote)
                        .addGap(197, 197, 197))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imgGato, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(imgAmikos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(pnlBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblLiberarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLiberarMouseEntered
        // TODO add your handling code here:
        btnLiberar.setBackground(new java.awt.Color(4, 40, 215));
    }//GEN-LAST:event_lblLiberarMouseEntered

    private void lblLiberarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLiberarMouseExited
        // TODO add your handling code here:
        btnLiberar.setBackground(new java.awt.Color(25, 50, 178));
    }//GEN-LAST:event_lblLiberarMouseExited

    private void lblLiberarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLiberarMouseClicked
        // TODO add your handling code here:
        //evento para liberar la computadora
        presentacion_bloqueo.Controlador.mostrarBloqueo(frame);
    }//GEN-LAST:event_lblLiberarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private presentacion_bloqueo.componentes.PanelRound btnLiberar;
    private javax.swing.JLabel imgAmikos;
    private javax.swing.JLabel imgGato;
    private javax.swing.JLabel imgGatote;
    private javax.swing.JLabel lblLiberar;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel pnlBoton;
    private javax.swing.JPanel pnlContenido;
    // End of variables declaration//GEN-END:variables
}
