/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import conexion.conexionBD;
import presentacion.pantallaOpcionInvAnfi;

public class ProyectoArquitecturaPatolli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Da error porque el constructor que posee la clase conexionBD es privado
        //conexionBD conecion = new conexionBD();
        
        //Manera correcta de crear instancias para conectar a la base de datos
        conexionBD con = conexionBD.getInstance();
        con.conectar();
        
        if (con != null) {
            System.out.println("Conexion creada");
            
        }else{
            System.out.println("No");
        }
        
        
        
    }//Main
    
}
