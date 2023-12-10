import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int casos = ler.nextInt();
    StringBuilder sb = new StringBuilder();
    sb.append("");
    
    for(int i = 0; i < casos; i++){
      if(ler.hasNextLong()){
        long l = ler.nextLong();
        long r = ler.nextLong();
        sb.append(String.format("%d%n", quadradosPerfeitos(l, r)));
      }
    }
  
    System.out.print(sb.toString());  
    ler.close();
  }
  static long quadradosPerfeitos(long l, long r){
    long cont = (long) (Math.floor(Math.sqrt(r)) - Math.ceil(Math.sqrt(l)) + 1);
    return cont;
  }
}
