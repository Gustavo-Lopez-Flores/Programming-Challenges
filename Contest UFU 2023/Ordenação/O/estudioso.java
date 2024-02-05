import java.io.*;
import java.util.*;
import java.util.stream.*;

public class estudioso{
  static int insertionSort(char[] arr){
    int n = arr.length;
    int cont = 0;
    for(int i = 1; i < n; i++){
      char key = arr[i];
      int j = i - 1;

      while(j >= 0 && arr[j] > key){
        arr[j + 1] = arr[j];
        j--;
        cont++;
      }

      arr[j + 1] = key;
      cont++;
    }
    return cont;
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
    int cases = Integer.parseInt(br.readLine());
    List<String> list = IntStream.range(0, cases).mapToObj(i -> {
      try{
        return br.readLine();
      }catch(IOException e){
        throw new RuntimeException(e);
      }
    }).collect(Collectors.toList());

    for(String s : list){
      char[] arr = s.toCharArray();
      System.out.println(insertionSort(arr));
    }
  }
}
