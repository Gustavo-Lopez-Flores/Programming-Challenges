import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (ler.hasNext()) {
            double m1 = ler.nextDouble();
            double m2 = ler.nextDouble();
            double m3 = ler.nextDouble();

            double a = m1 * (3);
            double b = m2 * (3);
            double c = m3 * (3);

            boolean ehTriangulo = (a > Math.abs(b - c))
                    && (b > Math.abs(a - c))
                    && (c > Math.abs(a - b))
                    && (a < (b + c))
                    && (b < (a + c))
                    && (c < (a + b));

            if (ehTriangulo) {
                double s = (m1 + m2 + m3) / 2.0;
                double area = (4.0 / 3.0) * Math.sqrt(s * (s - m1) * (s - m2) * (s - m3));
                System.out.printf("%.3f%n", area);
            } else {
                System.out.println("-1.000");
            }
        }

        ler.close();
    }
}
