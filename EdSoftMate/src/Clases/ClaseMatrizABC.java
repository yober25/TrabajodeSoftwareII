package Clases;

public class ClaseMatrizABC {
    public int[][] tablero;
    public int tamano;
    public ClaseMatrizABC(int t){
        tamano = t;
        tablero = new int[t][t];
        for(int i=0;i<tamano;i++)
        {for(int j=0;j<tamano;j++)
            {quitarFicha(i, j);} //se marca con 0 para indicar que está vacío
        }
    }
    public final void quitarFicha(int i, int j){
        tablero[i][j]=0;
    }
    public void ponerFicha(int i, int j,int valor){
        tablero[i][j]=valor;
    }
    public int obtenerFicha(int i, int j){
        return tablero[i][j];
    }
}
