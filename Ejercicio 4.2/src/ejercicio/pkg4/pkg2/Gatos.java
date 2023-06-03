/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4.pkg2;

/**
 *
 * @author 57302
 */
public class Gatos extends Animal{

    @Override
    public String AlimentoAnimales() {
        return("ratones");
    }

    @Override
    public String sonidosAnimales() {
        return("maullido");
    }

    @Override
    public String habitatAnimales() {
        return("doméstico");
    }

    @Override
    public String nombre_cientificoAnimales() {
        return("Felis silvestris catus");
    }
    
}
