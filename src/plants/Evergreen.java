package plants;

public abstract class Evergreen extends Plant {
    private final int MAX_PRODUCTION = 70;

    public void growLeaves(){
        growing(8);
    }

    public void speak(){
        System.out.println(this.getClass().getSimpleName() + "at full production!");
    }

    public void isProductionAtMax(){
        if (production > 70){
            setProduction(70);
            this.speak();
        }
    }

}
