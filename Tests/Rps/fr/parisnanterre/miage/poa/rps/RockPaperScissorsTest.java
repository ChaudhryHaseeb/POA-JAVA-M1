package Rps.fr.parisnanterre.miage.poa.rps;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class RockPaperScissorsTest
{
    RockPaperScissors game;

    @DataProvider(name= "winData")
    public Object[][] createDataWin(){
        return new Object[][] {
                {RPSEnum.ROCK, RPSEnum.SCISSORS},
                {RPSEnum.SCISSORS, RPSEnum.PAPER},
                {RPSEnum.PAPER, RPSEnum.ROCK}
        };
    }

    @DataProvider(name= "looseData")
    public Object[][] createDataLoose(){
        return new Object[][] {
                {RPSEnum.ROCK, RPSEnum.PAPER},
                {RPSEnum.SCISSORS, RPSEnum.ROCK},
                {RPSEnum.PAPER, RPSEnum.SCISSORS}
        };
    }

    @DataProvider(name= "tieData")
    public Object[][] createDataTie(){
        return new Object[][] {
                {RPSEnum.ROCK, RPSEnum.ROCK},
                {RPSEnum.SCISSORS, RPSEnum.SCISSORS},
                {RPSEnum.PAPER, RPSEnum.PAPER}
        };
    }


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


    @Test(dataProvider = "winData")
    public void testPlayWin(RPSEnum p1, RPSEnum p2) throws Exception
    {
        assertEquals(game.play(p1, p2), Result.WIN);
    }

    @Test(dataProvider = "looseData")
    public void testLostPlay(RPSEnum p1, RPSEnum p2) throws Exception
    {
        assertEquals(game.play(p1, p2), Result.LOOSE);
    }

    @Test(dataProvider = "tieData")
    public void testTiePlay(RPSEnum p1, RPSEnum p2) throws Exception
    {
        assertEquals(game.play(p1, p2), Result.TIE);
    }


}