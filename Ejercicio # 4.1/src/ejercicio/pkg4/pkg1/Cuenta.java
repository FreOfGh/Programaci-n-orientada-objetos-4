/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4.pkg1;

public class Cuenta {
   protected float saldo,tasa_anual,comision_mensual = 0;
   protected int numero_de_consignaciones = 0, numero_de_retiros = 0; 
   public Cuenta(float saldo, float tasa_anual){
       this.saldo =  saldo;
       this.tasa_anual =  tasa_anual;
   }
    
    public void consignar_dinero(float consignacion){
        this.saldo = this.saldo+consignacion;
        this.numero_de_consignaciones+=1 ;
    }
    public void retirar_dinero(float retiro){
        if (retiro <= this.saldo) {
            this.saldo = this.saldo - retiro;
            this.numero_de_retiros +=1;
        } else{
            System.out.println("Usted no tiene el saldo suficiente para realizar esta operación");    
        }
    }
    public void interes_mensual (){
        float tasa_interes_mensual = (this.tasa_anual/12);
        float interes_mesnual  =  tasa_interes_mensual*saldo;
        this.saldo += interes_mesnual;
    }
    public void   Extracto_mensual() {
        this.saldo -= this.comision_mensual;
        interes_mensual();
    }
    
    private void imprimir(){
        System.out.println("El saldo actual de su cuenta es : " + saldo + "\n" +"La tasa anual de la cuenta es : " + tasa_anual + "\n" + "La comisión mensual es : " +comision_mensual + "\n" + "el numero de consignaciones realizadas es : " + numero_de_consignaciones + "\n" + "El numero de retiros realizados es  : " + numero_de_retiros
                 );
    }
    
    
}
