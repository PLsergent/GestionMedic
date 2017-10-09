package gestionMedic;
import java.util.*;
public class Professionnel {
  protected String nomP;
  protected String adresseP;
  protected String telP;
  protected int nbMedic;
  protected ArrayList<Medicament> listeMedic;

  public Professionnel(){
    nomP="";
    adresseP="";
    telP="";
    nbMedic=0;
    listeMedic= new ArrayList<Medicament>();
  }

  public Professionnel(String n, String a, String tel){
    nomP=n;
    adresseP=a;
    telP=tel;
    nbMedic=0;
    listeMedic= new ArrayList<Medicament>();
  }

  public Professionnel(String n, String a, String tel,ArrayList<Medicament> lm){
    nomP=n;
    adresseP=a;
    telP=tel;
    nbMedic=listeMedic.size();
    listeMedic=lm;
  }

  public void ajoutMedicament(Medicament m){
    listeMedic.add(m);
    nbMedic=nbMedic+1;
  }

  public void afficheMedic(){
    for (Medicament i:listeMedic)
    System.out.println(i.getNom());
    System.out.println("");
  }

  public boolean rechercheMedicament (String nom){
    for (Medicament i:listeMedic)
    {
      String nomMedic=i.getNom();
      if (nomMedic.equals(nom))
      {
        System.out.println("True");
        return true;
      }
    }
    System.out.println("False");
    return false;
  }

  public void coutEchan(){
    double prix=0;
    for (Medicament z:listeMedic){
      prix=prix+(z.getPrixEch());
    }
    System.out.println(prix);
  }

  public String getNomM(){
    return nomP;
  }

  public String toString(){
    return nomP+" "+adresseP+" "+telP;
  }
}
