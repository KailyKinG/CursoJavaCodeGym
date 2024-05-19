
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

        // int pase = 0;
        // int suma = 0;
        // while(pase < 100){
        //     pase++;
        //     if((pase%3) == 0)
        //         continue;
        //     suma+=pase;
        // }
        // System.out.print(suma);

        /*int mayor_parcial = Integer.MIN_VALUE;
        System.out.println("Ingresa un Numero o una letra: ");
        while(turno.hasNextInt()){
            int num = turno.nextInt();
            if(num > mayor_parcial && (num%2) == 0){
                mayor_parcial = num;
            }
        }
        System.out.print(mayor_parcial);*/


        /*int menor_parcial = Integer.MAX_VALUE;
        System.out.println("Ingresa un Numero o una letra: ");
        while(turno.hasNextInt()){
            int num = turno.nextInt();
            if(num < menor_parcial){
                menor_parcial = num;
            }
        }
        System.out.print(menor_parcial);*/


        /*int menor_parcial = 0, count = 0, first = 0, second = 0;
        System.out.println("Ingresa un numero o una Letra: ");
        while(turno.hasNextInt()){
            int num = turno.nextInt();

            count += 1;
        }
        boolean noEsMenor = !(count < 2);
        if(noEsMenor)
            System.out.print(menor_parcial);*/

        /*
        *   8
            4
            7
            4
            5
            9
        * */

        // 8 4 7 4 5 9
//        int min = Integer.MAX_VALUE;        // 4
//        int secondMin = Integer.MAX_VALUE;  // 5
//
//        while (turno.hasNextInt()) {
//            int tmp = turno.nextInt(); // 9
//            if (tmp < min) {
//                secondMin = min;
//                min = tmp; //
//            } else if (tmp > min && tmp < secondMin) {
//                secondMin = tmp;
//            }
//        }
//
//        System.out.println(secondMin);


        //////////////////////
        //      Level 4     //
        //////////////////////

        // Leccion 6;

        // Ejercicio 1
        /*for(int i = 1; i <= 15; i++){
            boolean esPar = (i % 2) == 0;
            if(esPar) System.out.println(i);
        }*/

        // Ejercicio 2
        // Scanner scanner = new Scanner(System.in);
        // int start = scanner.nextInt();
        // int end = scanner.nextInt();
        // int multiple = scanner.nextInt();
        // int sum = 0;
        // for(int i = start; i < end; i++){
        //     boolean esMultiplo = (i%multiple) == 0;
        //     if(!esMultiplo) continue;
        //     sum+=i;
        // }
        // System.out.print("Suma: "+sum);


        // Leccion 7;

        // Ejercicio 1;
//        for(int i = 1; i<=10; i++){
//            if(i == 10) System.out.print(8888888888L);
//            else {
//                String temporal = "8".repeat(i);
//                int row = Integer.parseInt(temporal);
//                System.out.println(row);
//            }
//        }

        // Leccion 8;

        // Ejercicio 1;
//        String cadena = turno.nextLine();
//        int number = turno.nextInt();
//        if(number > 0 && number < 5 ){
//            int i = 1;
//            do{
//               System.out.println(cadena);
//               i++;
//            }
//            while(i <= number);
//        }
//        else {
//            System.out.print(cadena);
//        }

        // Leccion 9;

        // Ejercicio 1;
//        System.out.println("\nIngresa un Numero Entero Y Positivo: ");
//        int radio = turno.nextInt();
//        if( radio > 0) {
//           double pi = 3.14;
//           int area = (int)(pi*(radio*radio));
//           System.out.print(area);
//        }

        // Ejercicio 2;
//        int latas = turno.nextInt();
//        int persons = turno.nextInt();
//        double partes = 1.0 * latas / persons;
//        System.out.print(partes);



        // Leccion 10;

        // Ejercicio 1;
//        System.out.println("Ingresa La Velocidad del Viento en M/S: ");
//        int vientoEnMS = turno.nextInt();
//        double relacionKmH = 3.6;
//        int vientoKmH = (int) Math.round((vientoEnMS*relacionKmH));
//        System.out.print(vientoKmH);

        // Ejercicio 2;
//        System.out.println("Ingresa true o false: ");
//        double glass = 0.5;
//        boolean response = turno.nextBoolean();
//        System.out.print(response ? (int) Math.ceil(glass) : (int) Math.floor(glass));



    }
}