import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SubmissionisAllYouNeed_2130A{
	public static void main(String[] args) throws IOException{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
		int[] loc ;
		int[] ans = new int[n];
		int sum = 0;
		for(int x = 0 ; x < n ; x++){
			int len = Integer.parseInt(sc.readLine());
			int[] arr = Arrays.stream(sc.readLine().split(" "))
                          		.mapToInt(Integer::parseInt)
                          		.toArray();
			loc = new int[51];
			for( int a : arr ) loc[a]++;
			sum = loc[0];
			for( int i = 1 ; i < loc.length ; i++ ){
				sum += loc[i]*i;	
			}
			ans[x] = sum;
		}
		for(int a : ans)		
			System.out.println(a); 
		sc.close();
	}
}