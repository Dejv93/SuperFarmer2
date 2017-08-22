package SuperFarmer2.dices;

import SuperFarmer2.animal.AnimalBase;
import SuperFarmer2.Game;

public class RollReward {


    public int[] calculateBonusAnimalCount() {

        int[] bonusAnimalArray = new int[]{0, 0, 0, 0, 0, 0, 0};

        DiceRoll yellowDice = new YellowDice();
        System.out.println(yellowDice.makeARoll());
        DiceRoll redDice = new RedDice();
        System.out.println(redDice.makeARoll());

        for (int i = 0; i < bonusAnimalArray.length; ++i) {
            bonusAnimalArray[i] = (yellowDice.executeRoll()[i] + redDice.executeRoll()[i]);
        }
            return bonusAnimalArray;

    }

    public int[] calculateAnimalReward() {
        int[] rewardAnimalArray = this.calculateBonusAnimalCount();

        for (int i = 0; i < rewardAnimalArray.length; ++i) {

            rewardAnimalArray[i] = (rewardAnimalArray[i]) / 2;
        }

        return rewardAnimalArray;
    }


}

