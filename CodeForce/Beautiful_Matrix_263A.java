
import java.io.*;
public class Beautiful_Matrix_263A{
    public static void main(String[] args)throws IOException {
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(ip);
        int j,ans=0;
        for (int i=0;i<5;i++) {
            String[] str=sc.readLine().split("\\s+");
            j=0;
            while(j < 5){
                if(Integer.parseInt(str[j])==1){
                    ans=Math.abs(2-j)+Math.abs(2-i);
                    break;
                }
                j++;
            }
        }
        System.out.println(ans);
    }
}