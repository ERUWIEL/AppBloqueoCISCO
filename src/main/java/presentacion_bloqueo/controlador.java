package presentacion_bloqueo;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import presentacion_bloqueo.vistas.VentanaBloqueo;
import presentacion_bloqueo.vistas.VentanaDesbloqueada;
import presentacion_bloqueo.vistas.VentanaIlegal;

/**
 * clase que permite controlar el flujo de las ventanas
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
     *
     * @param frame
     */
    public static void mostrarBloqueo(JFrame frame) {
        VentanaBloqueo ventana = new VentanaBloqueo(frame);
        //ventana.setReservacion("Erubiel"); //esta parte ira en un ciclo de escuchamiento y se ejecutara hasta recibir un AlumnoDominio
        frame.setContentPane(ventana);
        frame.revalidate();
    }

    /**
     * metodo que permite mostrar la pantalla desbloqueada
     *
     * @param frame
     */
    public static void mostrarDesbloqueo(JFrame frame) {
        VentanaDesbloqueada ventana = new VentanaDesbloqueada(frame);
        frame.setContentPane(ventana);
        frame.revalidate();
    }

    
    /**
     * metodo que mostrara la ventana de una maquina no registrada
     * @param frame
     */
    public static void mostrarVentanaIlegal(JFrame frame) {
        VentanaIlegal ventana = new VentanaIlegal();
        frame.setContentPane(ventana);
        frame.revalidate();
    }

    /**
     * metodo que permite cerrar el programa
     */
    public static void cerrarPrograma() {
        System.exit(0);
    }
}
