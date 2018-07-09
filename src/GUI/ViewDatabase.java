    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataBase.Model.Scoreboard;
import DataBase.dao.scoreboardDao;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author uca
 */
public class ViewDatabase extends JFrame {

    public JTable resultados;
    public JPanel table;
    private static final int ANCHOC = 130, ALTOC = 30;

    DefaultTableModel tm;

    public ViewDatabase() {
        super("ScoreBoard X-Zone");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        config();
        llenarTabla();
        Container container = getContentPane();
        container.add(table);
        setSize(800, 800);

    }

    private void llenarTabla() {
        tm = new DefaultTableModel() {
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return Integer.class;
                    default:
                        return Boolean.class;
                }
            }
        };
        tm.addColumn("Nickname");
        tm.addColumn("Score");

        scoreboardDao sd = new scoreboardDao();

        ArrayList<Scoreboard> scores = sd.readAll();
        
        for (Scoreboard score : scores) {
            tm.addRow(new Object[]{score.getNickname(), score.getScore()});
        }
        resultados.setModel(tm);
    }

    private void config() {
        resultados = new JTable();
        table = new JPanel();
        table.setBounds(10, 10, 600, 600);
        table.add(new JScrollPane(resultados));
    }

}
