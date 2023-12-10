import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, x;
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        ArrayList<Integer> calls = new ArrayList<Integer>();
        fibo.add(1);
        fibo.add(1);
        calls.add(0);
        calls.add(2);
        n = ler.nextInt();
        for(int i = 0; i < n; i++){
            x = ler.nextInt();
            if(x < (fibo.size())){
                System.out.printf("fib(%d) = %d calls = %d%n", x, calls.get(x-1), fibo.get(x-1));
            }else{
                for(int j = fibo.size(); j < x; j++){
                    fibo.add(fibo.get(j-1) + fibo.get(j-2));
                    calls.add(calls.get(j-1) + calls.get(j-2) + 2);
                }
                System.out.printf("fib(%d) = %d calls = %d%n", x, calls.get(x-1), fibo.get(x-1));
            }
        }
        ler.close();
    }
}
