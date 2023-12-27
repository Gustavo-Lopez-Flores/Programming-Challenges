import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    while(input.hasNextDouble()){
      double numerica = input.nextDouble();
      double decimal = input.nextDouble();
      double resultado = numerica + (decimal * 0.01);
      DecimalFormat formato = new DecimalFormat("#,###.00");
      String numeroFormatado = formato.format(resultado);
      System.out.println((numerica == 0 ? "$0" : "$") + numeroFormatado);
    }
    
    input.close();
  }
}