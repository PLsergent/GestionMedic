package gestionMedic;

public class testprofe{
  public static void main (String[] args){
    Professionnel p1 = new Professionnel("MedicPlus","3 rue de Nazareth","876540989");
    Medecin m1 = new Medecin("Dupont","Albert","8 rue de Brest","0986574635","cardiologue");
    Medecin m2 = new Medecin("Harabi","Nael","8 rue de Brest","0879685746","chirurgien");
    System.out.println(p1.toString());
    System.out.println(m1.toString());
    System.out.println(m2.toString());
    System.out.println("===========");
    Pharmacie pharma1 = new Pharmacie("TousMedic","rue des chataigne","098765456","Jean Michel");
    Pharmacie pharma2 = new Pharmacie("Weshalors","jul street","073245678","Perrick");
    System.out.println(pharma1.toString());
    System.out.println(pharma2.toString());
    Medicament doli = new Medicament("Doliprane",
            "soulage les mots de tête",
            "1 comprimé toutes les 6 heures", 10, 2.8);
    Medicament strep = new Medicament("Strepsil",
            "soulage les maux de gorge",
            "1 pastille toutes les 2 heures", 20, 4.2);
    Medicament arnica = new Medicament("Arnica",
            "apaise les douleurs de coups et bosses",
            "Appliquer sur le choc", 30, 5.5);
    System.out.println("");
    m1.ajoutMedicament(doli);
    m1.ajoutMedicament(strep);
    m1.ajoutMedicament(arnica);
    pharma2.ajoutMedicament(doli);
    pharma2.ajoutMedicament(strep);
    pharma2.ajoutMedicament(arnica);
    System.out.println("Medicament du médecin : ");
    m1.afficheMedic();
    System.out.println("Medicament de la pharmacie: ");
    pharma2.afficheMedic();
  }
}
