import java.io.*;
import java.util.*;
import java.math.*;

public class relogio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = scanner.nextInt();
    }

    int soma = 0;
    for(int i = 0; i < n; i++){
      soma += arr[i];
    }
    
    System.out.println(soma % 12);
    scanner.close();
  }
}