package Logement;

import Logement.base.Lit;
import Logement.base.Piece;
import Logement.base.Truc;
import Logement.base.Univers;
import Logement.visiteur.Visiteur;
import Logement.visiteur.VisiteurAnglais;
import Logement.visiteur.VisiteurComptage;
import Logement.visiteur.VisiteurFrancais;

public class MainLogement
{
    public static void main(String[] args){
        Truc l = new Lit();
        Piece p = new Piece("chambre");
        p.ajouter(l);
        Univers u = new Univers();
        u.ajouter(p);

        Visiteur v = new VisiteurFrancais();
        v.visit(u);

        Visiteur ve = new VisiteurAnglais();
        ve.visit(u);

        Visiteur co = new VisiteurComptage();
        u.accept(co);
        System.out.println(co.value());
    }
}
