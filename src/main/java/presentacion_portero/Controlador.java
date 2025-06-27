package presentacion_portero;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import presentacion_portero.vistas.VentanaIlegal;

/**
 * control que permite organizar las ventanas del portero
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
            mostrarVentanaIlegal(control);
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
    
    /**
     * metodo que muestra la ventana a una computadora no registrada
     * @param frame 
     */
    public static void mostrarVentanaIlegal(JFrame frame){
        VentanaIlegal ventana = new VentanaIlegal();
        frame.setContentPane(ventana);
        frame.revalidate();
    }
    
    /**
     * metodo que cierra el programa
     */
    public static void cerrarPrograma(){
        System.exit(0);
    }
}
