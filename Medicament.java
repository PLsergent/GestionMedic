package gestionMedic;
import java.util.*;
/**
* Gestion médicament
* @version 1.0
* @author PLsergent
*/
public class Medicament {
    private String nom;
    private String effet;
    private String posologie;
    private double prixEch;
    private double prixVente;
    private ArrayList<Professionnel> listePro;
    private ArrayList<StockMed> listeStock;

    public Medicament()
    {
        nom="";
        effet="";
        posologie="";
        prixEch=0;
        prixVente=0;
        listePro = new ArrayList<Professionnel>();
        listeStock = new ArrayList<StockMed>();
    }
/**
  * @param n chaine de caractères : nom du médicament
  * @param e chaine de caractères : effet du médicament
  * @param p chaine de caractères : posologie
  * @param pe réel : prix de l'échantillon
  * @param pv réel : prix de vente
  */
    public Medicament(String n, String ef, String p, double pe, double pv,
      ArrayList<Professionnel> lp, ArrayList<StockMed> ls) throws negatifException
    {
        nom=n;
        effet=ef;
        posologie=p;
        if (pe<0){
          throw new negatifException("Prix échantillon");}
        if (pv<0){
          throw new negatifException("Prix de vente");}
        prixEch=pe;
        prixVente=pv;
        listePro=lp;
        listeStock=ls;
    }
    public Medicament(String n, double pe, double pv,ArrayList<Professionnel> lp,ArrayList<StockMed> ls)
    {
        nom=n;
        effet="";
        posologie="";
        prixEch=pe;
        prixVente=pv;
        listePro=lp;
        listeStock=ls;
    }
    public Medicament(String n, double pe, double pv)
    {
        nom=n;
        effet="";
        posologie="";
        prixEch=pe;
        prixVente=pv;
        listePro = new ArrayList<Professionnel>();
        listeStock = new ArrayList<StockMed>();
    }

    public void affiche()
    {
        System.out.println(nom);
        System.out.println("Effets : "+effet);
        System.out.println("Posologie : "+posologie);
        System.out.println("Prix de l'échantillon :"+prixEch+" €");
        System.out.println("Prix de vente :"+prixVente+" €");
        System.out.println("======================");

    }
    public void affichePro(){
      System.out.println("Liste Professionnel : ");
      for (Professionnel p: listePro){
        System.out.println(p.toString());
      }
    }

    public void afficheLesStocks(){
      System.out.println("Liste des Stocks : ");
      for (StockMed st:listeStock){
        st.affiche();
      }
    }

    public void afficheSynthese()
    {
        System.out.println(nom);
        System.out.println("Prix de l'échantillon :"+prixEch+" €");
        System.out.println("Prix de vente :"+prixVente+" €");
    }
    public double calculeMarge()
    {
        return prixVente-prixEch;
    }

    public double pourcentMarge()
    {
        return 100*calculeMarge()/prixEch;
    }
    public double getPrixEch()
    {
        return prixEch;
    }
    public String getNom()
    {
        return nom;
    }

    public ArrayList<Professionnel> getListePro(){
      return listePro;
    }
    public void setListePro(ArrayList<Professionnel> liste)
    {
      listePro=liste;
    }

    public void ajoutProf(Professionnel p){
      listePro.add(p);
      ArrayList<Medicament> listedesMedic = p.getListeMedic();
      listedesMedic.add(this);
      p.setListeMedic(listedesMedic);
    }

    public void ajoutStock(StockMed st)
    {
      listeStock.add(st);
    }


}
