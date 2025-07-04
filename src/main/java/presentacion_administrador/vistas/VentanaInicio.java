package presentacion_administrador.vistas;

import javax.swing.JFrame;
import presentacion_administrador.componentes.PanelNavegacion;

/**
 *
 * @author erwbyel
 */
public class VentanaInicio extends javax.swing.JPanel {

    /**
     * Creates new form VentanaBienvenida
     *
     * @param frame
     */
    public VentanaInicio(JFrame frame) {
        initComponents();
        PanelNavegacion pnlNavegacion = new PanelNavegacion(frame);
        add(pnlNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440,200));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgPrincipal = new javax.swing.JLabel();
        pnlInformacionOpciones = new javax.swing.JPanel();
        lblOpcionesComputadoras = new javax.swing.JLabel();
        lblOpcion1 = new javax.swing.JLabel();
        lblOpcion2 = new javax.swing.JLabel();
        lblOpcion3 = new javax.swing.JLabel();
        lblOpcionesAlumnos = new javax.swing.JLabel();
        lblOpcion4 = new javax.swing.JLabel();
        lblOpcion5 = new javax.swing.JLabel();
        lblOpcion6 = new javax.swing.JLabel();
        lblOpcionesLaboratorios = new javax.swing.JLabel();
        lblOpcion7 = new javax.swing.JLabel();
        lblOpcion8 = new javax.swing.JLabel();
        lblOpcion9 = new javax.swing.JLabel();
        lblOpcionesReportes = new javax.swing.JLabel();
        lblOpcion10 = new javax.swing.JLabel();
        lblOpcion11 = new javax.swing.JLabel();
        lblOpcion12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(16, 20, 65));
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        imgPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/itson_baner (2).jpg"))); // NOI18N
        add(imgPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 196, 1340, 190));

        pnlInformacionOpciones.setBackground(new java.awt.Color(25, 30, 69));
        pnlInformacionOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOpcionesComputadoras.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblOpcionesComputadoras.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcionesComputadoras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOpcionesComputadoras.setText("OPCIONES DE COMPUTADORAS");
        pnlInformacionOpciones.add(lblOpcionesComputadoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, 1290, 40));

        lblOpcion1.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lblOpcion1.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcion1.setText("COMPUTADORAS > AGREGAR COMPUTADORA");
        pnlInformacionOpciones.add(lblOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 46, 1240, 30));

        lblOpcion2.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lblOpcion2.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcion2.setText("COMPUTADORAS > ELIMINAR COMPUTADORA");
        pnlInformacionOpciones.add(lblOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 76, 1240, 30));

        lblOpcion3.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lblOpcion3.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcion3.setText("COMPUTADORAS > LISTAR COMPUTADORA");
        pnlInformacionOpciones.add(lblOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 106, 1240, 30));

        lblOpcionesAlumnos.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblOpcionesAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcionesAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOpcionesAlumnos.setText("OPCIONES DE ALUMNOS");
        pnlInformacionOpciones.add(lblOpcionesAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 156, 1290, 30));

        lblOpcion4.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lblOpcion4.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcion4.setText("ALUMNOS > BLOQUEAR ALUMNO");
        pnlInformacionOpciones.add(lblOpcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 186, 1240, 30));

        lblOpcion5.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lblOpcion5.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcion5.setText("ALUMNOS > DESBLOQUEAR ALUMNO");
        pnlInformacionOpciones.add(lblOpcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 216, 1240, 20));

        lblOpcion6.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lblOpcion6.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcion6.setText("ALUMNOS > LISTAR ALUMNOS");
        pnlInformacionOpciones.add(lblOpcion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 236, 1240, 30));

        lblOpcionesLaboratorios.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblOpcionesLaboratorios.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcionesLaboratorios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOpcionesLaboratorios.setText("OPCIONES DE LABORATORIOS");
        pnlInformacionOpciones.add(lblOpcionesLaboratorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 286, 1290, 30));

        lblOpcion7.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lblOpcion7.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcion7.setText("LABORATORIOS > AGREGAR LABORATORIO");
        pnlInformacionOpciones.add(lblOpcion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 326, 1240, 30));

        lblOpcion8.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lblOpcion8.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcion8.setText("LABORATORIOS > MODIFICAR LABORATORIO");
        pnlInformacionOpciones.add(lblOpcion8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 356, 1240, 20));

        lblOpcion9.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lblOpcion9.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcion9.setText("LABORATORIOS > LISTAR LABORATORIOS");
        pnlInformacionOpciones.add(lblOpcion9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 376, 1240, 30));

        lblOpcionesReportes.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblOpcionesReportes.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcionesReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOpcionesReportes.setText("OPCIONES DE REPORTES");
        pnlInformacionOpciones.add(lblOpcionesReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 416, 1290, 30));

        lblOpcion10.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lblOpcion10.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcion10.setText("REPORTES > REPORTE CARRERAS");
        pnlInformacionOpciones.add(lblOpcion10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 456, 1240, 30));

        lblOpcion11.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lblOpcion11.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcion11.setText("REPORTES > REPORTE BLOQUEOS");
        pnlInformacionOpciones.add(lblOpcion11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 486, 1240, 20));

        lblOpcion12.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        lblOpcion12.setForeground(new java.awt.Color(255, 255, 255));
        lblOpcion12.setText("REPORTES > REPORTE CENTROS");
        pnlInformacionOpciones.add(lblOpcion12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 506, 1240, 30));

        add(pnlInformacionOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 1340, 640));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgPrincipal;
    private javax.swing.JLabel lblOpcion1;
    private javax.swing.JLabel lblOpcion10;
    private javax.swing.JLabel lblOpcion11;
    private javax.swing.JLabel lblOpcion12;
    private javax.swing.JLabel lblOpcion2;
    private javax.swing.JLabel lblOpcion3;
    private javax.swing.JLabel lblOpcion4;
    private javax.swing.JLabel lblOpcion5;
    private javax.swing.JLabel lblOpcion6;
    private javax.swing.JLabel lblOpcion7;
    private javax.swing.JLabel lblOpcion8;
    private javax.swing.JLabel lblOpcion9;
    private javax.swing.JLabel lblOpcionesAlumnos;
    private javax.swing.JLabel lblOpcionesComputadoras;
    private javax.swing.JLabel lblOpcionesLaboratorios;
    private javax.swing.JLabel lblOpcionesReportes;
    private javax.swing.JPanel pnlInformacionOpciones;
    // End of variables declaration//GEN-END:variables
}
