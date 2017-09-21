public class testmedecin{

  public static void main (String[] args){
    Medicament med = new Medicament();
    Medicament doli = new Medicament("Doliprane",
            "soulage les mots de tête",
            "1 comprimé toutes les 6 heures", 10, 2.8);
    Medicament strep = new Medicament("Strepsil",
            "soulage les maux de gorge",
            "1 pastille toutes les 2 heures", 20, 4.2);
    Medicament arnica = new Medicament("Arnica",
            "apaise les douleurs de coups et bosses",
            "Appliquer sur le choc", 30, 5.5);
    Medecin pl = new Medecin("sergent","pl","6 rue de nazet","0785354456","dentaire");
    pl.afficheMe();

    pl.ajoutMedicament(arnica);
    pl.ajoutMedicament(strep);
    pl.afficheMedic();
    System.out.println("=========");
  //  pl.rechercheMedicament("Doliprane");
    if ((pl.rechercheMedicament("Arnica"))==true)
    {
      System.out.println("Trouvé");
    }else{
      System.out.println("Introuvable");
    }
    System.out.println("=========");
    pl.coutEchan();
  }
}
