/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.*;

public class conexionBD {
    
    private conexionBD(){
        
    }

    //variable que guarda el estado de la conexion a la bd
    private static Connection conexion;

    //Variable para crar una sola instancia (singleton)
    private static conexionBD instancia;

    //Conexion BD
    private static final String URL = "jdbc:mysql://localhost/patolli";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    //Metodo que realiza la conexion
    public Connection conectar() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            System.out.println("Succesfully Connected!");

            return conexion;

        } catch (Exception e) {

            System.out.println("No se pudo crear la conexion." + e);

        }
        return conexion;
    }

    //Metodo que realiza el cierre de conexion
    public void cerrarConexion() throws SQLException {
        try {

            conexion.close();

        } catch (Exception e) {

            System.out.println("Error al cerrar la conexion." + e);
            conexion.close();

        } finally {

            conexion.close();

        }
    }

    //PATRON SINGLETON
    public static conexionBD getInstance() {
        if (instancia == null) {
            instancia = new conexionBD();
        }
        return instancia;
    }

}//clase
