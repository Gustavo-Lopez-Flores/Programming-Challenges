import java.util.Scanner;

public class senha {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String linha = sc.nextLine();
    byte min = 0, mai = 0, num = 0;
    for(char c : linha.toCharArray()){
      if(Character.isLetter(c))
        if(Character.isUpperCase(c))
          mai++;
        else
          min++;
      else if(Character.isDigit(c))
        num++;
    }

    if(min > 0 && mai > 0 && num > 0 && linha.length() >= 8)
      System.out.println("senha valida");
    else
      System.out.println((linha.length() < 8 ? "minimo de 8 caracteres\n" : "") 
                       + (mai == 0 ? "letra maiuscula\n" : "") 
                       + (min == 0 ? "letra minuscula\n" : "")
                       + (num == 0 ? "numero" : ""));
    
    sc.close();
  }
}
