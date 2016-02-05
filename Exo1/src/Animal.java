/**
 * Created by paulettl on 05/02/16.
 */
public class Animal {

    private String name;
    private Integer weight;


    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
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
