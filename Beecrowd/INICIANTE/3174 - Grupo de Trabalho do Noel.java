import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, m = 0, n, h, bon = 0, mus = 0, arq = 0, des = 0;
    String e, g;
    n = ler.nextInt();
    for(i=0;i<n;i++){
      e = ler.next();
      g = ler.next();
      h = ler.nextInt();
      if(g.equals("bonecos")){
        bon+=h;
      }else if(g.equals("arquitetos")){
        arq+=h;
      }else if(g.equals("musicos")){
        mus+=h;
      }else if(g.equals("desenhistas")){
        des+=h;
      }
    }
    if(bon != 0){
      m += (bon/8);  
    }
    if(arq != 0){
      m += (arq/4);
    }
    if(mus != 0){
      m += (mus/6);
    }
    if(des != 0){
      m += (des/12);
    }
    System.out.println(m);
    ler.close();
  }
}