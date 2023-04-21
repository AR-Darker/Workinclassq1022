package petspractice;

public class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        System.out.println("Питомец с именем и возрастом");
        this.name = name;
        this.age = age;
    }

    public Pet() {
        System.out.println("Питомец без параметров");
    }

    public void printPetInfo(){
        System.out.println("Имя питомца -" + name + "И его возраст =" + age);

    }
    public void say(){
        System.out.println("Звучит");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
