/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase.dao;

import DataBase.Conection.Conexion;
import DataBase.Interfaces.Metodos;
import DataBase.Model.Scoreboard;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.*;

/**
 *
 * @author uca
 */
public class scoreboardDao implements Metodos<Scoreboard> {

    private static final String SQL_INSERT = "INSERT INTO Scoreboard (nickname, score) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE Scoreboard SET score =? WHERE nickname=?";
    private static final String SQL_DELETE = "DELETE FROM Scoreboard WHERE nickname=?";
    private static final String SQL_READ = "SELECT * FROM Scoreboard WHERE nickname=?";
    private static final String SQL_READALL = "SELECT Nickname,score from Score order by score desc ";
    private static final Conexion con = Conexion.conectar();

    @Override
    public boolean create(Scoreboard g) {
        PreparedStatement ps ;
        try {
            ps = con.getCnx().prepareStatement(SQL_INSERT);
            ps.setString(1, g.getNickname());
            ps.setInt(2, g.getScore());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(scoreboardDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean delete(Object key) {
        PreparedStatement ps;
        try {
            ps = con.getCnx().prepareStatement(SQL_DELETE);
            ps.setString(1, key.toString());

            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(scoreboardDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }

        return false;

    }

    @Override
    public boolean update(Scoreboard c) {
        PreparedStatement ps;
        try {
            System.out.println(c.getNickname());
            ps = con.getCnx().prepareStatement(SQL_UPDATE);
            ps.setString(1, c.getNickname());
            ps.setInt(2, c.getScore());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(scoreboardDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }

        return false;

    }

    @Override
    public Scoreboard read(Object key) {
        Scoreboard f = null;
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = con.getCnx().prepareStatement(SQL_READ);
            ps.setString(1, key.toString());
            
            rs = ps.executeQuery();
             while (rs.next()){
                f = new Scoreboard(rs.getString(1), rs.getInt(2));           
            }
            rs.close();
            
       } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(scoreboardDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }
        
    
    return f;
    }

    @Override
    public ArrayList<Scoreboard> readAll() {
        ArrayList<Scoreboard> all = new ArrayList();
        Statement s;
        ResultSet rs;

        try {
            s = con.getCnx().prepareStatement(SQL_READALL);

            rs = s.executeQuery(SQL_READALL);
            System.out.println("entro");
            while (rs.next()) {
                all.add(new Scoreboard(rs.getString(1), rs.getInt(2)));
           }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(scoreboardDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }

        return all;
    }

}

