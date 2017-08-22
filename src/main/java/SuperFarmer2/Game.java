package SuperFarmer2;

import SuperFarmer2.animal.*;
import SuperFarmer2.dices.DiceRoll;
import SuperFarmer2.dices.RedDice;
import SuperFarmer2.dices.RollReward;
import SuperFarmer2.dices.YellowDice;

import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        DiceRoll yellowDice = new YellowDice();
        System.out.println(yellowDice.makeARoll());
        DiceRoll redDice = new RedDice();
        System.out.println(redDice.makeARoll());


        Farm farm = new Farm();
        farm.changeAnimalQuantity(AnimalBase.RABBIT, 5);
        System.out.println(Arrays.toString(farm.getFarmAnimalsArray()));

    }
}

