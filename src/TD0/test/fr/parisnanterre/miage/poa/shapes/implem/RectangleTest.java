package TD0.test.fr.parisnanterre.miage.poa.shapes.implem;

import TD0.src.fr.parisnanterre.miage.poa.shapes.implem.Point2D;
import TD0.src.fr.parisnanterre.miage.poa.shapes.implem.Rectangle;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTest
{
    Rectangle r1;

    @BeforeMethod
    public void setUp() throws Exception
    {
        Point2D p = new Point2D(0,0);
        r1 = new Rectangle(p, 4,3);
    }

    @AfterMethod
    public void tearDown() throws Exception
    {
        r1 = null;
    }

    @Test
    public void testSurface() throws Exception
    {
        assertEquals(r1.perimeter(), 14);
    }

    @Test
    public void testPerimeter() throws Exception
    {
        assertEquals(r1.surface(), 12);
    }

}