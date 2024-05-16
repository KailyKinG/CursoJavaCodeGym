import java.util.Scanner;

public class WhileClase {

    public static void main(String[] args){
        Scanner turno = new Scanner(System.in);
        int suma = 0;
        while(true){
            String dato = turno.nextLine();
            boolean isEnter = dato.equalsIgnoreCase("ENTER");
            if(isEnter){
                break;
            }
            else{
                int num = Integer.parseInt(dato);
                suma+=num;
            }
        }
        System.out.println(suma);
    }
}
