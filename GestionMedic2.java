/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author myria
 */
public class GestionMedic2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // liste des médecins
        ArrayList<Medecin> lesMedecins = remplitListeMedecin();

        //liste des stocks de médicament
        ArrayList<StockMed> lesStocks = remplitListeStock();

        for (Medecin i:lesMedecins)
        {
          i.afficheMe();
          i.afficheMedic();
          System.out.println("=======");
        }

        for (StockMed i:lesStocks)
        {
          if (i.getStock()>500)
          {
            Medicament m = i.getMedic();
            System.out.println(m.getNom());
          }
        }


    }

    public static ArrayList<Medecin> remplitListeMedecin()
    {
        ArrayList<Medecin> tabMedecin= new ArrayList<Medecin>();
        Medicament doli = new Medicament("Doliprane",
                "soulage les mots de tête",
                "1 comprimé toutes les 6 heures", 10, 2.8);
        Medicament strep = new Medicament("Strepsil",
                "soulage les maux de gorge",
                "1 pastille toutes les 2 heures", 20, 4.2);
        Medicament arnica = new Medicament("Arnica",
                "apaise les douleurs de coups et bosses",
                "Appliquer sur le choc", 30, 5.5);
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
        Medicament doli = new Medicament("Doliprane",
                "soulage les mots de tête",
                "1 comprimé toutes les 6 heures", 10, 2.8);
        Medicament strep = new Medicament("Strepsil",
                "soulage les maux de gorge",
                "1 pastille toutes les 2 heures", 20, 4.2);
        Medicament arnica = new Medicament("Arnica",
                "apaise les douleurs de coups et bosses",
                "Appliquer sur le choc", 30, 5.5);
        Medicament asp = new Medicament("Aspirine",2.8, 3.5);
        Medicament eff = new Medicament("Efferalgan",3.1, 3.7);
        Medicament ferv = new Medicament("Fervex",2, 2.5);
        StockMed st1=new StockMed(doli, 1200,600,300);
        StockMed st2=new StockMed(strep, 500,300,300);
        StockMed st3=new StockMed(arnica, 600,400,300);
        StockMed st4=new StockMed(asp, 1500,1000,2000);
        StockMed st5=new StockMed(eff, 500,300,200);
        StockMed st6=new StockMed(ferv, 450,250,250);
        tabStock.add(st1);
        tabStock.add(st2);
        tabStock.add(st3);
        tabStock.add(st4);
        tabStock.add(st5);
        tabStock.add(st6);
        return tabStock;
    }

}
