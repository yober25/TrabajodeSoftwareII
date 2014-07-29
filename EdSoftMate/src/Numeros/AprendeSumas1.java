package Numeros;
import Colores.*;
import AprendiendoMatematicas.ClaseEdSoft;
import AprendiendoMatematicas.MDIAplicacion;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class AprendeSumas1 extends javax.swing.JInternalFrame {
    private Timer tiempo ;
    private TimerTask task;
    private int duracion; 
    boolean bandera=false;
    int rango,num1,num2,num3,suma,limite,contador,totalmensajes=5;
    int pCorrecto=0,pError=0,pTotal=0,pPuntos;
    //----------------------------------
    ClaseEdSoft clase=new ClaseEdSoft();    
    String puntaje;
    String[] mensajeCorrecto = {"Muy bien!", "Sigue así.", "Correcto!","Acertaste!","Bien!"};
    String[] mensajeIncorrecto = {"Intentalo de nuevo.", "Ops... ERROR","Oh, no!","Puedes lograrlo!","Sigue intentando"};
    
    public AprendeSumas1() {        
        initComponents();
        limite=1;rango=5;respuesta.requestFocus();
        BotonIniciarSinTiempo.setForeground(new Color(87, 166, 213));
        botonIniciarConTiempo.setForeground(new Color(87, 166, 213)); 
        pCorrecto=0;pError=0;pTotal=1;pPuntos=0;
        suma(rango);  
        puntaje="<html><style type='text/css'>"
            + ".estilo1{font-family:Times New Roman;font-style:normal;font-weight:bold; font-size:36px;color:rgb(161, 1, 3);text-align:center}   "
            + ".estilo2{font-family:verdana;font-weight:bold; font-size:12px;color:rgb(12, 149, 1);text-align:center}</style>  "
            + "<span class='estilo1'> 0 </span> <span class='estilo2'> puntos</span> </div></body></html>";
        puntajeRealizado.setText(puntaje);
        respError.setText(String.valueOf("Respuestas equivocadas: 0"));        
        respTotal.setText(String.valueOf("Total de preguntas       : 0"));
        respCorrecta.setText(String.valueOf("Preguntas respondidas  : 0"));
        respuesta.setText(String.valueOf(suma)); 
        mensaje.setText("");     
    }
    // metodo y funciones
    public void sonido(String cadena){
        AudioClip sonido=java.applet.Applet.newAudioClip(getClass().getResource(cadena));
        sonido.play();
    }
    public String mensajeColor(String estilo, String mensaje){
        String men="<html><style type='text/css'>"
                + ".estilo1{font-family:Times New Roman;font-style:normal;font-weight:bold; font-size:18px;color:rgb(161, 1, 3);text-align:center}   "
                + ".estilo2{font-family:verdana;font-weight:bold; font-size:18px;color:rgb(12, 149, 1);text-align:center}</style>  "
                + "<span class='"+estilo+"'>"+mensaje+"</div></body></html>";
        return men;
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
    public void suma(int rango){
        contador=0;
        num1=1+(int)(Math.random()*rango);
        num2=(int)(Math.random()*rango);
        numero1.setText(String.valueOf(num1));
        numero2.setText(String.valueOf(num2)); 
        respuesta.setText("");
        respuesta.requestFocus();
        suma=num1+num2;
        //----------------------------------------------------------------------
        num3=1+(int)(Math.random()*2);
        if(num1<=10 && num2<=10){
            if(num1==0){
                cambiarIcono(imagen1,"/Numeros/iconos/imagen0.png");                
            }else{
                cambiarIcono(imagen1,"/Numeros/iconos/imagen"+num3+"-"+num1+".png");
            }
            if(num2==0){
                cambiarIcono(imagen2,"/Numeros/iconos/imagen0.png");                
            }else{
                cambiarIcono(imagen2,"/Numeros/iconos/imagen"+num3+"-"+num2+".png");
            }             
        }else{
            cambiarIcono(imagen1,"/Numeros/iconos/imagen0.png");
            cambiarIcono(imagen2,"/Numeros/iconos/imagen0.png");
        }        
    }
    public void Comenzar_a_contar() {  
           tiempo = new Timer();
           task = new TimerTask() {               
               int c,contador=-1;
               @Override
               public void run() {
                   contador++;
                   c=duracion-contador;
                   medidorTiempo.setText(String.valueOf("Tiempo(Segundos) : "+c));
                   if(contador == duracion){                    
                       mensaje.setText("Se acabo el tiempo, mala suerte");
                       mensaje.setForeground(new Color(255, 0, 0));
                       Font controlFont = new Font("Tahoma", Font.TYPE1_FONT, 18);
                       mensaje.setFont(controlFont);
                       detener();                     
                   }                  
               }                      
           };             
           tiempo.schedule(task,0,1000);            
    } 
    public void detener() {   
        bandera=false;
        tiempo.cancel();
        task.cancel();
        botonDetener.setEnabled(false);
        ComboElegirTiempo.setEnabled(true);
        ComboElegirTiempo.setEditable(true);
        botonIniciarConTiempo.setEnabled(true);
        BotonIniciarSinTiempo.setEnabled(true);
        medidorTiempo.setText(String.valueOf("Tiempo(Segundos) : 0"));
        clase.sonido("/Sonidos/water1.wav");
    }  
    public void iniciar_nuevo(){
        bandera=true;
        medidorTiempo.setText("");
        respuesta.setEnabled(true);
        facil.setEnabled(true);
        muyFacil.setEnabled(true);
        algoFacil.setEnabled(true);
        noTanFacil.setEnabled(true);
        ComboElegirTiempo.setEnabled(true);
        botonIniciarConTiempo.setEnabled(true);
        
        pCorrecto=0;pError=0;pTotal=1;pPuntos=0;
        suma(rango);
        puntaje="<html><style type='text/css'>"
        + ".estilo1{font-family:Times New Roman;font-style:normal;font-weight:bold; font-size:36px;color:rgb(161, 1, 3);text-align:center}   "
        + ".estilo2{font-family:verdana;font-weight:bold; font-size:12px;color:rgb(12, 149, 1);text-align:center}</style>  "
        + "<span class='estilo1'> 0 </span> <span class='estilo2'> puntos</span> </div></body></html>";
        puntajeRealizado.setText(puntaje);
        respCorrecta.setText(String.valueOf("Preguntas respondidas  : "+pCorrecto));
        respError.setText(String.valueOf("Respuestas equivocadas: "+pError));
        respTotal.setText(String.valueOf("Total de preguntas       : "+pTotal));
        mensaje.setText("");
        
        clase.sonido("/Sonidos/water1.wav");
    }
    public void conf_text_buton(JButton boton,int x, int y, int z,int tamanio){
        boton.setForeground(new Color(x, y, z));
        Font controlFont = new Font("Tahoma", Font.TYPE1_FONT, tamanio);
        boton.setFont(controlFont);        
    }
    public void cambiarIcono(JButton boton,String icono){
        boton.setIcon(new ImageIcon(getClass().getResource(icono)));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nivel = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        signo = new javax.swing.JButton();
        numero2 = new javax.swing.JButton();
        numero1 = new javax.swing.JButton();
        imagen2 = new javax.swing.JButton();
        imagen1 = new javax.swing.JButton();
        signo1 = new javax.swing.JButton();
        respuesta = new javax.swing.JTextField();
        respError = new javax.swing.JLabel();
        facil = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        algoFacil = new javax.swing.JRadioButton();
        noTanFacil = new javax.swing.JRadioButton();
        muyFacil = new javax.swing.JRadioButton();
        puntajeRealizado = new javax.swing.JLabel();
        respTotal = new javax.swing.JLabel();
        respCorrecta = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComboElegirTiempo = new javax.swing.JComboBox();
        botonIniciarConTiempo = new javax.swing.JButton();
        medidorTiempo = new javax.swing.JLabel();
        botonDetener = new javax.swing.JButton();
        BotonIniciarSinTiempo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setClosable(true);
        setTitle("A probar tus habilidades en la matemática con EdSoftMate");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/numeros.png"))); // NOI18N

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        signo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        signo.setForeground(new java.awt.Color(255, 255, 255));
        signo.setText("=");
        signo.setToolTipText("");
        signo.setBorderPainted(false);
        signo.setContentAreaFilled(false);
        signo.setBounds(290, 360, 70, 50);
        jDesktopPane1.add(signo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        numero2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        numero2.setForeground(new java.awt.Color(255, 255, 255));
        numero2.setText("00");
        numero2.setToolTipText("numero2");
        numero2.setBorderPainted(false);
        numero2.setContentAreaFilled(false);
        numero2.setBounds(210, 360, 90, 50);
        jDesktopPane1.add(numero2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        numero1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        numero1.setForeground(new java.awt.Color(255, 255, 255));
        numero1.setText("00");
        numero1.setToolTipText("");
        numero1.setBorderPainted(false);
        numero1.setContentAreaFilled(false);
        numero1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numero1.setBounds(50, 360, 100, 50);
        jDesktopPane1.add(numero1, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        imagen2.setBounds(190, 230, 129, 105);
        jDesktopPane1.add(imagen2, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        imagen1.setBounds(40, 230, 129, 105);
        jDesktopPane1.add(imagen1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        signo1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        signo1.setForeground(new java.awt.Color(255, 255, 255));
        signo1.setText("+");
        signo1.setToolTipText("");
        signo1.setBorderPainted(false);
        signo1.setContentAreaFilled(false);
        signo1.setBounds(150, 360, 60, 50);
        jDesktopPane1.add(signo1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        respuesta.setBackground(new java.awt.Color(0, 0, 0));
        respuesta.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        respuesta.setForeground(new java.awt.Color(255, 255, 255));
        respuesta.setText("000");
        respuesta.setToolTipText("");
        respuesta.setEnabled(false);
        respuesta.setOpaque(false);
        respuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                respuestaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                respuestaKeyTyped(evt);
            }
        });
        respuesta.setBounds(350, 360, 100, 50);
        jDesktopPane1.add(respuesta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        respError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        respError.setForeground(new java.awt.Color(0, 255, 0));
        respError.setText("Respuestas equivocadas: 0");
        respError.setBounds(40, 160, 280, 15);
        jDesktopPane1.add(respError, javax.swing.JLayeredPane.DEFAULT_LAYER);

        facil.setBackground(new java.awt.Color(248, 248, 248));
        nivel.add(facil);
        facil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        facil.setText("Fácil");
        facil.setToolTipText("<html><style type='text/css'> .estilo1{font-family:Times New Roman;font-weight:bold;font-size:14px;color:#00F;}</style> <div align=\"center\"><span class='estilo1'>Números 1 a 10</span></div></html>");
        facil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facil.setEnabled(false);
        facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilActionPerformed(evt);
            }
        });
        facil.setBounds(570, 190, 93, 25);
        jDesktopPane1.add(facil, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 115, 147));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Elije el Tiempo");
        jLabel4.setBounds(560, 350, 290, 40);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        algoFacil.setBackground(new java.awt.Color(248, 248, 248));
        nivel.add(algoFacil);
        algoFacil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        algoFacil.setText("Algo fácil");
        algoFacil.setToolTipText("<html><style type='text/css'> .estilo1{font-family:Times New Roman;font-weight:bold;font-size:14px;color:#00F;}</style> <div align=\"center\"><span class='estilo1'>Números 1 a 25</span></div></html>");
        algoFacil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        algoFacil.setEnabled(false);
        algoFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                algoFacilActionPerformed(evt);
            }
        });
        algoFacil.setBounds(570, 220, 93, 25);
        jDesktopPane1.add(algoFacil, javax.swing.JLayeredPane.DEFAULT_LAYER);

        noTanFacil.setBackground(new java.awt.Color(248, 248, 248));
        nivel.add(noTanFacil);
        noTanFacil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noTanFacil.setText("No tan fácil");
        noTanFacil.setToolTipText("<html><style type='text/css'> .estilo1{font-family:Times New Roman;font-weight:bold;font-size:14px;color:#00F;}</style> <div align=\"center\"><span class='estilo1'>Números 1 a 100</span></div></html>");
        noTanFacil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        noTanFacil.setEnabled(false);
        noTanFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTanFacilActionPerformed(evt);
            }
        });
        noTanFacil.setBounds(570, 250, 93, 25);
        jDesktopPane1.add(noTanFacil, javax.swing.JLayeredPane.DEFAULT_LAYER);

        muyFacil.setBackground(new java.awt.Color(248, 248, 248));
        nivel.add(muyFacil);
        muyFacil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        muyFacil.setSelected(true);
        muyFacil.setText("Muy fácil");
        muyFacil.setToolTipText("<html><style type='text/css'> .estilo1{font-family:Times New Roman;font-weight:bold;font-size:14px;color:#00F;}</style> <div align=\"center\"><span class='estilo1'>Números 1 a 5</span></div></html>");
        muyFacil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        muyFacil.setEnabled(false);
        muyFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muyFacilActionPerformed(evt);
            }
        });
        muyFacil.setBounds(570, 160, 93, 25);
        jDesktopPane1.add(muyFacil, javax.swing.JLayeredPane.DEFAULT_LAYER);

        puntajeRealizado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        puntajeRealizado.setForeground(new java.awt.Color(255, 153, 0));
        puntajeRealizado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        puntajeRealizado.setText("Puntaje");
        puntajeRealizado.setToolTipText("");
        puntajeRealizado.setBounds(270, 130, 230, 70);
        jDesktopPane1.add(puntajeRealizado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        respTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        respTotal.setForeground(new java.awt.Color(0, 255, 0));
        respTotal.setText("Número de pregunta    : 0");
        respTotal.setBounds(40, 180, 220, 15);
        jDesktopPane1.add(respTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        respCorrecta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        respCorrecta.setForeground(new java.awt.Color(0, 255, 0));
        respCorrecta.setText("Preguntas respondidas  : 0");
        respCorrecta.setBounds(40, 140, 200, 15);
        jDesktopPane1.add(respCorrecta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mensaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 153, 0));
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje.setText("Mensaje");
        mensaje.setToolTipText("");
        mensaje.setBounds(40, 420, 460, 30);
        jDesktopPane1.add(mensaje, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 115, 147));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DIFICULTAD");
        jLabel5.setBounds(560, 130, 270, 30);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ComboElegirTiempo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboElegirTiempo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "30 Segundos", "1 Minuto (60 segundos)", "2 Minutos (120 segundos)", "3 Minutos (180 segundos)", "4 Minutos (240 segundos)", "5 Minutos (300 segundos)" }));
        ComboElegirTiempo.setToolTipText("<html><style type='text/css'> .estilo1{font-family:Times New Roman;font-weight:bold;font-size:14px;color:#00F;}</style> <div align=\"center\"><span class='estilo1'>Tiempo</span></div></html>");
        ComboElegirTiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboElegirTiempo.setBounds(580, 390, 250, 30);
        jDesktopPane1.add(ComboElegirTiempo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        botonIniciarConTiempo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonIniciarConTiempo.setForeground(new java.awt.Color(87, 166, 213));
        botonIniciarConTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/iniciar.png"))); // NOI18N
        botonIniciarConTiempo.setText("Iniciar");
        botonIniciarConTiempo.setToolTipText("<html><style type='text/css'> .estilo1{font-family:Times New Roman;font-weight:bold;font-size:14px;color:#00F;}</style> <div align=\"center\"><span class='estilo1'>Iniciar</span></div></html>");
        botonIniciarConTiempo.setBorder(null);
        botonIniciarConTiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIniciarConTiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIniciarConTiempoMouseClicked(evt);
            }
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
        botonIniciarConTiempo.setBounds(580, 430, 120, 30);
        jDesktopPane1.add(botonIniciarConTiempo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        medidorTiempo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        medidorTiempo.setForeground(new java.awt.Color(0, 255, 0));
        medidorTiempo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        medidorTiempo.setToolTipText("");
        medidorTiempo.setBounds(300, 200, 200, 20);
        jDesktopPane1.add(medidorTiempo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        botonDetener.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botonDetener.setForeground(new java.awt.Color(87, 166, 213));
        botonDetener.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/detener.png"))); // NOI18N
        botonDetener.setText("Detener");
        botonDetener.setToolTipText("<html><style type='text/css'> .estilo1{font-family:Times New Roman;font-weight:bold;font-size:14px;color:#00F;}</style> <div align=\"center\"><span class='estilo1'>Detener</span></div></html>");
        botonDetener.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonDetener.setEnabled(false);
        botonDetener.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDetenerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonDetenerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonDetenerMouseExited(evt);
            }
        });
        botonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDetenerActionPerformed(evt);
            }
        });
        botonDetener.setBounds(710, 430, 120, 30);
        jDesktopPane1.add(botonDetener, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BotonIniciarSinTiempo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BotonIniciarSinTiempo.setForeground(new java.awt.Color(87, 166, 213));
        BotonIniciarSinTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/iniciar.png"))); // NOI18N
        BotonIniciarSinTiempo.setText("Empezar un Nuevo juego");
        BotonIniciarSinTiempo.setToolTipText("<html><style type='text/css'> .estilo1{font-family:Times New Roman;font-weight:bold;font-size:14px;color:#00F;}</style> <div align=\"center\"><span class='estilo1'>Nuevo Juego</span></div></html>");
        BotonIniciarSinTiempo.setBorder(null);
        BotonIniciarSinTiempo.setBorderPainted(false);
        BotonIniciarSinTiempo.setContentAreaFilled(false);
        BotonIniciarSinTiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonIniciarSinTiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonIniciarSinTiempoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonIniciarSinTiempoMouseExited(evt);
            }
        });
        BotonIniciarSinTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarSinTiempoActionPerformed(evt);
            }
        });
        BotonIniciarSinTiempo.setBounds(570, 290, 260, 30);
        jDesktopPane1.add(BotonIniciarSinTiempo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/ayudaIcon.png"))); // NOI18N
        jButton1.setText("Ayuda");
        jButton1.setToolTipText("<html><style type='text/css'> .estilo1{font-family:Times New Roman;font-weight:bold;font-size:14px;color:#00F;}</style> <div align=\"center\"><span class='estilo1'>Ayuda</span></div></html>");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/ayudaRoller.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(0, 80, 120, 40);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/iconos/suma.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setBounds(60, 0, 460, 120);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/iconos/logo1.png"))); // NOI18N
        jLabel2.setBounds(554, 10, 310, 110);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numeros/pizarra.PNG"))); // NOI18N
        fondo.setToolTipText("Suma");
        fondo.setBounds(0, 0, 865, 520);
        jDesktopPane1.add(fondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 865, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void muyFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muyFacilActionPerformed
        clase.sonido("/Sonidos/water1.wav");
        rango=5;limite=0;respuesta.setEnabled(true);
        suma(rango);
    }//GEN-LAST:event_muyFacilActionPerformed

    private void noTanFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTanFacilActionPerformed
        clase.sonido("/Sonidos/water1.wav");
        rango=100;limite=2;respuesta.setEnabled(true);
        suma(rango);
    }//GEN-LAST:event_noTanFacilActionPerformed

    private void algoFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_algoFacilActionPerformed
        clase.sonido("/Sonidos/water1.wav");
        rango=25;limite=1;respuesta.setEnabled(true);
        suma(rango);
    }//GEN-LAST:event_algoFacilActionPerformed

    private void facilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilActionPerformed
        clase.sonido("/Sonidos/water1.wav");
        rango=10;limite=1;respuesta.setEnabled(true);
        suma(rango);
    }//GEN-LAST:event_facilActionPerformed

    private void respuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respuestaKeyTyped
        char c=evt.getKeyChar();
        int n=respuesta.getText().length();
        if(n>limite || (c<'0' || c>'9')){evt.consume();}
        if(c==KeyEvent.VK_ENTER && bandera==true){            
            int index=(int)(Math.random()*totalmensajes);
            if(String.valueOf(suma).equals(respuesta.getText())){
                mensaje.setText(mensajeColor("estilo2", mensajeCorrecto[index]));
                if(contador==0){pPuntos=pPuntos+5;}
                else if(contador==1){pPuntos=pPuntos+3;}
                else if(contador==2){pPuntos=pPuntos+1;}
                else{pPuntos=pPuntos+0;}
                pTotal=pTotal+1;
                pCorrecto=pCorrecto+1;
                puntaje="<html><style type='text/css'>"
                + ".estilo1{font-family:Times New Roman;font-style:normal;font-weight:bold; font-size:36px;color:rgb(161, 1, 3);text-align:center}   "
                + ".estilo2{font-family:verdana;font-weight:bold; font-size:12px;color:rgb(12, 149, 1);text-align:center}</style>  "
                + "<span class='estilo1'>"+pPuntos+"</span> <span class='estilo2'> puntos</span> </div></body></html>";
                respCorrecta.setText(String.valueOf("Preguntas respondidas  : "+pCorrecto));
                puntajeRealizado.setText(puntaje);
                respTotal.setText(String.valueOf("Numero de pregunta    : "+pTotal));
                suma(rango);
            }else{
                pError=pError+1;
                contador=contador+1;
                respuesta.setText("");
                respuesta.requestFocus();
                mensaje.setText(mensajeColor("estilo1", mensajeIncorrecto[index]));
                respError.setText(String.valueOf("Respuestas Equivocadas  : "+pError));
            }
        }
    }//GEN-LAST:event_respuestaKeyTyped

    private void imagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagen1ActionPerformed

    private void imagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagen2ActionPerformed

    private void respuestaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respuestaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuestaKeyPressed

    private void botonIniciarConTiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarConTiempoMouseEntered
        if(botonIniciarConTiempo.isEnabled()){conf_text_buton(botonIniciarConTiempo,229, 98, 18,16);}
    }//GEN-LAST:event_botonIniciarConTiempoMouseEntered

    private void botonIniciarConTiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarConTiempoMouseExited
        if(botonIniciarConTiempo.isEnabled()){conf_text_buton(botonIniciarConTiempo,87, 166,213,14);}
    }//GEN-LAST:event_botonIniciarConTiempoMouseExited

    private void botonIniciarConTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarConTiempoActionPerformed
        iniciar_nuevo();
        Integer indice = ComboElegirTiempo.getSelectedIndex();
        if (indice.equals(0)){duracion=30;}
        if (indice.equals(1)){duracion=60;}
        if (indice.equals(2)){duracion=120;}
        if (indice.equals(3)){duracion=180;}
        if (indice.equals(4)){duracion=240;}
        if (indice.equals(5)){duracion=300;}
        Comenzar_a_contar();  
        botonDetener.setEnabled(true);
        ComboElegirTiempo.setEnabled(false);
        ComboElegirTiempo.setEditable(false);
        botonIniciarConTiempo.setEnabled(false);
        BotonIniciarSinTiempo.setEnabled(false);
    }//GEN-LAST:event_botonIniciarConTiempoActionPerformed

    private void botonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDetenerActionPerformed
        detener();        
    }//GEN-LAST:event_botonDetenerActionPerformed

    private void BotonIniciarSinTiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarSinTiempoMouseEntered
        if(BotonIniciarSinTiempo.isEnabled()){conf_text_buton(BotonIniciarSinTiempo,229, 98, 18,16);}
    }//GEN-LAST:event_BotonIniciarSinTiempoMouseEntered

    private void BotonIniciarSinTiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarSinTiempoMouseExited
        if(BotonIniciarSinTiempo.isEnabled()){conf_text_buton(BotonIniciarSinTiempo,87, 166,213,14);}
    }//GEN-LAST:event_BotonIniciarSinTiempoMouseExited

    private void BotonIniciarSinTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarSinTiempoActionPerformed
        iniciar_nuevo();
    }//GEN-LAST:event_BotonIniciarSinTiempoActionPerformed

    private void botonDetenerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDetenerMouseEntered
        if(botonDetener.isEnabled()){conf_text_buton(botonDetener,229, 98, 18,16);}        
    }//GEN-LAST:event_botonDetenerMouseEntered

    private void botonDetenerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDetenerMouseExited
        if(botonDetener.isEnabled()){conf_text_buton(botonDetener,87, 166,213,14);}
    }//GEN-LAST:event_botonDetenerMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        clase.sonido("/Sonidos/water1.wav");
    }//GEN-LAST:event_jButton1MouseEntered

    private void botonIniciarConTiempoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarConTiempoMouseClicked
        conf_text_buton(botonDetener,87, 166,213,14);
    }//GEN-LAST:event_botonIniciarConTiempoMouseClicked

    private void botonDetenerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDetenerMouseClicked
        conf_text_buton(BotonIniciarSinTiempo,87, 166,213,14);
    }//GEN-LAST:event_botonDetenerMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AyudaSuma ayuda=new AyudaSuma(null, closable);
        ayuda.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIniciarSinTiempo;
    private javax.swing.JComboBox ComboElegirTiempo;
    private javax.swing.JRadioButton algoFacil;
    private javax.swing.JButton botonDetener;
    private javax.swing.JButton botonIniciarConTiempo;
    private javax.swing.JRadioButton facil;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton imagen1;
    private javax.swing.JButton imagen2;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel medidorTiempo;
    private javax.swing.JLabel mensaje;
    private javax.swing.JRadioButton muyFacil;
    private javax.swing.ButtonGroup nivel;
    private javax.swing.JRadioButton noTanFacil;
    private javax.swing.JButton numero1;
    private javax.swing.JButton numero2;
    private javax.swing.JLabel puntajeRealizado;
    private javax.swing.JLabel respCorrecta;
    private javax.swing.JLabel respError;
    private javax.swing.JLabel respTotal;
    private javax.swing.JTextField respuesta;
    private javax.swing.JButton signo;
    private javax.swing.JButton signo1;
    // End of variables declaration//GEN-END:variables
}
