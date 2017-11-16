package gestionMedic;
import java.util.*;

public class negatifException extends Exception{
  public negatifException (String attribut)
  {
    super(attribut+" ne doit pas être négatif");
  }
}
