package plants;

public class Juniper extends Evergreen{

    private final int STARTER_PRODUCTION = 14;

    @Override
    public String toString() {
        return "Juniper{" +
                "production=" + production +
                '}';
    }

    public Juniper() {
        production = STARTER_PRODUCTION;
    }
}
