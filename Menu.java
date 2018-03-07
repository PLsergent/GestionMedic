package gestionMedic;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.*;

public class Menu extends JFrame{
  public JPanel pan = new JPanel();
  public JButton button1 = new JButton("Gestion des médicaments");
  public JButton button2 = new JButton("Gestion des stocks");
  public JButton button3 = new JButton("Gestion des pro");
  public Menu(){
        this.setTitle("Gestion Médicament");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //Ajout du bouton à notre content pane
        this.setLayout(new GridLayout(3,1,10,10));
        pan = (JPanel) getContentPane();
        this.pan.add(button1, BorderLayout.CENTER);
        this.pan.add(button2, BorderLayout.CENTER);
        this.pan.add(button3, BorderLayout.CENTER);
        this.setVisible(true);
        button1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent evt){
            button1ActionPerformed(evt);}
        });}
        private void button1ActionPerformed(ActionEvent evt){
          MenuMedicament j = new MenuMedicament();
          j.setVisible(true);
        }
  public static void main(String[] args) {
    Menu menu = new Menu();
    }
}
