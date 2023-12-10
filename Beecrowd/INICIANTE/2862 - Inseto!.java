import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    long i, n, m;
    while(ler.hasNext()){
      n = ler.nextLong();
      for(i=0;i<n;i++){
        m = ler.nextLong();
        if(m > 8000){
          System.out.println("Mais de 8000!");
        }else{
          System.out.println("Inseto!");
        }
      }
    }
    ler.close();
  }
}  