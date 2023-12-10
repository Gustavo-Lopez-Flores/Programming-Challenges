import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n, t, i;
    n = ler.nextInt();
    for(i=0;i<n;i++){
      t = ler.nextInt();
      if(t % 2 == 0){
        System.out.println("0");
      }else{
        System.out.println("1");
      }
    }
    ler.close();
  }
}