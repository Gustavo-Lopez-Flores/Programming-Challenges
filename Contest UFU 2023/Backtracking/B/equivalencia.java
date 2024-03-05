import java.io.*;
import java.util.*;
import java.math.*;

public class equivalencia {
  public static void main(String[] args) throws IOException {
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
      int a = Integer.parseInt(br.readLine());
      int b = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());
      if((a%m) == (b%m)){
        System.out.println("1");
      }else{
        System.out.println("0");
      }
    }
  }
}