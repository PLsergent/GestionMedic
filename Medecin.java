package gestionMedic;
import java.util.*;
public class Medecin{

    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String specialite;
    private int nbMedic;
    private ArrayList<Medicament> listeMedic;

    public Medecin()
    {
      nom="";
      prenom="";
      adresse="";
      telephone="";
      specialite="";
      nbMedic=0;
      listeMedic= new ArrayList<Medicament>();
    }

    public Medecin(String n, String p, String a, String t, String s){
      nom=n;
      prenom=p;
      adresse=a;
      telephone=t;
      specialite=s;
      nbMedic=0;
      listeMedic= new ArrayList<Medicament>();
    }

    public Medecin(String n, String p, String a, String t, String s, ArrayList<Medicament> lm)
    {
      nom=n;
      prenom=p;
      adresse=a;
      telephone=t;
      specialite=s;
      listeMedic= lm;
      nbMedic=listeMedic.size();
    }

    public void afficheMe()
    {
      System.out.println(nom);
      System.out.println(prenom);
      System.out.println("Adresse : "+adresse);
      System.out.println("telephone : "+telephone);
      System.out.println("specialite : "+specialite);
    }

    public void ajoutMedicament(Medicament m){
      listeMedic.add(m);
      nbMedic=nbMedic+1;
    }

    public void afficheMedic(){
      for (Medicament i:listeMedic)
      System.out.println(i.getNom());
    }

    public boolean rechercheMedicament (String nom)
    {
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

    public String getNomM()
    {
      return nom;
    }
    public String getPrenomM()
    {
      return prenom;
    }
}
