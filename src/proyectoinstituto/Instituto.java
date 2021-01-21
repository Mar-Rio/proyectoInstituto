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
public class Instituto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alum1 = new Alumno("Mario Arribas", "Els pins,1", 1976, "DAW1");
        Alumno alum2 = new Alumno("Eleno Monleón", "Els pins,3", 2000, "DAW1");
        Profesor prof1 = new Profesor("john huston", "ayuntamiento, 1", 1970,
                "informatica", 2010);
        Profesor prof2 = new Profesor("Pepe Reina", "ayuntamiento, 3", 1972,
                "informatica", 2019);
        System.out.println(alum1);
        System.out.println(alum1);
        System.out.println(prof1);
    }

}
