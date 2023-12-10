import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String[] linhas = new String[4];    
    
    for(int i = 0; i < 4; i++){
      linhas[i] = ler.nextLine();
    }

    int tamLinha = linhas[0].length() - 1;

    String f = Character.toString(linhas[0].charAt(0)) + 
               Character.toString(linhas[1].charAt(0)) + 
               Character.toString(linhas[2].charAt(0)) + 
               Character.toString(linhas[3].charAt(0)); 
    int numF = Integer.parseInt(f);
    
    String l = Character.toString(linhas[0].charAt(tamLinha)) + 
               Character.toString(linhas[1].charAt(tamLinha)) + 
               Character.toString(linhas[2].charAt(tamLinha)) + 
               Character.toString(linhas[3].charAt(tamLinha));
    int numL = Integer.parseInt(l);
    
    StringBuilder matring = new StringBuilder();
    for(int i = 1; i < tamLinha; i++){
      String m = Character.toString(linhas[0].charAt(i)) + 
                 Character.toString(linhas[1].charAt(i)) + 
                 Character.toString(linhas[2].charAt(i)) + 
                 Character.toString(linhas[3].charAt(i)); 
      
      int ascii = (numF * Integer.parseInt(m) + numL) % 257;
      char letra = (char)ascii;
      matring.append(Character.toString(letra));
    }
    
    System.out.println(matring);
    
    ler.close();
  }
}
/*
for(int i = 0; i < tamLinha; i++){
      
}
*/