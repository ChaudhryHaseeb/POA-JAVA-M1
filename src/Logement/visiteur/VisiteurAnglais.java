package Logement.visiteur;

import Logement.base.*;

public class VisiteurAnglais implements Visiteur
{
    public VisiteurAnglais()
    {

    }

    @Override
    public Object value() {
        return null;
    }

    @Override
    public void visit(Bureau b)
    {
        System.out.println("IAM un bureau");
        for (Truc t : b.trucs)
        {
            t.accept(this);
        }
    }

    @Override
    public void visit(CollectionDeLivres cl)
    {
        System.out.println("IAM une collection de " + cl.nbLivres + " livres.");
    }

    @Override
    public void visit(GardeRobe g)
    {
        System.out.println("IAM un garde robe");
        for (Truc t : g.vetements)
        {
            t.accept(this);
        }
    }

    @Override
    public void visit(Lamp lmp)
    {
        System.out.println("IAM une lampe");

    }

    @Override
    public void visit(Lit lit)
    {
        System.out.println("IAM un lit");
    }

    @Override
    public void visit(Piece p)
    {
        System.out.println("IAM une piece");
        for (Truc t : p.trucs)
        {
            t.accept(this);
        }
    }

    @Override
    public void visit(Univers u)
    {
        System.out.println("IAM un univers");
        for (Piece p : u.pieces)
        {
            p.accept(this);
        }

    }

    @Override
    public void visit(Vetement v)
    {
        System.out.println("IAM un vetement");
    }
}
