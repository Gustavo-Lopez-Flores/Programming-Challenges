import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int aux = 0, cont, num, sum = 0;
    while(aux == 0){
    num = ler.nextInt();
    cont = 0;
      if(num == 0){
        break; 
      }else{
        while(cont<5){
          if(num % 2 == 0){
            sum+=num;
            cont++;
          }
          num++;
        }
        System.out.println(sum);
        sum = 0;
      }
    }
    ler.close();
  }
}