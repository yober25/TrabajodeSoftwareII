
package AprendiendoMatematicas;
import java.applet.AudioClip;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;

public class ClaseEdSoft {    
    public void sonido(String cadena){
        AudioClip sonido=java.applet.Applet.newAudioClip(getClass().getResource(cadena));
        sonido.play();
    }
    public void cambiarIconoBoton(JButton boton,String icono,String rollIcon){
        boton.setIcon(new ImageIcon(getClass().getResource(icono)));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource(rollIcon)));
    } 
    public final void customizeNimbusLaF() {  
        UIManager.put( "nimbusFocus" , Color.GREEN );
        UIManager.put("OptionPane.background",new Color(233 ,239 ,248));
        UIManager.put( "control" , new Color(233 ,239 ,248) );//color 
        UIManager.put("Panel.background", Color.RED);        
        UIManager.put("controlText", Color.RED);
        UIManager.put("JTextfield",Color.RED);
        //UIManager.put("nimbusBlueGrey",new Color(50, 84 ,112));//color fondo MenuBar
    }
}
