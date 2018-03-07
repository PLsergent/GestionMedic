/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionMedic;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author myria
 */
public class Annee {
    //liste des mois
    public static ArrayList listeMois=new ArrayList()
    {{add("janvier");add("février");add("mars");add("avril");add("mai");add("juin");
    add("juillet");add("aout");add("septembre");add("octobre");
    add("novembre");add("décembre");}};
    //annee en cours
    private int annee;
    //jours de l'année
    private ArrayList<Jour> lesJours = new ArrayList();

    /**
     * Constructeur pour une année à compléter
     * @param annee
     */
    public Annee(int annee, ArrayList<Jour> lesJours)
    {
        this.annee = annee;
        listeJour = lesJours;
        int mois = 1;
        while (listeJour.size()<365){
          int jour = 1;
          while (mois <= 7){
            if (mois%2 != 0){
              while (jour < 31){
                listeJour.add(Jour(jour, mois));
                jour = jour + 1;
              }
            }
            if (mois == 2){
              while(jour < 28){
                listeJour.add(Jour(jour, mois));
                jour = jour + 1;
              }
            }
            if (mois%2 == 0 && mois != 2){
              while (jour < 30){
                listeJour.add(Jour(jour, mois));
                jour = jour + 1;
              }
            }
            mois = mois + 1;
          }
          while (mois <= 12){
            if (mois%2 == 0){
              while (jour < 31){
                listeJour.add(Jour(jour, mois));
                jour = jour + 1;
              }
            }
            if (mois%2 != 0){
              while (jour < 30){
                listeJour.add(Jour(jour, mois));
                jour = jour + 1;
              }
            }
            mois = mois + 1;
          }
        }
        //créer tous les jours de l'année
        //paramétrer les jours non ouvrables :
        // week-end, 1 janvier, 1 mai, 8 mai, 14 juillet, 15 aout
        // 11 novembre, 25 décembre
        //par soucis de simplification, on ignore les jours non fixes
    }
    public String toString()
    {
       return "l'année "+annee+"contient "+lesJours.size()+"jours";
    }
    public  ArrayList<Jour> getlesJours()
    {
        return lesJours;
    }
    public  ArrayList<Jour> getlesJoursDuMois(int mois)
    {
        ArrayList<Jour> leMois=new ArrayList();
        for(Jour unJour :lesJours)
        {
            if (unJour.getNumMois()==mois)
                leMois.add(unJour);
        }
        return leMois;
    }
    public Jour getUnJour(int nbJour,int nbMois)
    {
        for(Jour unJour :lesJours)
        {
            if(unJour.getNumMois()==nbMois && unJour.getNumJour()==nbJour)
                return unJour;
        }
        return null;
    }
    /**
     *
     * @param jour
     * @param mois
     * @param annee
     * @return le jour de la semaine de la date passée en paramètres
     *          1 pour dimanche, 2 pour lundi..., 7 pour samedi
     */
     public static int getJour(int jour, int mois, int annee)
   {
       try{
                SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
                String date =jour+"/"+mois+"/"+annee;
                Date dt1=format1.parse(date);
                Calendar c = Calendar.getInstance();

                c.setTime(dt1);

                int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
                return dayOfWeek;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return -1;
        }
   }

}
