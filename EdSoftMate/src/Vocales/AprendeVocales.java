package Vocales;
import java.applet.AudioClip;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AprendeVocales extends javax.swing.JInternalFrame {
    public AprendeVocales() {
        initComponents();
        mensaje.setText("Estas Son las 5 Vocales");
        //botona.setIcon("/Iconos/bakground.png");

    }
    public void sonido(String cadena){
        AudioClip sonido=java.applet.Applet.newAudioClip(getClass().getResource(cadena));
        sonido.play();
    }
    public void cambiarIcono(JButton boton,String icono,String rollIcon){
        boton.setIcon(new ImageIcon(getClass().getResource(icono)));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource(rollIcon)));
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
        jButton16 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        botona = new javax.swing.JButton();
        botone = new javax.swing.JButton();
        botoni = new javax.swing.JButton();
        botono = new javax.swing.JButton();
        botonu = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Aprende las Vocales con EdSoftMate");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/submenu/apvocales.png"))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "El Tren de las Vocales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 1, 18), java.awt.Color.darkGray)); // NOI18N
        jPanel3.setName(""); // NOI18N

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/i1.png"))); // NOI18N
        jButton16.setToolTipText("Vocal i");
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setIconTextGap(-3);
        jButton16.setMaximumSize(new java.awt.Dimension(81, 64));
        jButton16.setMinimumSize(new java.awt.Dimension(81, 64));
        jButton16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/i.png"))); // NOI18N
        jButton16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/u1.png"))); // NOI18N
        jButton20.setToolTipText("Vocal u");
        jButton20.setBorder(null);
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setIconTextGap(-3);
        jButton20.setMaximumSize(new java.awt.Dimension(81, 64));
        jButton20.setMinimumSize(new java.awt.Dimension(81, 64));
        jButton20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/u.png"))); // NOI18N
        jButton20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/a1.png"))); // NOI18N
        jButton1.setToolTipText("Vocal a");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(-3);
        jButton1.setMaximumSize(new java.awt.Dimension(81, 64));
        jButton1.setMinimumSize(new java.awt.Dimension(81, 64));
        jButton1.setPreferredSize(new java.awt.Dimension(81, 64));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/a.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/e1.png"))); // NOI18N
        jButton5.setToolTipText("Vocal e");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setIconTextGap(-3);
        jButton5.setMaximumSize(new java.awt.Dimension(81, 64));
        jButton5.setMinimumSize(new java.awt.Dimension(81, 64));
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/e.png"))); // NOI18N
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/o1.png"))); // NOI18N
        jButton14.setToolTipText("Vocal o");
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setIconTextGap(-3);
        jButton14.setMaximumSize(new java.awt.Dimension(81, 64));
        jButton14.setMinimumSize(new java.awt.Dimension(81, 64));
        jButton14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/o.png"))); // NOI18N
        jButton14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/locomotora1.png"))); // NOI18N
        jButton28.setToolTipText("");
        jButton28.setBorder(null);
        jButton28.setBorderPainted(false);
        jButton28.setContentAreaFilled(false);
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.setIconTextGap(-3);
        jButton28.setMaximumSize(new java.awt.Dimension(81, 64));
        jButton28.setMinimumSize(new java.awt.Dimension(81, 64));
        jButton28.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/locomotora.png"))); // NOI18N
        jButton28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton28.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/fin1.png"))); // NOI18N
        jButton29.setToolTipText("");
        jButton29.setBorder(null);
        jButton29.setBorderPainted(false);
        jButton29.setContentAreaFilled(false);
        jButton29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.setIconTextGap(-3);
        jButton29.setMaximumSize(new java.awt.Dimension(81, 64));
        jButton29.setMinimumSize(new java.awt.Dimension(81, 64));
        jButton29.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/fin.png"))); // NOI18N
        jButton29.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton29.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/va.png"))); // NOI18N
        botona.setToolTipText("");
        botona.setBorder(null);
        botona.setBorderPainted(false);
        botona.setContentAreaFilled(false);
        botona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botona.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botona.setIconTextGap(-3);
        botona.setMaximumSize(new java.awt.Dimension(81, 64));
        botona.setMinimumSize(new java.awt.Dimension(81, 64));
        botona.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/va1.png"))); // NOI18N
        botona.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botona.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonaActionPerformed(evt);
            }
        });

        botone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/ve.png"))); // NOI18N
        botone.setToolTipText("");
        botone.setBorder(null);
        botone.setBorderPainted(false);
        botone.setContentAreaFilled(false);
        botone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botone.setIconTextGap(-3);
        botone.setMaximumSize(new java.awt.Dimension(81, 64));
        botone.setMinimumSize(new java.awt.Dimension(81, 64));
        botone.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/ve1.png"))); // NOI18N
        botone.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botone.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneActionPerformed(evt);
            }
        });

        botoni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/vi.png"))); // NOI18N
        botoni.setToolTipText("");
        botoni.setBorder(null);
        botoni.setBorderPainted(false);
        botoni.setContentAreaFilled(false);
        botoni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoni.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botoni.setIconTextGap(-3);
        botoni.setMaximumSize(new java.awt.Dimension(81, 64));
        botoni.setMinimumSize(new java.awt.Dimension(81, 64));
        botoni.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/vi1.png"))); // NOI18N
        botoni.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botoni.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoniActionPerformed(evt);
            }
        });

        botono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/vo.png"))); // NOI18N
        botono.setToolTipText("");
        botono.setBorder(null);
        botono.setBorderPainted(false);
        botono.setContentAreaFilled(false);
        botono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botono.setIconTextGap(-3);
        botono.setMaximumSize(new java.awt.Dimension(81, 64));
        botono.setMinimumSize(new java.awt.Dimension(81, 64));
        botono.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/vo1.png"))); // NOI18N
        botono.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botono.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonoActionPerformed(evt);
            }
        });

        botonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/vu.png"))); // NOI18N
        botonu.setToolTipText("");
        botonu.setBorder(null);
        botonu.setBorderPainted(false);
        botonu.setContentAreaFilled(false);
        botonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonu.setIconTextGap(-3);
        botonu.setMaximumSize(new java.awt.Dimension(81, 64));
        botonu.setMinimumSize(new java.awt.Dimension(81, 64));
        botonu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/trenvocales/vu1.png"))); // NOI18N
        botonu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonuActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(botona, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(botone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(botoni, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(botono, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(botonu, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .add(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, botono, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, botoni, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, botone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, botona, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, botonu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mensaje.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        mensaje.setText("Estas son las 5 vocales");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jButton28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(mensaje))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jButton20, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton14, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton16, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton28, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(23, 23, 23)
                .add(mensaje, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/iconos/abcmen.png"))); // NOI18N

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vocales/iconos/abc.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(4, 4, 4)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 194, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel1)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 18, Short.MAX_VALUE)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mensaje.setText("Palabras que empiezan con la vocal A(a)");
        this.sonido("/Vocales/audio/a.wav");        
        cambiarIcono(botona,"/Vocales/trenvocales/vocala1.png", "/Vocales/trenvocales/vocala11.png");  
        cambiarIcono(botone,"/Vocales/trenvocales/vocala2.png", "/Vocales/trenvocales/vocala21.png");
        cambiarIcono(botoni,"/Vocales/trenvocales/vocala3.png", "/Vocales/trenvocales/vocala31.png");
        cambiarIcono(botono,"/Vocales/trenvocales/vocala4.png", "/Vocales/trenvocales/vocala41.png");
        cambiarIcono(botonu,"/Vocales/trenvocales/vocala5.png", "/Vocales/trenvocales/vocala51.png");
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mensaje.setText("Palabras que empiezan con la vocal E(e)");
        this.sonido("/Vocales/audio/e.wav");
        cambiarIcono(botona,"/Vocales/trenvocales/vocale1.png", "/Vocales/trenvocales/vocale11.png");  
        cambiarIcono(botone,"/Vocales/trenvocales/vocale2.png", "/Vocales/trenvocales/vocale21.png");
        cambiarIcono(botoni,"/Vocales/trenvocales/vocale3.png", "/Vocales/trenvocales/vocale31.png");
        cambiarIcono(botono,"/Vocales/trenvocales/vocale4.png", "/Vocales/trenvocales/vocale41.png");
        cambiarIcono(botonu,"/Vocales/trenvocales/vocale5.png", "/Vocales/trenvocales/vocale51.png");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        mensaje.setText("Palabras que empiezan con la vocal I(i)");
        this.sonido("/Vocales/audio/i.wav");
        cambiarIcono(botona,"/Vocales/trenvocales/vocali1.png", "/Vocales/trenvocales/vocali11.png");  
        cambiarIcono(botone,"/Vocales/trenvocales/vocali2.png", "/Vocales/trenvocales/vocali21.png");
        cambiarIcono(botoni,"/Vocales/trenvocales/vocali3.png", "/Vocales/trenvocales/vocali31.png");
        cambiarIcono(botono,"/Vocales/trenvocales/vocali4.png", "/Vocales/trenvocales/vocali41.png");
        cambiarIcono(botonu,"/Vocales/trenvocales/vocali5.png", "/Vocales/trenvocales/vocali51.png");
    }//GEN-LAST:event_jButton16ActionPerformed
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        mensaje.setText("Palabras que empiezan con la vocal O(o)");
        this.sonido("/Vocales/audio/o.wav");
        cambiarIcono(botona,"/Vocales/trenvocales/vocalo1.png", "/Vocales/trenvocales/vocalo11.png");  
        cambiarIcono(botone,"/Vocales/trenvocales/vocalo2.png", "/Vocales/trenvocales/vocalo21.png");
        cambiarIcono(botoni,"/Vocales/trenvocales/vocalo3.png", "/Vocales/trenvocales/vocalo31.png");
        cambiarIcono(botono,"/Vocales/trenvocales/vocalo4.png", "/Vocales/trenvocales/vocalo41.png");
        cambiarIcono(botonu,"/Vocales/trenvocales/vocalo5.png", "/Vocales/trenvocales/vocalo51.png");
    }//GEN-LAST:event_jButton14ActionPerformed
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        mensaje.setText("Palabras que empiezan con la vocal U(u)");
        this.sonido("/Vocales/audio/u.wav");
        cambiarIcono(botona,"/Vocales/trenvocales/vocalu1.png", "/Vocales/trenvocales/vocalu11.png");  
        cambiarIcono(botone,"/Vocales/trenvocales/vocalu2.png", "/Vocales/trenvocales/vocalu21.png");
        cambiarIcono(botoni,"/Vocales/trenvocales/vocalu3.png", "/Vocales/trenvocales/vocalu31.png");
        cambiarIcono(botono,"/Vocales/trenvocales/vocalu4.png", "/Vocales/trenvocales/vocalu41.png");
        cambiarIcono(botonu,"/Vocales/trenvocales/vocalu5.png", "/Vocales/trenvocales/vocalu51.png");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        mensaje.setText("Estas Son las 5 Vocales");
        this.sonido("/Vocales/audio/5v.wav");
        cambiarIcono(botona,"/Vocales/trenvocales/va.png", "/Vocales/trenvocales/va1.png");  
        cambiarIcono(botone,"/Vocales/trenvocales/ve.png", "/Vocales/trenvocales/ve1.png");
        cambiarIcono(botoni,"/Vocales/trenvocales/vi.png", "/Vocales/trenvocales/vi1.png");
        cambiarIcono(botono,"/Vocales/trenvocales/vo.png", "/Vocales/trenvocales/vo1.png");
        cambiarIcono(botonu,"/Vocales/trenvocales/vu.png", "/Vocales/trenvocales/vu1.png");
        
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void botonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botonaActionPerformed

    private void botoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botoneActionPerformed

    private void botoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botoniActionPerformed

    private void botonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonoActionPerformed

    private void botonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botona;
    private javax.swing.JButton botone;
    private javax.swing.JButton botoni;
    private javax.swing.JButton botono;
    private javax.swing.JButton botonu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel mensaje;
    // End of variables declaration//GEN-END:variables
}
