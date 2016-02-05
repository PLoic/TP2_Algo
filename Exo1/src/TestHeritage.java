public class TestHeritage {

    public static void main (String[] args) {
        Canard donald = new Canard("Canardo", 5, "noir tuxien");
        Animal tux = donald;

        System.out.println("Faisons crier Donald deux fois... ");
        donald.crier();
        tux.crier();

        System.out.println("Oh les belles plumes " + donald.getColor());
        //System.out.println("Oh les belles plumes " + tux.getColor());
        
        Lion simba = new Lion("Simba", 243);
        Animal unAnimal = simba;

        unAnimal = new Lion("Leo", 332);
        Lion leo = (Lion) unAnimal;

        unAnimal = new Animal("Leo", 332);
        //leo = (Lion) unAnimal;
    
    }
}
