import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            BigInteger result = BigInteger.ONE;

            for (int i = n; i > 3; i--) {
                result = result.multiply(BigInteger.valueOf(i));
                result = result.mod(BigInteger.valueOf(1000000009));
            }

            System.out.println(result);
        }
    }
}
