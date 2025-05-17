import java.util.Scanner;
class StringsInJava{
    public static void main(String[] args) {

        String fname ="Rajdeep" ;
        String lname= "Debnath";
        String name = fname+" "+lname; //concatinatio
        for(int i=0;i<name.length();i++){
    System.out.println("character at "+i+ ": "+name.charAt(i));  
        }

        String s1="Rajdeep";
        String s2="rajdeep";
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareToIgnoreCase(s2));

        //String to Integer
        String num = "123";
        int numc = Integer.parseInt(num);
    System.out.println("String to number : "+num+" "+numc);

        //Integer to String
        int n = 100;
        String s = Integer.toString(n);
    System.out.println(s);


        Scanner sc = new Scanner(System.in);      
        //String input1 = sc.next();  //input without space
        String input2 = sc.nextLine(); //input include space
        //System.out.println(input1+name);
        System.out.println(input2);


}
}