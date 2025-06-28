package presentacion_administrador;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import presentacion_administrador.vistas.VentanaInicio;

/**
 * clase que controla las ventanas del admin
 *
 * @author erwbyel
 */
public class Controlador extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(() -> {
            Controlador control = new Controlador();
            mostrarVentanaInicio(control);
            control.setVisible(true);
        });
    }

    /**
     * metodo que nos permite crear la ventana
     */
    public Controlador() {
        setTitle("administrador");
        setSize(1440, 1050);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void mostrarVentanaInicio(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaInicio ventana = new VentanaInicio(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }
}
