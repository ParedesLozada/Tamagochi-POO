/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import Entity.Tamagochi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Select {
    private ResultSet datos, dato;
    //Gurada la consulta
    private Statement st;
    //Hace la consulta
    private Connection cn;
    
    public Select(){
        Conexion con = new Conexion();
        this.cn = con.connection();
    }
    
    public Tamagochi selectTamagochi(int id){
        String query = "SELECT * FROM estado_tamagochi WHERE id_tamagochi = "+ id;
        Tamagochi tamago = new Tamagochi();
        try {
            this.st = this.cn.createStatement();
            this.datos = this.st.executeQuery(query);
            while (this.datos.next()) {//Recorre la wea mienstras tenga datos                
                tamago.setId(this.datos.getInt("id_tamagochi"));
                tamago.setNombre(this.datos.getString("nombre"));
                tamago.setVida(this.datos.getInt("vida"));
                tamago.setEnergia(this.datos.getInt("energia"));
                tamago.setFelicidad(this.datos.getInt("felicidad"));
                tamago.setEstado(this.datos.getString("estado"));
            }
        } catch (Exception e) {
            tamago = new Tamagochi(0, e.toString(), 0, 0, 0, e.toString());
            return tamago;
        }
        return tamago;
    }
    
    public ArrayList<Tamagochi> selectTamagochis(){
        ArrayList<Tamagochi> tamagochis = new ArrayList<>();
        String consulta = "SELECT * FROM estado_tamagochi";
        Tamagochi tamago;
        try {
            this.st = this.cn.createStatement();
            this.datos = this.st.executeQuery(consulta);
            while (this.datos.next()) {//Recorre la wea mienstras tenga datos 
                tamago = new Tamagochi();
                tamago.setId(this.datos.getInt("id_tamagochi"));
                tamago.setNombre(this.datos.getString("nombre"));
                tamago.setVida(this.datos.getInt("vida"));
                tamago.setEnergia(this.datos.getInt("energia"));
                tamago.setFelicidad(this.datos.getInt("felicidad"));
                tamago.setEstado(this.datos.getString("estado"));
                
                tamagochis.add(tamago);
            }
        } catch (Exception e) {
            System.out.println("error"+e);
            
        }
        return tamagochis;
    }
}
