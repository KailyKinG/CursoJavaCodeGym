import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args){
        Scanner cadena = new Scanner(System.in);
        System.out.println("Dime tu Nombre ???");
        String nombre = cadena.nextLine();
        System.out.println("Que Edad Tienes???");
        int edad = cadena.nextInt();
        cadena.nextLine();
        System.out.println("Son Exactas tus Respuestas???");
        String resp = cadena.nextLine();
        System.out.println("Nombre: "+nombre+", Edad: "+edad+".-");
        System.out.print("Respuestas Exactas: "+resp);

    }
}
