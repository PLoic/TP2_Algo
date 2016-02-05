public class Main {

    public static void crierZoo (Zoo zoo) {
        zoo.ajouterAnimal(new Vache("Catherine", 10, 4));
        zoo.ajouterAnimal(new Canard("Gwen", 10, "noir tuxien"));
        zoo.ajouterAnimal(new Lion("Mathias", 10));
        zoo.ajouterAnimal(new Vache("Matthieu", 10, 5));
        zoo.ajouterAnimal(new Lion("Nicolas", 10));
        zoo.ajouterAnimal(new Vache("Sylvain", 10, 6));
        zoo.crier();
    }

    public static void getCoutGlobal(Zoo zoo) {
        System.out.println(zoo.getCoutGlobal());
    }
    
    public static void main (String[] args) {
        Zoo Ensimag = new Zoo("Ensimag");
        crierZoo(Ensimag);
        getCoutGlobal(Ensimag);
    }
}
