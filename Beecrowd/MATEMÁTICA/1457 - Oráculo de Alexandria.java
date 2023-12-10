import java.util.Scanner;
import java.math.BigInteger;

public class Main {
  static void calcular(String numero){
    int index = numero.indexOf("!");
    int qtd = numero.length() - index;    
    int n = Integer.parseInt(numero.substring(0, index));

    if(qtd == 1){
      System.out.println(fatorial(n)); 
    }else{
      System.out.println(kfatorial(n, qtd));
    }
  } 
  static String fatorial(int n){
    BigInteger fat = BigInteger.ONE;
    for(int i = 1; i <= n; i++){
      fat = fat.multiply(BigInteger.valueOf(i));
    }
    return fat.toString();
  }
  static String kfatorial(int n, int qtd){
    BigInteger kfat = BigInteger.valueOf(n);
    for(int i = 1; (n-(qtd*i)) > 0; i++){
      BigInteger aux = BigInteger.valueOf(n-(qtd*i));
      kfat = kfat.multiply(aux);
    }
    return kfat.toString();
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int casos = ler.nextInt();
      
    for(int i = 0; i < casos; i++){
      String numero = ler.next();
      calcular(numero);
    }
    
    ler.close();
 }
}