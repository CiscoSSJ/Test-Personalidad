package Boletin5;


import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

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
                    medidorRango();
                    break;
                case 5:
                    creditosCreador();
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
        System.out.println("Si ves un enemigo yendo por ti ¿ que haces ?");
        System.out.println("\t1.- Te escondes");
        System.out.println("\t2.- Sales a por el como un titan");
        System.out.println("\t3.- Huyes de el como una ratita");
        opcionTest = inputInt.nextInt();
        calculoPuntuacion(opcionTest);


        System.out.println();
        System.out.println("Si eres el unico de los 5 amigos que esta de pie, ¿Te enfrentas a ellos o no?");
        System.out.println("\t1.- Te escondes y llamas a tu padre");
        System.out.println("\t2.- Te quitas la camiseta y vas a por ellos");
        System.out.println("\t3.- Sales cagando leche");
        opcionTest = inputInt.nextInt();
        calculoPuntuacion(opcionTest);


        System.out.println();
        System.out.println(" Si el Phoenix se tira la ultimate, ¿ cual de las opciones haria tú?");
        System.out.println("\t1.- Te quedas en un esquinita escondido hasta que se acabe la ultimate");
        System.out.println("\t2.- Le echas huevos y vas a matarlo");
        System.out.println("\t3.- Huyes como una avestruz hasta que se acabe la ultimate");
        opcionTest = inputInt.nextInt();
        calculoPuntuacion(opcionTest);


        System.out.println();
        System.out.println("El Chamber utiliza la utlimate.....mmhh ¿ que harias tú?");
        System.out.println("\t1.- Utilizar el apoyo del equipo y esconderte");
        System.out.println("\t2.- Vas a por el sin pensarlo");
        System.out.println("\t3.- Huyes yendo al otro side");
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
        if (puntosLocura == 4){
            agente = "Jett";
            System.out.println("Te pareces mucho a " + agente + " porque estas un poco mal de la cabeza");
        }else if (puntosMiedo == 4){
            agente = "Fade";
            System.out.println("Eres un poco miedoso... te viene al pelo ser " + agente);
        }else if (puntosTactico == 4){
            agente = "Sage";
            System.out.println("Pareces bastante táctico, tu serías " + agente + " seguro");
        }else {
            agente = "Killjoy";
            System.out.println("Eres alguien bastante equilibrado, podrías ser " + agente);
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
                    case 6:
                        System.out.println("Volviendo al menú.");
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
                            System.out.println("El mejor agente para apoyar a la Sage es Yoru, ya que  podrias sorprender un poco con los tp´s de Yoru y los muros de Sage ");
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("El mejor agente que podria apoyar a la Raze sería la Astra, ya que podrías combinar ambas utilidades.");
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("Skye....hmmmm, el mejor agente para acompañarle sería la Reyna.");
                            System.out.println();
                            break;
                        case 4:
                            System.out.println("Astra....Raze sería una de las mejores opciones para apoyar a este personaje.");
                            System.out.println();
                            break;
                        case 5:
                            System.out.println("El mejor agente para apoyar a la killjoy podrian ser varios... por ejemplo el kayO o fade ya que tienen utilidades que te podrian dejar muerto de 1.");
                            System.out.println();
                            break;
                        case 6:
                            System.out.println("Volviendo al menú.");
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
        System.out.println("\t6.- Salir");
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
        System.out.println("\t6.- Salir");
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

    public static void medidorRango(){
        String continuarMedidorRango, continuarMedidorRangoLower;
        int puntuacion=0, eleccionUsuarioInt=0;

        System.out.println("El medidor de rango constirá en 3 breves preguntas que van a ir aumentando según avance el test.");
        System.out.println("¿Estás preparado? Si/No");
        continuarMedidorRango = inputString.nextLine();
        System.out.println();
        continuarMedidorRangoLower = continuarMedidorRango.toLowerCase();
        if (continuarMedidorRangoLower.equals("si")){
            System.out.println("Medidor de rango");
            System.out.println("----------------------");
            System.out.println("PRIMERA PREGUNTA");
            System.out.println("Si el equipo enemigo planta la spike que deben hacer (en orden)");
            System.out.println("\t1.- Matar a los enemigos, usar las utilidades, desactivar la spike");
            System.out.println("\t2.- Usar las utilizades, matar a los enemigos, desactivar la skipe");
            System.out.println("\t3.- Desactivar la spike, usar las utilizades, matar al enemigo");
            eleccionUsuarioInt = inputInt.nextInt();
            System.out.println();
            
            if (eleccionUsuarioInt == 1){
                System.out.println("ERROR!");
                System.out.println();
            }else if (eleccionUsuarioInt == 2){
                System.out.println("CORRECTO!");
                puntuacion++;
                System.out.println();
            }else if (eleccionUsuarioInt == 3){
                System.out.println("ERROR!");
                System.out.println();
            }else{
                System.out.println("Por introducir una respuesta invalida se te valorará como mal está pregunta.");
                System.out.println();
            }

            System.out.println("SEGUNDA PREGUNTA");
            System.out.println("Estás en 1 vs 1 contra el rival, tienes la spike y sabes que el está en la otra punta del mapa ¿Que haces?");
            System.out.println("\t1.- Vas a buscarlo y matarlo.");
            System.out.println("\t2.- Guardas arma para la siguiente ronda.");
            System.out.println("\t3.- Plantas la spike y te posiciones para cubrirla.");
            eleccionUsuarioInt = inputInt.nextInt();
            System.out.println();

            if (eleccionUsuarioInt == 1){
                System.out.println("ERROR!");
                System.out.println();
            }else if (eleccionUsuarioInt == 2){
                System.out.println("ERROR!");
                System.out.println();
            }else if (eleccionUsuarioInt == 3){
                System.out.println("CORRECTO!");
                puntuacion++;
                System.out.println();
            }else{
                System.out.println("Por introducir una respuesta invalida se te valorará como mal está pregunta.");
                System.out.println();
            }

            System.out.println("TERCERA PREGUNTA");
            System.out.println("Si todo tu equipo ha muerto, el equipo enemigo está en una ronda eco y solo quedas tú ¿Que haces?");
            System.out.println("\t1.- Guardas arma para la siguiente ronda.");
            System.out.println("\t2.- Vas a matar al equipo enemigo.");
            System.out.println("\t3.- Intentas sacar alguna kill para después retroceder.");
            eleccionUsuarioInt = inputInt.nextInt();
            System.out.println();

            if (eleccionUsuarioInt == 1){
                System.out.println("CORRECTO!");
                puntuacion++;
                System.out.println();
            }else if (eleccionUsuarioInt == 2){
                System.out.println("ERROR!");
                System.out.println();
            }else if (eleccionUsuarioInt == 3){
                System.out.println("ERROR!");
                System.out.println();
            }else{
                System.out.println("Por introducir una respuesta invalida se te valorará como mal está pregunta.");
                System.out.println();
            }

            if (puntuacion == 3){
                System.out.println("Eres un Radiant!");
            }else if (puntuacion == 2){
                System.out.println("Eres un simple Platino");
            }else if( puntuacion == 1){
                System.out.println("No te pongo menos rango porque no existe... Hierro");
            }else{
                System.out.println("Ha surgido un error.");
            }
        }
        else if (continuarMedidorRangoLower.equals("no")){
            System.out.println("Vale, pues te pasamos de nuevo con el menú.");
            System.out.println();
        }else {
            System.out.println("Introduce una opción correcta la próxima vez.");
            System.out.println();
        }
    } 

    public static void creditosCreador(){
        System.out.println("Los autores de este maravilloso programa son:");
        System.out.println("Francisco Diaz Pozuelo (Cisco)");
        System.out.println("Abdel'lah Achiban Kaddouri (Hasbullah)");
    }
}