package TD0.src.fr.parisnanterre.miage.poa.shapes.implem;

import TD0.src.fr.parisnanterre.miage.poa.shapes.api.Mesureable2D;
import TD0.src.fr.parisnanterre.miage.poa.shapes.api.Translatable2D;

public abstract class Shape2D implements Mesureable2D, Translatable2D
{
    Point2D refPoint;

    public Shape2D(Point2D refPoint)
    {
        this.refPoint = refPoint;
    }

    @Override
    public Point2D getRefPoint()
    {
        return refPoint;
    }

    @Override
    public void translate(double dx, double dy)
    {
        refPoint.setX(refPoint.getX() + dx);
        refPoint.setY(refPoint.getY() + dy);
    }

}
