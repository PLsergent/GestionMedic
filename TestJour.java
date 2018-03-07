package gestionMedic;
import junit.*;
import static junit.Assert.*;

public class TestJour {
  public void chercheCreneau(){
    Professionnel p = new Professionnel ("Medicplus","adresse","tel");
    RendezVous rdv = new RendezVous(9,"rendez",p);

    Jour jrs = new Jour(8,12);

    int heure = jrs.chercheCreneau(rdv);
    assertEquals(heure,9);
  }
}
