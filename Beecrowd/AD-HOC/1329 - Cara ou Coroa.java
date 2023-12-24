import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while(ler.hasNextInt()){
      int casos = ler.nextInt();
      
      if(casos == 0){
        break;
      }else{
        byte[] arr = new byte[casos]; 
        for(int i = 0; i < casos; i++){
          arr[i] = ler.nextByte();
        }
        
        int mary = 0, john = 0;
        for(int i = 0; i < casos; i++){
          if(arr[i] == 0){
            mary++;
          }else if(arr[i] == 1){
            john++;
          }
        }
        
        System.out.println(String.format("Mary won %d times and John won %d times", mary, john));
      }
    }
    
  }
}