
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class aa {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int contador = 1;
        int contador2 = 1;

        try{
            
        System.out.println("Ingrese la cantidad de jugadores");
        String dim = br.readLine();
        int x = Integer.parseInt(dim);
        int futbol[][] = new int[x][2];

            for (int i = 0; i < futbol.length; i++) {

            System.out.println("Ingrese la cantidad de goles del jugador N° " +contador++);
            String goles = br.readLine();
            int g = Integer.parseInt(goles);

            System.out.println("Ingrese la cantidad de partidos del jugador N° " + contador2++);
            String partidos = br.readLine();
            int p = Integer.parseInt(partidos);
            
            futbol[i][0] = g;
            futbol [i][1] = p;

        } 
        
        System.out.println("Matriz fuvol: ");
        for (int i = 0; i < futbol.length; i++) {
            System.out.println("Goles del jugador n°" + (i + 1) + ": " + Arrays.toString(futbol[i]));
        }

    } catch(NumberFormatException  | NegativeArraySizeException e) {
            System.out.println("Tipo de dato no valido");
        } 
        finally {
            br.close();
            isr.close();
        }
    }
}