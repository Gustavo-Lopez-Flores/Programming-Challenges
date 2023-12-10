import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        while(true){
            n = ler.nextInt();
            if(n == 0){
                break;
            }else{
                ArrayDeque<Integer> cartas = new ArrayDeque<Integer>();
                for(int i = 0; i < n; i++){
                    cartas.add(n-i);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Discarded cards: ");
                while(cartas.size() > 1){
                    sb.append(cartas.getLast());
                    sb.append(", ");
                    cartas.removeLast();
                    cartas.addFirst(cartas.getLast());
                    cartas.removeLast();
                }
                sb.delete(sb.length() - 2, sb.length());
                sb.append("\nRemaining card: ");
                sb.append(cartas.getFirst());
                System.out.println(sb.toString());
            }
        }
        ler.close();
    }
}