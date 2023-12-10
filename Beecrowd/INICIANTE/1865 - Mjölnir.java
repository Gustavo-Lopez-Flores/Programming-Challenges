import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 10;
    int i, n, f;
    String nome;
    n = ler.nextInt();
    for(i = 0; i < n; i++){
      nome =ler.next();
      f = ler.nextInt();
      if(nome.equals("Thor")){
        System.out.println("Y"); 
      }else{
        System.out.println("N"); 
      }    
    }
    ler.close();
  }
}