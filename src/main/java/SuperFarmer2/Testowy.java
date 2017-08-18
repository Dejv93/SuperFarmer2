package SuperFarmer2;

import SuperFarmer2.dices.DiceRoll;
import SuperFarmer2.dices.RedDice;

public class Testowy {

    public static void main(String[] args){
        DiceRoll redDice = new RedDice();
        RedDice redDice2 = new RedDice();
        redDice.rollADice();
        redDice2.rollADice();
    }
}