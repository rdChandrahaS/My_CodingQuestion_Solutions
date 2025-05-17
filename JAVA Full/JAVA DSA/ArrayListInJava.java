//import java.util.ArrayList;
//import java.util.Collections;
import java.util.*;

class ArrayListInJava{
    public static void main(String[] args){
        ArrayList<Integer>  ilist = new ArrayList<>();//Here Integer is not data type, its integer class .
/*      ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Float>  flist = new ArrayList<Float>();//Here Integer is not data type, its integer class .
        ArrayList<String>  slist = new ArrayList<String>();//Here Integer is not data type, its integer class .
        ArrayList<Boolean>  blist = new ArrayList<Boolean>();//Here Integer is not data type, its integer class .
*/
    //Add element in Aray List
        ilist.add(0);
        ilist.add(1);
        ilist.add(2);
    System.out.println(ilist); // here it will store 0 , then 1 then 2

    //Get element in Array List
        int element = ilist.get(0);
    System.out.println(element);

    // Add element at any position in the Array List
        ilist.add(1,1); //add(index where to add, element)
    System.out.println(ilist);

    //Change element in any index of the Array List
        ilist.set(0,7);
    System.out.println(ilist);

    //Remove element in Array List
        ilist.remove(1);
    System.out.println(ilist);

    //To get the size of the array list
        int size = ilist.size();
    System.out.println(size);


    //Loops in array list

    for (int i=0;i<ilist.size();i++) {
        System.out.print(ilist.get(i)+ " ");
    }
System.out.println("");

    //Sorting in array list
        Collections.sort(ilist); //Collections is a class where sort() method is defined. It doesa not works on array
    System.out.println(ilist);

    }
}