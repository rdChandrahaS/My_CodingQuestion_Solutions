import java.io.*;
public class Next_Round_158A{
    public static void main(String[] args) throws IOException{
        InputStreamReader ip=new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(ip);
        String[] st= sc.readLine().split(" ");
        String[] str= sc.readLine().split(" ");
        int ans=0;
        for(int i=0;i<Integer.parseInt(st[0]);i++){
            if(Integer.parseInt(str[i])>=Integer.parseInt(str[Integer.parseInt(st[1])-1]) && Integer.parseInt(str[i])>0)ans++;
        }
        System.out.println(ans);
    }
}