import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 100000;
    int i, n, fv;
    int v[] = new int[MAX];
    double im;
    while(ler.hasNext()){
      n = ler.nextInt();
      for(i=0;i<n;i++){
        v[i] = ler.nextInt();      
      } 
      fv = 0;
      for(i=0;i<n;i++){
        if(v[i] == 1){
          fv++;
        }
      }
      im = n*(2/3.0);
      if(fv >= im){
        System.out.println("impeachment");
      }else{
        System.out.println("acusacao arquivada"); 
      }
    }
    ler.close();
  }
}