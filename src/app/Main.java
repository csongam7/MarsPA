package app;

import farm.Farm;
import plants.Almond;
import plants.Juniper;
import plants.Plant;
import plants.Spruce;

public class Main {
    public static void main(String[] args){
        Farm farm = new Farm();
        Plant p1 = new Spruce();
        Plant p2 = new Spruce();
        Plant p3 = new Almond();
        Plant p4 = new Almond();
        Plant p5 = new Juniper();
        Plant p6 = new Juniper();
        farm.addPlant(p1);
        farm.addPlant(p2);
        farm.addPlant(p3);
        farm.addPlant(p4);
        farm.addPlant(p5);
        farm.addPlant(p6);
        System.out.println(farm.allProducedFood());
    }
}
