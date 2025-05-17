import java.io.*;
public class Solution{
    public static void main (String[] args)throws IOException,FileNotFoundException{
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader sc=new BufferedReader(ir);
    int n=Integer.parseInt(sc.readLine());
    String[] st=new String[n];
    for(int i=0;i<n;i++)st[i]=sc.readLine();
    for(int i=0;i<n;i++){
        if(st[i].length()<=10)continue;
        else{
            int temp=st[i].length()-2;
            st[i]=String.valueOf(st[i].charAt(0))+String.valueOf(temp)+String.valueOf(st[i].charAt(temp+1));
        }
    }
    for(String s:st)System.out.println(s);
    }
}