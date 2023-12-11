package insurance_case;

public abstract class Insurance_case {
    private final String name;

    private final Integer payout;

    public Insurance_case(String name, Integer payout){
        this.name = name;
        this.payout = payout;
    }

    public String getName() {return name;}

    public Integer getPayout() {return payout;}

}
