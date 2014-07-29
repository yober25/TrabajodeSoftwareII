package AprendiendoMatematicas;
import Abecedario.AprendeAbecedario;
import Colores.AprendeColores1;
import Colores.QueColorEs1;
import Colores.QueColorSigue1;
import Numeros.AprendeSumas1;
import Numeros.LaSuma1;
import Vocales.AprendeVocales;
import Vocales.QueVocalEmpieza;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class MDIAplicacion extends JFrame {
    boolean mostrar;
    public static String nombre,cadena;
    Icon Usuario;
    ClaseEdSoft clase=new ClaseEdSoft();
    public MDIAplicacion() {
        initComponents();        
        //fondo de MDI
//        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        fondo.setSize(getWidth(),getHeight());
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Iconos/fondoMDI.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(getWidth(),getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        fondo.setIcon(iconoEscalado);  
        this.repaint();
        //iniciamos imagen de JOptionPane        
        Usuario= new ImageIcon(this.getClass().getResource("/Iconos/peke.gif"));
    }
    // metodo y funciones
    public void centrar(JInternalFrame Ventana){
        Ventana.setOpaque(false);
        Ventana.setVisible(true);
        int x = (desktopPane.getWidth() / 2) - Ventana.getWidth() / 2; 
        if (Ventana.isShowing()) {
            Ventana.setLocation(x, 0);
        } else {
            desktopPane.add(Ventana);
            Ventana.setLocation(x, 0);  
            Ventana.show();
        }
      Ventana.moveToFront();  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu23 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        desktopPane = new javax.swing.JDesktopPane();
        fondo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        Aprender_colores = new javax.swing.JMenuItem();
        Que_color_es = new javax.swing.JMenuItem();
        Que_color_sigue = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Aprender_vocales = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        Aprender_abecedario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        Ayuda = new javax.swing.JMenuItem();
        Informacion = new javax.swing.JMenuItem();

        jMenuItem11.setText("jMenuItem11");

        jMenu23.setText("jMenu23");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        fondo.setBounds(0, 0, 900, 510);
        desktopPane.add(fondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane1.setViewportView(desktopPane);

        fileMenu.setBorder(null);
        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AprendiendoMatematicas/home.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Menú");
        fileMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fileMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fileMenu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        fileMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fileMenu.add(jSeparator1);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AprendiendoMatematicas/exit.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        fileMenu.add(Salir);

        menuBar.add(fileMenu);

        helpMenu.setBorder(null);
        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/icono.png"))); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("Los Colores");
        helpMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helpMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        helpMenu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        helpMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Aprender_colores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/submenu/colors.png"))); // NOI18N
        Aprender_colores.setMnemonic('c');
        Aprender_colores.setText("Aprende los Colores");
        Aprender_colores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aprender_colores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aprender_coloresActionPerformed(evt);
            }
        });
        helpMenu.add(Aprender_colores);

        Que_color_es.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/submenu/colores.png"))); // NOI18N
        Que_color_es.setText("¿Que color es?");
        Que_color_es.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Que_color_es.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Que_color_esActionPerformed(evt);
            }
        });
        helpMenu.add(Que_color_es);

        Que_color_sigue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/submenu/color1.png"))); // NOI18N
        Que_color_sigue.setMnemonic('a');
        Que_color_sigue.setText("¿Que color sigue?");
        Que_color_sigue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Que_color_sigue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Que_color_sigueActionPerformed(evt);
            }
        });
        helpMenu.add(Que_color_sigue);

        menuBar.add(helpMenu);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/vocales.png"))); // NOI18N
        jMenu1.setText("Las Vocales");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jMenu1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Aprender_vocales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/submenu/apvocales.png"))); // NOI18N
        Aprender_vocales.setText("Apreder las Vocales");
        Aprender_vocales.setToolTipText("");
        Aprender_vocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aprender_vocalesActionPerformed(evt);
            }
        });
        jMenu1.add(Aprender_vocales);
        jMenu1.add(jSeparator2);

        menuBar.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Abecedario/abc.png"))); // NOI18N
        jMenu2.setText("El Abecedario");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jMenu2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Aprender_abecedario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Abecedario/apabc.png"))); // NOI18N
        Aprender_abecedario.setText("Aprender el Abecedario");
        Aprender_abecedario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aprender_abecedarioActionPerformed(evt);
            }
        });
        jMenu2.add(Aprender_abecedario);

        menuBar.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/numeros.png"))); // NOI18N
        jMenu3.setText("Numeros");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jMenu3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenu3.add(jSeparator4);

        jMenuItem40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/iconos/SubMenu-Numeros.png"))); // NOI18N
        jMenuItem40.setText("La Suma");
        jMenuItem40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem40);

        jMenuItem38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/iconos/SubMenu-Suma.png"))); // NOI18N
        jMenuItem38.setText("Desafios de Suma");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem38);

        menuBar.add(jMenu3);

        jMenu15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ayuda/ayuda.png"))); // NOI18N
        jMenu15.setText("Ayuda");
        jMenu15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jMenu15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ayuda/manual_help.png"))); // NOI18N
        Ayuda.setText("Ayuda contenido");
        jMenu15.add(Ayuda);

        Informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ayuda/alert.png"))); // NOI18N
        Informacion.setText("Acerca de");
        Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformacionActionPerformed(evt);
            }
        });
        jMenu15.add(Informacion);

        menuBar.add(jMenu15);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Aprender_abecedarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aprender_abecedarioActionPerformed
        AprendeAbecedario frmPrincipal = new AprendeAbecedario(); 
        this.centrar(frmPrincipal);
    }//GEN-LAST:event_Aprender_abecedarioActionPerformed
    private void Aprender_vocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aprender_vocalesActionPerformed
        AprendeVocales frmPrincipal = new AprendeVocales();         
        this.centrar(frmPrincipal);
    }//GEN-LAST:event_Aprender_vocalesActionPerformed
    private void InformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformacionActionPerformed
        Informacion inf=new Informacion(this, true);
        inf.setVisible(true);        
    }//GEN-LAST:event_InformacionActionPerformed
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
//        int eleccion = JOptionPane.showConfirmDialog(null, "<html><body><div align='center' ><h2>¿Ya te vas "+nombre.toUpperCase()+"?<br>¿Quieres salir de EdSotMate?</h2></div></body></html>", "Cerrando EdSoftMate...", JOptionPane.WARNING_MESSAGE, JOptionPane.WARNING_MESSAGE, Usuario);
//        if (eleccion==0){
            System.exit(0);
            dispose(); 
//        }
    }//GEN-LAST:event_SalirActionPerformed
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        clase.customizeNimbusLaF();
//        cadena= "<html><body><div align='center' ><h2>Hola "+nombre.toUpperCase()+", Yo soy PEKE.</h2>"
//                + "<p>Ahora aprenderemos las matemáticas y nos divertiremos jugando.</p>"
//                + "<p>¡Elige las opciones del menú y a devertirnos!.</p></div></body></html>";        
//        Bienvenida panel = new Bienvenida();
//        Bienvenida.texto.setText(cadena);
//        JOptionPane.showMessageDialog(null, panel, "Bienvenidos a EdSoftMate", JOptionPane.WARNING_MESSAGE, Usuario);
    }//GEN-LAST:event_formWindowOpened

    private void Que_color_sigueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Que_color_sigueActionPerformed
        QueColorSigue1 frmPrincipal = new QueColorSigue1();
        this.centrar(frmPrincipal);
    }//GEN-LAST:event_Que_color_sigueActionPerformed

    private void Que_color_esActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Que_color_esActionPerformed
        QueColorEs1 frmPrincipal = new QueColorEs1();
        this.centrar(frmPrincipal);
    }//GEN-LAST:event_Que_color_esActionPerformed

    private void Aprender_coloresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aprender_coloresActionPerformed
        AprendeColores1 frmPrincipal = new AprendeColores1();
        this.centrar(frmPrincipal);
    }//GEN-LAST:event_Aprender_coloresActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        AprendeSumas1 frmPrincipal = new AprendeSumas1();
        this.centrar(frmPrincipal);
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        LaSuma1 frmPrincipal = new LaSuma1();
        this.centrar(frmPrincipal);
    }//GEN-LAST:event_jMenuItem40ActionPerformed
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MDIAplicacion main=new MDIAplicacion();                
                main.setVisible(true);
                main.setLocationRelativeTo(null);
            }
        });        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Aprender_abecedario;
    private javax.swing.JMenuItem Aprender_colores;
    private javax.swing.JMenuItem Aprender_vocales;
    private javax.swing.JMenuItem Ayuda;
    private javax.swing.JMenuItem Informacion;
    private javax.swing.JMenuItem Que_color_es;
    private javax.swing.JMenuItem Que_color_sigue;
    private javax.swing.JMenuItem Salir;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
