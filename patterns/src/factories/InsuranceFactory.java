package factories;

import insurance.Insurance;
import insurance.KASKO;
import insurance.OSAGO;

public class InsuranceFactory {
    public Insurance createOSAGO() { return new OSAGO(); }

    public Insurance createKASKO() {
        return new KASKO();
    }
}
