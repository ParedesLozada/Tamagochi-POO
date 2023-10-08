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
public class Insert {
    
    private Connection cn;
    
    public Insert(){
        Conexion con = new Conexion();
        this.cn = con.connection();
    }
    
    public boolean insertTamagochi(Tamagochi tamagochi){
        String consulta = "INSERT INTO estado_tamagochi "
                + "(nombre, vida, energia, felicidad, estado)"
                + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement pst = this.cn.prepareStatement(consulta);
            pst.setString(1, tamagochi.getNombre());
            pst.setInt(2, tamagochi.getVida());
            pst.setInt(3, tamagochi.getEnergia());
            pst.setInt(4, tamagochi.getFelicidad());
            pst.setString(5, tamagochi.getEstado());
            int filasAfectadas = pst.executeUpdate(); //Retorna la cantidad de filas modificadas
            //El execute update da 1 cuando se inserta y 0 si no
            return filasAfectadas > 0;
        } catch (Exception e) {
            System.out.println("error "+e);
        }
        return false;
    }
}
