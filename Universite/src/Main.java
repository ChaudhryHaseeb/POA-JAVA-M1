import fr.parisnanterre.miage.poa.universite.api.IBoursier;
import fr.parisnanterre.miage.poa.universite.api.IEnseignantPermanent;
import fr.parisnanterre.miage.poa.universite.implem.Doctorant;
import fr.parisnanterre.miage.poa.universite.implem.Personnel;
import fr.parisnanterre.miage.poa.universite.implem.Professeur;

import java.util.Date;

import static fr.parisnanterre.miage.poa.universite.implem.EchelonBourse.Doctorant;


public class Main
{
    public static void main(String[] args)
    {
        Personnel p1 = new Doctorant("Chaudhry", "Haseeb","12345", Doctorant);
        System.out.println(p1);
        System.out.println(((IBoursier)p1).montantBourse());

        IEnseignantPermanent pro = new Professeur("poizat", "pascal", "3453",new Date(),3000.0, "Des choses");
        System.out.println(pro);

    }
}
