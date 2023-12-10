import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, p, j1, j2, r, a, v;
    p = ler.nextInt();
    j1 = ler.nextInt();
    j2 = ler.nextInt();
    r = ler.nextInt();
    a = ler.nextInt();
    if(r == 0 && a == 0){
      v = (((j1+j2)%2)==0 && p == 1) || (((j1+j2)%2)!=0 && p == 0) ? 1: 2;  
    }else{
      v = ((r==1)&&(a==0)) || ((r==0)&&(a==1))? 1: 2;        
    }
    System.out.printf("Jogador %d ganha!%n",v);
    ler.close();
  }
}
