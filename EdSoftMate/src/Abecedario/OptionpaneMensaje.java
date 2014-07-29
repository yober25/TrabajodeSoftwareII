package Abecedario;
import com.sun.awt.AWTUtilities;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
public final class OptionpaneMensaje extends javax.swing.JFrame {  
    private Timer tiempo ;
    private TimerTask task;
    private int duracion;  
    String icono;
    
    public OptionpaneMensaje(int tiempo_duracion,int img_mensaje) {        
        initComponents();
        this.setLocationRelativeTo(null);
        this.duracion=tiempo_duracion;
        Comenzar_conteo(); 
        if(img_mensaje==0){icono="/Iconos/no.png";}
        if(img_mensaje==1){icono="/Iconos/si.png";}    
        if(img_mensaje==2){icono="/Iconos/fin.png";}
        // Fondo de JOption
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource(icono)); 
        desktop.setIcon(uno); 
        getLayeredPane().add(desktop,JLayeredPane.FRAME_CONTENT_LAYER); 
        desktop.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        if(img_mensaje==0 || img_mensaje==1){
            int[] puntos_x = {5 ,14,30,50,75,95,115,130,148,165,170,166,171,162,204,241,277,282,282,278,223,184,152,134,107,83 ,57 ,45 ,26 ,14 ,12 ,16 ,8  ,4  ,5};
            int[] puntos_y = {85,64,46,33,29,28,35 ,22 ,14 ,19 ,25 ,33 ,41 ,52 ,44 ,33 ,19 ,22 ,92 ,97 ,119,130,135,154,167,170,168,161,163,159,148,139,120,100,85};
            Shape forma = new Polygon(puntos_x, puntos_y,35);
            AWTUtilities.setWindowShape(this, forma); 
        }         
    }    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);

        desktop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desktopMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desktopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desktopMouseClicked
        this.dispose();
    }//GEN-LAST:event_desktopMouseClicked
   //tiempo que se muestra el mensaje..............
    public void Comenzar_conteo() {  
           tiempo = new Timer();
           task = new TimerTask() {               
               int contador=0;
               @Override
               public void run() {
                   contador++;
                   if(contador == duracion){                       
                       time_is_over();
                       detener();                       
                   }
               }                      
           };             
           tiempo.schedule(task,0,1000);            
    }        
     public void detener() {   
            tiempo.cancel();
            task.cancel();
    }     
    public void time_is_over(){ 
        this.dispose();
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel desktop;
    // End of variables declaration//GEN-END:variables
    
}
