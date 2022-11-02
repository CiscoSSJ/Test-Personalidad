package Proyecto;

import java.util.Scanner;

public class main {

public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
        boolean bucle = true;
        String agente;
        int respuestaMenu;
        
        while (bucle){
            respuestaMenu = menu();
            switch (respuestaMenu){
                case 1:
                    System.out.println("Prueba 1");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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
            System.out.println("1.- Test para ver agente eres");
            System.out.println("2.- ¿Cuál es el mejor duo con tu agente favorito?");
            System.out.println("3.- ¿Cuál es el mejor mapa según el agento?");
            System.out.println("4.- Medidor de rango");
            System.out.println("5.- Ver crédito");
            System.out.println("6.- Salir del programa");
            opcionMenu = input.nextInt();
            System.out.println();
            if (opcionMenu == 6){
                System.exit(0);
            }else if (opcionMenu < 6 && opcionMenu > 0){
                continuarBucle = false;
            }else{
                System.out.println("Introduce una opción válida.");
            }
        }
        return opcionMenu;
    }
}