package DPFactorySingleton.src;

public class ProductEs implements IProduct
{
    ProductEs() {
    }

    @Override
    public void showProduct()
    {
        System.out.println("Soy un producto");
    }
}
