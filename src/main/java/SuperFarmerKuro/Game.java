package SuperFarmerKuro;

import SuperFarmerKuro.animal.Animal;
import SuperFarmerKuro.animal.Rabbit;
import SuperFarmerKuro.dices.DiceRoll;
import SuperFarmerKuro.dices.YellowDice;

public class Game {
    public static void main(String[] args) {
        DiceRoll yellowDice = new YellowDice();
        System.out.println(yellowDice.makeARoll());

        Animal animal = new Rabbit();
        System.out.println(animal.printViableTrades());
    }
}
