/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda;

import java.util.Scanner;

/**
 *
 * @author User
 */
class Ventilador extends ElementoAula {
    private int velocidad;
    private boolean estaEncendido;

    public Ventilador(String nombre) {
        super(nombre);
    }

    @Override
    public void pedirInformacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la velocidad del ventilador (1-3): ");
        velocidad = scanner.nextInt();
        System.out.print("¿El ventilador está encendido? (si/no): ");
        String respuesta = scanner.next();
        estaEncendido = respuesta.equalsIgnoreCase("si");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---------------------------\n----------------------\n Informacion de tu objeto creado");
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Encendido: " + (estaEncendido ? "si" : "no"));
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }
}
