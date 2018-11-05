package DPFactorySingleton.src;

public class ProductEn implements IProduct
{
     ProductEn() {
    }

    @Override
    public void showProduct()
    {
        System.out.println("I'm a product");
    }
}
