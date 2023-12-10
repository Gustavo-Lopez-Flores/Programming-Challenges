import java.util.Scanner;
import java.lang.Math;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int d, vF, vG, pF;
    double tF, tG, H;
    pF = 12;
    while(ler.hasNext()){
      d = ler.nextInt();
      vF = ler.nextInt();
      vG = ler.nextInt();
      H = (double)Math.sqrt((pF*pF)+(d*d));
      tF = (double)pF/vF;
      tG = (double)H/vG;  
      if(tG > tF){
        System.out.println("N");
      }else{
        System.out.println("S");
      }
    }    
    ler.close();
  }
}

// 1,4 VG -  1 VF