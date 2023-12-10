import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 26;
    int i, n;
    String[] vilao = new String[MAX];
    n = ler.nextInt();
    for(i=0;i<n;i++){
      vilao[i] = ler.next();
      if(vilao.equals("Batmain")){
        System.out.println("N");
      }else{
        System.out.println("Y"); 
      }
    } 
    ler.close();
  }
}
