import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i;
    String num;
    while(ler.hasNext()){
      num = ler.next();
      if(num.indexOf('x') == -1){
        if(Integer.parseInt(num) < 0){
          break;
        }else{
          System.out.println("0x" + (Integer.toHexString(Integer.parseInt(num))).toUpperCase());        
        }
      }else{
        num = num.substring(2);        
        System.out.println(Integer.parseInt(num, 16));
      }  
    }    
    ler.close();
  }
}