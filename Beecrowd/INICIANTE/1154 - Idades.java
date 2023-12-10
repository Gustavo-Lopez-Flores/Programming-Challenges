import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int aux = 0, age, sum = 0, amount = 0;
    float average; 
    while(aux >= 0){
      age = ler.nextInt();
      if(age<0){
        break;
      }else{
        sum += age;
        amount++;    
      }
    }
    average = (float)sum/amount;
    System.out.printf("%.2f%n",average);
    ler.close();
  }
}