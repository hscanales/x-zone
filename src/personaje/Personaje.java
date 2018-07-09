/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

import DataBase.Model.Scoreboard;
import DataBase.dao.scoreboardDao;
import GUI.Login;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author MaPache
 */
public class Personaje {

    private String nombre;
    private int vida;
    private ArrayList arma;
    private int ataque;
    private int vel;
    private JLabel player;
    private long inicio;
    private long fin;
    private int score;

    public JLabel getPlayer() {
        return player;
    }

    public void setPlayer(JLabel player) {
        this.player = player;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getArma() {
        return arma;
    }

    public void setArma(ArrayList arma) {
        this.arma = arma;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public void init() {
        inicio = System.currentTimeMillis();
    }

    public void score() {
        fin = System.currentTimeMillis() - inicio;
        score = (int) fin / 1000;
        scoreboardDao dao = new scoreboardDao();
        dao.create(new Scoreboard(Login.user, score));
    }

    public Personaje() {
        init();
    }

}
