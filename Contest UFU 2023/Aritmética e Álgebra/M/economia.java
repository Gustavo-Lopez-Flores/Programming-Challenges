import java.io.*;
import java.util.*;
import java.math.*;

public class economia{
  public static void main(String[] args) throws IOException{
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int num = Integer.parseInt(br.readLine());
      int sum = 0;
      for(int i = 0; i < num; i++){
        sum += Math.pow(2,i);
      }
      System.out.println(sum);
    } catch (IOException e) {
      e.printStackTrace();
    } catch(NumberFormatException e){
      e.printStackTrace();
    }
  }
}
