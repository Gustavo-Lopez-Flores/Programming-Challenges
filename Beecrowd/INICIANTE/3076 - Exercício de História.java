import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n, seculo;
    while(ler.hasNext()){
      n = ler.nextInt();
      if((n%100)!=0){
        seculo = (n/100)+1;      
      }else{
        seculo = (n/100);      
      }
      System.out.println(seculo);
    }
    ler.close();
  }
}
