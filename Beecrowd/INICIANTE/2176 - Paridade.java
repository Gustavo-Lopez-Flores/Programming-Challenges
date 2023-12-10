import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int soma = 0;
    String bits = ler.next();
    for(int i=0; i<bits.length(); i++){
      if(bits.charAt(i) == '1')
        soma++;
    }
    if(soma % 2 == 0){
      bits += "0";
    }else{
      bits += "1";
    }
    System.out.println(bits);
  }
}