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
class Laptop extends ElementoAula {
    private String marca;
    private String modelo;
    private double tamañoPantalla;

    public Laptop(String nombre) {
        super(nombre);
    }

    @Override
    public void pedirInformacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca de la laptop: ");
        marca = scanner.nextLine();
        System.out.print("Ingrese el modelo de la laptop: ");
        modelo = scanner.nextLine();
        System.out.print("Ingrese el tamaño de pantalla de la laptop (en pulgadas): ");
        tamañoPantalla = scanner.nextDouble();
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---------------------------\n----------------------\n Informacion de tu objeto creado");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamaño de Pantalla: " + tamañoPantalla + " pulgadas");
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

    public double getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }
}
