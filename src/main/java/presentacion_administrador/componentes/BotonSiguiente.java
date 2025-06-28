package presentacion_administrador.componentes;

/**
 * clase que nos ayudara a mantener el codigo limpio
 *
 * @author erwbyel
 */
public class BotonSiguiente extends PanelRound {

    public BotonSiguiente() {
        super();
        setRoundBottomLeft(15);
        setRoundBottomRight(15);
        setRoundTopLeft(15);
        setRoundTopRight(15);
        
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
        setBackground(new java.awt.Color(4,40,213));
    }

    private void btnMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        setBackground(new java.awt.Color(25,50,178));
    }
}
