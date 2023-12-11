import insurance.Insurance;
import insurance_case.Insurance_case;
import observers.Observable;
import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Accident implements Observable {

    private final List<Observer> observers = new ArrayList<>();
    private Insurance insurance;

    private Insurance_case insurance_case;

    public void addInsurance(Insurance insurance) {
        this.insurance = insurance;
        notifyObservers(String.format("Insurance type is %s", insurance.getName()));
    }

    public void addInsurance_case(Insurance_case insurance_case) {
        this.insurance_case = insurance_case;
        notifyObservers(String.format("Accident type is %s", insurance_case.getName()));
    }


    public void calculateInsurance() {
        notifyObservers("The final insurance payment");
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.notify(message);
        }
    }
}
