package Rps.fr.parisnanterre.miage.poa.rps;

public enum RPSEnum
{
    ROCK(0),
    PAPER(1),
    SCISSORS(2);

    private int value;

    RPSEnum(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}
