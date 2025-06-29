package presentacion_administrador;

import presentacion_administrador.vistas.computadoras.agregar_computadora.*;
import presentacion_administrador.vistas.laboratorios.agregar_laboratorio.*;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import presentacion_administrador.vistas.*;
import presentacion_administrador.vistas.bloqueos.agregar_bloqueo.VentanaBloqueoAgrega;
import presentacion_administrador.vistas.bloqueos.listar_bloqueo.VentanaBloqueoLista;
import presentacion_administrador.vistas.bloqueos.quitar_bloqueo.VentanaBloqueoQuita;
import presentacion_administrador.vistas.computadoras.listar_computadora.VentanaComputadoraLista;
import presentacion_administrador.vistas.computadoras.quitar_computadora.VentanaComputadoraQuita;
import presentacion_administrador.vistas.reportes.reporte_bloqueados.VentanaReporteBloqueo;

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
     *
     * @param frame
     */
    public static void mostrarVentanaInicio(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaInicio ventana = new VentanaInicio(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

    //Ventanas de Computadoras
    /**
     * ventana que permite iniciar el proceso de agregar una computadora
     *
     * @param frame
     */
    public static void mostrarVentanaComputadoraAgrega(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaComputadoraAgrega ventana = new VentanaComputadoraAgrega(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

    /**
     * ventana que permite iniciar el proceso de quitar una computadora
     *
     * @param frame
     */
    public static void mostrarVentanaComputadoraQuita(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaComputadoraQuita ventana = new VentanaComputadoraQuita(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

    /**
     * ventana que permite iniciar el proceso de listar una computadora
     *
     * @param frame
     */
    public static void mostrarVentanaComputadoraLista(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaComputadoraLista ventana = new VentanaComputadoraLista(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

    //Ventanas de Laboratorios
    /**
     * ventana que permite iniciar el proceso de agregar un laboratorio
     *
     * @param frame
     */
    public static void mostrarVentanaLaboratorioAgrega(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaLaboratorioAgrega ventana = new VentanaLaboratorioAgrega(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

    //Ventanas de Bloqueos
    /**
     * ventana que permite iniciar el proceso de agregar un bloqueo
     *
     * @param frame
     */
    public static void mostrarVentanaBloqueoAgrega(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaBloqueoAgrega ventana = new VentanaBloqueoAgrega(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

    /**
     * ventana que permite iniciar el proceso de quitar un bloqueo
     *
     * @param frame
     */
    public static void mostrarVentanaBloqueoQuita(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaBloqueoQuita ventana = new VentanaBloqueoQuita(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

    /**
     * ventana que permite iniciar el proceso de listar un bloqueo
     *
     * @param frame
     */
    public static void mostrarVentanaBloqueoLista(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaBloqueoLista ventana = new VentanaBloqueoLista(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

    //ventanas de reportes
    /**
     * ventana que permite iniciar el proceso de generar un reporte bloqueo
     *
     * @param frame
     */
    public static void mostrarVentanaReporteBloqueo(JFrame frame) {
        SwingUtilities.invokeLater(() -> {
            VentanaReporteBloqueo ventana = new VentanaReporteBloqueo(frame);
            frame.setContentPane(ventana);
            frame.revalidate();
        });
    }

}
