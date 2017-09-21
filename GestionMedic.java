public class GestionMedic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Medicament doli = new Medicament("Doliprane",
                "soulage les mots de tête",
                "1 comprimé toutes les 6 heures", 2.5, 2.8);
        StockMed stDoli= new StockMed(doli, 150,100,200);
        Medicament strep = new Medicament("Strepsil",
                "soulage les maux de gorge",
                "1 pastille toutes les 2 heures", 3.5, 4.2);
        StockMed stStrep= new StockMed(strep, 100,90,50);
        Medicament arnica = new Medicament("Arnica",
                "apaise les douleurs de coups et bosses",
                "Appliquer sur le choc", 4.2, 5.5);
        StockMed stArnica= new StockMed(arnica, 250,120,300);
        Medicament asp = new Medicament("Aspirine",2.8, 3.5);
        StockMed stAsp = new StockMed(asp,100,50,100);
        //utilisation des méthodes
        System.out.println("====Lundi====");
        stStrep.supprimeStock(25);
        stDoli.supprimeStock(100);
        stArnica.supprimeStock(100);
        System.out.println("====Mardi====");
        stStrep.ajoutStock(50);
        stDoli.ajoutStock(200);
        System.out.println("====Mercredi====");
        double prixTot=stDoli.prixStock() +stStrep.prixStock()
                +stArnica.prixStock()+stAsp.prixStock();
        System.out.println("Le prix total est "+prixTot+" euros");
        if (asp.calculeMarge()>doli.calculeMarge())
            System.out.println(asp.getNom()+" a la plus grande marge");
        else if (asp.calculeMarge()==doli.calculeMarge())
            System.out.println("Les 2 médicaments ont la même marge");
        else
            System.out.println(doli.getNom()+"a la plus grande marge");
        double margemini=doli.pourcentMarge();
        Medicament medicMini=doli;
        if (asp.pourcentMarge()<margemini)
        {
            margemini=asp.pourcentMarge();
            medicMini=asp;
        }
        if (strep.pourcentMarge()<margemini)
        {
            margemini=strep.pourcentMarge();
            medicMini=strep;
        }
        if (arnica.pourcentMarge()<margemini)
        {
            margemini=arnica.pourcentMarge();
            medicMini=arnica;
        }
        System.out.println("Le médicament avec la plus petite marge est "+medicMini.getNom());
        System.out.println("====Jeudi====");
        stDoli.affiche();
        stStrep.affiche();
        stArnica.affiche();
        stAsp.affiche();
    }

}
