/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instancias creadas automaticamen por el usuario tal como pidio
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("'''Welcome''' preciona enter para crear tu objeto: ");
            String nombreElemento = scanner.nextLine();

            System.out.println("Clases disponibles para instanciar:");
            System.out.println("1. Pizarra");
            System.out.println("2. Proyector");
            System.out.println("3. Ventilador");
            System.out.println("4. Computadora de Mesa");
            System.out.println("5. Laptop");
            System.out.println("6. Escritorio");
            System.out.println("7. Silla");
            System.out.print("Seleccione el 'Numero' correspondiente a la clase que desea instanciar (0 para salir): ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            ElementoAula elementoAula = null;

            switch (opcion) {
                case 1:
                    elementoAula = new Pizarra(nombreElemento);
                    break;
                case 2:
                    elementoAula = new Proyector(nombreElemento);
                    break;
                case 3:
                    elementoAula = new Ventilador(nombreElemento);
                    break;
                case 4:
                    elementoAula = new ComputadoraDeMesa(nombreElemento);
                    break;
                case 5:
                    elementoAula = new Laptop(nombreElemento);
                    break;
                case 6:
                    elementoAula = new Escritorio(nombreElemento);
                    break;
                case 7:
                    elementoAula = new Silla(nombreElemento);
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    continue;
            }

            if (elementoAula != null) {
                elementoAula.pedirInformacion();
                elementoAula.mostrarInformacion();
            }
        }
        
        /*
        //Instancia creada normalmente
        Pizarra pizarra = new Pizarra("Pizarra");
        Proyector proyector = new Proyector("Proyector");
        Ventilador ventilador = new Ventilador("Ventilador");
        ComputadoraDeMesa computadora = new ComputadoraDeMesa("Computadora");
        Laptop laptop = new Laptop("Laptop");
        Escritorio escritorio = new Escritorio("Escritorio");
        Silla silla = new Silla("Silla");

        pizarra.pedirInformacion();
        pizarra.mostrarInformacion();

        proyector.pedirInformacion();
        proyector.mostrarInformacion();

        ventilador.pedirInformacion();
        ventilador.mostrarInformacion();

        computadora.pedirInformacion();
        computadora.mostrarInformacion();

        laptop.pedirInformacion();
        laptop.mostrarInformacion();

        escritorio.pedirInformacion();
        escritorio.mostrarInformacion();

        silla.pedirInformacion();
        silla.mostrarInformacion();

        */
    }
}
