import java.util.*;

public class Main {
  public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int casos = ler.nextInt();
      StringBuilder sb = new StringBuilder();
      sb.append("");
    
      for (int i = 0; i < casos; i++) {
        if(ler.hasNextLong()){
          long numero = ler.nextLong();
          if(ehPrimo(numero)) {
            sb.append(String.format("Prime%n"));
          }else {
            sb.append(String.format("Not Prime%n"));
          }
        }
      }

      System.out.print(sb.toString());
      ler.close();
  }  
  static boolean ehPrimo(long num){
    if(num == 1){
      return false;
    }

    if(num == 2 || num == 3){
      return true;
    }

    if(num % 2 == 0 || num % 3 == 0){
      return false;
    }

    for(long i = 3; i * i <= num; i++){
      if(num % i == 0){
        return false;
      }
    }

    return true;   
  }
}
