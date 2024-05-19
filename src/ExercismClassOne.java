import java.util.Locale;

public class ExercismClassOne {
    //        //////////
    //        Log Levels
    //        //////////

    //        Ejercicio 1;
//    public static String message(String logLine) {
//        int indiceInicial;
//        if(logLine.startsWith("[WARNING]:")) {
//            indiceInicial = "[WARNING]: ".length();
//        }
//        else if(logLine.startsWith("[INFO]:")){
//            indiceInicial = "[INFO]: ".length();
//        }
//        else {
//            indiceInicial = "[ERROR]: ".length();
//        }
//        return logLine.substring(indiceInicial).trim();
//    }


        // Ejercicio 2;
//    public static String logLevel(String logLine) {
//        int ultimo_indice = logLine.lastIndexOf("]");
//        String newLogLine = logLine.substring(1, ultimo_indice);
//        return newLogLine.toLowerCase();
//    }

//    Ejercicio 3;
//    public static String reformat(String logLine) {
//        String nivel = logLevel(logLine);
//        String mensaje = message(logLine);
//        return String.format("%s (%s)", mensaje, nivel);
//    }


//    //////////////////////
//    Annalyn's Infiltration
//    //////////////////////

//    Ejercicio 1;
//    public static boolean canFastAttack(boolean knightIsAwake) {
//        boolean response = knightIsAwake ? false : true;
//        return response;
//    }

//    Ejercicio 2;
//    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
//        String temporal = String.format("%s, %s, %s", knightIsAwake, archerIsAwake, prisonerIsAwake);
//        return temporal.contains("true");
//    }


//    Ejercicio 3;
//    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
//        return (archerIsAwake != true && prisonerIsAwake);
//    }

//    Ejercicio 4;
     public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
         return (!archerIsAwake && (prisonerIsAwake || petDogIsPresent));
     }
}
