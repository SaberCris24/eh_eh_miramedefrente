import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Operaciones {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;

        try {
            System.out.println("Ingresa el numero de filas");
            x = Integer.parseInt(br.readLine());
            int suma [][] = new int[x][1];


            
            //for (int i = 0 ; i < suma.length; i++) {
              //  int number = 0, number2 = 0;
              //  number = suma[i][1];
              //  number2 = suma[i+1][1];

            //}

        } catch (NumberFormatException | NegativeArraySizeException e) {
            System.out.println("Tipo de dato incorrecto");
        }

    }
}