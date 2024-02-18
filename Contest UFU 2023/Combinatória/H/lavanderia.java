import java.io.*;
import java.util.*;
import java.math.*;

public class lavanderia{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num;
    while((num = sc.nextInt()) != 0){
      long resultado = fat(num) / 6;
      System.out.println(resultado);
    }
  }
  static long fat(int n){
    long fat = 6;
    for(int i = 3; i < n; i++){
      fat *= (i+1);
    }
    return fat;
  }
}