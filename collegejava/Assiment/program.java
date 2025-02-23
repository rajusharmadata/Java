
//public package Assiment;
import java.util.*;

 class program {

    public static void Series(long n) {
        long Totalsum = 0;
        long ans = 0;
        long fact = 1;

        for (long k = 1; k <= n; k++) {
            // calculate squr
           
            for (long i = 1; i <= k; i++) {
                ans = (long) Math.pow(i, i);

            }
            // factorial
            for (long j = 1; j <= k; j++) {
                fact = fact * j;
            }

            // calclate total sum 
            Totalsum = Totalsum+(fact / ans);
        }
        System.out.println(Totalsum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        long n = sc.nextLong();
        Series(n);

    }
}