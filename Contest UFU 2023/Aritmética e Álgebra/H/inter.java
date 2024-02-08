import java.io.*;
import java.util.*;
import java.math.*;
  
public class inter {
  public static boolean estaContido(double valor, double inicio, double fim){
    return valor > inicio && valor < fim ? true: false;
  }

  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    
    int cases = sc.nextInt();
    for(int i = 0; i < cases; i++){
      double valor = sc.nextDouble();
      double inicio = sc.nextDouble();
      double fim = sc.nextDouble();
      if(estaContido(valor, inicio, fim)){
        sb.append("True\n");
      }else{
        sb.append("False\n");
      }
    }

    System.out.print(sb.toString());
    sc.close();
  }
}