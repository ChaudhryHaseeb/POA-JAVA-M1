import fr.parisnanterre.miage.poa.universite.implem.Etudiant;
import fr.parisnanterre.miage.poa.universite.implem.Personnel;

import static fr.parisnanterre.miage.poa.universite.implem.EchelonBourse.Doctorant;


public class Main
{
    public static void main(String[] args)
    {
        Personnel p1 = new Etudiant("Chaudhry", "Haseeb","12345",Doctorant);
        System.out.println(p1.toString());
    }
}
