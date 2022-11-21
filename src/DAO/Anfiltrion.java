/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author NALLELY, RICARDO, JOAQUIN
 */
public class Anfiltrion extends Jugador{

    public Anfiltrion() {
    }

    public Anfiltrion(String nombre, String idJugador, int fondo) {
        super(nombre, idJugador, fondo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public int getFondo() {
        return fondo;
    }

    public void setFondo(int fondo) {
        this.fondo = fondo;
    }
    
}
