import java.util.Scanner;
class FactorialInJava{
    static int factorial(int n){
        if(n<1)
        return 1;
        else
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=a.nextInt();
        System.out.println("Factorial : "+ factorial(n));
        
    }
}