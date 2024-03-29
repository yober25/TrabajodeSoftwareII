package Colores;
import AprendiendoMatematicas.ClaseEdSoft;
import AprendiendoMatematicas.MDIAplicacion;
import javax.swing.JInternalFrame;

public class AprendeColores1 extends javax.swing.JInternalFrame {
    ClaseEdSoft clase=new ClaseEdSoft();
    public AprendeColores1() {
        initComponents();
    }
    // metodo y funciones
    public void centrar(JInternalFrame frmPrincipal){
        frmPrincipal.setOpaque(false);
        frmPrincipal.setVisible(true);
        int x = (MDIAplicacion.desktopPane.getWidth() / 2) - frmPrincipal.getWidth() / 2; 
        if (frmPrincipal.isShowing()) {
            frmPrincipal.setLocation(x, 0);
        } else {
            MDIAplicacion.desktopPane.add(frmPrincipal);
            frmPrincipal.setLocation(x, 0);  
            frmPrincipal.show();
        }
      frmPrincipal.moveToFront();  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Aprende los Colores con EdSoftMate");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/icono.png"))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Los Colores Básicos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 18), java.awt.Color.darkGray)); // NOI18N
        jPanel3.setToolTipText("");
        jPanel3.setName(""); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/amarillo.png"))); // NOI18N
        jButton1.setToolTipText("<html> <script type=\"text/javascript\"> function mostrarVentana(){var ventana = document.getElementById('miVentana');ventana.style.marginTop = \"100px\";  ventana.style.marginLeft = ((document.body.clientWidth-350) / 2) +  \"px\";ventana.style.display = 'block';} </script> <body onload=\"mostrarVentana()\"> <div id=\"miVentana\" style=\" width: 120px; height: 30px; top: 0; left: 0; font-family:Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-weight: normal; border: #000000 1px solid; background-color: #FAFAFA; color: #000000;\">  <div style=\"font-weight: bold; text-align: center; color: #FFFFFF; padding: 1px; background-color:#006394\">Los Colores</div> \t<p style=\"font-family:Times New Roman;font-style:italic;font-weight:bold; font-size:16px;color:rgb(51, 0, 153); text-align:center; te\">AMARILLO</p>  </div> </div> </body> </html>");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(-3);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/amarillo1.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/verde.png"))); // NOI18N
        jButton2.setToolTipText("<html> <script type=\"text/javascript\"> function mostrarVentana(){var ventana = document.getElementById('miVentana');ventana.style.marginTop = \"100px\";  ventana.style.marginLeft = ((document.body.clientWidth-350) / 2) +  \"px\";ventana.style.display = 'block';} </script> <body onload=\"mostrarVentana()\"> <div id=\"miVentana\" style=\" width: 120px; height: 30px; top: 0; left: 0; font-family:Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-weight: normal; border: #000000 1px solid; background-color: #FAFAFA; color: #000000;\">  <div style=\"font-weight: bold; text-align: center; color: #FFFFFF; padding: 1px; background-color:#006394\">Los Colores</div> \t<p style=\"font-family:Times New Roman;font-style:italic;font-weight:bold; font-size:16px;color:rgb(51, 0, 153); text-align:center; te\">VERDE</p>  </div> </div>      </body> </html>");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-3);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/verde1.png"))); // NOI18N
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/rojo.png"))); // NOI18N
        jButton3.setToolTipText("<html> <script type=\"text/javascript\"> function mostrarVentana(){var ventana = document.getElementById('miVentana');ventana.style.marginTop = \"100px\";  ventana.style.marginLeft = ((document.body.clientWidth-350) / 2) +  \"px\";ventana.style.display = 'block';} </script> <body onload=\"mostrarVentana()\"> <div id=\"miVentana\" style=\" width: 120px; height: 30px; top: 0; left: 0; font-family:Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-weight: normal; background-color: #FAFAFA; color: #000000;\">  <div style=\"font-weight: bold; text-align: center; color: #FFFFFF; padding: 1px; background-color:#006394\">Los Colores</div> \t<p style=\"font-family:Times New Roman;font-style:italic;font-weight:bold; font-size:16px;color:rgb(51, 0, 153); text-align:center; te\">ROJO</p>  </div> </div> </body> </html>");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(-3);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/rojo1.png"))); // NOI18N
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/azul.png"))); // NOI18N
        jButton4.setToolTipText("<html>  <style type='text/css'>  .estilo1{font-family:Times New Roman;font-style:italic;font-weight:bold; font-size:18px;color:rgb(51, 0, 153);}  .estilo2{font-family:Arial;font-weight:bold; font-size:12px;color:rgb(153, 102, 0);}</style>  <div align=\"center\"><span class='estilo1'>Azul</span></div></html>");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setIconTextGap(-3);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/azul1.png"))); // NOI18N
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/rosado.png"))); // NOI18N
        jButton5.setToolTipText("<html>  <style type='text/css'>  .estilo1{font-family:Times New Roman;font-style:italic;font-weight:bold; font-size:18px;color:rgb(51, 0, 153);}  .estilo2{font-family:Arial;font-weight:bold; font-size:12px;color:rgb(153, 102, 0);}</style>  <div align=\"center\"><span class='estilo1'>Rosado</span></div></html>");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setIconTextGap(-3);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/rosado1.png"))); // NOI18N
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/anaranjado.png"))); // NOI18N
        jButton6.setToolTipText("<html>  <style type='text/css'>  .estilo1{font-family:Times New Roman;font-style:italic;font-weight:bold; font-size:18px;color:rgb(51, 0, 153);}  .estilo2{font-family:Arial;font-weight:bold; font-size:12px;color:rgb(153, 102, 0);}</style>  <div align=\"center\"><span class='estilo1'>Naranja</span></div></html>");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setIconTextGap(-3);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/anaranjado1.png"))); // NOI18N
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/negro.png"))); // NOI18N
        jButton7.setToolTipText("Negro");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setIconTextGap(-3);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/negro1.png"))); // NOI18N
        jButton7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/marron.png"))); // NOI18N
        jButton8.setToolTipText("Marrón");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setIconTextGap(-3);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/marron1.png"))); // NOI18N
        jButton8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/blanco.png"))); // NOI18N
        jButton9.setToolTipText("Blanco");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setIconTextGap(-3);
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/blanco1.png"))); // NOI18N
        jButton9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/gris.png"))); // NOI18N
        jButton10.setToolTipText("Gris");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setIconTextGap(-3);
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/gris1.png"))); // NOI18N
        jButton10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/next_button1.png"))); // NOI18N
        siguiente.setToolTipText("Siguiente");
        siguiente.setBorder(null);
        siguiente.setBorderPainted(false);
        siguiente.setContentAreaFilled(false);
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        siguiente.setIconTextGap(-3);
        siguiente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/next_button.png"))); // NOI18N
        siguiente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        siguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                siguienteMouseEntered(evt);
            }
        });
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/morado.png"))); // NOI18N
        jButton12.setToolTipText("<html> <script type=\"text/javascript\"> function mostrarVentana(){var ventana = document.getElementById('miVentana');ventana.style.marginTop = \"100px\";  ventana.style.marginLeft = ((document.body.clientWidth-350) / 2) +  \"px\";ventana.style.display = 'block';} </script> <body onload=\"mostrarVentana()\"> <div id=\"miVentana\" style=\" width: 120px; height: 30px; top: 0; left: 0; font-family:Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-weight: normal; border: #000000 1px solid; background-color: #FAFAFA; color: #000000;\">  <div style=\"font-weight: bold; text-align: center; color: #FFFFFF; padding: 1px; background-color:#006394\">Los Colores</div> \t<p style=\"font-family:Times New Roman;font-style:italic;font-weight:bold; font-size:16px;color:rgb(51, 0, 153); text-align:center; te\">Violeta</p>  </div> </div> </body> </html>");
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setIconTextGap(-3);
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/morado1.png"))); // NOI18N
        jButton12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jButton1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jButton2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jButton3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jButton4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jButton6))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jButton5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jButton7)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jButton8)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jButton9)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jButton10)))
                        .add(32, 32, 32))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jButton12)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(siguiente))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(35, 35, 35)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jButton2)
                    .add(jButton1)
                    .add(jButton3)
                    .add(jButton4)
                    .add(jButton6))
                .add(18, 18, 18)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton7)
                    .add(jButton5)
                    .add(jButton8)
                    .add(jButton9)
                    .add(jButton10))
                .add(18, 18, 18)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jButton12)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(siguiente))))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/coloresmen.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/iconos/loscolores.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clase.sonido("/Colores/coloressonidos/amarillo.wav");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clase.sonido("/Colores/coloressonidos/verde.wav");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clase.sonido("/Colores/coloressonidos/rojo.wav");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clase.sonido("/Colores/coloressonidos/azul.wav");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clase.sonido("/Colores/coloressonidos/rosado.wav");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        clase.sonido("/Colores/coloressonidos/naranja.wav");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        clase.sonido("/Colores/coloressonidos/negro.wav");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        clase.sonido("/Colores/coloressonidos/marron.wav");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        clase.sonido("/Colores/coloressonidos/blanco.wav");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        clase.sonido("/Colores/coloressonidos/gris.wav");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        AprendeColores2 color2=new AprendeColores2();
        this.dispose();
        centrar(color2);
        clase.sonido("/Sonidos/water1.wav");
    }//GEN-LAST:event_siguienteActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        clase.sonido("/Colores/coloressonidos/morado.wav");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void siguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseEntered
        clase.sonido("/Sonidos/water1.wav");
    }//GEN-LAST:event_siguienteMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
