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
class ComputadoraDeMesa extends ElementoAula {
    private String marca;
    private String modelo;
    private int capacidadAlmacenamiento;

    public ComputadoraDeMesa(String nombre) {
        super(nombre);
    }

    @Override
    public void pedirInformacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca de la computadora de escritorio: ");
        marca = scanner.nextLine();
        System.out.print("Ingrese el modelo de la computadora de escritorio: ");
        modelo = scanner.nextLine();
        System.out.print("Ingrese la capacidad de almacenamiento de la computadora de escritorio (en GB): ");
        capacidadAlmacenamiento = scanner.nextInt();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("---------------------------\n----------------------\n Informacion de tu objeto creado");
        super.mostrarInformacion();
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidad de almacenamiento: " + capacidadAlmacenamiento + " GB");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }
}
