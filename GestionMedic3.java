/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package gestionMedic;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;


/**
*
* @author myria
*/
public class GestionMedic3{

 public static void main(String[] args) {
     try{
     // liste des médecins
     ArrayList<Medecin> lesMedecins = remplitListeMedecin();

     //liste des stocks de médicament
     ArrayList<StockMed> lesStocks = remplitListeStock();

     new JFrameMaximize();

     }catch(Exception e){
         System.out.println(e.getMessage());
     }
}
 public static ArrayList<Medecin> remplitListeMedecin()
 {
     ArrayList<Medecin> tabMedecin = new ArrayList<Medecin>();
     Medicament doli = new Medicament("Doliprane",10, 2.8);
     Medicament strep = new Medicament("Strepsil",20, 4.2);
     Medicament arnica = new Medicament("Arnica",30, 5.5);
     Medicament asp = new Medicament("Aspirine",2.8, 3.5);
     Medicament eff = new Medicament("Efferalgan",3.1, 3.7);
     Medicament ferv = new Medicament("Fervex",2, 2.5);
     Medecin med1=new Medecin("Durand", "Charles",
             "10 cours Vitton 69006 Lyon","0475896251","généraliste");
     med1.ajoutMedicament(doli);
     med1.ajoutMedicament(strep);
     med1.ajoutMedicament(arnica);
     Medecin med2=new Medecin("Chonon", "Sonia",
             "3 rue Boileau 69002 Lyon","0472659878","dermatologiste");
     med2.ajoutMedicament(doli);
     med2.ajoutMedicament(asp);
     Medecin med3=new Medecin("Vidert", "Gérard",
             "","0651236548","généraliste");
     med3.ajoutMedicament(doli);
     med3.ajoutMedicament(asp);
     med3.ajoutMedicament(ferv);
     Medecin med4=new Medecin("Carpin", "Hubert",
             "10, bd Magenta 69002 Lyon","0472698412","ophtalmologiste");
     med4.ajoutMedicament(asp);
     med4.ajoutMedicament(arnica);
     med4.ajoutMedicament(eff);
     Medecin med5=new Medecin("Potut", "Carole",
             "3 rue Victor Hugo 69002 Lyon","0472332569","généraliste");
     med5.ajoutMedicament(doli);
     med5.ajoutMedicament(asp);
     med5.ajoutMedicament(arnica);
     med5.ajoutMedicament(eff);
     Medecin med6=new Medecin("Dubois", "Claire",
             "69100 Villeurbanne","0654229971","dermatologiste");
     med6.ajoutMedicament(doli);
     med6.ajoutMedicament(asp);
     med6.ajoutMedicament(eff);

     tabMedecin.add(med1);
     tabMedecin.add(med2);
     tabMedecin.add(med3);
     tabMedecin.add(med4);
     tabMedecin.add(med5);
     tabMedecin.add(med6);
     return tabMedecin;
 }
  public static ArrayList<StockMed> remplitListeStock()
 {
     ArrayList<StockMed> tabStock= new ArrayList<StockMed>();
     Medicament doli = new Medicament("Doliprane",10, 2.8);
     Medicament strep = new Medicament("Strepsil",20, 4.2);
     Medicament arnica = new Medicament("Arnica",30, 5.5);
     Medicament asp = new Medicament("Aspirine",2.8, 3.5);
     Medicament eff = new Medicament("Efferalgan",3.1, 3.7);
     Medicament ferv = new Medicament("Fervex",2, 2.5);
     StockMed st1 = new StockMed(doli, 1200,600,300);
     StockMed st2 = new StockMed(strep, 500,300,300);
     StockMed st3 = new StockMed(arnica, 600,400,300);
     StockMed st4 = new StockMed(asp, 1500,1000,2000);
     StockMed st5 = new StockMed(eff, 500,300,200);
     StockMed st6 = new StockMed(ferv, 450,250,250);
     tabStock.add(st1);
     tabStock.add(st2);
     tabStock.add(st3);
     tabStock.add(st4);
     tabStock.add(st5);
     tabStock.add(st6);
     return tabStock;
 }
public class JFrameMaximize extends JFrame{
 public JFrameMaximize(){
   setVisible(true);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   JPanel panel = new JPanel();
   // A Fake Dimension, inside this panel are a lot of swing components
   panel.setPreferredSize(new Dimension(333, 666));

    setContentPane(panel);

    // Now we want to set the Extended State
    if (Toolkit.getDefaultToolkit().isFrameStateSupported(MAXIMIZED_BOTH)) {
        setExtendedState(MAXIMIZED_BOTH);
    } else {
        System.out.println("Oh oh... i have a problem...");

        // Now we need a Fullscreen but we dont have the size of a WindowManager Panels and
        // stuff
        Dimension max = Toolkit.getDefaultToolkit().getScreenSize();
        // asume that the screen has a 20px bar on top (=awesome wm)
        max.height -= 20;
        setSize(max);
        setLocation(0, 20);
        // The alternative is to call pack() here, but then the window is totally broken, because of the internal components. Every Panel we load in here has a different size, so the window will scale up and down on every panel change.
    }
 }}

}
