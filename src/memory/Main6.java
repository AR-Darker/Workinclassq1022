package memory;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataService service = new LocalMemoryService();


        while (true){
            String next = scanner.next();
            if("exit".equals(next)){
                break;
            }else if ("get" .equals(next)) {
                System.out.println(service.get());
            }else {
                service.add(next);

            }
        }
    }
}
