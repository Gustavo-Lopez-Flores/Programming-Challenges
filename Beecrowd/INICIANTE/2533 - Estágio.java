import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, m, n, c, dvs, dvd;
    double ira;
    while(ler.hasNext()){
      m = ler.nextInt();
      dvs = 0;
      dvd = 0;
      for(i=0;i<m;i++){
        n = ler.nextInt();
        c = ler.nextInt();
        dvs = dvs + (n*c);
        dvd = dvd + c;
      }
      ira = (double)(dvs/(dvd*100.0));
      System.out.printf("%.4f%n",ira);    
    }
    ler.close();
  }
}