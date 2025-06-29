package presentacion_portero.componentes;

import presentacion_portero.vistas.VentanaSeleccionComputadora;

/**
 * elemento que representa graficamente ala computadora
 *
 * @author erubyel
 */
public class RegistroComputadora extends javax.swing.JPanel {
    private VentanaSeleccionComputadora panelPadre;
    
    /**
     * Creates new form RegistroComputadora
     *
     * @param panelPadre
     */
    public RegistroComputadora(VentanaSeleccionComputadora panelPadre, String numero) {
        this.panelPadre = panelPadre;
        initComponents();
        lblNumComputadora.setText(numero);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgComputadora = new javax.swing.JLabel();
        lblNumComputadora = new javax.swing.JLabel();
        pnlFondo = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(128, 128));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(128, 128));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgComputadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgComputadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/iconos/computadora_128.png"))); // NOI18N
        imgComputadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgComputadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgComputadoraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgComputadoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgComputadoraMouseExited(evt);
            }
        });
        add(imgComputadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 130, 130));

        lblNumComputadora.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        lblNumComputadora.setForeground(new java.awt.Color(153, 153, 153));
        lblNumComputadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumComputadora.setText("99");
        add(lblNumComputadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, 70, 50));

        pnlFondo.setBackground(new java.awt.Color(25, 30, 69));

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void imgComputadoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgComputadoraMouseEntered
        // TODO add your handling code here:
        pnlFondo.setBackground(new java.awt.Color(105, 111, 153));
        revalidate();
        repaint();
    }//GEN-LAST:event_imgComputadoraMouseEntered

    private void imgComputadoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgComputadoraMouseExited
        // TODO add your handling code here:
        pnlFondo.setBackground(new java.awt.Color(25, 30, 69));
        revalidate();
        repaint();
    }//GEN-LAST:event_imgComputadoraMouseExited

    private void imgComputadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgComputadoraMouseClicked
        // TODO add your handling code here:
        panelPadre.setNumeroSeleccionado(lblNumComputadora.getText());
    }//GEN-LAST:event_imgComputadoraMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgComputadora;
    private javax.swing.JLabel lblNumComputadora;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}
