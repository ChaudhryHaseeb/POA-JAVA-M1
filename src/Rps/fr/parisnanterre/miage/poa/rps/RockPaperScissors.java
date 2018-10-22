package Rps.fr.parisnanterre.miage.poa.rps;

public class RockPaperScissors
{

    Result play(RPSEnum p1, RPSEnum p2)
    {
        if(p1 == RPSEnum.PAPER && p2 == RPSEnum.ROCK)
        {
            return Result.WIN;
        }

        if(p1 == RPSEnum.PAPER && p2 == RPSEnum.SCISSORS)
        {
            return Result.LOOSE;
        }

        if(p1 == RPSEnum.SCISSORS && p2 == RPSEnum.ROCK)
        {
            return Result.LOOSE;
        }

        if(p1 == RPSEnum.SCISSORS && p2 == RPSEnum.PAPER)
        {
            return Result.WIN;
        }

        if(p1 == RPSEnum.ROCK && p2 == RPSEnum.SCISSORS)
        {
            return Result.WIN;
        }

        if(p1 == RPSEnum.ROCK && p2 == RPSEnum.PAPER)
        {
            return Result.LOOSE;
        }

        if(p1 == p2)
        {
            return Result.TIE;
        }



        return Result.LOOSE;
    }

}
