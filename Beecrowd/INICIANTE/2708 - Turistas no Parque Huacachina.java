import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n, t = 0, j = 0;
    String opcao;
    while(true){
      opcao = ler.next();
      if(opcao.equals("ABEND")){
        break;
      }else{
        n = ler.nextInt();
        if(opcao.equals("SALIDA")){
          t += n;
          j++;
        }else if(opcao.equals("VUELTA")){
          t -= n;
          j--;
        }
      }
    }
    System.out.printf("%d%n%d%n",t,j);
    ler.close();
  }
}