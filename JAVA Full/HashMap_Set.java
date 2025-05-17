//import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class HashMap_Set{
    public static void main(String[] args) {
        //(unique ID)key, value
        HashMap<Integer, String> temp = new HashMap<>();
        temp.put(1,"key");
        temp.put(2,"Rajdeep");
        temp.put(3,"Titli");
        System.out.println(temp);

        System.out.println(temp.get(2)); //To get element by ID

        System.out.println(temp.put(2,"Titli")); // Here It will update the value in the ID 2 and return the previous value stored in ID or Key 2
        System.out.println(temp);

        System.out.println(temp.containsKey(3)); //Checks if map contains the key or ID or not
        System.out.println(temp.containsValue("Rajdeep")); // checks whether the map contains the value at any id or key or not

        System.out.println(temp.replace(1, "value"));// replace method only works if the key exists in the map. But does not work if the key doesnot exist.. it returns the value that has been replaced

        temp.putIfAbsent(4, "Rajdeep");
        System.out.println(temp);


        Set<String> tempSet = new HashSet<>();
        tempSet.add("Titli");
        tempSet.add("Rajdeep");
        tempSet.add("Titli");
        tempSet.add("Sonai");

        System.out.println(tempSet);
        System.out.println(tempSet.contains("Bitch"));
        System.out.println(tempSet.isEmpty());
        System.out.println(tempSet.remove("Sonai"));
        for(String str :tempSet)System.out.println(str);
        
        //using lambda function in java
        tempSet.forEach(System.out::println);

        //using iterator Object
        Iterator<String> names = tempSet.iterator();
        while(names.hasNext())System.out.println(names.next());
        

        tempSet.clear();
        System.out.println(tempSet);

        //addAll
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(2);
        list.add(7);
        list.add(9);
        System.out.println(list);
        HashSet<Integer> listHash = new HashSet<>();
        HashSet<Integer> linkedlistHash = new LinkedHashSet<>(); //It stores the values in hashset by the order you add them in the set. 
        //HashSet<Integer> listHash = new HashSet<>(list);  another way
        listHash.addAll(list);
        System.out.println(listHash);
        
    }
}