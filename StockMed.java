public class StockMed {
    private Medicament medic;
    private double qteStock;
    private double seuil;
    private double qteCde;

    //constructeur vide
    public StockMed()
    {
        medic = new Medicament();
        qteStock=0;
        seuil=0;
        qteCde=0;
    }
    //constructeur avec paramètres
    public StockMed(Medicament m, double st, double se, double qc)
    {
        medic=m;
        qteStock=st;
        seuil=se;
        qteCde=qc;
    }

    //affichage des informations du stock
    public void affiche()
    {
        medic.affiche();
        System.out.println("Quantité en stock: "+qteStock);
    }
    //ajout de médicaments au stock
    public void ajoutStock(double qte)
    {
        qteStock+=qte;
    }
    //suppression de médicaments du stock
    public void supprimeStock(double qte)
    {
        qteStock-=qte;
        if (qteStock<seuil)
        {
            System.out.println("Commande de "+qteCde+"déclenchée");
        }
    }
    //calcul du cout du stock
    public double prixStock()
    {
        return qteStock*medic.getPrixEch();
    }

    public double getStock()
    {
      return qteStock;
    }

    public Medicament getMedic()
    {
      return medic;
    }

}
