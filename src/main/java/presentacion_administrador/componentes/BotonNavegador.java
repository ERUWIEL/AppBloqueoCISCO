package presentacion_administrador.componentes;

import javax.swing.JPanel;

/**
 * clase que nos ayudara a mantener el codigo limpio
 * @author angel
 */
public class BotonNavegador extends JPanel {

    public BotonNavegador() {
        super();
        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMouseEntered(evt);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMouseExited(evt);
            }
        });
    }

    private void btnMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        setBackground(new java.awt.Color(25, 50, 178));
    }
    
    private void btnMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        setBackground(new java.awt.Color(32, 39, 116));
    }
}
