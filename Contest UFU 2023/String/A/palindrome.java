import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String palavra = sc.nextLine();
    boolean palindromo = true;
    for(int i = 0; i < (palavra.length() / 2) ; i++){
      if(palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)){
        palindromo = false;
        break;
      }
    }

    if(palindromo){
      System.out.println("sim");
    }else{
      System.out.println("não");
    }
    
    sc.close();
  }
}
