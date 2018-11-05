package Rps.fr.parisnanterre.miage.poa.rps;

import java.util.ArrayList;
import java.util.List;

public class Player
{
    private String nom;
    private int Score;
    private List<RPSEnum> myList = new ArrayList<>(10);


    public Player(String nom, List<RPSEnum> myList)
    {
        this.nom = nom;
        this.myList = myList;
    }

    public Player(String nom)
    {
    }


}
