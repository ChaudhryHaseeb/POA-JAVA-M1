package fr.parisnanterre.miage.poa.universite.implem;

public class Doctorant extends Etudiant
{

    public Doctorant(String nom, String prenom, String numeroSecu)
    {
        super(nom, prenom, numeroSecu, EchelonBourse.Doctorant);
    }

    @Override
    public String toString() {
        return String.format("Doctorant %s", super.toString());
    }
}
