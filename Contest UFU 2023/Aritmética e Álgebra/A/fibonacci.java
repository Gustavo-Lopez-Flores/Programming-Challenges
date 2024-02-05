import java.io.*;
import java.util.*;
import java.util.stream.*;

public class fibonacci {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      ArrayList<Integer> fibo = new ArrayList<Integer>();
      fibo.add(1);
      fibo.add(1);
      
      int num = Integer.parseInt(br.readLine().trim());

      if(num < fibo.size()){
        System.out.println(fibo.get(num-1));
      }else{
        for(int i = fibo.size(); i < num; i++){
          fibo.add(fibo.get(i-1) + fibo.get(i-2));
        }
        System.out.println(fibo.get(num-1));
      }
      
    }
  }
}
