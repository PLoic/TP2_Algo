/**
 * Created by paulettl on 05/02/16.
 */
public class Lion extends Animal {

    public Lion(String name, Integer weight) {
        super(name, weight, new Regime("viande", 10));
    }

    @Override
    public void crier() {
        System.out.println(super.getName() + " lion de " + super.getWeight() + " kg crie... il rugit\n "  );
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name=" + super.getName() +
                "weight=" + super.getWeight() +
                '}';
    }

    @Override
    public double getCout() {
        return super.getWeight()*super.getCout();
    }
}
