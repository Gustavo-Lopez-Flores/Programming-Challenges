import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int aux = 0, type, n1 = 0, n2 = 0, n3 = 0;
    while(aux == 0){
      type = ler.nextInt();
      if(type == 1){
        n1++;
      } else if(type == 2){
        n2++;
      } else if(type == 3){
        n3++;
      } else if(type == 4){
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n",n1);
        System.out.printf("Gasolina: %d%n",n2);
        System.out.printf("Diesel: %d%n",n3);
        break;
      } 
  }
    ler.close();
  }
}