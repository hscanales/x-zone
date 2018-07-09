/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DataBase.Model.Scoreboard;
import DataBase.dao.scoreboardDao;

/**
 *
 * @author pretc
 */
public class Global {

    public static String nickname;
    public static long inicio;
    public static long fin;
    public static int score;
    public static scoreboardDao dao = new scoreboardDao();

    public static String getNickname() {
        return nickname;
    }

    public static void setNickname(String nickname) {
        Global.nickname = nickname;
    }

    public static long getInicio() {
        return inicio;
    }

    public static void setInicio( ) {
        Global.inicio = System.currentTimeMillis();
    }

    public static long getFin() {
        return fin;
    }

    public static void setFin() {
        Global.fin = System.currentTimeMillis();
    }

    public static int getScore() {
        return score;
    }

    public static void setScore() {
        fin=System.currentTimeMillis();
        score = (int)(fin-inicio)/1000;
        Scoreboard lmao= new Scoreboard(nickname,score);
        dao.create(lmao);
    }

}
