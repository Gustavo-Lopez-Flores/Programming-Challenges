import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double preco = 1;
    int codigo = ler.nextInt();
    int quantidade = ler.nextInt();
    if(codigo == 1){
        preco = 4.00 * quantidade;
    }
    if(codigo == 2){
        preco = 4.50 * quantidade;
    }
    if(codigo == 3){
        preco = 5.00 * quantidade;
    }
    if(codigo == 4){
        preco = 2.00 * quantidade;
    } 
    if(codigo == 5){
        preco = 1.50 * quantidade;
    }
    System.out.printf("Total: R$ %.2f\n", (double)preco);
    ler.close();
  }
}