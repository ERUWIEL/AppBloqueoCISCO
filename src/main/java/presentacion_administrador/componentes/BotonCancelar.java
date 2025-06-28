package presentacion_administrador.componentes;


/**
 * clase que nos ayudara a mantener el codigo limpio
 *
 * @author erwbyel
 */
public class BotonCancelar extends PanelRound {

    public BotonCancelar() {
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
        setBackground(new java.awt.Color(200, 46, 46));
    }

    private void btnMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        setBackground(new java.awt.Color(212, 82, 82));
    }
}
