/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import main.Global;

/**
 *
 * @author Joshua
 */
public class GOver extends JFrame {

    public JLabel go, us, sc, us2, sc2;
    public JButton re, sa, ra;
    public String user, score;

    public GOver() {
        super("Game Over");
        Global.setScore();
        this.user = Login.user;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setSize(960, 608);
        this.getContentPane().setBackground(Color.black);
        this.setLocationRelativeTo(null);
        Tabla();
        Container container = getContentPane();
        container.add(go);
        container.add(us);
        container.add(sc);
        container.add(re);
        container.add(sa);
        container.add(ra);
        container.add(re);
        container.add(sa);
        container.add(us2);
        container.add(sc2);
        Eventos();

    }

    public void Tabla() {
        go = new JLabel("GAME OVER");
        go.setFont(new java.awt.Font("Arial", 1, 60));
        go.setForeground(Color.white);
        go.setBounds(275, 10, 400, 200);
        us = new JLabel("USUARIO:");
        us.setFont(new java.awt.Font("Arial", 1, 40));

        us.setForeground(Color.white);
        us.setBounds(75, 100, 400, 200);
        sc = new JLabel("PUNTAJE:");
        sc.setFont(new java.awt.Font("Arial", 1, 40));

        sc.setForeground(Color.white);
        sc.setBounds(75, 180, 400, 200);
        score = String.valueOf(Global.getScore());
        us2 = new JLabel(Global.nickname);
        sc2 = new JLabel(score);
        us2.setBounds(400, 100, 400, 200);
        us2.setForeground(Color.WHITE);
        sc2.setForeground(Color.WHITE);
        us2.setFont(new java.awt.Font("Arial", 1, 40));
        sc2.setFont(new java.awt.Font("Arial", 1, 40));
        sc2.setBounds(400, 180, 400, 200);
        re = new JButton("Reiniciar partida");
        re.setBackground(Color.WHITE);
        re.setContentAreaFilled(false);
        re.setOpaque(true);
        re.setBounds(340, 350, 250, 75);
        sa = new JButton("Salir del juego");
        sa.setBackground(Color.WHITE);
        sa.setContentAreaFilled(false);
        sa.setOpaque(true);
        sa.setBounds(340, 450, 250, 75);
        ra = new JButton("Rankings");
        ra.setBackground(Color.WHITE);
        ra.setContentAreaFilled(false);
        ra.setOpaque(true);
        ra.setBounds(825, 30, 100, 30);

    }

    public void Eventos() {
        re.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();

                try {
                    new GO1().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GOver.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        sa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                System.exit(0);
            }
        });
        ra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                new ViewDatabase().setVisible(true);
            }
        });
    }

}
