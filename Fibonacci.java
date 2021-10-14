import java.util.Scanner;
public class Fibonacci{

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number :");
        n = s.nextInt();

        int num1 = 1, num2 = 1;
        System.out.print("Fibonacci Series of "+n+"th numbers:");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(num1+" ");

           
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}
