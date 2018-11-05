package DPFactorySingleton.main;

import DPFactorySingleton.src.Factory;
import DPFactorySingleton.src.IProduct;

public class Client
{

    public static void main(String[] args)
    {
        Factory f = Factory.getInstance();
        IProduct p = f.CreateProduct("en");
        p.showProduct();
        
    }

}
