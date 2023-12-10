import java.util.Scanner;

public class Main {
  static void fraseCompleta(String frase) {
    int[] vet = new int[26];
    int tamFrase = frase.length();
    
    for(int i = 0; i < tamFrase; i++){
      char letra = frase.charAt(i); 
      if(Character.isLetter(letra)){
        vet[(int)letra-97]++;
      }
    }

    int alfabeto = 0;
    for(int i = 0; i < 26; i++){
      if(vet[i] > 0){
        alfabeto++;
      }
    }

    if(alfabeto == 26){
      System.out.println("frase completa");
    }else if(alfabeto >= 13){
      System.out.println("frase quase completa");
    }else{
      System.out.println("frase mal elaborada");
    }
  }

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int numeroDeCasos = ler.nextInt();
    ler.nextLine();
    
    for(int i = 0; i < numeroDeCasos; i++) {
      String frase = ler.nextLine();
      fraseCompleta(frase);
    }

    ler.close();
  }
}
