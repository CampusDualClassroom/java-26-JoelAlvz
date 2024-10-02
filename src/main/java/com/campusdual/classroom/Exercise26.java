package com.campusdual.classroom;


import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {

        Contact c1 = new Contact("Fernando Miguel","Juan de los Santos Requejo León","12" );
        System.out.println(c1.concatenar());

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            System.out.println("Elige una opción");
            System.out.println("1. Llamar a mi número");
            System.out.println("2. Llamar otro numero");
            System.out.println("3. Detalles de contacto");
            System.out.println("4. Salir");

            int eleccion = sc.nextInt();
            switch (eleccion){
                case 1:
                    c1.callMyNumber();
                    break;
                case 2:
                    String num = sc.nextLine();
                    c1.callOtherNumber(num);
                    break;
                case 3:
                    c1.showContactDetails();
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }
    }
}
