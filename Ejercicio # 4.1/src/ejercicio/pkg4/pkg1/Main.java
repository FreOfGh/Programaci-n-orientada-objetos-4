/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4.pkg1;
import java.util.Scanner;
/**
 *
 * @author 57302
 */
public class Main {
    
    public static void main(String[] args) {
        float saldo = 0;
        float tasa_de_interes = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Pofavor ingrese el saldo inicial");
        saldo = input.nextFloat();
        System.out.println("Ingrese la tasa de interes anual");
        tasa_de_interes = input.nextFloat();
        Cuenta_de_ahorros Cuenta_usuario =  new Cuenta_de_ahorros(saldo, tasa_de_interes);
        System.out.println("Ingrese la cantidad de dinero a consignar");
        Cuenta_usuario.consignar_dinero(input.nextFloat());
        System.out.println("Ingrese la cantidad de dinero a retirar");
        Cuenta_usuario.retirar_dinero(input.nextFloat());
        Cuenta_usuario.Extracto_mensual();
        Cuenta_usuario.imprimir();
        

    }   
}
