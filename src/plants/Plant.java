package plants;

public abstract class Plant {
    protected int production;

    public void setProduction(int production) {
        this.production = production;
    }

    public int getProduction() {
        return production;
    }

    public void defaultGrowing(){
        growing(4);
    }

    public void growing(int growBy) {
        production += growBy;
    }

}
