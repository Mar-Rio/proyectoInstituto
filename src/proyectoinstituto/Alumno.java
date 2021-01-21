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
public class Alumno extends Persona{
    
    private String grupo ="SINGRUPO";

    public Alumno(String nombre, String direccion, int añoNacimiento, 
            String grupo) {
        super(nombre, direccion, añoNacimiento);
    this.grupo = grupo;
    }

    public Alumno(String grupo) {
        super();
        this.grupo = grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.anyoNacimiento = añoNacimiento;
    }

    public String getGrupo() {
        return grupo;
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
                + ", añoNacimiento=" + anyoNacimiento + ", grupo=" + grupo +'}';
    }
   
}
