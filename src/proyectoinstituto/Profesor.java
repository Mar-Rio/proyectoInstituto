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
public class Profesor extends Persona {
    private String departamento;
    private int anyo;

    public Profesor(String departamento, int anyo) {
        super();
        this.departamento = departamento;
        this.anyo = anyo;
    }

    public Profesor( String nombre, String direccion, int añoNacimiento,
            String departamento, int anyo) {
        super(nombre, direccion, añoNacimiento);
        this.departamento = departamento;
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Profesor{" + "departamento=" + departamento + ", anyo=" + anyo + '}';
    }
    
    
}
