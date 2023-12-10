import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    long a, b, c;
    String retangulo = "Retangulo: ", tipo = "Valido-";
    a = ler.nextLong();
    b = ler.nextLong();
    c = ler.nextLong();
    if((Math.abs(b-c) < a && a < (b+c)) && (Math.abs(a-c) < b && b < (a+c)) && (Math.abs(a-b) < c && c < (a+b))){
      if(a == b && b == c){
        tipo += "Equilatero";
      }else if(a != b && b != c && c != a){
        tipo += "Escaleno";
      }else{
        tipo += "Isoceles";
      }
      if(a == Math.sqrt(Math.pow(b,2)+Math.pow(c,2)) || b == Math.sqrt(Math.pow(a,2)+Math.pow(c,2)) || c == Math.sqrt(Math.pow(a,2)+Math.pow(b,2))){
        retangulo += "S";
      }else{
        retangulo += "N";
      }
      System.out.printf("%s%n%s%n", tipo, retangulo);
    }else{
      System.out.printf("Invalido%n");
    }
  }
}