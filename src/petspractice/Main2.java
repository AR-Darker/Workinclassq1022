package petspractice;

public class Main2 {
    public static void main(String[] args) {
        Pet dog1 = new Dog("Tuzik", 3);
        dog1.printPetInfo();
        Pet cat1 = new Cat("Murzik",6);
        cat1.printPetInfo();


        PetService petService = new PetService();
        petService.say(dog1);

        System.out.println(dog1.toString());

    }
}
