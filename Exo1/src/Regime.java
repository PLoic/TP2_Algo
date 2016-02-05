/**
 * Created by paulettl on 05/02/16.
 */
public class Regime {

    private String name;
    private double pricePerKg;


    public Regime(String name, double pricePerKg) {
        this.name = name;
        this.pricePerKg = pricePerKg;
    }

    public String getName() {
        return name;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }
}
