import java.util.Scanner;

public class Q2609 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int d = gcd(a, b);

        System.out.println(d); //최대공약수
        System.out.println(a * b / d); //최소공배수

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}