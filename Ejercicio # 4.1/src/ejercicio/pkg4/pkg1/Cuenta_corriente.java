/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4.pkg1;

public class Cuenta_corriente extends Cuenta{
    private float sobregiro = 0;

    public Cuenta_corriente(float saldo, float tasa_anual) {
        super(saldo, tasa_anual);
        this.sobregiro= 0;
    }
    
    public void retirar_dinero(float cantidad){
        super.saldo -= cantidad;
        if (super.saldo < 0){ this.sobregiro += saldo; super.saldo = 0; }else {super.retirar_dinero(cantidad);}
    }
    
    public void consignar_dinero(float cantidad ){
        if(sobregiro > 0) { this.sobregiro += cantidad; if(sobregiro > 0){ super.saldo = this.sobregiro; sobregiro= 0; }}else{super.consignar_dinero(cantidad);} 
    }
    
    public void Extracto_mensual(){
        super.Extracto_mensual();
    }
    
    private void imprimir(){
     System.out.println("El saldo de la cuenta es " + super.saldo + "\n" + "El numero de operaciones es"+ super.numero_de_consignaciones + super.numero_de_retiros + "\n" + "La comision mensual es de :  "+ super.comision_mensual+ "\n" + "El sobregiro es : " +this.sobregiro);
     }
    
    
}
