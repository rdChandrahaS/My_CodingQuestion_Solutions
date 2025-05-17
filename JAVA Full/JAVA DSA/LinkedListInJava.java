import java.util.*;
class LinkedListInJava{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>(); // Creation is same as ArrayList
        list.addFirst("Rajdeep");
        list.addFirst("Hi");
        list.addLast("Debnath");
        list.add("rdx"); //by default add means addLast
        System.out.println(list);
        System.out.println(list.size()); //size() to get the size

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));}

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

    }
}