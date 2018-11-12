package Logement.visiteur;

import Logement.base.*;

public interface Visiteur
{
    Object value();
    public void visit(Bureau b);
    public void visit(CollectionDeLivres cl);
    public void visit(GardeRobe g);
    public void visit(Lamp lmp);
    public void visit(Lit lit);
    public void visit(Piece p);
    public void visit(Univers u);
    public void visit(Vetement v);
}
