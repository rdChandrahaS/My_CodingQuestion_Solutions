import java.io.*;
public class HelpFul_Maths_339A{
    private static String ans(String str){
        if(str.length()<2)return str;
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<str.length()-2;i+=2){
            for(int j=i+2;j<str.length();j+=2){
                if(str.charAt(i) > str.charAt(j)){
                    sb.setCharAt(i, str.charAt(j));
                    sb.setCharAt(j, str.charAt(i));
                    str=sb.toString();
                }
            }
        }
        return str;
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader sc = new BufferedReader(ip);
        String st=sc.readLine();
        System.out.print(ans(st));
    }
}