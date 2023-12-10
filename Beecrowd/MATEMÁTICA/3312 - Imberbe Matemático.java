import java.util.*;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int n = ler.nextInt();
    StringBuilder sb = new StringBuilder();
    sb.append("");
    
    for(int i = 0; i < n; i++){
      if (ler.hasNextInt()) {
        int num = ler.nextInt();
        if(ehPrimo(num)){
          BigInteger fat = calculaFatorial(num);
          sb.append(String.format("%d! = %s%n", num, fat.toString()));
        }
      }
    }

    if(sb.length() > 0){
      System.out.print(sb.toString());
    }

    ler.close();
  }
  static boolean ehPrimo(int num){
    if(num <= 1){
      return false;
    }

    if(num == 2 || num == 3){
      return true;
    }

    if(num % 2 == 0){
      return false;
    }

    for(int i = 3; i * i <= num; i+=2){
      if(num % i == 0){
        return false;
      }
    }
    
    return true;
  }
  static BigInteger calculaFatorial(int num) {
    BigInteger fat = BigInteger.ONE;
    for(int i = 2; i <= num; i++) {
      fat = fat.multiply(BigInteger.valueOf(i));
    }
    return fat;
  }
}
