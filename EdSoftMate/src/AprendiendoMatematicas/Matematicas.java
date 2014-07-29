package AprendiendoMatematicas;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Matematicas {
    public static void main(String[] args) {
        try {  UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");            
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {} 
        
        MDIAplicacion inicio=new MDIAplicacion();
        inicio.setVisible(true);                
        inicio.setTitle("Aprendiendo las Matematicas");
        inicio.setExtendedState(inicio.MAXIMIZED_BOTH);
        inicio.setResizable(false);    
    }    
}
