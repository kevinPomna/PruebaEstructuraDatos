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
class Escritorio extends ElementoAula {
    private String material;

    public Escritorio(String nombre) {
        super(nombre);
    }

    @Override
    public void pedirInformacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el material del escritorio: ");
        material = scanner.nextLine();
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("---------------------------\n----------------------\n Informacion de tu objeto creado");
        System.out.println("Material: " + material);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

