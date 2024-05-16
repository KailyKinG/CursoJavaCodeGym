import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner turno = new Scanner(System.in);

        /*int row = 1;
        while(row <= 10){
            int col = 1;
            while(col <= 20){
                if(row == 1 || row == 10)
                    System.out.print("B");
                else{
                    boolean response = (col == 1 || col == 20);
                    String turno = response ? "B" : " ";
                    System.out.print(turno);
                }
                col++;
            }
            System.out.println();
            row++;
        }*/

        /*int pase = 0;
        while(pase < 20){
            pase++;
            if((pase % 7) == 0)
                continue;
            System.out.println(pase);

        }*/


        /*System.out.println("Si Quieres Salir Solo escribe 'basta'. Si no Sigamos Jugando...");
        while(true){
            System.out.println("Ingresa lo que quieras: ");
            String dato = turno.nextLine();
            if(dato.equalsIgnoreCase("BASTA"))
                break;
            System.out.println(dato);
        }*/

        int pase = 0;
        int suma = 0;
        while(pase < 100){
            pase++;
            if((pase%3) == 0)
                continue;
            suma+=pase;
        }
        System.out.print(suma);
    }
}