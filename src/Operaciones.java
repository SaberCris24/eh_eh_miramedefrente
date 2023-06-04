import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Operaciones {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingresa la cantidad de numeros: ");
            int cnumeros = Integer.parseInt(br.readLine());

            int[] svector = new int[cnumeros];

            System.out.println("Ingresa los numeros: ");

            for (int i = 0; i < cnumeros; i++) {
                System.out.println("Ingresa el numero " + (i+1) + ":");
                svector[i] = Integer.parseInt(br.readLine());
            }

            int suma = Arrays.stream(svector).reduce(1, (a, b) -> a / b);

            System.out.println("El resultado es: " + suma);

        } catch (NumberFormatException | NegativeArraySizeException e) {
            System.out.println("Tipo de dato incorrecto");
            br.close();
        }

    }
}