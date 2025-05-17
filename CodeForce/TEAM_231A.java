import java.io.*;
public class TEAM_231A{
    public static void main(String[] args) throws IOException{
        InputStreamReader ip=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ip);
        int n=Integer.parseInt(br.readLine()),ans=0,temp; 
        for (int i=0;i<n*3;i=i+3){
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int c = Integer.parseInt(inputs[2]);
            if (a + b + c >= 2)ans++;
        }
        System.out.println(ans);
    }
}