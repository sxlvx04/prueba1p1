package com.mycompany.prueba1p1salvadormacias;

/**
 *
 * @author salvador macias
 */
import java.util.Scanner;

public class Prueba1p1salvadormacias {//inicio clase

    public static void main(String[] args) {//inicio main
        Scanner moly = new Scanner(System.in);
        boolean goku = true;//centinela utilizado para ciclo while
        int cont = 0;//inicializacion de contador
        do {//inicio ciclo do while
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("Bienvenido a mi primera prueba practica en Java, las opciones son las siguientes: ");
            System.out.println("1. Repetir mi nombre ");
            System.out.println("2. Submenu de mensajes ");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion disponible: ");
            int opc = moly.nextInt();
            cont++;//incremento contador
            switch (opc) {//inicio case

                case 1: {//inicio case 1
                    System.out.println("Cantidad de veces que se repetira el texto: ");
                    int rep = moly.nextInt();
                    String nom;
                    Scanner nombre = new Scanner(System.in);
                    System.out.println("Ingrese su nombre: ");
                    nom = nombre.nextLine();//nombre
                    for (int i = 1; i <= rep; i++) {
                        System.out.println("!Hola mi nombre es " + nom + " y miren mi prueba!");//rango repeticion
                    }

                }//fin case 1
                break;

                case 2: {//inicio case 2
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    System.out.println("Bienvenido al Submenu!");
                    System.out.println("Opciones disponibles: ");
                    System.out.println("1. Bienvenida ");
                    System.out.println("2. Despedida ");
                    System.out.println("3. Salir del submenu");
                    boolean goku2 = true;// centinela utilizado para abandonar el submenu
                    do {
                        int opc2 = moly.nextInt();
                        if (opc2 == 1) {

                            System.out.println("Bienvenid@ a mi menu, gracias por hacer uso de mi programa, espero sea de utilidad!");
                        } else if (opc2 == 2) {

                            System.out.println("Hasta luego, gracias por usar mi programa");
                        } else if (opc2 == 3) {
                            goku2 = false;
                        }

                    } while (goku2 != false);//fin while

                }//fin case 2
                break;

                case 3: {//inicio case 3
                    goku = false;
                }//fin case 3
                break;

                default:
                    System.out.println("Opcion ingresada no es valida");
            }//fin switch

        } while (goku != false);//fin while
        System.out.println(+cont + " veces se ingreso al menu principal ");//impresion de contador
        System.out.println("");
    }//fin main

}//fin clase
