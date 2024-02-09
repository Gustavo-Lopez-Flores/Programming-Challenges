import java.io.*;
import java.util.*;
import java.math.*;
  
public class promocao {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    double valor = Double.parseDouble(br.readLine());
    int idade = Integer.parseInt(br.readLine());

    if(idade <= 5){
      valor = valor - (valor * 0.5);
    }else if(idade < 18){
      valor = valor - (valor * 0.05);
    }else if(idade <= 59){
      valor = valor + (valor * 0.10);
    }else{
      valor = valor - (valor * 0.15);
    }

    System.out.println(String.format("%.2f", valor));
    
    br.close();
  }
}