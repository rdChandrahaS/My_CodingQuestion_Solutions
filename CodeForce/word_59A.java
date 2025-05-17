import java.io.*;
public class word_59A{
    private static String ans(String st){
        double upc=0.00,len=(double)st.length();
        for(char ch:st.toCharArray()){
            if(ch>='A' && ch<='Z')upc+=1;
        }
        return (len/2) >=upc ?st.toLowerCase():st.toUpperCase();
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader sc = new BufferedReader(ip);
        String st=sc.readLine();
        System.out.print(ans(st));
    }
}