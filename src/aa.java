import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class aa {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int contador = 1, contador2 = 1;
        int x = 0;
        boolean reiniciar = true;

        while (reiniciar) {
        try{
            do {
                System.out.println("Ingrese la cantidad de jugadores (min: 2)");
                x = Integer.parseInt(br.readLine());
            } while (x <= 1);

            int futbol[][] = new int[x][2];

            for (int i = 0; i < futbol.length; i++) {
            System.out.println("Ingrese la cantidad de goles del jugador N° " +contador++);
            int g = Integer.parseInt(br.readLine());

            System.out.println("Ingrese la cantidad de partidos del jugador N° " + contador2++);
            int p = Integer.parseInt(br.readLine());
            
            futbol[i][0] = g;
            futbol [i][1] = p;
        } 
        
        System.out.println("Matriz fuvol: ");
        for (int i = 0; i < futbol.length; i++) {
            System.out.println("Goles/partidos del jugador n°" + (i + 1) + ": " + Arrays.toString(futbol[i]));
        }
        
        reiniciar = false;
    } catch(NumberFormatException  | NegativeArraySizeException e) {
            System.out.println("Tipo de dato no valido");
            reiniciar = true;
        } 
    }  
    br.close();
    }
}