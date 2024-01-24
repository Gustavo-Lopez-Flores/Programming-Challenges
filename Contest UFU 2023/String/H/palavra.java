import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String linha = sc.nextLine();
    int cifra = sc.nextInt();

    StringBuilder resultado = new StringBuilder();
    for(char c : linha.toCharArray()){
      if(Character.isLetter(c)){
        int ascii = ((int) c);
        if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){
          int base = Character.isUpperCase(c) ? 65 : 97;
          int cifrado = (ascii - base + cifra) % 26 + base;
          resultado.append((char) cifrado);
        }else{
          resultado.append(c);
        }
      }else{
        resultado.append(c);
      } 
    }
    System.out.println(resultado.toString());
    
    sc.close();
  }
}
