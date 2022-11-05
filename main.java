package Proyecto;

import java.util.Scanner;

public class main {

public static int puntosTactico=0, puntosLocura=0, puntosMiedo=0, testCompletado=0, sexo=0;
public static String agente;
public static Scanner inputInt = new Scanner(System.in);
public static Scanner inputString = new Scanner(System.in);

	public static void main(String[] args) {
        boolean bucle = true;
        String respuestaTest;
        int respuestaMenu;
        
        while (bucle){
            respuestaMenu = menu();
            switch (respuestaMenu){
                case 1:
                    if (testCompletado == 0){
                        test();
                    }else{
                        System.out.println("El test solo se puede completar una vez!");
                    }
                    break;
                case 2:
                    mejorDuo();
                    break;
                case 3:
                    if (testCompletado == 1){
                        mapa();
                    }else{
                        System.out.println("Para acceder a esta opción primero debes haber completado el test!");
                    }
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
            System.out.println("\t3.- Mejor mapa según el agente asignado en el test");
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
        int opcionTest;

        if (sexo == 0){
            System.out.println();
            comprobarSexo();
        }

        //FALTA POR COMPLETAR TEXTO
        System.out.println();
        System.out.println("Si ves un enemigo...");
        System.out.println("\t1.- Te escondes");
        System.out.println("\t2.- Le echas huevos");
        System.out.println("\t3.- Huyes cual ratita");
        opcionTest = inputInt.nextInt();
        calculoPuntuacion(opcionTest);


        System.out.println();
        System.out.println("Si blabla un enemigo...");
        System.out.println("\t1.- Te escondes");
        System.out.println("\t2.- Le echas huevos");
        System.out.println("\t3.- Huyes cual ratita");
        opcionTest = inputInt.nextInt();
        calculoPuntuacion(opcionTest);


        System.out.println();
        System.out.println("Si blabla un enemigo...");
        System.out.println("\t1.- Te escondes");
        System.out.println("\t2.- Le echas huevos");
        System.out.println("\t3.- Huyes cual ratita");
        opcionTest = inputInt.nextInt();
        calculoPuntuacion(opcionTest);


        System.out.println();
        System.out.println("Si blabla un enemigo...");
        System.out.println("\t1.- Te escondes");
        System.out.println("\t2.- Le echas huevos");
        System.out.println("\t3.- Huyes cual ratita");
        opcionTest = inputInt.nextInt();
        calculoPuntuacion(opcionTest);

        
        if ( sexo == 1){
            agenteSexoHombre(puntosLocura, puntosMiedo, puntosTactico);
        }else if (sexo == 2) {
            agenteSexoMujer(puntosLocura, puntosMiedo, puntosTactico);
        }else{
            System.out.println("Porfavor, introduce un valor correcto la próxima vez.");
        }

        testCompletado = 1;
    }

    //MÉTODOS GLOBALES

    public static int comprobarSexo(){
        System.out.println("¿Cuál es tu sexo?");
        System.out.println("\t1.- Hombre");
        System.out.println("\t2.- Mujer");
        sexo = inputInt.nextInt();
        System.out.println();
        if (sexo == 1 || sexo == 2){
            return sexo;
        }else{
            System.out.println("Porfavor, introduzca un valor correcto la próxima vez");
            return sexo=0;
        }
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
        if (puntosLocura == 4){
            agente = "Yoru";
            System.out.println("Te pareces mucho a " + agente + " porque estas un poco mal de la cabeza");
        }else if (puntosMiedo == 4){
            agente = "Sova";
            System.out.println("Eres un poco miedoso... te viene al pelo ser " + agente);
        }else if (puntosTactico == 4){
            agente = "Cypher";
            System.out.println("Pareces bastante táctico, tu serías " + agente + " seguro");
        }else {
            agente = "Chamber";
            System.out.println("Eres alguien bastante equilibrado, podrías ser " + agente);
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
        int eleccionUsuarioInt;
        boolean continuar = true;
        if (sexo != 0){
            if (sexo == 1){
                while (continuar){
                    menuAgenteHombre();
                    eleccionUsuarioInt = inputInt.nextInt();

                    switch(eleccionUsuarioInt){
                        case 1:
                        System.out.println("El mejor agente con Cypher es Astra, porque puedes defender un site ganando visión con tus cables mientras te apoyas en sus smokes");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("El mejor agente con Yoru es Sage, ya que puedes hacer jugadas agresivas con los tp's mientras ella cubre una zona con el muro.");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("El mejor agente con KayO es prácticamente cualquier duelista que pueda hacerle follow up en sus entrys");
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("El mejor agente con Brimstone es Bridge ya que aporta mucha utilidad saliendo a travéx de los smokes y con la mejora de velocidd pueden ganar un site rápidamente");
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("El mejor agente con Chamber... este personaje si quiera necesita compañia? Gana");
                        System.out.println();
                        break;
                    default:
                        System.out.println("Elige una opción válida.");
                        System.out.println();
                    }
                    
                    continuar = continuarBucleDuo();
                }
            }else if(sexo == 2){
                while (continuar){
                    menuAgenteMujer();
                    eleccionUsuarioInt = inputInt.nextInt();

                    //FALTA POR COMPLETAR TEXTO
                    switch(eleccionUsuarioInt){
                        case 1:
                            System.out.println("");
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("");
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("");
                            System.out.println();
                            break;
                        case 4:
                            System.out.println("");
                            System.out.println();
                            break;
                        case 5:
                            System.out.println("");
                            System.out.println();
                            break;
                        default:
                            System.out.println("Elige una opción válida.");
                            System.out.println();
                    }

                    continuar = continuarBucleDuo();
                    System.out.println();

                }
            }else{
                System.out.println("Porfavor, introduce un valor correcto la proxima vez.");
                System.out.println();
            }
        }else if(sexo == 0){
            System.out.println("Antes de comenzar: ");
            sexo = comprobarSexo();
            mejorDuo();
        }
    }

    public static void menuAgenteHombre(){
        System.out.println("AGENTES");
        System.out.println("-----------------");
        System.out.println("\t1.- Cypher");
        System.out.println("\t2.- Yoru");
        System.out.println("\t3.- KayO");
        System.out.println("\t4.- Brimstone");
        System.out.println("\t5.- Chamber");
        System.out.println();
    }

    public static void menuAgenteMujer(){
        System.out.println("AGENTES");
        System.out.println("-----------------");
        System.out.println("\t1.- Sage");
        System.out.println("\t2.- Raze");
        System.out.println("\t3.- Skye");
        System.out.println("\t4.- Astra");
        System.out.println("\t5.- KillJoy");
        System.out.println();
    }

    public static boolean continuarBucleDuo(){
        boolean respuesta;
        String eleccionUsuarioString, eleccionUsuarioStringLower;

        System.out.println("¿Quieres saber sobre otro agente? Si/No");
        eleccionUsuarioString = inputString.nextLine();
        eleccionUsuarioStringLower = eleccionUsuarioString.toLowerCase();
        System.out.println();
        if (eleccionUsuarioStringLower.equals("no")){
            respuesta = false;
            return respuesta;
        }else{
            respuesta = true;
            return respuesta;
        }
    }

    //MÉTODOS PARA LA TERCERA OPCIÓN DEL MENÚ

    public static void mapa(){
        if(agente.length() > 2){
            if(sexo == 0){
                comprobarSexo();
            }else{
                if(sexo == 1){
                    if(agente.equals("Yoru")){
                        System.out.println("El mejor mapa para " + agente + " es Breeze");
                    }else if(agente.equals("Sova")){
                        System.out.println("Con diferencia para " + agente + " es Ascend");
                    }else if(agente.equals("Cypher")){
                        System.out.println("Con " + agente + " eres bastante bueno en todos los mapas con lado defensor fuerte, pero sobre todo es Bind");
                    }else if(agente.equals("Chamber")){
                        System.out.println("En todos hijo, con " + agente + " en todos.");
                    }
                }
            }
        }else{
            System.out.println("Primero necesitas hacer el test para saber que a que agente te pareces");
        }
    }

    //MÉTODOS PARA LA CUARTA OPCIÓN DEL MENÚ
}