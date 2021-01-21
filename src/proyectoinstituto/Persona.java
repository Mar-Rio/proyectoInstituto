/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoinstituto;

/**
 *
 * @author cosca
 */
public class Persona {

    protected String nombre,
            direccion;
    protected int anyoNacimiento;

    public Persona(String nombre, String direccion, int añoNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.anyoNacimiento = añoNacimiento;
    }

    public Persona() {
        this.nombre = "";
        this.direccion = "";
        this.anyoNacimiento = 0;
    }
    
    

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion 
                + ", añoNacimiento=" + anyoNacimiento + '}';
    }

}
