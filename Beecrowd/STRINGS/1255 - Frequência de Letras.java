import java.util.Scanner;
import java.util.Arrays;

public class Main {
  static String letrasMaisFrequentes(String texto){
    int[] alfabeto = new int[26]; 
    int tamTexto = texto.length();
    
    for(int i = 0; i < tamTexto; i++){
      if (Character.isLetter(texto.charAt(i))) {
        char letra = Character.toLowerCase(texto.charAt(i));
        alfabeto[(int)letra - 97]++;
      }

    }

    int maior = 0;
    for(int i = 0; i < 26; i++){
      if(alfabeto[i] > maior){
        maior = alfabeto[i];
      }
    }

    StringBuilder letrasFrequentes = new StringBuilder();

    if(maior == 1){
      for(int i = 0; i < 26; i++){
        if(alfabeto[i] == 1){
          int letra = i + 97;
          letrasFrequentes.append(Character.toString((char)letra));
        }
      }
    }else{
      for(int i = 0; i < 26; i++){
        if(alfabeto[i] == maior){
          int letra = i + 97;
          letrasFrequentes.append(Character.toString((char)letra));
        }
      }
    }

    return letrasFrequentes.toString();
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = ler.nextInt();
    ler.nextLine();
    
    for(int i = 0; i < n; i++){
      String frase = ler.nextLine();  
      String maisFrequentes = letrasMaisFrequentes(frase); 
      char[] caracteres = maisFrequentes.toCharArray();
      Arrays.sort(caracteres);
      String ordenado = new String(caracteres);
      System.out.println(ordenado);
    }
  
    ler.close();
  }
}