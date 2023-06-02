/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda;

/**
 *
 * @author User
 */
abstract class ElementoAula {
    
    protected String nombre;

    public ElementoAula(String nombre) {
        this.nombre = nombre;
    }

    public abstract void pedirInformacion();

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
    }
    
    
}
