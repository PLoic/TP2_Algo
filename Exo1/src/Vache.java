/**
 * Created by paulettl on 05/02/16.
 */
public class Vache extends Animal {

    private Integer nbSpots;

    public Vache(String name, Integer weight, Integer nbSpots) {
        super(name, weight);
        this.nbSpots = nbSpots;
    }


    @Override
    public void crier() {
        System.out.println(super.getName() + " vache de " + super.getWeight() + " kg aux belles " + nbSpots
                + " , taches crie... il meugle\n "  );
    }

    @Override
    public String toString() {
        return "Vache{" +
                "name=" + super.getName() +
                "weight=" + super.getWeight() +
                "nbSpots='" + nbSpots + '\'' +
                '}';
    }

    public Integer getNbSpots() {
        return nbSpots;
    }
}
