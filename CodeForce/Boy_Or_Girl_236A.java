import java.io.*;
import java.util.HashSet;

public class Boy_Or_Girl_236A {
    public static void main(String[] args)throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String inp = sc.readLine();
        HashSet<Character> distinct = new HashSet<>();
        HashSet<Character> duplicate = new HashSet<>();
        for(char ch: inp.toCharArray()){
            if(!duplicate.contains(ch) && !distinct.contains(ch)) distinct.add(ch);
            else duplicate.add(ch);
        }
        System.out.println(distinct.size()%2==0?"CHAT WITH HER!":"IGNORE HIM!");
    }
}
