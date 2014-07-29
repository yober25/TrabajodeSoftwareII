package Clases;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JLabel;
import Abecedario.OptionpaneMensaje;

public class ClaseMatrizVerificar {
    private boolean bandera=false,isPrimero=false;
    private Timer tiempo ;
    private int puntaje=0;
    private int contador=0,respCorrecta=0,respFallido=0,intentoTotal=0;
    private TimerTask task;
    private String cad_seg,cad_min,cad_hor;    
    private ClasePrincipal clase=new ClasePrincipal();
    private String[] letras = { "A","B","C","D","E","F","G","H",
                                "I","J","K","L","M","N","Ñ","O",
                                "P","Q","R","S","T","U","V","W",
                                "X","Y","Z","A","B","C","D","E",
                                "F","G","H","I","J","K","L","M",
                                "N","Ñ","O","P","Q","R","S","T",
                                "U","V","W","X","Y","Z","A","B",
                                "C","D","E","F","G","H","I","J"};
    public void Verificar_letra(String ubicacion,JButton BotonAVerificar,JButton BotonVerificar){
        if (BotonAVerificar.getText().equals("Ñ")){
            clase.sonido("/Sonidos/nn.wav");
        }else{
            clase.sonido(ubicacion+BotonAVerificar.getText()+".wav");
        }
        if(BotonAVerificar.getText().equals("Z") && BotonVerificar.getText().equals("Z")){
            detener();
            new OptionpaneMensaje(8,2).show();
        }else{
            if(BotonAVerificar.getText().equals(letras[contador])){
                BotonAVerificar.setEnabled(false);
                BotonVerificar.setText(letras[contador+1]);            
                contador=contador+1;  
                bandera=true;
                //botonMensaje.setIcon(new ImageIcon(getClass().getResource("/Iconos/si2.png")));
                new OptionpaneMensaje(2,1).show();
            }else{
                bandera=false;
                new OptionpaneMensaje(2,0).show();
            }
            BotonVerificar.setVisible(false);
        }
        
    }

    public void Comenzar_a_contar_para_abc(final JLabel medidorTiempo,final JLabel mensaje) {     
        tiempo = new Timer();
           task = new TimerTask() {               
               int segundos=-1,minutos=0,horas=0;
               @Override
               public void run() {
                   segundos++;
                   if(segundos==60){
                       minutos++;
                       segundos=0;
                       if(minutos==60){
                           horas++;
                           minutos=0;
                       }
                   }
                   if(segundos<10){
                       cad_seg="0"+ String.valueOf(segundos);
                   }else{
                       cad_seg= String.valueOf(segundos);
                   }
                   if(minutos<10){
                       cad_min="0"+ String.valueOf(minutos);
                   }else{
                       cad_min= String.valueOf(minutos);
                   }
                   if(horas<10){
                       cad_hor="0"+ String.valueOf(horas);
                   }else{
                       cad_hor= String.valueOf(horas);
                   }
                   medidorTiempo.setText(String.valueOf(cad_hor+":"+cad_min+":"+cad_seg));                 
               }                      
           };             
           tiempo.schedule(task,0,1000);            
    } 
    //contador de puntos de los 4 opciones 
    public void contar_puntos(JLabel respuestaTotal,JLabel respuestaBien,JLabel respuestaMal,JLabel puntajeRealizado){
        intentoTotal=intentoTotal+1;
        if(bandera==true){            
            respCorrecta=respCorrecta+1;  
            isPrimero=true;
        }else{
            respFallido=respFallido+1;  
            isPrimero=false;
        }
        if(isPrimero==true){
            puntaje=puntaje+5;
        }
        respuestaTotal.setText("Intentos  : "+String.valueOf(intentoTotal));
        respuestaBien.setText("Correctas: "+String.valueOf(respCorrecta));
        respuestaMal.setText("Falladas   : "+String.valueOf(respFallido));
        puntajeRealizado.setText(mensajeColor(String.valueOf(1),String.valueOf(puntaje)));
    }
    public String mensajeColor(String estilo, String mensaje){
        String men="<html><style type='text/css'>"
                + ".estilo1{font-family:Times New Roman;font-style:normal;font-weight:bold; font-size:18px;color:rgb(161, 1, 3);text-align:center}   "
                + ".estilo2{font-family:verdana;font-weight:bold; font-size:18px;color:rgb(12, 149, 1);text-align:center}</style>  "
                + "<span class='"+estilo+"'>"+mensaje+"</div></body></html>";
        return men;
    }    
    public void iniciar(JLabel respuestaTotal,JLabel respuestaBien,JLabel respuestaMal,JLabel puntajeRealizado){
        bandera=false;      isPrimero=false;
        contador=0;         puntaje=0;          
        respCorrecta=0;     respFallido=0;
        intentoTotal=0;
        respuestaTotal.setText("Intentos  : "+String.valueOf(intentoTotal));
        respuestaBien.setText("Correctas: "+String.valueOf(respCorrecta));
        respuestaMal.setText("Falladas    : "+String.valueOf(respFallido));
        puntajeRealizado.setText(mensajeColor(String.valueOf(1),String.valueOf(puntaje)));
    }
    public void detener() {   
        bandera=false;
        tiempo.cancel();
        task.cancel();
        contador=0;
    }
}
