import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        ler.nextLine();
        
        for (int i = 0; i < n; i++) {
            StringBuilder palavra = new StringBuilder();
            String texto = ler.nextLine();
            boolean continua = false;
            
            for (int j = 0; j < texto.length(); j++) {
                char caractere = texto.charAt(j);
                if (Character.isLowerCase(caractere)) {
                    if (!continua) {
                        palavra.append(caractere);
                        continua = true;
                    }
                } else {
                    continua = false;
                }
            }
            
            System.out.println(palavra);
        }
        
        ler.close();
    }
}
