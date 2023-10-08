/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Conexion {
    private final String driver ="com.mysql.cj.jdbc.Driver";
    //Dónde está la base de datos
    private final String url ="jdbc:mysql://localhost/";
    //Nombre de la base de datos
    private final String bd = "tamagochi";
    private final String usuario = "root";
    private final String password = "Insertname_1";
     
    public Connection connection(){
        Connection cn = null;
        try {
            Class.forName(this.driver);
            cn = DriverManager.getConnection(this.url+this.bd, this.usuario, this.password);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "error"+e);
        }
        return cn;
    }
}
