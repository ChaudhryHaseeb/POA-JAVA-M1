package fr.parisnanterre.miage.poa.shapes.implem;

public class Rectangle extends Shape2D
{
    private double length;
    private double width;

    public Rectangle(Point2D refPoint, double length, double width)
    {
        super(refPoint);
        this.length = length;
        this.width = width;
    }

    @Override
    public double surface()
    {
        return 2*length + 2*width;
    }

    @Override
    public double perimeter()
    {
        return length * width;
    }
}
