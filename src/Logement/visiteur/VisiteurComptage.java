package Logement.visiteur;

import Logement.base.*;

public class VisiteurComptage implements Visiteur
{
    private int cpt;

    public VisiteurComptage()
    {
        this.cpt = 0;
    }

    @Override
    public Object value() {
        return cpt;
    }

    @Override
    public void visit(Bureau b)
    {
        cpt++;
        for (Truc t : b.trucs)
        {
            t.accept(this);
        }
    }

    @Override
    public void visit(CollectionDeLivres cl)
    {
        cpt++;
    }

    @Override
    public void visit(GardeRobe g)
    {
        cpt++;
        for (Truc t : g.vetements)
        {
            t.accept(this);
        }
    }

    @Override
    public void visit(Lamp lmp)
    {
        cpt++;
    }

    @Override
    public void visit(Lit lit)
    {
        cpt++;
    }

    @Override
    public void visit(Piece p)
    {
        for (Truc t : p.trucs)
        {
            t.accept(this);
        }
    }

    @Override
    public void visit(Univers u)
    {
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
