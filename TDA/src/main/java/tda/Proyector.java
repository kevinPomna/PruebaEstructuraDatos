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
class Proyector extends ElementoAula {
    private String marca;
    private int resolucion;

    public Proyector(String nombre) {
        super(nombre);
    }

    @Override
    public void pedirInformacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca del proyector: ");
        marca = scanner.nextLine();
        System.out.print("Ingrese la resolución del proyector: ");
        resolucion = scanner.nextInt();
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---------------------------\n----------------------\n Informacion de tu objeto creado");
        System.out.println("Marca: " + marca);
        System.out.println("Resolución: " + resolucion);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
}
