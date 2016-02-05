import java.util.LinkedList;

public class Zoo {

    private String name;
    private LinkedList<Animal> animals;

    public Zoo (String nom) {
        this.name = nom;
        this.animals = new LinkedList<Animal>();
    }

    public int getNbAnimaux () {
        return animals.size();
    }

    public void ajouterAnimal (Animal animal) {
        animals.add(animal);
    }

    public void crier() {
        for (Animal a : animals) {
            a.crier();
        }
    }

    public String toString() {
        return "Zoo " + name + " contient : " + animals;
    }

    public double getCoutGlobal() {
        double somme = 0;
        for (Animal a : animals) {
            somme += a.getCout();
        }
        return somme;
    }
}
