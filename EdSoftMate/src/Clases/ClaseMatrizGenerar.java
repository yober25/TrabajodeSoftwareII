package Clases;

import javax.swing.JButton;

public class ClaseMatrizGenerar {  
    private int desplaza_fila[] = new int[8];
    private int desplaza_columna[] = new int[8];
    
    public ClaseMatrizGenerar () {
        desplaza_fila[0] = 1;       desplaza_fila[1] = 2;       desplaza_fila[2] = -1;      desplaza_fila[3] = -2;
        desplaza_fila[4] = 1;       desplaza_fila[5] = 2;       desplaza_fila[6] = -1;      desplaza_fila[7] = -2;
        desplaza_columna[0] = 2;    desplaza_columna[1] = 1;    desplaza_columna[2] = -2;
        desplaza_columna[3] = -1;   desplaza_columna[4] = -2;   desplaza_columna[5] = -1;
        desplaza_columna[6] = 2;    desplaza_columna[7] = 1;
    }
    public void GenerarSolucion (int x, int y,int Tamano,ClaseMatrizABC tabla) {
        int i,j,MaximoSaltos,fil,col,k,cuento,dondevoy = 0,nuevafil,nuevacol;
        tabla.ponerFicha(x, y, 1);//tabla[x][y] = 1 , Primera pieza
        fil = x;
        col = y;
        for (j = 2; j <= (Tamano*Tamano); j++) {
            MaximoSaltos = Tamano;
            for (i = 0; i < Tamano; i++) {
                nuevafil = fil + desplaza_fila[i];
                nuevacol = col + desplaza_columna[i];
                if (nuevafil >= 0 && nuevafil < Tamano && nuevacol >= 0 && nuevacol < Tamano && tabla.obtenerFicha(nuevafil,nuevacol) == 0){
                    cuento = 0;       
                    for (k = 0; k < Tamano; k++) {
                        if ((nuevafil + desplaza_fila[k] >= 0 && nuevafil + desplaza_fila[k] < Tamano) &&
                             (nuevacol + desplaza_columna[k] >= 0 && nuevacol + desplaza_columna[k] < Tamano) && 
                             (tabla.obtenerFicha(nuevafil+desplaza_fila[k], nuevacol+desplaza_columna[k])== 0)) {
                                cuento++;
                        }
                    }//
                    if (cuento <= MaximoSaltos && cuento>=0) {
                        MaximoSaltos = cuento;
                        dondevoy = i;//Movemos a la Opcion "i" de salto.
                    }
                }
            }            
            fil = fil + desplaza_fila[dondevoy];
            col = col + desplaza_columna[dondevoy];
            tabla.ponerFicha(fil, col, j);//Pongo el siguiente numero en tablero
        }
    }
    public void Solucion (int Tamano,ClaseMatrizABC tabla,JButton teclado,int x,int y) {
    String[] letras = {"A","B","C","D","E","F","G","H",
                       "I","J","K","L","M","N","Ñ","O",
                       "P","Q","R","S","T","U","V","W",
                       "X","Y","Z","A","B","C","D","E",
                       "F","G","H","I","J","K","L","M",
                       "N","Ñ","O","P","Q","R","S","T",
                       "U","V","W","X","Y","Z","A","B",
                       "C","D","E","F","G","H","I","J"};
    try {
        teclado.setText(letras[tabla.obtenerFicha(x, y)]);  
        teclado.setEnabled(true);
    } catch (Exception e) {        
    }
    }
}
