import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 3;
    int i, tempo;
    int a[] = new int[MAX];
    for(i=0;i<MAX;i++){
      a[i] = ler.nextInt();  
    }
    if(Math.abs(a[0]-a[2]) <= a[1]){
      tempo = (a[0]+a[2])*2;       
    }else{
      if(a[0]>a[2]){
        tempo = (a[1]*2)+(a[2]*4);
      }else{
        tempo = (a[1]*2)+(a[0]*4);
      }
    }
    System.out.println(tempo);
    ler.close();
  }
}