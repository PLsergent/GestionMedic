package gestionMedic;
import java.util.*;

public class Pharmacie extends Professionnel{
  private String responsable;

  public Pharmacie(){
    super();
    responsable="";
  }

  public Pharmacie(String n,String a, String t, String r){
    super (n,a,t);
    responsable=r;
  }

  public String getResp(){
    return responsable;
  }

  public String toString(){
    String chaine = super.toString();
    chaine += " "+responsable;
    return chaine;
    //ou
    // return super.toString()+" nom responsable "+responsable;
  }
}
