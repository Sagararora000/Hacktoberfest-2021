import java.util.*;
public class Stairs
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of stairs :-");
		int n = scn.nextInt();
		System.out.println();
		System.out.println("Number of ways to climb the stairs :-");
		System.out.println(Staircase(n));
	}
    public static long Staircase(int n) {
        if ( n == 0 )
            return 0;
        if ( n == 1 )
            return 1;
        long arr[] = new long[n+1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        for ( int i = 3; i < n+1; i ++ ) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        return arr[n];
    }
}