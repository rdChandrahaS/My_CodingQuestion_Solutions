import java.io.*;
public class DominoPiling_50A{
    public static void main(String[] args)throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String[] inp = sc.readLine().split("\\s+");
        int l=Integer.parseInt(inp[0]),b=Integer.parseInt(inp[1]);
        System.out.println(l*b/2);
    }
}