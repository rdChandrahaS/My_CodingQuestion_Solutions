import java.util.Scanner;
class ReverseAStringInJava{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       String st=sc.next();
       StringBuilder str = new StringBuilder(st);
       for(int i=0;i<(str.length()-1)/2;i++){
        char first = str.charAt(0+i);
        char last = str.charAt(str.length()-1-i);
        str.setCharAt(i,last);
        str.setCharAt((str.length()-1-i),first);
       }                                            // alternative :  str.reverse();
       System.out.println(str);

    }
}