import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SoldierandBananas_546A{
	public static void main(String[] args) throws IOException{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(sc.readLine().split(" "))
                          		.mapToInt(Integer::parseInt)
                          		.toArray();

		// arr[0] = cost of first banana
		// arr[1] = Initial amount
		// arr[2] = no. of banana he wants

		int ans = 0;
		for(int i = 1 ; i <= arr[2] ; i++){
			ans += arr[0]*i;
		}
		sc.close();
		arr[0] =  ans-arr[1];
		System.out.println( arr[0] < 0 ? 0 : arr[0]);
	} 
}