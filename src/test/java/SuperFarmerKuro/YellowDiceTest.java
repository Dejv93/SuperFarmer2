package SuperFarmerKuro;

import SuperFarmerKuro.animal.AnimalBase;
import SuperFarmerKuro.dices.DiceRoll;
import SuperFarmerKuro.dices.YellowDice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YellowDiceTest {
    DiceRoll yellowDice;

    @Before
    public void setUp() {
        yellowDice = new YellowDice();
    }

    @Test
    public void givenSpecificRollReturnProperAnimal() {
        Assert.assertEquals(AnimalBase.PIG.getName(), yellowDice.giveRollResult(8)  );
        Assert.assertEquals(AnimalBase.RABBIT.getName(), yellowDice.giveRollResult(4)  );
        Assert.assertEquals(AnimalBase.WOLF.getName(), yellowDice.giveRollResult(11)  );
    }

    @Test
    public void givenWrongRollResultsReturnEmptyString(){
        Assert.assertEquals("", yellowDice.giveRollResult(12));
        Assert.assertNotEquals(AnimalBase.FOX.getName(), yellowDice.giveRollResult(11)  );
    }


}