/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import Entity.Tamagochi;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Usuario
 */
public class Update {
    Connection cn;
    
    public Update(){
        Conexion con = new Conexion();
        this.cn = con.connection();
    }
    
    public boolean updateTamagochi(Tamagochi tamagochi, int id_tamagochi){
        String consulta = "UPDATE estado_tamagochi SET nombre = ?, vida = ?, "
                + "energia = ?, felicidad = ?, estado = ? "
                + "WHERE id_tamagochi =  ?";
        try {
            PreparedStatement pst = cn.prepareStatement(consulta);
            pst.setString(1, tamagochi.getNombre());
            pst.setInt(2, tamagochi.getVida());
            pst.setInt(3, tamagochi.getEnergia());
            pst.setInt(4, tamagochi.getFelicidad());
            pst.setString(5, tamagochi.getEstado());
            pst.setInt(6, id_tamagochi);
            int filasAfectada =  pst.executeUpdate();
            return filasAfectada > 0;
        } catch (Exception e) {
            System.out.println("error "+e);
        }
        return false;
    }
}
