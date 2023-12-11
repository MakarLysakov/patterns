package insurance;

public abstract class Insurance {
    private final String name;
    private final Integer maximum_payout;

    public Insurance(String name, Integer maximum_payout) {
        this.name = name;
        this.maximum_payout = maximum_payout;
    }

    public String getName() {
        return name;
    }

    public Integer getMaximum_payout() {
        return maximum_payout;
    }

}
