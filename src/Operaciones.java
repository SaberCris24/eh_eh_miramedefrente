import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Operaciones {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        int y = 0;

        try {
            System.out.println("Ingresa el numero de filas");
            x = Integer.parseInt(br.readLine());

            System.out.println("Ingres el numeor de columnas");
            y = Integer.parseInt(br.readLine());

        } catch (NumberFormatException | NegativeArraySizeException e) {
            System.out.println("Tipo de dato incorrecto");
        }

    }
}