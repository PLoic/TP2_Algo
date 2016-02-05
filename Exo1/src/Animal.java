/**
 * Created by paulettl on 05/02/16.
 */
public class Animal {

    private String name;
    private Integer weight;
    private  Regime regime;

    public Animal(String name, Integer weight, Regime regime) {
        this.name = name;
        this.weight = weight;
        this.regime = regime;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public double getCout(){
        return regime.getPricePerKg();
    }

    public void crier(){
        System.out.println(name + " crie...");
    }


    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }
}
