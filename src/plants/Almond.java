package plants;

import util.RandomUtil;

public class Almond extends Plant implements Events {

    public static final int MUSHROOM_CHANCE = 8;
    public static final int MUSHROOM_GROWING = 10;
    public static final int ROTTING_CHANCE = 4;
    public static final int ROTTING_VALUE = -18;
    private final int STARTER_PRODUCTION = 50;

    public Almond() {
        production = STARTER_PRODUCTION;
    }

    public static int getMushroomChance() {
        return MUSHROOM_CHANCE;
    }

    public static int getMushroomGrowing() {
        return MUSHROOM_GROWING;
    }

    public static int getRottingChance() {
        return ROTTING_CHANCE;
    }

    public static int getRottingValue() {
        return ROTTING_VALUE;
    }

    public void productionUnder40(){
        if (production < 40){
            production = production*2;
        }
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
    public void mushroomGrowing(){
        RandomUtil random = new RandomUtil();
        if (random.chanceCalculator(MUSHROOM_CHANCE)){
            growing(MUSHROOM_GROWING);
        }
    }

    @Override
    public String toString() {
        return "Almond{" +
                "production=" + production +
                '}';
    }

    @Override
    public void checkIfRotted() {
        if (production <= 0){
            setProduction(0);
        }

    }
}
