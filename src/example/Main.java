package example;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Map<String, Integer>> mapList = new LinkedList<>();


        List<String> strings = new ArrayList<>();

        //   key      value
        Map<String, String> contacts = new HashMap<>();
        contacts.put("Aiturgan", "0700000000");
        contacts.put("Nurmukhammed", "0700000001");
        contacts.put("Gulumkan", "0700000002");
        contacts.put("Nurislam", "0700000003");
        contacts.put("Nurtilek", "0700000000");

        Phone phone = new Phone(contacts);
        System.out.println(phone.getContacts());
        System.out.println(phone.addContact("Gulumkan", "1234567890000"));
        System.out.println(phone.getContacts());















//        System.out.println(phone.addContact("Azhybek", "1234567890"));
//        System.out.println("-------------------------------------");
//        System.out.println(phone.getContact("Nurmukhammed"));
//        System.out.println(phone.getContact("Test"));
//        System.out.println("----------------------------------");
//        phone.removeContact("Nurislam");
//        phone.removeContact("User");
//        System.out.println("-----------------------------------------");
//        System.out.println(phone.getContacts());


        //
//        Map<String, Integer> map = new HashMap<>();
//        map.put("muktarbek", 123);
//        map.put("nurmukhammed", 987);
//        map.put("aiturgan", 111);
//        map.put("gulumkan", 222);
//        map.put("MUKTARBEK", 987);
////        System.out.println(map);
//
//        //get key
////        for (String word : map.keySet()) {
////            System.out.println(word);
////        }
//
//        //get value
////        for (Integer value : map.values()) {
////            System.out.println(value);
////        }
//
//        // with for
////        for (Map.Entry<String, Integer> m : map.entrySet()) {
////            System.out.println(m.getKey() + " " + m.getValue());
////        }
//
//        Iterator<Map.Entry<String, Integer>> mapIterator = map.entrySet().iterator();
//        while (mapIterator.hasNext()) {
//            System.out.println(mapIterator.next());
//        }
//
//
//        //linkedHashMap
//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put("muktarbek", 123);
//        linkedHashMap.put("nurmukhammed", 987);
//        linkedHashMap.put("aiturgan", 111);
//        linkedHashMap.put("gulumkan", 222);
//        linkedHashMap.put("MUKTARBEK", 987);
////        System.out.println(linkedHashMap);
//
//        //treeMap
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("muktarbek", 123);
//        treeMap.put("nurmukhammed", 987);
//        treeMap.put("aiturgan", 111);
//        treeMap.put("gulumkan", 222);
//        treeMap.put("MUKTARBEK", 987);
//        System.out.println(treeMap);


//        Map<Integer, User> userMap = new HashMap<>();
//        userMap.put(1, new User("Java-12"));
//        userMap.put(2, new User("Java-11"));
//        System.out.println(userMap.get(2));
    }
}
