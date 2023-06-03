/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8.pkg1;
import javax.swing.*;
import java.awt.event.* ; 
import java.awt.*;

public class VentanaPrincipal extends JFrame  {
    private final Lista_personas Lista_usuarios;
    private Container contenedor;
    protected String nombre, apellidos, direccion, telefono;
    private JLabel label_apellidos, label_nombre, label_direccion, label_telefono;
    private JTextField text_apellidos, text_nombre, text_direccion, text_telefono;
    private JButton añadir_lista, eliminar_lista,borrar_lista;
    private JList lista_usuarios;
    private DefaultListModel modelo_lista;
    private JScrollPane  barra_de_deslizamiento; 
    public VentanaPrincipal (){
        Lista_usuarios = new Lista_personas();
        inicio();
        this.setBackground(Color.GRAY);
        this.setTitle("Ventana Principal");
        this.setSize( 400, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    protected void inicio(){
        contenedor  = getContentPane();
        contenedor.setLayout(null);
      
        label_nombre = new JLabel("Ingrese el nombre para agregar a la lista");
        label_nombre.setBounds(20, 0, 300, 40);
        
        text_nombre = new JTextField();
        text_nombre.setBounds(50, 50, 200, 20);
        
        label_apellidos = new JLabel("Ingrese el apellido para agregar a la lista");
        label_apellidos.setBounds(20, 90, 300, 40); 

        text_apellidos = new JTextField();       
        text_apellidos.setBounds(50, 130, 200, 20);
        
        label_telefono = new JLabel("Ingrese el telefono para agregar a la lista");
        label_telefono.setBounds(20, 170, 300, 40); 
 
        text_telefono = new JTextField(); 
        text_telefono.setBounds(50, 210, 200, 20);
        
        label_direccion = new JLabel("Ingrese la dirección para agregar a la lista");
        label_direccion.setBounds(20, 250, 300, 40); 
        
        text_direccion = new JTextField(); 
        text_direccion.setBounds(50, 290, 200, 20);
        
        añadir_lista =  new JButton("Ingresar nombre");
        añadir_lista.setBounds(40,420,200, 20);
        añadir_lista.setBackground(Color.blue);
        
        
        eliminar_lista =  new JButton("Eliminar nombre");
        eliminar_lista.setBounds(40,460,200, 20);
        eliminar_lista.setBackground(Color.blue);
        
        borrar_lista =  new JButton("Borrar lista");
        borrar_lista.setBounds(050,500,200, 20);
        borrar_lista.setBackground(Color.blue);
        
        lista_usuarios = new JList();

        lista_usuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo_lista = new DefaultListModel();
        barra_de_deslizamiento = new JScrollPane();
        barra_de_deslizamiento.setBounds(40, 330 ,220, 80);
        barra_de_deslizamiento.setViewportView(lista_usuarios);
        contenedor.add(label_nombre);
        contenedor.add(text_nombre);
        contenedor.add(label_apellidos);
        contenedor.add(text_apellidos);
        contenedor.add(label_telefono);
        contenedor.add(text_telefono);
        contenedor.add(label_direccion);
        contenedor.add(text_direccion);
        contenedor.add(añadir_lista);
        contenedor.add(eliminar_lista);
        contenedor.add(borrar_lista);
        contenedor.add(barra_de_deslizamiento);
        initacciones();
        }
    private void añadirpersona() {
        if (text_nombre.getText().isEmpty() || text_apellidos.getText().isEmpty() ||
            text_telefono.getText().isEmpty() || text_direccion.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos",
                "Campos vacíos", JOptionPane.WARNING_MESSAGE);
        return;
        
    }
        String telefono = text_telefono.getText();
        if (!telefono.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "El campo de teléfono solo debe contener dígitos numéricos",
                "Formato incorrecto", JOptionPane.WARNING_MESSAGE);
        return; // Sale del método si el teléfono no es numérico
    }
        Persona p = new Persona(text_nombre.getText(), text_apellidos.getText(),text_telefono.getText(), text_direccion.getText());
        Lista_usuarios.añadir_persona(p); 
        String elemento = text_nombre.getText() + " " + text_apellidos.getText() + " " + text_telefono.getText() + " "+ text_direccion.getText();
        modelo_lista.addElement(elemento); 
        lista_usuarios.setModel(modelo_lista);
        text_nombre.setText("");
        text_apellidos.setText("");
        text_telefono.setText("");
        text_direccion.setText("");
        
    }
    private void eliminarlista(int indice_elemento) {
        if (indice_elemento >= 0) { // Si la posición existe
            modelo_lista.removeElementAt(indice_elemento); 
            Lista_usuarios.remover_persona(indice_elemento); 
            } else { 
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error",  JOptionPane.ERROR_MESSAGE);
        System.out.println("Hola");

        }
        
    }
    private void borrarlista() {
        modelo_lista.clear();
        Lista_usuarios.eliminar_lista();
            System.out.println("Hola");

    }
    
        
    
    private void initacciones(){           
            añadir_lista.addActionListener( new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent click){
                        if(click.getSource() == añadir_lista){
                                añadirpersona();
                            }
                    }
            });
            eliminar_lista.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent click){

                if (click.getSource() == eliminar_lista){
                eliminarlista(lista_usuarios.getSelectedIndex());

        }       
           
        
        }
        });
             borrar_lista.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent click){

                if (click.getSource() == borrar_lista){
                borrarlista();
                
    }}});
    

                
         
    };
    
    
    
    }
    

