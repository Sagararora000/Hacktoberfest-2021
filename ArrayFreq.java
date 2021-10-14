import java.util.Scanner;
public class ArrayFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] a = new int[size];
        int[] b = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array");
            a[i] = sc.nextInt(); }
        for (int i = 0; i < size; i++) {
            int c = 1;
           if (a[i] != -1) {
         // look the initialization of j
                for (int j = i + 1; j < size; j++) {

                    if (a[i] == a[j]) {
                        c = c + 1;
                        a[j] = -1;
                    }
                }
                b[i] = c;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println("number" + "|" + "frequency");
            if (a[i] != -1) {
                System.out.println("\t"+a[i] + "|" + b[i]);
            }
        }
    }}
