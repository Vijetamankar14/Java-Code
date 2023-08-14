
import java.util.Scanner;

class GCD{
    int findGCD(int m,int n) {
        int rem = 0;
        while (n != 0) {
            rem = m % n;
            m = n;
            n = rem;
        }
        int gcd = m;
        //System.out.println( "The GCD of $m and $n is m");

        return gcd;


    }
}

public class Euclien_algo_GCD {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        GCD calculate = new GCD();
        int res =calculate.findGCD(a,b);
        System.out.println("GCD of " +a+ " and " +b+" is : " +res);




    }

}
