package SuperFarmer2;

import SuperFarmer2.animal.Animal;
import SuperFarmer2.animal.AnimalCreator;
import SuperFarmer2.animal.Rabbit;
import SuperFarmer2.dices.DiceRoll;
import SuperFarmer2.dices.RedDice;
import SuperFarmer2.dices.RollReward;
import SuperFarmer2.dices.YellowDice;

public class Game {
    public static void main(String[] args) {
        DiceRoll yellowDice = new YellowDice();
        System.out.println(yellowDice.makeARoll());
        DiceRoll redDice = new RedDice();
        System.out.println(redDice.makeARoll());

        AnimalCreator.createAnimals();


    }
}
