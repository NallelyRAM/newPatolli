/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Hp
 */
public class Partida {
    int cantidadJugador;
    int numCasilla;
    int fichaJugador;
    int fondoFijo;
    int montoApostar;
    String codigo;
    Ficha colorFicha;
    Sala sala;
    Jugador jugador;
    Boolean dado1;
    Boolean dado2;
    Partida partida;

    public Partida() {
    }

    public Partida(int cantidadJugador, int numCasilla, int fichaJugador, int fondoFijo, int montoApostar, String codigo, Ficha colorFicha, Sala sala, Jugador jugador, Boolean dado1, Boolean dado2, Partida partida) {
        this.cantidadJugador = cantidadJugador;
        this.numCasilla = numCasilla;
        this.fichaJugador = fichaJugador;
        this.fondoFijo = fondoFijo;
        this.montoApostar = montoApostar;
        this.codigo = codigo;
        this.colorFicha = colorFicha;
        this.sala = sala;
        this.jugador = jugador;
        this.dado1 = dado1;
        this.dado2 = dado2;
        this.partida = partida;
    }

    public int getCantidadJugador() {
        return cantidadJugador;
    }

    public void setCantidadJugador(int cantidadJugador) {
        this.cantidadJugador = cantidadJugador;
    }

    public int getNumCasilla() {
        return numCasilla;
    }

    public void setNumCasilla(int numCasilla) {
        this.numCasilla = numCasilla;
    }

    public int getFichaJugador() {
        return fichaJugador;
    }

    public void setFichaJugador(int fichaJugador) {
        this.fichaJugador = fichaJugador;
    }

    public int getFondoFijo() {
        return fondoFijo;
    }

    public void setFondoFijo(int fondoFijo) {
        this.fondoFijo = fondoFijo;
    }

    public int getMontoApostar() {
        return montoApostar;
    }

    public void setMontoApostar(int montoApostar) {
        this.montoApostar = montoApostar;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Ficha getColorFicha() {
        return colorFicha;
    }

    public void setColorFicha(Ficha colorFicha) {
        this.colorFicha = colorFicha;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Boolean getDado1() {
        return dado1;
    }

    public void setDado1(Boolean dado1) {
        this.dado1 = dado1;
    }

    public Boolean getDado2() {
        return dado2;
    }

    public void setDado2(Boolean dado2) {
        this.dado2 = dado2;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    
    
    
}
