import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n, s, a, b;
    n = ler.nextInt();
    for(i=0;i<n;i++){
      a = ler.nextInt();
      b = ler.nextInt();
      s = a + b;
      switch (s){
        case 0: 
          System.out.println("PROXYCITY");  
        break;
        case 1: 
          System.out.println("P.Y.N.G.");  
        break;
        case 2: 
          System.out.println("DNSUEY!");  
        break;
        case 3: 
          System.out.println("SERVERS");  
        break;
        case 4: 
          System.out.println("HOST!");  
        break;
        case 5: 
          System.out.println("CRIPTONIZE");  
        break;
        case 6: 
          System.out.println("OFFLINE DAY");  
        break;
        case 7: 
          System.out.println("SALT");  
        break;
        case 8: 
          System.out.println("ANSWER!");  
        break;
        case 9: 
          System.out.println("RAR?");  
        break;
        case 10: 
          System.out.println("WIFI ANTENNAS");  
        break;
      }
    }
    ler.close();
  }
}