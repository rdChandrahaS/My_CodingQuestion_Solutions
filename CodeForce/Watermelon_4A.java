import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Watermelon_4A{
	public static void main(String[] args) throws IOException{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int w = Integer.parseInt(sc.readLine());
		System.out.println( w%2==0 ? "YES" : "NO"); 
		sc.close();
	}
}