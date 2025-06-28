package presentacion_administrador;

import presentacion_administrador.vistas.computadoras.agregar_computadora.VentanaAgregarConfirmar;
import presentacion_administrador.vistas.computadoras.agregar_computadora.VentanaAgregarProgramas;
import presentacion_administrador.vistas.computadoras.agregar_computadora.VentanaAgregarComputadora;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import presentacion_administrador.vistas.*;

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

    /**
     * ventana que permite volver al menu inicial
     * @param frame 
     */
    public static void mostrarVentanaInicio(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaInicio ventana = new VentanaInicio(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

    /**
     * ventana que permite iniciar el proceso de agregar una computadora
     * @param frame 
     */
    public static void mostrarVentanaAgregarComputadora(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaAgregarComputadora ventana = new VentanaAgregarComputadora(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }
    /**
     * ventana que permite continuar el proceso de agregar una computadora
     * @param frame 
     */
    public static void mostrarVentanaAgregarProgramas(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaAgregarProgramas ventana = new VentanaAgregarProgramas(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }
    /**
     * ventana que permite continuar el proceso de agregar una computadora
     * @param frame 
     */
    public static void mostrarVentanaAgregarConfirmacion(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaAgregarConfirmar ventana = new VentanaAgregarConfirmar(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }
    
}
