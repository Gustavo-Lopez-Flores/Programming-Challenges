import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int r1, r2, x1, x2, y1, y2;
        double dist;
        while(ler.hasNext()){
            r1 = ler.nextInt();
            x1 = ler.nextInt();
            y1 = ler.nextInt();
            r2 = ler.nextInt();
            x2 = ler.nextInt();
            y2 = ler.nextInt();
            dist = Math.hypot(Math.abs(x2-x1),Math.abs(y2-y1));
            if(r1 >= (double)(r2 + dist)){
                System.out.println("RICO");
            }else{
                System.out.println("MORTO");
            }
        }
        ler.close();
    }
}