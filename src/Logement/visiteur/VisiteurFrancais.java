package Logement.visiteur;

import Logement.base.*;

public class VisiteurFrancais implements Visiteur
{

    public VisiteurFrancais() {
    }

    @Override
    public Object value() {
        return null;
    }

    @Override
    public void visit(Bureau b)
    {
        System.out.println("Je suis un bureau");
        for (Truc t : b.trucs)
        {
            t.accept(this);
        }
    }

    @Override
    public void visit(CollectionDeLivres cl)
    {
        System.out.println("Je suis une collection de " + cl.nbLivres + " livres.");
    }

    @Override
    public void visit(GardeRobe g)
    {
        System.out.println("Je suis un garde robe");
        for (Truc t : g.vetements)
        {
            t.accept(this);
        }
    }

    @Override
    public void visit(Lamp lmp)
    {
        System.out.println("Je suis une lampe");

    }

    @Override
    public void visit(Lit lit)
    {
        System.out.println("Je suis un lit");
    }

    @Override
    public void visit(Piece p)
    {
        System.out.println("Je suis une piece");
        for (Truc t : p.trucs)
        {
            t.accept(this);
        }
    }

    @Override
    public void visit(Univers u)
    {
        System.out.println("Je suis un univers");
        for (Piece p : u.pieces)
        {
            p.accept(this);
        }

    }

    @Override
    public void visit(Vetement v)
    {
        System.out.println("Je suis un vetement");
    }
}
