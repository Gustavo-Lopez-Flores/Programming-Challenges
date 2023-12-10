import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 100;
    int i, num, p, q;
    float preco = 0;
    num = ler.nextInt();
    for(i=0;i<num;i++){
      p = ler.nextInt();
      q = ler.nextInt();
      switch(p){
        case 1001:
          preco += (float)(1.50*q);
        break;
        case 1002:
          preco += (float)(2.50*q);
        break;
        case 1003: 
          preco += (float)(3.50*q);
        break;
        case 1004: 
          preco += (float)(4.50*q);
        break;
        case 1005: 
          preco += (float)(5.50*q);
        break;
        default: 
        break;
      }
    }
    System.out.printf("%.2f%n",preco);          
    ler.close();
  }
}
