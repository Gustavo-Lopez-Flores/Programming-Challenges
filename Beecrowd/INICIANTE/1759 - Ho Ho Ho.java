import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    long i, j, num;
    num = ler.nextInt();
    for(i = 0; i < num; i++){
      if(i == num-1){
        System.out.println("Ho!");  
      }else{  
        System.out.printf("Ho ");
      }
    }
    ler.close();
  }
}
