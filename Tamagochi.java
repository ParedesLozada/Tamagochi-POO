/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Usuario
 */
public class Tamagochi {
    
    private int id;
    private String nombre;
    private int vida;
    private int energia;
    private int felicidad;
    private String estado;

    public Tamagochi(int id, String nombre, int vida, int energia, int felicidad, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.vida = vida;
        this.energia = energia;
        this.felicidad = felicidad;
        this.estado = estado;
    }
    
    public Tamagochi(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.vida = 100;
        this.energia = 100;
        this.felicidad = 100;
        this.estado = "neutral";
    }
    
    public Tamagochi(){
    
    };

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return this.energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getFelicidad() {
        return this.felicidad;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return this.id+" "+this.nombre+" "+this.vida+" "+this.energia+" "+this.felicidad+" "+this.estado;
    }
    
    
}
