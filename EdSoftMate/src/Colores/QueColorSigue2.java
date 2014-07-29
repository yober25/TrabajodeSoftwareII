package Colores;
import AprendiendoMatematicas.ClaseEdSoft;
import AprendiendoMatematicas.MDIAplicacion;
import AprendiendoMatematicas.OptionpaneMensaje;
import javax.swing.JInternalFrame;

public class QueColorSigue2 extends javax.swing.JInternalFrame {
    int contIntentos,contError;
    public int num1,num2,numero,puntaje,control;
    ClaseEdSoft clase=new ClaseEdSoft();
    
    public QueColorSigue2() {
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
    public void nuevoInicio(){   
        clase.sonido("/Sonidos/quecolorsigue.wav");
        //---------------------------------------------------------------------
        jButtonAmarillo.setEnabled(true);
        jButtonAnaranjado.setEnabled(true);
        jButtonAzul.setEnabled(true);
        jButtonBlanco.setEnabled(true);
        jButtonCeleste.setEnabled(true);
        jButtonFucsia.setEnabled(true);
        jButtonGris.setEnabled(true);
        jButtonMarron.setEnabled(true);
        jButtonMorado.setEnabled(true);
        jButtonNegro.setEnabled(true);
        jButtonRojo.setEnabled(true);
        jButtonRosado.setEnabled(true);
        jButtonVerde.setEnabled(true);
        //----------------------------------------------------------------------
        contIntentos=0;
        contError=0;
        numero=0;
        puntaje=0;
        
        num1=1+(int)(Math.random()*13);
        String cadena1="/Colores/quecolorsigue/imagen"+num1+"-1.png";
        String cadena2="/Colores/quecolorsigue/imagen"+num1+"-2.png";
        
        num2=1+(int)(Math.random()*13);
        String cadena3="/Colores/quecolorsigue/imagen"+num2+"-1.png";
        String cadena4="/Colores/quecolorsigue/imagen"+num2+"-2.png";
        
        clase.cambiarIconoBoton(imagen1,cadena1,cadena2 ); 
        clase.cambiarIconoBoton(imagen2,cadena3,cadena4 );
        clase.cambiarIconoBoton(imagen3,cadena1,cadena2 );
        clase.cambiarIconoBoton(imagen4,cadena3,cadena4 );
        
        contIntentos=contIntentos+1;
        intentos.setText(String.valueOf(contIntentos));
        fallas.setText(String.valueOf(contError));
        puntos.setText(String.valueOf(puntaje));
    }
    public void verificarFin(int numControl){
        clase.sonido("/Sonidos/water1.wav");
        //mesaje, ventana mensaje 2 seg. y [1 (imagen SI) o 0(imagen NO)]
        if(num1==numControl){
            new OptionpaneMensaje("",2,1).show();
            if(numero==0){
                puntaje=puntaje+1;
                puntos.setText(String.valueOf(puntaje));                
            }  
            colorSiguiente();                      
        }else{
            new OptionpaneMensaje("",2,0).show();
            contError=contError+1;
            fallas.setText(String.valueOf(contError));
            numero=numero+1;
        }
        if(contIntentos==21){
            jButtonAmarillo.setEnabled(false);
            jButtonAnaranjado.setEnabled(false);
            jButtonAzul.setEnabled(false);
            jButtonBlanco.setEnabled(false);
            jButtonCeleste.setEnabled(false);
            jButtonFucsia.setEnabled(false);
            jButtonGris.setEnabled(false);
            jButtonMarron.setEnabled(false);
            jButtonMorado.setEnabled(false);
            jButtonNegro.setEnabled(false);
            jButtonRojo.setEnabled(false);
            jButtonRosado.setEnabled(false);
            jButtonVerde.setEnabled(false);
            //-----------------------------------------------------------------
            String cadena1="/Colores/quecolorsigue/imagen.png";
            String cadena2="/Colores/quecolorsigue/imagen.png";
            clase.cambiarIconoBoton(imagen1,cadena1,cadena2 ); 
            clase.cambiarIconoBoton(imagen2,cadena1,cadena2 ); 
            clase.cambiarIconoBoton(imagen3,cadena1,cadena2 ); 
            clase.cambiarIconoBoton(imagen4,cadena1,cadena2 ); 
            //-----------------------------------------------------------------
            new OptionpaneMensaje("",8,2).show();
        }            
    }
    public void colorSiguiente(){
        numero=0;
        
        num1=1+(int)(Math.random()*13);
        String cadena1="/Colores/quecolorsigue/imagen"+num1+"-1.png";
        String cadena2="/Colores/quecolorsigue/imagen"+num1+"-2.png";
        
        num2=1+(int)(Math.random()*13);
        String cadena3="/Colores/quecolorsigue/imagen"+num2+"-1.png";
        String cadena4="/Colores/quecolorsigue/imagen"+num2+"-2.png";
        
        clase.cambiarIconoBoton(imagen1,cadena1,cadena2 ); 
        clase.cambiarIconoBoton(imagen2,cadena3,cadena4 );
        clase.cambiarIconoBoton(imagen3,cadena1,cadena2 );
        clase.cambiarIconoBoton(imagen4,cadena3,cadena4 );
        
        contIntentos=contIntentos+1;
        if(contIntentos<=20){        
            intentos.setText(String.valueOf(contIntentos)); 
        }
          
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
        imagen1 = new javax.swing.JButton();
        jButtonRojo = new javax.swing.JButton();
        jButtonNegro = new javax.swing.JButton();
        jButtonMarron = new javax.swing.JButton();
        jButtonBlanco = new javax.swing.JButton();
        jButtonGris = new javax.swing.JButton();
        jButtonMorado = new javax.swing.JButton();
        jButtonFucsia = new javax.swing.JButton();
        jButtonCeleste = new javax.swing.JButton();
        jButtonAmarillo = new javax.swing.JButton();
        jButtonVerde = new javax.swing.JButton();
        jButtonAzul = new javax.swing.JButton();
        jButtonAnaranjado = new javax.swing.JButton();
        jButtonRosado = new javax.swing.JButton();
        Iniciar = new javax.swing.JButton();
        imagen4 = new javax.swing.JButton();
        imagen5 = new javax.swing.JButton();
        imagen2 = new javax.swing.JButton();
        imagen3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        intentos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        fallas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        puntos = new javax.swing.JButton();

        setClosable(true);
        setTitle("Aprende los Colores con EdSoftMate");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/icono.png"))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 18), java.awt.Color.darkGray)); // NOI18N
        jPanel3.setName(""); // NOI18N

        imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/quecolorsigue/imagen.png"))); // NOI18N
        imagen1.setToolTipText("¿Qué color es?");
        imagen1.setBorder(null);
        imagen1.setBorderPainted(false);
        imagen1.setContentAreaFilled(false);
        imagen1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imagen1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imagen1.setIconTextGap(-3);
        imagen1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        imagen1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        imagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen1ActionPerformed(evt);
            }
        });

        jButtonRojo.setFont(new java.awt.Font("AG Stencil", 0, 18)); // NOI18N
        jButtonRojo.setText("Rojo");
        jButtonRojo.setToolTipText("Rojo");
        jButtonRojo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRojo.setEnabled(false);
        jButtonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRojoActionPerformed(evt);
            }
        });

        jButtonNegro.setFont(new java.awt.Font("AG Stencil", 0, 18)); // NOI18N
        jButtonNegro.setText("Negro");
        jButtonNegro.setToolTipText("Negro");
        jButtonNegro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNegro.setEnabled(false);
        jButtonNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNegroActionPerformed(evt);
            }
        });

        jButtonMarron.setFont(new java.awt.Font("AG Stencil", 0, 18)); // NOI18N
        jButtonMarron.setText("Marron");
        jButtonMarron.setToolTipText("Marron");
        jButtonMarron.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMarron.setEnabled(false);
        jButtonMarron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarronActionPerformed(evt);
            }
        });

        jButtonBlanco.setFont(new java.awt.Font("AG Stencil", 0, 18)); // NOI18N
        jButtonBlanco.setText("Blanco");
        jButtonBlanco.setToolTipText("Blanco");
        jButtonBlanco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBlanco.setEnabled(false);
        jButtonBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBlancoActionPerformed(evt);
            }
        });

        jButtonGris.setFont(new java.awt.Font("AG Stencil", 0, 18)); // NOI18N
        jButtonGris.setText("Gris");
        jButtonGris.setToolTipText("Gris");
        jButtonGris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGris.setEnabled(false);
        jButtonGris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrisActionPerformed(evt);
            }
        });

        jButtonMorado.setFont(new java.awt.Font("AG Stencil", 0, 18)); // NOI18N
        jButtonMorado.setText("Morado");
        jButtonMorado.setToolTipText("Morado");
        jButtonMorado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMorado.setEnabled(false);
        jButtonMorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoradoActionPerformed(evt);
            }
        });

        jButtonFucsia.setFont(new java.awt.Font("AG Stencil", 0, 18)); // NOI18N
        jButtonFucsia.setText("Fucsia");
        jButtonFucsia.setToolTipText("Fucsia");
        jButtonFucsia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFucsia.setEnabled(false);
        jButtonFucsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFucsiaActionPerformed(evt);
            }
        });

        jButtonCeleste.setFont(new java.awt.Font("AG Stencil", 0, 18)); // NOI18N
        jButtonCeleste.setText("Celeste");
        jButtonCeleste.setToolTipText("Celeste");
        jButtonCeleste.setEnabled(false);
        jButtonCeleste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCelesteActionPerformed(evt);
            }
        });

        jButtonAmarillo.setFont(new java.awt.Font("AG Stencil", 0, 18)); // NOI18N
        jButtonAmarillo.setText("Amarillo");
        jButtonAmarillo.setToolTipText("Amarillo");
        jButtonAmarillo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAmarillo.setEnabled(false);
        jButtonAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmarilloActionPerformed(evt);
            }
        });

        jButtonVerde.setFont(new java.awt.Font("AG Stencil", 0, 18)); // NOI18N
        jButtonVerde.setText("Verde");
        jButtonVerde.setToolTipText("Verde");
        jButtonVerde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerde.setEnabled(false);
        jButtonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerdeActionPerformed(evt);
            }
        });

        jButtonAzul.setFont(new java.awt.Font("AG Stencil", 0, 18)); // NOI18N
        jButtonAzul.setText("Azul");
        jButtonAzul.setToolTipText("Azúl");
        jButtonAzul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAzul.setEnabled(false);
        jButtonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAzulActionPerformed(evt);
            }
        });

        jButtonAnaranjado.setFont(new java.awt.Font("AG Stencil", 0, 18)); // NOI18N
        jButtonAnaranjado.setText("Anaranjado");
        jButtonAnaranjado.setToolTipText("Anaranjado");
        jButtonAnaranjado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAnaranjado.setEnabled(false);
        jButtonAnaranjado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnaranjadoActionPerformed(evt);
            }
        });

        jButtonRosado.setFont(new java.awt.Font("AG Stencil", 0, 18)); // NOI18N
        jButtonRosado.setText("Rosado");
        jButtonRosado.setToolTipText("Rosado");
        jButtonRosado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRosado.setEnabled(false);
        jButtonRosado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRosadoActionPerformed(evt);
            }
        });

        Iniciar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Iniciar.setText("Iniciar/Reiniciar");
        Iniciar.setToolTipText("Iniciar");
        Iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IniciarMouseEntered(evt);
            }
        });
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        imagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/quecolorsigue/imagen.png"))); // NOI18N
        imagen4.setToolTipText("¿Qué color es?");
        imagen4.setBorder(null);
        imagen4.setBorderPainted(false);
        imagen4.setContentAreaFilled(false);
        imagen4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imagen4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imagen4.setIconTextGap(-3);
        imagen4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        imagen4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        imagen4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen4ActionPerformed(evt);
            }
        });

        imagen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/quecolorsigue/imagen.png"))); // NOI18N
        imagen5.setToolTipText("¿Qué color es?");
        imagen5.setBorder(null);
        imagen5.setBorderPainted(false);
        imagen5.setContentAreaFilled(false);
        imagen5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imagen5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imagen5.setIconTextGap(-3);
        imagen5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        imagen5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        imagen5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen5ActionPerformed(evt);
            }
        });

        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/quecolorsigue/imagen.png"))); // NOI18N
        imagen2.setToolTipText("¿Qué color es?");
        imagen2.setBorder(null);
        imagen2.setBorderPainted(false);
        imagen2.setContentAreaFilled(false);
        imagen2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imagen2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imagen2.setIconTextGap(-3);
        imagen2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        imagen2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        imagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen2ActionPerformed(evt);
            }
        });

        imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/quecolorsigue/imagen.png"))); // NOI18N
        imagen3.setToolTipText("¿Qué color es?");
        imagen3.setBorder(null);
        imagen3.setBorderPainted(false);
        imagen3.setContentAreaFilled(false);
        imagen3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imagen3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imagen3.setIconTextGap(-3);
        imagen3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        imagen3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back_blue1.png"))); // NOI18N
        anterior.setToolTipText("Anterior");
        anterior.setBorder(null);
        anterior.setBorderPainted(false);
        anterior.setContentAreaFilled(false);
        anterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        anterior.setIconTextGap(-3);
        anterior.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back_blue.png"))); // NOI18N
        anterior.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        anterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                anteriorMouseEntered(evt);
            }
        });
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
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

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(anterior)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(siguiente)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, anterior)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, siguiente)))
        );

        jLabel6.setFont(new java.awt.Font("Ardagh", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nivel 2");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jButtonRojo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonFucsia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonCeleste, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jButtonNegro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonMarron, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonBlanco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonGris, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonMorado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jButtonAmarillo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonVerde, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonAzul, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonAnaranjado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonRosado, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(imagen1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(imagen2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(imagen3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(imagen4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(imagen5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(Iniciar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(jSeparator1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(Iniciar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .add(18, 18, 18)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(imagen1)
                    .add(imagen2)
                    .add(imagen3)
                    .add(imagen5)
                    .add(imagen4))
                .add(18, 18, 18)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonAmarillo)
                    .add(jButtonVerde)
                    .add(jButtonAzul)
                    .add(jButtonAnaranjado)
                    .add(jButtonRosado))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonNegro)
                    .add(jButtonMarron)
                    .add(jButtonBlanco)
                    .add(jButtonGris)
                    .add(jButtonMorado))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonRojo)
                    .add(jButtonFucsia)
                    .add(jButtonCeleste))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/quecolorsigue/coloresmen.png"))); // NOI18N

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/quecolorsigue/loscolores.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        intentos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        intentos.setForeground(new java.awt.Color(0, 204, 0));
        intentos.setText("0");
        intentos.setToolTipText("Intentos Fallidos");
        intentos.setBorderPainted(false);
        intentos.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Intentos");

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exit.png"))); // NOI18N
        salir.setToolTipText("Salir");
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salir.setIconTextGap(-3);
        salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exit1.png"))); // NOI18N
        salir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        fallas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fallas.setForeground(new java.awt.Color(255, 0, 0));
        fallas.setText("0");
        fallas.setToolTipText("Intentos Fallidos");
        fallas.setBorderPainted(false);
        fallas.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fallas");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Puntaje");

        puntos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        puntos.setForeground(new java.awt.Color(0, 0, 204));
        puntos.setText("0");
        puntos.setToolTipText("Puntaje Alcanzado");
        puntos.setBorderPainted(false);
        puntos.setEnabled(false);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(salir))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(fallas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, puntos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(intentos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(intentos)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fallas)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(puntos)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 25, Short.MAX_VALUE)
                .add(salir))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(19, 19, 19)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen1ActionPerformed
        
    }//GEN-LAST:event_imagen1ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();        
    }//GEN-LAST:event_salirActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
         nuevoInicio(); 
    }//GEN-LAST:event_IniciarActionPerformed

    private void imagen4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagen4ActionPerformed

    private void imagen5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagen5ActionPerformed

    private void imagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagen2ActionPerformed

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        clase.sonido("/Sonidos/water1.wav");
    }//GEN-LAST:event_salirMouseEntered

    private void IniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseEntered
        clase.sonido("/Sonidos/water1.wav");
    }//GEN-LAST:event_IniciarMouseEntered

    private void siguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseEntered
        
    }//GEN-LAST:event_siguienteMouseEntered

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        QueColorSigue2 color2=new QueColorSigue2();
        this.dispose();
        centrar(color2);
        clase.sonido("/Sonidos/water1.wav");
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anteriorMouseEntered
        
    }//GEN-LAST:event_anteriorMouseEntered

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        QueColorSigue1 color1=new QueColorSigue1();
        this.dispose();
        centrar(color1);
        clase.sonido("/Sonidos/water1.wav");
    }//GEN-LAST:event_anteriorActionPerformed

    private void jButtonMoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoradoActionPerformed
        verificarFin(10);
    }//GEN-LAST:event_jButtonMoradoActionPerformed

    private void jButtonRosadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRosadoActionPerformed
        verificarFin(5);
    }//GEN-LAST:event_jButtonRosadoActionPerformed

    private void jButtonAnaranjadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnaranjadoActionPerformed
        verificarFin(4);
    }//GEN-LAST:event_jButtonAnaranjadoActionPerformed

    private void jButtonGrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrisActionPerformed
        verificarFin(9);
    }//GEN-LAST:event_jButtonGrisActionPerformed

    private void jButtonCelesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCelesteActionPerformed
        verificarFin(12);
    }//GEN-LAST:event_jButtonCelesteActionPerformed

    private void jButtonBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBlancoActionPerformed
        verificarFin(8);
    }//GEN-LAST:event_jButtonBlancoActionPerformed

    private void jButtonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAzulActionPerformed
        verificarFin(3);
    }//GEN-LAST:event_jButtonAzulActionPerformed

    private void jButtonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerdeActionPerformed
        verificarFin(2);
    }//GEN-LAST:event_jButtonVerdeActionPerformed

    private void jButtonMarronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarronActionPerformed
        verificarFin(7);
    }//GEN-LAST:event_jButtonMarronActionPerformed

    private void jButtonFucsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFucsiaActionPerformed
        verificarFin(13);
    }//GEN-LAST:event_jButtonFucsiaActionPerformed

    private void jButtonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRojoActionPerformed
        verificarFin(11);
    }//GEN-LAST:event_jButtonRojoActionPerformed

    private void jButtonNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNegroActionPerformed
        verificarFin(6);
    }//GEN-LAST:event_jButtonNegroActionPerformed

    private void jButtonAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmarilloActionPerformed
        verificarFin(1);
    }//GEN-LAST:event_jButtonAmarilloActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JButton anterior;
    private javax.swing.JButton fallas;
    private javax.swing.JButton imagen1;
    private javax.swing.JButton imagen2;
    private javax.swing.JButton imagen3;
    private javax.swing.JButton imagen4;
    private javax.swing.JButton imagen5;
    private javax.swing.JButton intentos;
    private javax.swing.JButton jButtonAmarillo;
    private javax.swing.JButton jButtonAnaranjado;
    private javax.swing.JButton jButtonAzul;
    private javax.swing.JButton jButtonBlanco;
    private javax.swing.JButton jButtonCeleste;
    private javax.swing.JButton jButtonFucsia;
    private javax.swing.JButton jButtonGris;
    private javax.swing.JButton jButtonMarron;
    private javax.swing.JButton jButtonMorado;
    private javax.swing.JButton jButtonNegro;
    private javax.swing.JButton jButtonRojo;
    private javax.swing.JButton jButtonRosado;
    private javax.swing.JButton jButtonVerde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton puntos;
    private javax.swing.JButton salir;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
