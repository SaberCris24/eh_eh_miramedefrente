import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] edades = new int[] {10, 30, 50, 70, 80, 85};
        System.out.println("edades = " + Arrays.toString(edades));
        System.out.println("Elementos = " + edades.length);
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades[" + i + "] = " + edades[i]);
            System.out.println("mamaguevo");
            //Na mentira
        }
    }
}
