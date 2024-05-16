import java.util.Scanner;
// import java.lang.String;

public class UsandoScanner2 {
    public static String hola = "Hola";

    public static void main(String[] args){
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingresa dos Numeros: ");
        double num1 = Double.parseDouble(numeros.nextLine());
        double num2 = Double.parseDouble(numeros.nextLine());
        String result = Math.abs(num2-num1) < 0.0001 ? "The numbers are equal" : "The numbers are not equal";
        System.out.println(result);

        boolean result_2 = hola.equalsIgnoreCase("HOLA");
        System.out.print(result_2);

        boolean verdadero = true;
        boolean falso = false;

    }
}
