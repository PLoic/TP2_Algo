/**
 * Created by paulettl on 05/02/16.
 */
public class Canard extends Animal {

    private String color;

    public Canard(String name, Integer weight, String color) {
        super(name, weight);
        this.color = color;
    }

    @Override
    public void crier() {
        System.out.println(super.getName() + " canard de " + super.getWeight() + " kg aux belles plumes " + color
                + " , crie... il cancane\n "  );
    }

    @Override
    public String toString() {
        return "Canard{" +
                "name=" + super.getName() +
                "weight=" + super.getWeight() +
                "color='" + color + '\'' +
                '}';
    }
}
