/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4.pkg1;


public class Cuenta_de_ahorros extends Cuenta {
    private boolean activa ;
    public Cuenta_de_ahorros(float saldo, float tasa_anual) {
        super(saldo, tasa_anual);
        if (saldo >= 10) {
            activa = true;
            
        }
    }
    public void consignar_dinero(float cantidad) {
        if(activa){
            super.consignar_dinero(cantidad);
        }        
    }
    public void retirar_dinero(float cantidad){
     if(activa){
         super.retirar_dinero(cantidad);
     }
    }
    public void Extracto_mensual(){
         if (super.numero_de_retiros >4){
             super.comision_mensual += (super.numero_de_retiros-4*1000);
         }
         super.Extracto_mensual();
         if (super.saldo <  10000){
             activa = false;
         }     
     }
    public void imprimir(){
     System.out.println("El saldo de la cuenta es " +  super.saldo + "\n" + "El numero de operaciones es : "+ ((super.numero_de_consignaciones) + (super.numero_de_retiros)) + "\n" + "La comision mensual es de :  "+ super.comision_mensual);
     
     }
    }
     
    
  

    
   