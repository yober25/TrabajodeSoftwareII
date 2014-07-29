
package Clases;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
//import java.awt.event.KeyEvent;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;

public class ClasePrincipal {   
    public final void customizeNimbusLaF() {  
        UIManager.put( "nimbusFocus" , Color.GREEN );
        UIManager.put("OptionPane.background",new Color(233 ,239 ,248));
        UIManager.put( "control" , new Color(233 ,239 ,248) );//color 
        UIManager.put("Panel.background", Color.RED);        
        UIManager.put("controlText", Color.RED);
        UIManager.put("JTextfield",Color.RED);
        //UIManager.put("nimbusBlueGrey",new Color(50, 84 ,112));//color fondo MenuBar
    }
    public void sonido(String cadena){
        //sonido codigo
        AudioClip sonido=java.applet.Applet.newAudioClip(getClass().getResource(cadena));
        sonido.play();
    }
    //
    // para  cargar imagines 
//    public void cambiarIconoBoton(JButton boton,String icono,String rollIcon){
//        boton.setIcon(new ImageIcon(getClass().getResource(icono)));
//        boton.setRolloverIcon(new ImageIcon(getClass().getResource(rollIcon)));
//    } 
    ///tamaño de la respuestas 
    public void conf_text_buton(JButton boton,int x, int y, int z,int tamanio){
        boton.setForeground(new Color(x, y, z));
        Font controlFont = new Font("Poor Richard", Font.TYPE1_FONT, tamanio);
        boton.setFont(controlFont);        
    }
    ///conf de texto 
    public void conf_text_buton(JButton boton,int tamanio){
        Font controlFont = new Font("Poor Richard", Font.TYPE1_FONT, tamanio);
        boton.setFont(controlFont);        
    }
//    public void validarNumero(KeyEvent e) {
//        char a=e.getKeyChar();
//        if(!(a>=KeyEvent.VK_0 && a<=KeyEvent.VK_9)) {
//            e.consume();
//        }
//    }
}
