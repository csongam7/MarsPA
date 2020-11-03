package util;

import java.util.Random;

public class RandomUtil {
    Random random = new Random();

    public boolean chanceCalculator(int chance){
        return random.nextInt(100) < chance;
    }
}
