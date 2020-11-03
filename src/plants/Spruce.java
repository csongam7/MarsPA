package plants;

import util.RandomUtil;

public class Spruce extends Evergreen implements Events {


    public static final int ROTTING_VALUE = -20;
    public static final int ROTTING_CHANCE = 4;
    public static final int CHANCE_OF_MUSHROOM = 5;
    public static final int MUSHROOM_GROWING = 15;
    private final int STARTER_PRODUCTION = 26;

    @Override
    public String toString() {
        return "Spruce{" +
                "production=" + production +
                '}';
    }

    public static int getRottingValue() {
        return ROTTING_VALUE;
    }

    public static int getRottingChance() {
        return ROTTING_CHANCE;
    }

    public static int getChanceOfMushroom() {
        return CHANCE_OF_MUSHROOM;
    }

    public static int getMushroomGrowing() {
        return MUSHROOM_GROWING;
    }

    public Spruce() {
        production = STARTER_PRODUCTION;
    }


    @Override
    public void rotting() {
        RandomUtil random = new RandomUtil();
        if (random.chanceCalculator(ROTTING_CHANCE)){
            growing(ROTTING_VALUE);
            System.out.println("ASDKKIWIEUEUWEUWUEWUEUWUEWBDWIBDWDDW");
        }

    }

    @Override
    public void mushroomGrowing() {
        RandomUtil random = new RandomUtil();
        if (random.chanceCalculator(CHANCE_OF_MUSHROOM)){
            growing(MUSHROOM_GROWING);
    }
}

    @Override
    public void checkIfRotted() {
        if (production <= 0){
            setProduction(0);
    }
}
}
