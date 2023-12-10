import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        fibo.add(1);
        fibo.add(2);
    
        while(ler.hasNext()){
          int n = ler.nextInt();
          if(n == 0){
            break;
          }else{
           if(n < (fibo.size())){
              System.out.println(fibo.get(n-1));
            }else{
              for(int i = fibo.size(); i < n; i++){
                fibo.add(fibo.get(i-1) + fibo.get(i-2));
              }
              System.out.println(fibo.get(n-1));
            }   
          }
        }
        
        ler.close();
    }
}