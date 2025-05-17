import java.io.*;
import java.util.*;
public class String_Task_118A{
    private static final Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','y'));

    private static String ans(String str){
        StringBuilder ans= new StringBuilder("");
        for(char ch:str.toLowerCase().toCharArray()){
            if(!vowels.contains(ch))
                ans.append(ch);
            }
        return "." + String.join(".",ans.toString().split(""));
    }
    public static void main(String[] args)throws IOException {
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader sc = new BufferedReader(ip);
        String st=sc.readLine().toLowerCase();
        System.out.println(ans(st));
    }
}