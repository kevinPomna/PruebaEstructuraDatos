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
public class Pizarra extends ElementoAula {

    private String color;

    public Pizarra(String nombre) {
        super(nombre);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---------------------------\n----------------------\n Informacion de tu objeto creado");
        System.out.println("Color: " + color);
    }

    @Override
    public void pedirInformacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el color de la pizarra: ");
        color = scanner.nextLine();

    }
}
