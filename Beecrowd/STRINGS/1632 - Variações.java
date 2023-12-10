import java.util.Scanner;

public class Main {
  static int verificarVariacoes(String senha){
    int tamSenha = senha.length();
    int variacoes = 1;
    
    for(int i = 0; i < tamSenha; i++){
      char letra = senha.charAt(i);

      if(Character.isLetter(letra)){
        char maiuscula = Character.toUpperCase(letra);
        if((maiuscula == 'A') || (maiuscula == 'E') || (maiuscula == 'I') || (maiuscula == 'O') || (maiuscula == 'S')){
          variacoes *= 3;
        }else{
          variacoes *= 2;
        }
      }else{
        variacoes *= 3;
      }

    }
    
    return variacoes;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numeroDeCasos = input.nextInt();

    for(int i = 0; i < numeroDeCasos; i++){
      String senha = input.next();
      System.out.println(verificarVariacoes(senha));
    }
    
    input.close();
  }
}