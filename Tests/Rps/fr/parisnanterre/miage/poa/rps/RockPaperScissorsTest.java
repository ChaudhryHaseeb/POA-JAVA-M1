package Rps.fr.parisnanterre.miage.poa.rps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RockPaperScissorsTest
{
    RockPaperScissors game;

    @BeforeMethod
    public void setUp() throws Exception
    {
        game = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() throws Exception
    {
        game = null;
    }

    @Test
    public void testPlay() throws Exception
    {
        assertEquals(game.play(RPSEnum.PAPER, RPSEnum.ROCK), Result.WIN);
    }



}