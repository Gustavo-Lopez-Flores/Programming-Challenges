import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int TAM = 100;
    int i, t, p;
    int n[] = new int[TAM];
    while(true){
      t = ler.nextInt();
      if(t == 0)
        break;
      for(i=0;i<t;i++){
        n[i] = ler.nextInt();
      }
      for(i=0;i<t;i++){
        if(n[i] % 2 == 0){
          p = (n[i]-2)*2 + 2;        
        }else{
          p = (n[i]-1)*2 + 1;        
        }
        System.out.println(p);
      }
    }
    ler.close();
  }
}
