/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase.Model;

/**
 *
 * @author uca
 */
public class Scoreboard {
    public int _id;
    public String nickname;
    public int score;

    public Scoreboard(int _id, String nickname, int score) {
        this._id = _id;
        this.nickname = nickname;
        this.score = score;
    }

    public Scoreboard(String nickname, int score) {
        this.nickname = nickname;
        this.score = score;
    }

    public Scoreboard() {
    }
    
    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
