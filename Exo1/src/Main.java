public class Main {

    public static void crierZoo (Zoo zoo) {
        zoo.ajouterAnimal(new Animal("Catherine", 10));
        zoo.ajouterAnimal(new Animal("Gwen", 10));
        zoo.ajouterAnimal(new Animal("Mathias", 10));
        zoo.ajouterAnimal(new Animal("Matthieu", 10));
        zoo.ajouterAnimal(new Animal("Nicolas", 10));
        zoo.ajouterAnimal(new Animal("Sylvain", 10));
        zoo.crier();
    }
    
    public static void main (String[] args) {
        Zoo Ensimag = new Zoo("Ensimag");
        crierZoo(Ensimag);
    }
}
