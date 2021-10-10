import java.util.Scanner;
public class Stairs
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number of stairs : ");
		int n = scn.nextInt();
		System.out.println("\nNumber of ways to climb stairs : ");
		System.out.println(Staircase(n));
	}
    	public static int Staircase(int n) {
        	if ( n == 0 ) {
            		return 1;
		}
        	else if ( n < 0 ) {
            		return 0;
		}
		int[] dp = new int[n + 1];
		dp[0] = 1;
		for(int i = 1 ; i <= n ; i++) {
        		dp[i] = dp[i - 1];
			if(i >= 2) {
				dp[i] += dp[i - 2];
			}
			if(i >= 3) {
				dp[i] += dp[i - 3];	
        		}
		}
        	return dp[n];
    	}
}
