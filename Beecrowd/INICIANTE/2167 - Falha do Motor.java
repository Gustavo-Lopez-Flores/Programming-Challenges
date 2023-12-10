import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n, q = 0;
    n = ler.nextInt();
    int v[] = new int[n];
    for(i=0;i<n;i++){
      v[i] = ler.nextInt();
    }
    for(i=1;i<n;i++){
      if(v[i]<v[i-1]){
        q = i + 1;
        break;
      }
    }
    System.out.println(q);
    ler.close();
  }
}
