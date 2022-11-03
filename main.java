package Proyecto;

import java.util.Scanner;

public class main {

public static int puntosTactico=0, puntosLocura=0, puntosMiedo=0;
public static Scanner inputInt = new Scanner(System.in);
public static Scanner inputString = new Scanner(System.in);

	public static void main(String[] args) {
        boolean bucle = true;
        String agente, respuestaTest;
        int respuestaMenu;
        
        while (bucle){
            respuestaMenu = menu();
            switch (respuestaMenu){
                case 1:
                    test();
                    break;
                case 2:
                    mejorDuo();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    bucle = false;
                    break;
            }
        }
    }

    public static int menu(){
        boolean continuarBucle = true;
        int opcionMenu = 0;
        while (continuarBucle){
            System.out.println();
            System.out.println("TEST DE VALORANT");
            System.out.println("-----------------------------");
            System.out.println("\t1.- Test para ver agente eres");
            System.out.println("\t2.- ¿Cuál es el mejor duo con tu agente favorito?");
            System.out.println("\t3.- ¿Cuál es el mejor mapa según el agento?");
            System.out.println("\t4.- Medidor de rango");
            System.out.println("\t5.- Ver crédito");
            System.out.println("\t6.- Salir del programa");
            opcionMenu = inputInt.nextInt();
            System.out.println();
            if (opcionMenu < 7 && opcionMenu > 0){
                continuarBucle = false;
            }else{
                System.out.println("Introduce una opción válida.");
            }
        }
        return opcionMenu;
    }

    public static void test() {
        String agente="";
        int opcionTest, sexoUsuario;

        System.out.println();
        System.out.println("PRIMERA PREGUNTA");
        sexoUsuario = comprobarSexo();


        System.out.println();
        System.out.println("SEGUNDA PREGUNTA");
        System.out.println("Si ves un enemigo...");
        System.out.println("\t1.- Te escondes");
        System.out.println("\t2.- Le echas huevos");
        System.out.println("\t3.- Huyes cual ratita");
        opcionTest = inputInt.nextInt();
        calculoPuntuacion(opcionTest);


        System.out.println();
        System.out.println("TERCERA PREGUNTA");
        System.out.println("Si blabla un enemigo...");
        System.out.println("\t1.- Te escondes");
        System.out.println("\t2.- Le echas huevos");
        System.out.println("\t3.- Huyes cual ratita");
        opcionTest = inputInt.nextInt();
        calculoPuntuacion(opcionTest);


        System.out.println();
        System.out.println("CUARTA PREGUNTA");
        System.out.println("Si blabla un enemigo...");
        System.out.println("\t1.- Te escondes");
        System.out.println("\t2.- Le echas huevos");
        System.out.println("\t3.- Huyes cual ratita");
        opcionTest = inputInt.nextInt();
        calculoPuntuacion(opcionTest);


        System.out.println();
        System.out.println("QUINTA PREGUNTA");
        System.out.println("Si blabla un enemigo...");
        System.out.println("\t1.- Te escondes");
        System.out.println("\t2.- Le echas huevos");
        System.out.println("\t3.- Huyes cual ratita");
        opcionTest = inputInt.nextInt();
        calculoPuntuacion(opcionTest);

        
        if ( sexoUsuario == 1){
            agenteSexoHombre(puntosLocura, puntosMiedo, puntosTactico);
        }else if (sexoUsuario == 2) {
            agenteSexoMujer(puntosLocura, puntosMiedo, puntosTactico);
        }else{
            System.out.println("Porfavor, introduce un valor correcto la proxima vez.");
        }
    }

    //MÉTODOS GLOBALES

    public static int comprobarSexo(){
        int sexo;
        System.out.println("¿Cuál es tu sexo?");
        System.out.println("\t1.- Hombre");
        System.out.println("\t2.- Mujer");
        sexo = inputInt.nextInt();
        return sexo;
    }

    //MÉTODOS DE LA PRIMERA OPCIÓN DEL MENÚ
    public static void calculoPuntuacion(int opcionTest) {
        if (opcionTest == 1){
            puntosTactico++;
        }else if (opcionTest == 2){
            puntosLocura++;
        }else if (opcionTest == 3){
            puntosMiedo++;
        }
    }
    public static void agenteSexoHombre(int puntosLocura, int puntosMiedo, int puntosTactico){
        if (puntosLocura == 3){
            System.out.println("Locura");
        }else if (puntosMiedo == 3){
            System.out.println("Miedo");
        }else if (puntosTactico == 3){
            System.out.println("Táctico");
        }else {
            System.out.println("Equilibrado");
        }
    }

    public static void agenteSexoMujer(int puntosLocura, int puntosMiedo, int puntosTactico){
        if (puntosLocura == 3){
            System.out.println("Locura");
        }else if (puntosMiedo == 3){
            System.out.println("Miedo");
        }else if (puntosTactico == 3){
            System.out.println("Táctico");
        }else {
            System.out.println("Equilibrado");
        }
    }


    //MÉTODOS DE LA SEGUNDA OPCIÓN DEL MENÚ

    public static void mejorDuo(){
        int sexoUsuario, eleccionUsuarioInt;
        boolean continuar = true;
        System.out.println("Antes de comenzar: ");
        sexoUsuario = comprobarSexo();
        if (sexoUsuario == 1){
            while (continuar){
                menuAgenteHombre();
                eleccionUsuarioInt = inputInt.nextInt();

                switch(eleccionUsuarioInt){
                    case 1:
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("");
                        break;
                    default:
                        System.out.println("Elige una opción válida.");
                }

                continuar = continuarBucleDuo();
            }
        }else if(sexoUsuario == 2){
            while (continuar){
                menuAgenteMujer();
                eleccionUsuarioInt = inputInt.nextInt();

                switch(eleccionUsuarioInt){
                    case 1:
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    break;
                default:
                    System.out.println("Elige una opción válida.");
                }

                continuar = continuarBucleDuo();

            }
        }else{
            System.out.println("Porfavor, introduce un valor correcto la proxima vez.");
        }
    }

    public static void menuAgenteHombre(){
        System.out.println("AGENTES");
        System.out.println("-----------------");
        System.out.println("\t1.- Cypher");
        System.out.println("\t2.- Yoru");
        System.out.println("\t3.- KayO");
        System.out.println("\t4.- Brimstone");
        System.out.println("\t5.- Bridge");
    }

    public static void menuAgenteMujer(){
        System.out.println("AGENTES");
        System.out.println("-----------------");
        System.out.println("\t1.- Sage");
        System.out.println("\t2.- Raze");
        System.out.println("\t3.- Skye");
        System.out.println("\t4.- Astra");
        System.out.println("\t5.- KillJoy");
    }

    public static boolean continuarBucleDuo(){
        boolean respuesta;
        String eleccionUsuarioString, eleccionUsuarioStringLower;

        System.out.println("¿Quieres saber sobre otro agente? Si/No");
        eleccionUsuarioString = inputString.nextLine();
        eleccionUsuarioStringLower = eleccionUsuarioString.toLowerCase();
        if (eleccionUsuarioStringLower.equals("no")){
            respuesta = false;
            return respuesta;
        }else{
            respuesta = true;
            return respuesta;
        }
    }
}