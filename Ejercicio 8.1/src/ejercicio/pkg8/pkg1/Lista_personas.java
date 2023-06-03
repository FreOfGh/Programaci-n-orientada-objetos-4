/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg8.pkg1;
import java.util.*;

public class Lista_personas {
    Vector lista_de_personas;
    public Lista_personas(){lista_de_personas = new Vector();}
    public void añadir_persona (Persona p){lista_de_personas.add(p);}
    public void remover_persona(int i){lista_de_personas.remove(i);}
    public void eliminar_lista(){lista_de_personas.removeAllElements();}
    
}
