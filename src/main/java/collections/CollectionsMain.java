package main.java.collections;

import java.util.*;
import java.util.Map.Entry;

public class CollectionsMain {

    public static void main(String[] args) {

        System.out.println("\n1. Join lists\n");
        List<User> list1 = new ArrayList<>();
        list1.add(new User("Vasya", 26));
        list1.add(new User("Vasya", 26));
        list1.add(new User("Petya", 29));
        list1.add(new User("Anya", 25));

        List<User> list2 = new ArrayList<>();
        list2.add(new User("Misha", 31));
        list2.add(new User("Petya", 29));
        list2.add(new User("Anya", 25));
        list2.add(new User("Anya", 25));

        List<User> list = join(list1, list2);
        printList(list);

        System.out.println("\n2. Join sets\n");
        Set<User> set1 = new HashSet<>();
        set1.add(new User("Vasya", 26));
        set1.add(new User("Vasya", 26));
        set1.add(new User("Petya", 29));
        set1.add(new User("Anya", 25));

        Set<User> set2 = new HashSet<>();
        set2.add(new User("Misha", 31));
        set2.add(new User("Petya", 29));
        set2.add(new User("Anya", 25));
        set2.add(new User("Anya", 25));

        Set<User> set = join(set1, set2);
        printSet(set);

        System.out.println("\n3. Iterate list\n");
        printList(list1);

        System.out.println("\n4. Iterate set\n");
        printSet(set1);

        System.out.println("\n5. Iterate map\n");
        final Map<Integer, User> map = new HashMap<>();

        map.put(5, new User("Vasya", 26));
        map.put(8, new User("Petya", 29));
        map.put(8, new User("Misha", 31));
        map.put(10, new User("Anna", 25));

        printMapByValues(map);
        printMapByKeys(map);
        printMapByEntries(map);
    }

    public static List<User> join(List<User> list1, List<User> list2) {
        List<User> list = new ArrayList<>();
        for (User user : list1) {
            if(list2.contains(user)) {
                list.add(user);
            }
        }
        return list;
    }

    public static Set<User> join(Set<User> set1, Set<User> set2) {
        Set<User> set = new HashSet<>();
        for (User user : set1) {
            if(set2.contains(user)) {
                set.add(user);
            }
        }
        return set;
    }

    public static void printList(List<User> list) {
        System.out.println(list + ": " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
    }

    public static void printSet(Set<User> set) {
        System.out.println(set + ": " + set.size());

        for (User user : set) {
            System.out.println(user);
        }
    }

    public static void printMapByValues(Map<Integer, User> map) {
        System.out.println(map + ": " + map.size());
        for (User user : map.values()) {
            System.out.println(user);
        }
    }

    public static void printMapByKeys(Map<Integer, User> map) {
        System.out.println(map + ": " + map.size());
        for (Integer key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    public static void printMapByEntries(Map<Integer, User> map) {
        System.out.println(map + ": " + map.size());
        for (Entry<Integer, User> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
