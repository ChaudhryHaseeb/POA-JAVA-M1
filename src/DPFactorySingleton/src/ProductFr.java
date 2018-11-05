package DPFactorySingleton.src;

public class ProductFr implements IProduct
{
    ProductFr() {
    }

    @Override
    public void showProduct()
    {
        System.out.println("Je suis un produit");
    }
}
