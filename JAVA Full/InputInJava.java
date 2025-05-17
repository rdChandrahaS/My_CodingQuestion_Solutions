import java.util.Scanner;
class InputInJava{
    public static void main(String[] args){
        System.out.println("Enter Keyboard/Mannual value : ");
        Scanner sc = new Scanner(System.in);  // Here System.in means it takes input from keyboard
        int a = sc.nextInt(); //It will take every intiger input
        System.err.println("Enter number 2 : ");
        int b = sc.nextInt();
        int c=a+b;
        System.err.println("Enter float number  : ");
        float f = sc.nextFloat();
        System.out.println(c);
        System.out.println(f);

        //hasNextInt() checks wether the input is integer or not
        System.out.println("Enter anything : ");
        boolean b1 = sc.hasNextInt();
        System.err.println(b1);

// String Input
        System.out.println("Enter the string : ");
        String str = sc.next(); //next() only reads the first  word
        System.out.println(str);
        System.out.println("Enter another string : ");
        String str1 = sc.nextLine(); //nextLine() only reads the sentense
        System.out.println(str1);
        




    }
}