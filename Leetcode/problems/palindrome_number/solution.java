import java.util.Scanner;

class Solution {
public static boolean isPalindrome(int x) 
    {
        int sum=0,rem,n;
        n=x;
        if(x>=0){
        while(x!=0){
            rem = x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(n == sum){
        return true;
        }
        else{
        return false;
        }
        }
        else
        return false;
    }
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean b = isPalindrome(num);
        System.out.println(b);
    }
}

