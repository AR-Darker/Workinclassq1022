package company;

public class Main3 {
    public static void main(String[] args) {

        Employee worker1 = new Worker("W1", "WS1", 1);
        Employee worker2 = new Worker("W2", "WS2", 2);
        Employee worker3 = new Worker("W3", "WS3", 3);
        Employee worker4 = new Worker("W4", "WS4", 4);

        Employee director1 = new Director("D1", "DS1", 1);
        Employee director2 = new Director("D2", "DS3", 2);

        ((Director)director1).addworker(worker1);
        ((Director)director1).addworker(worker2);
        ((Director)director1).addworker(worker3);

        ((Director)director2).addworker(worker4);

        ((Director)director1).addworker(director2);


        System.out.println(worker1);
    }
}
