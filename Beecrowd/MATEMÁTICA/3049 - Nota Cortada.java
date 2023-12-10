import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int b = ler.nextInt();
    int t = ler.nextInt();
    double areaEsq = ((b+t)*70.0)/2.0;
    double areaDir = (70.0*160.0) - areaEsq;

    if(areaEsq == areaDir) {
      System.out.println(0);
    }else if(areaEsq > areaDir){
      System.out.println(1);
    }else{
      System.out.println(2);
    }
  
    ler.close();
  }
}