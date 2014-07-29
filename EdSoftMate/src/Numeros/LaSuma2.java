package Numeros;
import Abecedario.*;
import AprendiendoMatematicas.ClaseEdSoft;
import AprendiendoMatematicas.MDIAplicacion;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

public final class LaSuma2 extends javax.swing.JInternalFrame {
     private Timer tiempo ;
    private TimerTask task;
    private int duracion; 
    boolean bandera=false;
    int rango,num1,num2,num3,suma,limite,contador,totalmensajes=5;
    int pCorrecto=0,pError=0,pTotal=0,pPuntos;
    //--------------------------------------------------------------------------
    ClaseEdSoft clase=new ClaseEdSoft();
    String[] mensajeCorrecto = {"Muy bien!", "Sigue así.", "Correcto!","Acertaste!","Bien!"};
    String[] mensajeIncorrecto = {"Intentalo de nuevo.", "Ops... ERROR","Oh, no!","Puedes lograrlo!","Sigue intentando"};
    
    public LaSuma2() {
        initComponents();
        rango=10;
        generarSuma();
    }
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
    public void generarSuma(){
        random(numero10,numero20,numero30,numero40,respuesta1);
        random(numero11,numero21,numero31,numero41,respuesta2);
        random(numero12,numero22,numero32,numero42,respuesta3);  
    }
    public void random(JTextField T1,JTextField T2,JTextField T3,JTextField T4,JTextField RT){
        num1=1+(int)(Math.random()*rango);
        num2=(int)(Math.random()*rango);
        suma=num1+num2;
        T1.setText(String.valueOf(num1));
        T2.setText(String.valueOf(num2));
        T3.setText(String.valueOf(num2));
        T4.setText(String.valueOf(num1));
        RT.setText(String.valueOf(suma));
    }    
    public void conf_text_buton(JButton boton,int x, int y, int z,int tamanio){
        boton.setForeground(new Color(x, y, z));
        Font controlFont = new Font("Tahoma", Font.TYPE1_FONT, tamanio);
        boton.setFont(controlFont);
        clase.sonido("/Sonidos/water1.wav");
    }
    public void sonido(String cadena){
        AudioClip sonido=java.applet.Applet.newAudioClip(getClass().getResource(cadena));
        sonido.play();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        signo1 = new javax.swing.JButton();
        signo = new javax.swing.JButton();
        numero10 = new javax.swing.JTextField();
        numero20 = new javax.swing.JTextField();
        numero30 = new javax.swing.JTextField();
        signo2 = new javax.swing.JButton();
        numero40 = new javax.swing.JTextField();
        signo3 = new javax.swing.JButton();
        numero11 = new javax.swing.JTextField();
        signo4 = new javax.swing.JButton();
        numero41 = new javax.swing.JTextField();
        signo5 = new javax.swing.JButton();
        signo6 = new javax.swing.JButton();
        signo7 = new javax.swing.JButton();
        numero21 = new javax.swing.JTextField();
        numero31 = new javax.swing.JTextField();
        numero12 = new javax.swing.JTextField();
        signo8 = new javax.swing.JButton();
        numero42 = new javax.swing.JTextField();
        signo9 = new javax.swing.JButton();
        signo10 = new javax.swing.JButton();
        signo11 = new javax.swing.JButton();
        numero22 = new javax.swing.JTextField();
        numero32 = new javax.swing.JTextField();
        botonIniciarConTiempo = new javax.swing.JButton();
        respuesta1 = new javax.swing.JTextField();
        respuesta2 = new javax.swing.JTextField();
        respuesta3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        anterior2 = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();

        setClosable(true);
        setTitle("Aprende los Numeros con EdSoftMate");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/numeros.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Chicken Butt", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("La Suma");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Intercambio de Posición", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vijaya", 0, 24), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 153, 51));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("3 + 2 = 5");
        jLabel6.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("2 + 3 = 5");
        jLabel8.setToolTipText("");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/iconos/logo3.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/iconos/logo4.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("... también ...");
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Intercambiar los números en las sumas da el mismo resultado.");
        jLabel11.setToolTipText("");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel11, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(24, 24, 24)
                                .add(jLabel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .add(jLabel10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(28, 28, 28)
                                .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel12)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel13))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel11)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(jLabel6)
                        .add(18, 18, 18)
                        .add(jLabel10)
                        .add(18, 18, 18)
                        .add(jLabel8)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel12)
                        .add(2, 2, 2)
                        .add(jLabel13)
                        .add(0, 3, Short.MAX_VALUE))))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Ejemplos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vijaya", 0, 24), new java.awt.Color(153, 0, 0))); // NOI18N

        signo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signo1.setText("+");
        signo1.setToolTipText("");
        signo1.setBorderPainted(false);
        signo1.setContentAreaFilled(false);

        signo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signo.setText("=");
        signo.setToolTipText("");
        signo.setBorderPainted(false);
        signo.setContentAreaFilled(false);

        numero10.setEditable(false);
        numero10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numero10.setForeground(new java.awt.Color(0, 204, 0));
        numero10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numero10.setText("77");

        numero20.setEditable(false);
        numero20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numero20.setForeground(new java.awt.Color(0, 204, 0));
        numero20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numero20.setText("77");

        numero30.setEditable(false);
        numero30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numero30.setForeground(new java.awt.Color(255, 102, 0));
        numero30.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numero30.setText("77");

        signo2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signo2.setText("+");
        signo2.setToolTipText("");
        signo2.setBorderPainted(false);
        signo2.setContentAreaFilled(false);

        numero40.setEditable(false);
        numero40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numero40.setForeground(new java.awt.Color(255, 102, 0));
        numero40.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numero40.setText("77");

        signo3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signo3.setText("=");
        signo3.setToolTipText("");
        signo3.setBorderPainted(false);
        signo3.setContentAreaFilled(false);

        numero11.setEditable(false);
        numero11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numero11.setForeground(new java.awt.Color(0, 204, 0));
        numero11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numero11.setText("77");

        signo4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signo4.setText("+");
        signo4.setToolTipText("");
        signo4.setBorderPainted(false);
        signo4.setContentAreaFilled(false);

        numero41.setEditable(false);
        numero41.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numero41.setForeground(new java.awt.Color(255, 102, 0));
        numero41.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numero41.setText("77");

        signo5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signo5.setText("=");
        signo5.setToolTipText("");
        signo5.setBorderPainted(false);
        signo5.setContentAreaFilled(false);

        signo6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signo6.setText("=");
        signo6.setToolTipText("");
        signo6.setBorderPainted(false);
        signo6.setContentAreaFilled(false);

        signo7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signo7.setText("+");
        signo7.setToolTipText("");
        signo7.setBorderPainted(false);
        signo7.setContentAreaFilled(false);

        numero21.setEditable(false);
        numero21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numero21.setForeground(new java.awt.Color(0, 204, 0));
        numero21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numero21.setText("77");

        numero31.setEditable(false);
        numero31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numero31.setForeground(new java.awt.Color(255, 102, 0));
        numero31.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numero31.setText("77");

        numero12.setEditable(false);
        numero12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numero12.setForeground(new java.awt.Color(0, 204, 0));
        numero12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numero12.setText("77");

        signo8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signo8.setText("+");
        signo8.setToolTipText("");
        signo8.setBorderPainted(false);
        signo8.setContentAreaFilled(false);

        numero42.setEditable(false);
        numero42.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numero42.setForeground(new java.awt.Color(255, 102, 0));
        numero42.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numero42.setText("77");

        signo9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signo9.setText("=");
        signo9.setToolTipText("");
        signo9.setBorderPainted(false);
        signo9.setContentAreaFilled(false);

        signo10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signo10.setText("=");
        signo10.setToolTipText("");
        signo10.setBorderPainted(false);
        signo10.setContentAreaFilled(false);

        signo11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        signo11.setText("+");
        signo11.setToolTipText("");
        signo11.setBorderPainted(false);
        signo11.setContentAreaFilled(false);

        numero22.setEditable(false);
        numero22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numero22.setForeground(new java.awt.Color(0, 204, 0));
        numero22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numero22.setText("77");

        numero32.setEditable(false);
        numero32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numero32.setForeground(new java.awt.Color(255, 102, 0));
        numero32.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numero32.setText("77");

        botonIniciarConTiempo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonIniciarConTiempo.setForeground(new java.awt.Color(87, 166, 213));
        botonIniciarConTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/iniciar.png"))); // NOI18N
        botonIniciarConTiempo.setText("Mas Ejemplos");
        botonIniciarConTiempo.setBorder(null);
        botonIniciarConTiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonIniciarConTiempoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonIniciarConTiempoMouseExited(evt);
            }
        });
        botonIniciarConTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarConTiempoActionPerformed(evt);
            }
        });

        respuesta1.setEditable(false);
        respuesta1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        respuesta1.setForeground(new java.awt.Color(0, 0, 204));
        respuesta1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        respuesta1.setText("77");

        respuesta2.setEditable(false);
        respuesta2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        respuesta2.setForeground(new java.awt.Color(0, 0, 204));
        respuesta2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        respuesta2.setText("77");

        respuesta3.setEditable(false);
        respuesta3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        respuesta3.setForeground(new java.awt.Color(0, 0, 204));
        respuesta3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        respuesta3.setText("77");

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel6Layout.createSequentialGroup()
                        .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel6Layout.createSequentialGroup()
                                .add(numero11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(signo4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(numero21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(signo5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(numero31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(signo7)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(numero41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel6Layout.createSequentialGroup()
                                .add(numero12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(signo8)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(numero22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(signo9)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(numero32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(signo11)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(numero42)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel6Layout.createSequentialGroup()
                                .add(signo10)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(respuesta3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(signo6)))
                    .add(jPanel6Layout.createSequentialGroup()
                        .add(numero10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(signo1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(numero20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(signo)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(numero30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(signo2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(numero40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(signo3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(respuesta2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel6Layout.createSequentialGroup()
                                .add(respuesta1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(botonIniciarConTiempo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 142, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(numero10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(signo1)
                        .add(numero20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(signo)
                        .add(numero30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(signo2)
                        .add(numero40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(signo3)
                        .add(respuesta1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(botonIniciarConTiempo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(numero11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(signo4)
                    .add(numero21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(signo5)
                    .add(numero31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(signo7)
                    .add(numero41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(signo6)
                    .add(respuesta2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(numero12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(signo8)
                    .add(numero22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(signo9)
                    .add(numero32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(signo11)
                    .add(numero42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(signo10)
                    .add(respuesta3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 0, Short.MAX_VALUE))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/iconos/banner_rigth_suma.png"))); // NOI18N
        jLabel9.setToolTipText("");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        anterior2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back_blue1.png"))); // NOI18N
        anterior2.setToolTipText("Anterior");
        anterior2.setBorder(null);
        anterior2.setBorderPainted(false);
        anterior2.setContentAreaFilled(false);
        anterior2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anterior2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        anterior2.setIconTextGap(-3);
        anterior2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back_blue.png"))); // NOI18N
        anterior2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        anterior2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        anterior2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                anterior2MouseEntered(evt);
            }
        });
        anterior2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anterior2ActionPerformed(evt);
            }
        });

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/next_blue1.png"))); // NOI18N
        siguiente.setToolTipText("Siguiente");
        siguiente.setBorder(null);
        siguiente.setBorderPainted(false);
        siguiente.setContentAreaFilled(false);
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        siguiente.setIconTextGap(-3);
        siguiente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/next_blue.png"))); // NOI18N
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

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel7Layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(anterior2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(siguiente))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(anterior2)
                    .add(siguiente))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
            .add(layout.createSequentialGroup()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(jLabel9)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed

    }//GEN-LAST:event_siguienteActionPerformed

    private void siguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseEntered

    }//GEN-LAST:event_siguienteMouseEntered

    private void anterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anterior2ActionPerformed
        LaSuma1 suma_anterior=new LaSuma1();
        this.dispose();
        centrar(suma_anterior);
        clase.sonido("/Sonidos/water1.wav");
    }//GEN-LAST:event_anterior2ActionPerformed
    private void anterior2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anterior2MouseEntered
    }//GEN-LAST:event_anterior2MouseEntered
    private void botonIniciarConTiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarConTiempoMouseEntered
        if(botonIniciarConTiempo.isEnabled()){conf_text_buton(botonIniciarConTiempo,229, 98, 18,16);}
    }//GEN-LAST:event_botonIniciarConTiempoMouseEntered
    private void botonIniciarConTiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarConTiempoMouseExited
        if(botonIniciarConTiempo.isEnabled()){conf_text_buton(botonIniciarConTiempo,87, 166,213,14);}
    }//GEN-LAST:event_botonIniciarConTiempoMouseExited
    private void botonIniciarConTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarConTiempoActionPerformed
        generarSuma();
    }//GEN-LAST:event_botonIniciarConTiempoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior2;
    private javax.swing.JButton botonIniciarConTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField numero10;
    private javax.swing.JTextField numero11;
    private javax.swing.JTextField numero12;
    private javax.swing.JTextField numero20;
    private javax.swing.JTextField numero21;
    private javax.swing.JTextField numero22;
    private javax.swing.JTextField numero30;
    private javax.swing.JTextField numero31;
    private javax.swing.JTextField numero32;
    private javax.swing.JTextField numero40;
    private javax.swing.JTextField numero41;
    private javax.swing.JTextField numero42;
    private javax.swing.JTextField respuesta1;
    private javax.swing.JTextField respuesta2;
    private javax.swing.JTextField respuesta3;
    private javax.swing.JButton signo;
    private javax.swing.JButton signo1;
    private javax.swing.JButton signo10;
    private javax.swing.JButton signo11;
    private javax.swing.JButton signo2;
    private javax.swing.JButton signo3;
    private javax.swing.JButton signo4;
    private javax.swing.JButton signo5;
    private javax.swing.JButton signo6;
    private javax.swing.JButton signo7;
    private javax.swing.JButton signo8;
    private javax.swing.JButton signo9;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}