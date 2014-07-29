package Vocales;
import Colores.*;
import AprendiendoMatematicas.ClaseEdSoft;
import AprendiendoMatematicas.MDIAplicacion;
import AprendiendoMatematicas.OptionpaneMensaje;
import javax.swing.JInternalFrame;

public class QueVocalEmpieza extends javax.swing.JInternalFrame {
    int contIntentos,contError;
    public int num1,num2,numero,puntaje,control,cantPalabras=11;
    ClaseEdSoft clase=new ClaseEdSoft();
    
    String[] palabraVocalA = {"Avion", "Arbol", "Alicate","Amigo", "Alma", "Ambar","Almacen", "Armario", "Astucia","Amar", "Agenda", "Agua"};
    String[] palabraVocalE = {"Enano", "Estrella", "Escalera","Eco", "Edad", "Egipto","Ejemplo", "Electricidad", "Erizo","Examen", "Exito", "Evento"};
    String[] palabraVocalI = {"Iman", "Impresora", "Iguana","Iman", "Inteligencia", "Igual","Icono", "Institucion", "Instituto","Infante", "Imagen", "Inmueble"};
    String[] palabraVocalO = {"Ovalo", "Olga", "Oso","Olla", "Oveja", "Oso","Ojo", "Ola", "Ocho","Oculto", "oferta", "Olimpo"};
    String[] palabraVocalU = {"Uva", "Ultimo", "Ursula","Utiles", "Ubicacion", "Ulcera","Uno", "Union", "Unico","ulcera", "Universidad", "Universo"};
    String[] palabraVocalN = {"Va", "Penultimo", "Sula","Tilde", "Geografia", "Bronco","Tres", "Razon", "Hunamo","Huevo", "Humo", "Haber"};
    
    public QueVocalEmpieza() {
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
        clase.sonido("/Sonidos/water1.wav");
        //----------------------------------------------------------------------
        jButtonAmarillo.setEnabled(true);
        jButtonAnaranjado.setEnabled(true);
        jButtonAzul.setEnabled(true);
        jButtonRosado.setEnabled(true);
        jButtonVerde.setEnabled(true);
        jButtonNinguno.setEnabled(true);
        //----------------------------------------------------------------------
        contIntentos=0;
        contError=0;
        numero=0;
        puntaje=0;
        num1=1+(int)(Math.random()*5);
        
        num2=1+(int)(Math.random()*cantPalabras);
        if(num1==1){vocal.setText(palabraVocalA[num2]);}
        if(num1==2){vocal.setText(palabraVocalE[num2]);}
        if(num1==3){vocal.setText(palabraVocalI[num2]);}
        if(num1==4){vocal.setText(palabraVocalO[num2]);}
        if(num1==5){vocal.setText(palabraVocalU[num2]);}  
        if(num1==6){vocal.setText(palabraVocalN[num2]);}  
        
        contIntentos=contIntentos+1;
        intentos.setText(String.valueOf(contIntentos));
        fallas.setText(String.valueOf(contError));
        puntos.setText(String.valueOf(puntaje));
    }
    public void verificarFin(int numControl){
        clase.sonido("/Sonidos/water1.wav");
        //----------------------------------------------------------------------
        if(num1==numControl){
            new OptionpaneMensaje("",2,1).show();
            if(numero==0){
                puntaje=puntaje+1;
                puntos.setText(String.valueOf(puntaje));                
            }  
            numeroSiguiente();
        }else{
            new OptionpaneMensaje("",2,0).show();
            contError=contError+1;
            fallas.setText(String.valueOf(contError));
            numero=numero+1;
        }
        if(contIntentos==20){
            jButtonAmarillo.setEnabled(false);
            jButtonAnaranjado.setEnabled(false);
            jButtonAzul.setEnabled(false);
            jButtonRosado.setEnabled(false);
            jButtonVerde.setEnabled(false);
            jButtonNinguno.setEnabled(false);
            //-----------------------------------------------------------------
            vocal.setText("?");

            intentos.setText(String.valueOf(contIntentos));
            fallas.setText(String.valueOf(contError));
            //-----------------------------------------------------------------
            new OptionpaneMensaje("",8,2).show();
        }            
    }
    public void numeroSiguiente(){
        num1=1+(int)(Math.random()*5);
        
        num2=1+(int)(Math.random()*cantPalabras);
        if(num1==1){vocal.setText(palabraVocalA[num2]);}
        if(num1==2){vocal.setText(palabraVocalE[num2]);}
        if(num1==3){vocal.setText(palabraVocalI[num2]);}
        if(num1==4){vocal.setText(palabraVocalO[num2]);}
        if(num1==5){vocal.setText(palabraVocalU[num2]);} 
        if(num1==6){vocal.setText(palabraVocalN[num2]);} 
        
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
        vocal = new javax.swing.JButton();
        jButtonAmarillo = new javax.swing.JButton();
        jButtonVerde = new javax.swing.JButton();
        jButtonAzul = new javax.swing.JButton();
        jButtonAnaranjado = new javax.swing.JButton();
        jButtonRosado = new javax.swing.JButton();
        Iniciar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonNinguno = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        puntos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fallas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        intentos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Aprende los Colores con EdSoftMate");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Abecedario/submenu/apabc.png"))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 18), java.awt.Color.darkGray)); // NOI18N
        jPanel3.setName(""); // NOI18N

        vocal.setFont(new java.awt.Font("Adventure", 0, 36)); // NOI18N
        vocal.setText("?");
        vocal.setToolTipText("¿Qué vocal es?");
        vocal.setBorder(null);
        vocal.setBorderPainted(false);
        vocal.setContentAreaFilled(false);
        vocal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vocal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vocal.setIconTextGap(-3);
        vocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vocalActionPerformed(evt);
            }
        });

        jButtonAmarillo.setFont(new java.awt.Font("apantasia", 0, 24)); // NOI18N
        jButtonAmarillo.setText("<html>  <style type='text/css'>  .estilo1{font-family:Times New Roman;font-style:normal;font-weight:bold; font-size:24px;color:rgb(51, 0, 153);}  .estilo2{font-family:apantasia;font-weight:bold; font-size:24px;color:rgb(253, 102, 0);}</style>  <div align=\"center\"><span class='estilo1'>A </span><span class='estilo2'>a</span></div></html>");
        jButtonAmarillo.setToolTipText("<html> <style type='text/css'>  .estilo1{font-family:Times New Roman;font-style:normal;font-weight:bold; font-size:18px;color:rgb(161, 1, 3);text-align:center}  .estilo2{font-family:verdana;font-weight:bold; font-size:12px;color:rgb(12, 149, 1);text-align:center}</style> <script type=\"text/javascript\"> function mostrarVentana(){var ventana = document.getElementById('miVentana');ventana.style.marginTop = \"100px\";  ventana.style.marginLeft = ((document.body.clientWidth-350) / 2) +  \"px\";ventana.style.display = 'block';} </script>  <body onload=\"mostrarVentana()\">  <div id=\"miVentana\" style=\" width: 120px; height: 60px; top: 0; left: 0; font-family:Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-weight: normal; border: #000000 1px; background-color: #FAFAFA; color: #000000;\"> <div style=\"font-weight: bold; text-align: center; color: #FFFFFF; padding: 1px; background-color:#006394\">Los Vocales</div> \t <span class='estilo1'> A </span> <span class='estilo2'>es Mayúscula</span><br> <span class='estilo1'> a </span> <span class='estilo2'>es Minúscula</span> </div></body></html>");
        jButtonAmarillo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAmarillo.setEnabled(false);
        jButtonAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmarilloActionPerformed(evt);
            }
        });

        jButtonVerde.setFont(new java.awt.Font("apantasia", 0, 24)); // NOI18N
        jButtonVerde.setText("<html>  <style type='text/css'>  .estilo1{font-family:Times New Roman;font-style:normal;font-weight:bold; font-size:24px;color:rgb(231, 123, 153);}  .estilo2{font-family:apantasia;font-weight:bold; font-size:24px;color:rgb(0, 145, 23);}</style>  <div align=\"center\"><span class='estilo1'>E </span><span class='estilo2'>e</span></div></html>");
        jButtonVerde.setToolTipText("<html> <style type='text/css'>  .estilo1{font-family:Times New Roman;font-style:italic;font-weight:bold; font-size:18px;color:rgb(233, 0, 153);text-align:center}  .estilo2{font-family:verdana;font-weight:bold; font-size:12px;color:rgb(100, 123, 123);text-align:center}</style> <script type=\"text/javascript\"> function mostrarVentana(){var ventana = document.getElementById('miVentana');ventana.style.marginTop = \"100px\";  ventana.style.marginLeft = ((document.body.clientWidth-350) / 2) +  \"px\";ventana.style.display = 'block';} </script>  <body onload=\"mostrarVentana()\">  <div id=\"miVentana\" style=\" width: 120px; height: 60px; top: 0; left: 0; font-family:Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-weight: normal; border: #000000 1px solid; background-color: #FAFAFA; color: #000000;\"> <div style=\"font-weight: bold; text-align: center; color: #FFFFFF; padding: 1px; background-color:#006394\">Los Vocales</div> \t <span class='estilo1'> E </span><span class='estilo2'>es Mayúscula</span><br/> <span class='estilo1'> e </span><span class='estilo2'>es Minúscula</span> </div></body></html>");
        jButtonVerde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerde.setEnabled(false);
        jButtonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerdeActionPerformed(evt);
            }
        });

        jButtonAzul.setFont(new java.awt.Font("apantasia", 0, 24)); // NOI18N
        jButtonAzul.setText("<html>  <style type='text/css'>  .estilo1{font-family:Times New Roman;font-style:normal;font-weight:bold; font-size:24px;color:rgb(51, 220, 153);}  .estilo2{font-family:apantasia;font-weight:bold; font-size:24px;color:rgb(253, 4, 0);}</style>  <div align=\"center\"><span class='estilo1'>I </span><span class='estilo2'>i</span></div></html>");
        jButtonAzul.setToolTipText("<html> <style type='text/css'>  .estilo1{font-family:Times New Roman;font-style:italic;font-weight:bold; font-size:18px;color:rgb(233, 0, 153);text-align:center}  .estilo2{font-family:verdana;font-weight:bold; font-size:12px;color:rgb(100, 123, 123);text-align:center}</style> <script type=\"text/javascript\"> function mostrarVentana(){var ventana = document.getElementById('miVentana');ventana.style.marginTop = \"100px\";  ventana.style.marginLeft = ((document.body.clientWidth-350) / 2) +  \"px\";ventana.style.display = 'block';} </script>  <body onload=\"mostrarVentana()\">  <div id=\"miVentana\" style=\" width: 120px; height: 60px; top: 0; left: 0; font-family:Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-weight: normal; border: #000000 1px solid; background-color: #FAFAFA; color: #000000;\"> <div style=\"font-weight: bold; text-align: center; color: #FFFFFF; padding: 1px; background-color:#006394\">Los Vocales</div> \t <span class='estilo1'> I </span><span class='estilo2'>es Mayúscula</span><br/> <span class='estilo1'> i </span><span class='estilo2'>es Minúscula</span> </div></body></html>");
        jButtonAzul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAzul.setEnabled(false);
        jButtonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAzulActionPerformed(evt);
            }
        });

        jButtonAnaranjado.setFont(new java.awt.Font("apantasia", 0, 24)); // NOI18N
        jButtonAnaranjado.setText("<html>  <style type='text/css'>  .estilo1{font-family:Times New Roman;font-style:normal;font-weight:bold; font-size:24px;color:rgb(51, 0, 153);}  .estilo2{font-family:apantasia;font-weight:bold; font-size:24px;color:rgb(253, 102, 0);}</style>  <div align=\"center\"><span class='estilo1'>O </span><span class='estilo2'>o</span></div></html>");
        jButtonAnaranjado.setToolTipText("<html> <style type='text/css'>  .estilo1{font-family:Times New Roman;font-style:italic;font-weight:bold; font-size:18px;color:rgb(233, 0, 153);text-align:center}  .estilo2{font-family:verdana;font-weight:bold; font-size:12px;color:rgb(100, 123, 123);text-align:center}</style> <script type=\"text/javascript\"> function mostrarVentana(){var ventana = document.getElementById('miVentana');ventana.style.marginTop = \"100px\";  ventana.style.marginLeft = ((document.body.clientWidth-350) / 2) +  \"px\";ventana.style.display = 'block';} </script>  <body onload=\"mostrarVentana()\">  <div id=\"miVentana\" style=\" width: 120px; height: 60px; top: 0; left: 0; font-family:Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-weight: normal; border: #000000 1px solid; background-color: #FAFAFA; color: #000000;\"> <div style=\"font-weight: bold; text-align: center; color: #FFFFFF; padding: 1px; background-color:#006394\">Los Vocales</div> \t <span class='estilo1'> O </span><span class='estilo2'>es Mayúscula</span><br/> <span class='estilo1'> o </span><span class='estilo2'>es Minúscula</span> </div></body></html>");
        jButtonAnaranjado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAnaranjado.setEnabled(false);
        jButtonAnaranjado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnaranjadoActionPerformed(evt);
            }
        });

        jButtonRosado.setFont(new java.awt.Font("apantasia", 0, 24)); // NOI18N
        jButtonRosado.setText("<html>  <style type='text/css'>  .estilo1{font-family:Times New Roman;font-style:normal;font-weight:bold; font-size:24px;color:rgb(51, 0, 153);}  .estilo2{font-family:apantasia;font-weight:bold; font-size:24px;color:rgb(253, 102, 0);}</style>  <div align=\"center\"><span class='estilo1'>U </span><span class='estilo2'>u</span></div></html>");
        jButtonRosado.setToolTipText("<html> <style type='text/css'>  .estilo1{font-family:Times New Roman;font-style:italic;font-weight:bold; font-size:18px;color:rgb(233, 0, 153);text-align:center}  .estilo2{font-family:verdana;font-weight:bold; font-size:12px;color:rgb(100, 123, 123);text-align:center}</style> <script type=\"text/javascript\"> function mostrarVentana(){var ventana = document.getElementById('miVentana');ventana.style.marginTop = \"100px\";  ventana.style.marginLeft = ((document.body.clientWidth-350) / 2) +  \"px\";ventana.style.display = 'block';} </script>  <body onload=\"mostrarVentana()\">  <div id=\"miVentana\" style=\" width: 120px; height: 60px; top: 0; left: 0; font-family:Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-weight: normal; border: #000000 1px solid; background-color: #FAFAFA; color: #000000;\"> <div style=\"font-weight: bold; text-align: center; color: #FFFFFF; padding: 1px; background-color:#006394\">Los Vocales</div> \t <span class='estilo1'> U </span><span class='estilo2'>es Mayúscula</span><br/> <span class='estilo1'> u </span><span class='estilo2'>es Minúscula</span> </div></body></html>");
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

        jButtonNinguno.setFont(new java.awt.Font("apantasia", 0, 24)); // NOI18N
        jButtonNinguno.setText("Ninguno");
        jButtonNinguno.setToolTipText("Rosado");
        jButtonNinguno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNinguno.setEnabled(false);
        jButtonNinguno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNingunoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jSeparator1)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(Iniciar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(vocal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 399, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jButtonAmarillo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonVerde, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonAzul, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonAnaranjado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonRosado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(20, 20, 20)
                                .add(jButtonNinguno)))
                        .add(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Iniciar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(vocal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 181, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonAzul, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonNinguno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonVerde, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonAnaranjado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonRosado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonAmarillo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/quecolores/coloresmen.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Colores/quecolores/loscolores.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exit.png"))); // NOI18N
        salir.setToolTipText("Siguiente");
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

        puntos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        puntos.setForeground(new java.awt.Color(0, 0, 204));
        puntos.setText("0");
        puntos.setToolTipText("Puntaje Alcanzado");
        puntos.setBorderPainted(false);
        puntos.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Puntaje");

        fallas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fallas.setForeground(new java.awt.Color(255, 0, 0));
        fallas.setText("0");
        fallas.setToolTipText("Intentos Fallidos");
        fallas.setBorderPainted(false);
        fallas.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fallas");

        intentos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        intentos.setForeground(new java.awt.Color(0, 204, 0));
        intentos.setText("0");
        intentos.setToolTipText("Intentos Fallidos");
        intentos.setBorderPainted(false);
        intentos.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Intentos");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(salir)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, fallas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, puntos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(intentos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
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
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 28, Short.MAX_VALUE)
                .add(salir))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vocalActionPerformed
        
    }//GEN-LAST:event_vocalActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();        
    }//GEN-LAST:event_salirActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
         nuevoInicio();  
    }//GEN-LAST:event_IniciarActionPerformed

    private void jButtonAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmarilloActionPerformed
        verificarFin(1);
    }//GEN-LAST:event_jButtonAmarilloActionPerformed

    private void jButtonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerdeActionPerformed
        verificarFin(2);
    }//GEN-LAST:event_jButtonVerdeActionPerformed

    private void jButtonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAzulActionPerformed
        verificarFin(3);
    }//GEN-LAST:event_jButtonAzulActionPerformed

    private void jButtonAnaranjadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnaranjadoActionPerformed
        verificarFin(4);
    }//GEN-LAST:event_jButtonAnaranjadoActionPerformed

    private void jButtonRosadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRosadoActionPerformed
        verificarFin(5);
    }//GEN-LAST:event_jButtonRosadoActionPerformed

    private void IniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarMouseEntered
        clase.sonido("/Sonidos/water1.wav");
    }//GEN-LAST:event_IniciarMouseEntered

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        clase.sonido("/Sonidos/water1.wav");
    }//GEN-LAST:event_salirMouseEntered

    private void jButtonNingunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNingunoActionPerformed
        verificarFin(6);
    }//GEN-LAST:event_jButtonNingunoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JButton fallas;
    private javax.swing.JButton intentos;
    private javax.swing.JButton jButtonAmarillo;
    private javax.swing.JButton jButtonAnaranjado;
    private javax.swing.JButton jButtonAzul;
    private javax.swing.JButton jButtonNinguno;
    private javax.swing.JButton jButtonRosado;
    private javax.swing.JButton jButtonVerde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton puntos;
    private javax.swing.JButton salir;
    private javax.swing.JButton vocal;
    // End of variables declaration//GEN-END:variables
}
