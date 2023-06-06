
import java.util.Arrays;
import java.io.IOException;
public class putacris {
    public static void main(String[] args) throws IOException {
        int[] edades = new int[] {10, 30, 50, 70, 80, 85};
        System.out.println("edades = " + Arrays.toString(edades));
        System.out.println("Elementos = " + edades.length);
        int filas = 2;
        int columnas = 3;

        

        int [][] matriz = new int[filas][columnas];
        int contador = 0;

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                matriz[i][j] = edades[contador];
                contador++;
            }
        }
        
        
       
        System.out.println(Arrays.deepToString(matriz));
    }
}

