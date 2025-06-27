package presentacion_portero;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import presentacion_portero.vistas.VentanaBienvenida;
import presentacion_portero.vistas.VentanaIlegal;
import presentacion_portero.vistas.VentanaConfirmacionIdentidad;
import presentacion_portero.vistas.VentanaConfirmarSeleccion;
import presentacion_portero.vistas.VentanaSeleccionComputadora;

/**
 * control que permite organizar las ventanas del portero
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
            mostrarVentanaBienvenida(control);
            control.setVisible(true);
        });
    }

    /**
     * metodo que instancia la ventana principal
     */
    public Controlador() {
        setTitle("portero");
        setSize(1440, 1050);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    // Inicio del proceso de recervacion
    /**
     * metodo que muestra la ventana inicial para reservar
     *
     * @param frame
     */
    public static void mostrarVentanaBienvenida(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaBienvenida ventana = new VentanaBienvenida(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

    /**
     * metodo que muestra la ventana para elaborar una reservacion
     *
     * @param frame
     */
    public static void mostrarVentanaIdentidad(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaConfirmacionIdentidad ventana = new VentanaConfirmacionIdentidad(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

    /**
     * metodo que muestra la ventana para seleccionar la computadora deseada
     *
     * @param frame
     */
    public static void mostrarVentanaSeleccion(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaSeleccionComputadora ventana = new VentanaSeleccionComputadora(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

    /**
     * metodo que muestra la ventana de confirmacion de recervacion
     *
     * @param frame
     * @param numComputadora
     */
    public static void mostrarVentanaConfirmacion(JFrame frame, String numComputadora) {
        SwingUtilities.invokeLater(() -> {
            VentanaConfirmarSeleccion ventana = new VentanaConfirmarSeleccion(frame, numComputadora);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

    // fin del proceso de recervacion
    /**
     * metodo que muestra la ventana a una computadora no registrada
     *
     * @param frame
     */
    public static void mostrarVentanaIlegal(JFrame frame) {
        VentanaIlegal ventana = new VentanaIlegal();
        frame.setContentPane(ventana);
        frame.revalidate();
    }

    /**
     * metodo que cierra el programa
     */
    public static void cerrarPrograma() {
        System.exit(0);
    }
}
