import java.util.Scanner;

public class main {

//Creación e inicialización de variables y objetos globales
public static int puntosTactico=0, puntosLocura=0, puntosMiedo=0, testCompletado=0, sexo=0;
public static String agente;
public static Scanner inputInt = new Scanner(System.in);
public static Scanner inputString = new Scanner(System.in);

	
	public static void main(String[] args){
        //Creación e inicialización de variables
        boolean bucle = true;
        int respuestaMenu;
        
        /*Entra en un bucle que llama a un método que muestra un menú y devuelve un int como opción 
        esa opción la utiliza para entrar en un switch y hacer la opción en función a lo que eliga el usuario
        en el caso de que la opción sea 8 le da a la variable booleana bucle el valor de false y sale del bucle en la siguiente iteración*/
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
                    mostrarAgenteAleatorio();
                    break;
                case 6:
                    rangoAleatorio();
                    break;
                case 7:
                    creditosCreador();
                    break;
                case 8:
                    valoracionFinal();
                    bucle = false;
                    break;
            }
        }
    }

	/**
	 * Muestra un menú y pide al usuario que elija una opción
	 * @return Devuelve la opción elegida por el usuario
	 */
    public static int menu(){
    	//Creación e inicialización de variables
        boolean continuarBucle = true;
        String opcionMenuString;
        int opcionMenu = 0;

        while (continuarBucle){
            System.out.println();
            System.out.println("TEST DE VALORANT");
            System.out.println("-----------------------------");
            System.out.println("\t1.- Test para ver agente eres");
            System.out.println("\t2.- ¿Cuál es el mejor duo con tu agente favorito?");
            System.out.println("\t3.- Mejor mapa según el agente asignado en el test");
            System.out.println("\t4.- Medidor de rango");
            System.out.println("\t5.- Muestra agente aleatorio");
            System.out.println("\t6.- Acertar rango aleatorio");
            System.out.println("\t7.- Ver créditos");
            System.out.println("\t8.- Salir del programa");
            //Captura una excepción si el formato del dato introducido no es INT
            try {
                opcionMenuString = inputString.nextLine();
                Integer opcionMenuInt = Integer.parseInt(opcionMenuString);
                opcionMenu = opcionMenuInt;
            }catch(NumberFormatException ex){
            }
            
            System.out.println();

            //Comprueba que la opción introducida este dentro del rango mostrado. (1-8)
            if (opcionMenu <= 8 && opcionMenu > 0){
                //Si lo cumple acaba el bucle
                continuarBucle = false;
            }else{
                //Si la opción no cumple muestra un mensaje error
                System.out.println("Introduce una opción válida.");
            }
        }
        //Devuelve la opción del menú
        return opcionMenu;
    }

    /**
     * Llama a un método que te pregunta cual es tu sexo, si este método a sido llamado previamente
     * lo ignora y 
     * Va pasando por preguntas y preguntando la respuesta, dependiendo de esta la pasa como parámetro
     * a otro métodos
     * Luego muestra el personaje que te corresponda en función de tu sexo
     */
    public static void test(){
    	//Creación e inicialización de variables
        String opcionString;
        int opcionTest;

        //Comproba que el método comprobarSexo no se haya llamado en otro momento, si no es así lo llama
        if ( sexo == 0){
            System.out.println();
            comprobarSexo();
        }

        //PRIMERA PREGUNTA
        System.out.println();
        System.out.println("Si ves un enemigo yendo por ti ¿ que haces ?");
        System.out.println("\t1.- Te escondes");
        System.out.println("\t2.- Sales a por el como un titan");
        System.out.println("\t3.- Huyes de el como una ratita");
        //Captura una excepción si el formato del dato introducido no es INT
        try {
            opcionString = inputString.nextLine();
            Integer opcionInt = Integer.parseInt(opcionString);
            opcionTest = opcionInt;
            calculoPuntuacion(opcionTest);
            System.out.println();
        }catch(NumberFormatException ex){
        }



        System.out.println();
        System.out.println("Si eres el unico de los 5 amigos que esta de pie, ¿Te enfrentas a ellos o no?");
        System.out.println("\t1.- Te escondes y llamas a tu padre");
        System.out.println("\t2.- Te quitas la camiseta y vas a por ellos");
        System.out.println("\t3.- Sales cagando leche");
        //Captura una excepción si el formato del dato introducido no es INT
        try {
            opcionString = inputString.nextLine();
            Integer opcionInt = Integer.parseInt(opcionString);
            opcionTest = opcionInt;
            calculoPuntuacion(opcionTest);
            System.out.println();
        }catch(NumberFormatException ex){
        }


        System.out.println();
        System.out.println(" Si el Phoenix se tira la ultimate, ¿ cual de las opciones haria tú?");
        System.out.println("\t1.- Te quedas en un esquinita escondido hasta que se acabe la ultimate");
        System.out.println("\t2.- Le echas huevos y vas a matarlo");
        System.out.println("\t3.- Huyes como una avestruz hasta que se acabe la ultimate");
        //Captura una excepción si el formato del dato introducido no es INT
        try {
            opcionString = inputString.nextLine();
            Integer opcionInt = Integer.parseInt(opcionString);
            opcionTest = opcionInt;
            calculoPuntuacion(opcionTest);
            System.out.println();
        }catch(NumberFormatException ex){
        }


        System.out.println();
        System.out.println("El Chamber utiliza la utlimate.....mmhh ¿ que harias tú?");
        System.out.println("\t1.- Utilizar el apoyo del equipo y esconderte");
        System.out.println("\t2.- Vas a por el sin pensarlo");
        System.out.println("\t3.- Huyes yendo al otro side");
        //Captura una excepción si el formato del dato introducido no es INT	
        try {
            opcionString = inputString.nextLine();
            Integer opcionInt = Integer.parseInt(opcionString);
            opcionTest = opcionInt;
            calculoPuntuacion(opcionTest);
            System.out.println();
        }catch(NumberFormatException ex){
        }

        
     	//Muestra el personaje que sea más acorde según las respuestas dependiendo del sexo del usuario
        if ( sexo == 1){
            agenteSexoHombre(puntosLocura, puntosMiedo, puntosTactico);
        }else if (sexo == 2) {
            agenteSexoMujer(puntosLocura, puntosMiedo, puntosTactico);
        }else{
            System.out.println("Porfavor, introduce un valor correcto la próxima vez.");
        }

        //Esta variable se usará para que no se pueda acceder al test más de una vez.
        testCompletado = 1;
    }


    public static int comprobarSexo(){
        //Declaración e inicialización de variables 
        String sexoString;
        boolean continuar = true;

        //Bucle que continua hasta que la variable continuar sea false
        while (continuar){
            System.out.println("¿Cuál es tu sexo?");
            System.out.println("\t1.- Hombre");
            System.out.println("\t2.- Mujer");
            //Captura una excepción si el formato del dato introducido no es INT
            try {
                sexoString = inputString.nextLine();
                Integer sexoInt = Integer.parseInt(sexoString);
                sexo = sexoInt;
                System.out.println();
            }catch(NumberFormatException ex){
            }
            
            /*Comprueba que el sexo sea 1 o 2, si es mayor o menor muestra un mensaje de error
            * e iguala sexo a 0
            */
            if (sexo < 1 || sexo > 2){
                System.out.println("Porfavor, introduzca un valor correcto la próxima vez");
                System.out.println();
                sexo=0;
            }else if (sexo >= 1 || sexo <= 2){
                //Finaliza el bucle
                continuar = false;
            }
        }
        //Devuelve el valor de sexo
        return sexo;
    }

    //MÉTODOS DE LA PRIMERA OPCIÓN DEL MENÚ
    /**
     * Contiene un condicional que suma un punto dependiendo de la opciòn introducida por el usuario.
     * @param opcionTest Parámetro introducido en la llamada 
     */
    public static void calculoPuntuacion(int opcionTest) {
        if (opcionTest == 1){
            puntosTactico++;
        }else if (opcionTest == 2){
            puntosLocura++;
        }else if (opcionTest == 3){
            puntosMiedo++;
        }else{
            System.out.println("Parece que ha habido algún fallo.");
        }
    }
    /**
     * Condición que dependiendo de tu puntuación en el test devuelve la variable agente con un valor u otro
     * @param puntosLocura Es una variable con valores entre 0 y 4 la cual se incrementa desde el método calculoPuntuacion()
     * @param puntosMiedo Es una variable con valores entre 0 y 4 la cual se incrementa desde el método calculoPuntuacion()
     * @param puntosTactico Es una variable con valores entre 0 y 4 la cual se incrementa desde el método calculoPuntuacion()
     */
    public static void agenteSexoHombre(int puntosLocura, int puntosMiedo, int puntosTactico){
        //Si los puntos de locura son mayor o igual que 3 muestra tu agente
        if (puntosLocura >= 3){
            agente = "Yoru";
            System.out.println("Te pareces mucho a " + agente + " porque estas un poco mal de la cabeza");
        //Si los puntos de miedo son mayor o igual que 3 muestra tu agente
        }else if (puntosMiedo >= 3){
            agente = "Sova";
            System.out.println("Eres un poco miedoso... te viene al pelo ser " + agente);
        //Si los puntos de tactica son mayor o igual que 3 muestra tu agente
        }else if (puntosTactico >= 3){
            agente = "Cypher";
            System.out.println("Pareces bastante táctico, tu serías " + agente + " seguro");
        //Si no se cumple ninguno se te toma por equilibrado.
        }else {
            agente = "Chamber";
            System.out.println("Eres alguien bastante equilibrado, podrías ser " + agente);
        }
    }

    /**
     * Condición que dependiendo de tu puntuación en el test devuelve la variable agente con un valor u otro
     * @param puntosLocura Es una variable con valores entre 0 y 4 la cual se incrementa desde el método calculoPuntuacion()
     * @param puntosMiedo Es una variable con valores entre 0 y 4 la cual se incrementa desde el método calculoPuntuacion()
     * @param puntosTactico Es una variable con valores entre 0 y 4 la cual se incrementa desde el método calculoPuntuacion()
     */
    public static void agenteSexoMujer(int puntosLocura, int puntosMiedo, int puntosTactico){
        //Si los puntos de locura son mayor o igual que 3 muestra tu agente
        if (puntosLocura == 4){
            agente = "Jett";
            System.out.println("Te pareces mucho a " + agente + " porque estas un poco mal de la cabeza");
        //Si los puntos de miedo son mayor o igual que 3 muestra tu agente
        }else if (puntosMiedo == 4){
            agente = "Fade";
            System.out.println("Eres un poco miedoso... te viene al pelo ser " + agente);
        //Si los puntos de tactica son mayor o igual que 3 muestra tu agente
        }else if (puntosTactico == 4){
            agente = "Sage";
            System.out.println("Pareces bastante táctico, tu serías " + agente + " seguro");
        //Si no se cumple ninguno se te toma por equilibrado.
        }else {
            agente = "Killjoy";
            System.out.println("Eres alguien bastante equilibrado, podrías ser " + agente);
        }
    }


    //MÉTODOS DE LA SEGUNDA OPCIÓN DEL MENÚ

    /** 
    * Método que comprueba tu sexo y dependiendo de este y el agente que elijas a través de
    * menú te indicará cual es el mejor dúo con tu agente.
    */
    public static void mejorDuo(){
        //Creación e inicialización de variables
        int eleccionUsuarioInt;
        boolean continuar = true;

        /*Comprobación para asegurarnos que el sexo no se haya introducido a través de otro método
        si no se ha introducido te lo pide y después continúa, en caso contrario simplemente continúa
        dependiendo de tu sexo*/

        //Comprueba si se ha introducido el sexo previamente
        if (sexo >= 1 && sexo <= 2){
            //Si se ha introducido el sexo entra en la condición
            if (sexo == 1){
                //Entra en un bucle que continuar hasta que la variable continuar sea false
                while (continuar){
                    //Llamada al método menuAgenteHombre
                    menuAgenteHombre();
                    //Recoge la elección del usuario
                    eleccionUsuarioInt = inputInt.nextInt();

                    /*Dependiendo de la opción entra en un case u otro indicando cual sería el mejor agente
                    con el agente seleccionado previamente.*/
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
                //Si se ha introducido el sexo entra en la condición
                while (continuar){
                    //Llamada al método menuAgenteHombre
                    menuAgenteMujer();
                    //Recoge la elección del usuario
                    eleccionUsuarioInt = inputInt.nextInt();

                    /*Dependiendo de la opción entra en un case u otro indicando cual sería el mejor agente
                    * con el agente seleccionado previamente.
                    */ 
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

                    //Llamada al método continuarBucleDuo que retorna true o false
                    continuar = continuarBucleDuo();
                    System.out.println();

                }
            //Si hay algún valor incorrecto salta este error
            }else{
                System.out.println("Parece que ha sucedido algún error con tu sexo.");
                System.out.println();
            }
        //Si no se ha preguntado el sexo te lo pregunta y luego continúa
        }else if(sexo == 0){
            System.out.println("Antes de comenzar: ");
            //Llamada al método comprobarSexo()
            sexo = comprobarSexo();
            mejorDuo();
        }
    }

    //Método que muestra un menú de los agentes masculinos
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

    //Método que muestra un menú de los agentes femeninos
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

    /**
     * Método que pregunta si quieres saber sobre otro agente
     * @return Devuelve true o false dependiendo si se continúa en el bucle o no
     */
    public static boolean continuarBucleDuo(){
        //Creación e inicialización de variables
        boolean respuesta;
        String eleccionUsuarioString, eleccionUsuarioStringLower;

        //Recoge la elección del usuario y lo pasa a minúsculas
        System.out.println("¿Quieres saber sobre otro agente? Si/No");
        eleccionUsuarioString = inputString.nextLine();
        //Pasa a minúsculas todo el String de eleccionUsuarioString y lo mete a la variable eleccionUsuarioStringLower
        eleccionUsuarioStringLower = eleccionUsuarioString.toLowerCase();
        System.out.println();
        //Condición que dependiendo de lo respondido previamente asigna a respuesta true o false
        if (eleccionUsuarioStringLower.equals("no")){
            respuesta = false;
        }else{
            respuesta = true;
        }
        //Devuelve el valor de respuesta
        return respuesta;
    }

    //MÉTODOS PARA LA TERCERA OPCIÓN DEL MENÚ

    /** Método que muestra el mapa dependiendo de el agente que se te haya asignado en el test,
    * comprueba que se haya asignado un agente, si no es así te devuelve al menú indicandote que tienes que hacer el test primero
    * comprueba que el sexo sea 0, si es así te lo pregunta, si no sigue con el siguiente paso
    * dependiendo de tu sexo y tu agente muestra un mapa u otro
    */
    public static void mapa(){
        //Comprueba la longitud del agente
        if(agente.length() > 2){
            //Comprueba que el sexo sea distinto a 0
            if(sexo == 0){
                //Llamda al método comprobarSexo
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
                }else if(sexo == 2){
                    if(agente.equals("Jett")){
                        System.out.println("El mejor mapa para " + agente + " es Breeze");
                    }else if(agente.equals("Fade")){
                        System.out.println("Con diferencia para " + agente + " es Ascend");
                    }else if(agente.equals("Sage")){
                        System.out.println("Con " + agente + " eres bastante buena en todos los mapas con lado defensor fuerte, pero sobre todo es Bind");
                    }else if(agente.equals("KillJoy")){
                        System.out.println("En todos hija, con " + agente + " en todos.");
                    }
                }
            }
        }else{
            System.out.println("Primero necesitas hacer el test para saber que a que agente te pareces");
        }
    }

    //MÉTODOS PARA LA CUARTA OPCIÓN DEL MENÚ

    /** Método que consiste en 3 simples preguntas que dependiendo de las que aciertas tienes 1 rango u otro.
    *
    */
    public static void medidorRango(){
        String continuarMedidorRango, continuarMedidorRangoLower;
        int puntuacion=0, eleccionUsuarioInt=0;
        boolean continuar = true;

        System.out.println("El medidor de rango constirá en 3 breves preguntas que van a ir aumentando según avance el test.");
        //Mientras que la variable continuar sea true se mantendrá el bucle
        while (continuar){
            System.out.println("¿Estás preparado? Si/No");
            //Recoge la respuesta del usuario
            continuarMedidorRango = inputString.nextLine();
            System.out.println();
            //La pasa a minúscula y la mete dentro de continuarMedidorRangoLower
            continuarMedidorRangoLower = continuarMedidorRango.toLowerCase();
            //Condición que comprueba si la respuesta del usuario es si o no y respectivamente ejecuta una acción u otra
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
                    continuar = false;
                }else if (puntuacion == 2){
                    System.out.println("Eres un simple Platino");
                    continuar = false;
                }else if( puntuacion == 1){
                    System.out.println("No te pongo menos rango porque no existe... Hierro");
                    continuar = false;
                }else{
                    System.out.println("Ha surgido un error.");
                    continuar = false;
                }
            }
            else if (continuarMedidorRangoLower.equals("no")){
                System.out.println("Vale, pues te pasamos de nuevo con el menú.");
                System.out.println();
                continuar = false;
            //En caso que no responda correctamente salta este error y le devuelve al comienzo del bucle
            }else {
                System.out.println("Introduce una opción correcta la próxima vez.");
                System.out.println();
            }
        }
    } 

    //NÉTODOS QUINTA OPCIÓN

    /**
    * Método que de un array de 10 String mostrará 1 aleatorio 
    */
    public static void mostrarAgenteAleatorio(){
        //Declaración e inicialización de variables
        int random;
        String[] agenteAleatorio = new String[] {"Cypher","Yoru","KayO","Brimstone","Chamber","Sage","Raze","Skye","Astra","KillJoy"};
        //Genera número aleatorio entre 0 y 9
        random = (int) (Math.random()*(9+0)+1);
        System.out.println("Te ha tocado " + agenteAleatorio[random]);
    }

    //MÉTODOS SEXTA OPCIÓN

    /**
    * Método que de un array con 9 String seleccionará 1 aleatorio y el usuario tiene que intentar adivinarlo mostrandole por pantalla la lista de los 9
    */
    public static void rangoAleatorio(){
        //Declaración e inicialización de variables
        int random;
        String rangoUsuario;
        String[] rangoAleatorio = new String[] {"hierro","bronce","plata","oro","platino","diamante","ascendente","inmortal","radiante"};
        //Genera número aleatorio entre 0 y 8
        random = (int) (Math.random()*(8+0)+1);

        //Muestra uns lista con todos los rangos
        System.out.println("Lista de rangos");
        System.out.println("---------------");
        for(String mostrarArray :rangoAleatorio){
            System.out.println(mostrarArray);
        }
        System.out.println();
        
        //Pide al usuario que introduzca el rango y convierte todo el String en minúscula
        System.out.println("¿Que rango crees que es?");
        rangoUsuario = inputString.nextLine().toLowerCase();
        System.out.println();

        //Bucle al que entrará si el usuario no acierta en el primer intento y no se saldrá de este hasta que no acierte
        while (!rangoAleatorio[random].equals(rangoUsuario)){
            System.out.println("Intentalo de nuevo");
            rangoUsuario = inputString.nextLine().toLowerCase();
            System.out.println();
        }

        System.out.println("Enhorabuena!");
    }

    //MÉTODOS SEPTIMA OPCIÓN

    //Método que muestra los autores del programa
    public static void creditosCreador(){
        System.out.println("Los autores de este maravilloso programa son:");
        System.out.println("Francisco Diaz Pozuelo (Cisco)");
        System.out.println("Abdel'lah Achiban Kaddouri (Hasbullah)");
    }

    //MÉTODOS OCTAVA OPCIÓN

    //Método que pone al usuario en una situación aparatosa pidiendo una valoración del programa
    public static void valoracionFinal(){
        //Declaración e inicialización de la variable
        int respuestaUsuario=0, respuestaUsuarioSi;
        String respuestaUsuarioInt;
        boolean continuarPrimerBucle = true, continuarSegundoBucle = true;

        //Bucle que continúa mientras que el usuario no introduzca una opción válida
        while (continuarPrimerBucle){
            System.out.println();
            System.out.println("Gracias por visitar nuestro programa!");
            System.out.println("Con una simple valoración nos ayudas mucho a mejorar ¿Tendrías 30 segundos para nosotros?");
            System.out.println("\t1.- Si");
            System.out.println("\t2.- No");
            //Captura una excepción si el formato del dato introducido no es INT
            try {
                respuestaUsuarioInt = inputString.nextLine();
                Integer opcionMenuInt = Integer.parseInt(respuestaUsuarioInt);
                respuestaUsuario = opcionMenuInt;
                continuarPrimerBucle=false;
                System.out.println();
            }catch(NumberFormatException ex){
            }
        }

        //Bucle que continúa mientras que continuarSegundoBucle sea verdadero
        while (continuarSegundoBucle){
            //Condicion que dependiendo de la opción del usuario te pregunta la valoración que le das al programa o se despide
            if (respuestaUsuario == 1){
                System.out.println("Del 1 al 10 como valorarías el programa.");
                respuestaUsuarioSi = inputInt.nextInt();
                System.out.println();
                //Condición que dependiendo del número de tu valoración te muestra un mensaje u otro
                if (respuestaUsuarioSi >=7 && respuestaUsuarioSi <= 10){
                    System.out.println("Muchas gracias!, nos alegramos que te haya gustado.");
                    continuarSegundoBucle = false;
                }else if (respuestaUsuarioSi < 7 && respuestaUsuarioSi >= 3){
                    System.out.println("Vaya.. seguro que tenemos muchas cosas que mejorar.");
                    continuarSegundoBucle = false;
                }else if (respuestaUsuarioSi < 3 && respuestaUsuarioSi >= 0){
                    System.out.println("Pues parece que has estado perdiendo el tiempoo con nosotros...");
                    continuarSegundoBucle = false;
                }else{
                    //Comprueba que el número sea entre 1 y 10
                    System.out.println("Por favor, introduce una valoración entre 1 y 10.");
                }
            }else if(respuestaUsuario == 2 ){
                System.out.println("Ten un buen día!");
                continuarSegundoBucle = false;
            // Comprueba que introduzca unas opción válida.
            }else{
                System.out.println("Por favor, introduce una opción válida.");
                continuarSegundoBucle = false;
            }
        }
    }
}