package collectionsInJava;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("gswd" , 23);
        User user1 = new User("gswd1" , 231);
        User user2 = new User("gswd2" , 232);

        Set<User> set = new HashSet<>();
        user.compareTo(user1);
        System.out.println(user.compareTo(user1));

//        Queue<String> queue = new ArrayDeque<>();
//        queue.add("first");
//        queue.add("next");
//        queue.add("last");
//
//        System.out.println(queue.peek());
//        System.out.println(queue.peek());
//        System.out.println(queue.peek());

//        List<String> arrayList = new ArrayList<>();
//        arrayList.add("first");
//        arrayList.add("second");
//        arrayList.add(1,"test");
//        arrayList.add(1,"test2");
//
//        Iterator<String> iterator = arrayList.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//    }
//
        }

    }

