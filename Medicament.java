public class Medicament {
    private String nom;
    private String effet;
    private String posologie;
    private double prixEch;
    private double prixVente;

    public Medicament()
    {
        nom="";
        effet="";
        posologie="";
        prixEch=0;
        prixVente=0;
    }

    public Medicament(String n, String e, String p, double pe, double pv)
    {
        nom=n;
        effet=e;
        posologie=p;
        prixEch=pe;
        prixVente=pv;
    }
    public Medicament(String n, double pe, double pv)
    {
        nom=n;
        effet="";
        posologie="";
        prixEch=pe;
        prixVente=pv;
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
}
