/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonjava;

/**
 *
 * @author iagop
 */
public class SingletonJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Persona obx1= Persona.getInstance("Juan", 36, "Lorenzo");
    Persona obx2=Persona.getInstance("Pablo",36,"Rodriguez");
        System.out.println(obx1.getNombre());
        System.out.println(obx2.getNombre());
    
    }
    
}
