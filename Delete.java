/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Usuario
 */
public class Delete {
    private Connection cn;
    
    public Delete (){
        Conexion con = new Conexion();
        this.cn = con.connection();
    }
    
    public boolean deleteTamagochi(int id_tamagochi){
        String consulta ="DELETE FROM estado_tamagochi WHERE id_tamagochi = ?";
        try {
            PreparedStatement stm = this.cn.prepareStatement(consulta);
            stm.setInt(1, id_tamagochi);
            int resultado = stm.executeUpdate();
            return resultado > 0;
        } catch (Exception e) {
            System.out.println("error "+e);
        }
        return false;
    }
}
