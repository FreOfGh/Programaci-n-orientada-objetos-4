/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4.pkg2;

/**
 *
 * @author 57302
 */
public class Main  {
    public static void main(String[] args) {
        Animal[] animal = new Animal[4]; 
        
        animal[0]  = new Gatos();
        animal[1]  = new Lobo();
        animal[2] = new Leon();
        animal[3] = new Perros();
        for (int i = 0; i < animal.length; i++) { 
            System.out.println(animal[i].nombre_cientificoAnimales());
            System.out.println("reside en " + animal[i].habitatAnimales());
            System.out.println("Su dieta es " + animal[i].AlimentoAnimales());
            System.out.println("El sonido producido es  : "+ animal[i].sonidosAnimales());   
        }
    }
}
