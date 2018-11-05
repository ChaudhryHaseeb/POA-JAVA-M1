package DPFactorySingleton.src;

public class Factory
{

    private static Factory instance;

    private Factory()
    {

    }

    public static synchronized Factory getInstance()
    {
        if (instance == null)
        {
            instance = new Factory();
        }
        return instance;
    }

    public IProduct CreateProduct(String langue)
    {
        switch(langue)
        {
            case "fr":
                return  new ProductFr();
            case "es":
                return new ProductEs();
            case "en":
                return new ProductEn();
            default:
                return null;
        }
    }
}
