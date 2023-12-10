import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n, q;
        int x, y = 0;
        int casos = 1;
        boolean achou = false;

        while(ler.hasNext()){
            if(casos == 66){
                break;
            }else{
                n = ler.nextInt();
                q = ler.nextInt();
                if((n == 0 && q == 0)){
                    break;
                }
                int vetor[] = new int[n];
                for(int i = 0; i < n; i++){
                    vetor[i] = ler.nextInt();
                }
                Arrays.sort(vetor);
                System.out.println("CASE# " + casos + ":");
                for(int i = 0; i < q; i++){
                    x = ler.nextInt();
                    achou = false;
                    for(int j = 0; j < n; j++){
                        if(vetor[j] == x){
                            y = j + 1;
                            achou = true;
                            break;
                        }
                    }
                    if(achou){
                        System.out.println(x + " found at " + y);
                    }else{
                        System.out.println(x + " not found");
                    }
                }
                casos++;
            }
        }
        ler.close();
    }
}