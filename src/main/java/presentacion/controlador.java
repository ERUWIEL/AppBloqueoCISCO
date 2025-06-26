package presentacion;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import presentacion.vistas.VentanaBloqueo;
 
/**
 *
 * @author erwbyel
 */
public class Controlador extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Controlador control = new Controlador();
            mostrarBloqueo(control);
            control.setVisible(true);
        });
    }
    /**
     * metodo que instancia la ventana principal
     */
    public Controlador() {
        setTitle("bloqueo");
        setSize(1440, 1050);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * metodo de control
     * @param frame 
     */
    public static void mostrarBloqueo(JFrame frame) {
        VentanaBloqueo ventana = new VentanaBloqueo();
        //ventana.setReservacion("Erubiel");
        frame.setContentPane(ventana);
        frame.revalidate();
    }
}
