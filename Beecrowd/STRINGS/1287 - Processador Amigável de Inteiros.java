import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            while (ler.hasNextLine()) {
                String linha = ler.nextLine();
                System.out.println(processarLinha(linha));
            }
        } catch (Exception e) {
            System.out.println("error");
        } finally {
            ler.close();
        }
    }

    public static String processarLinha(String linha) {
        long resultado = 0;
        boolean temNumero = false;
      
        for (char c : linha.toCharArray()) {
            if (Character.isDigit(c)) {
                temNumero = true;
                resultado = resultado * 10 + (c - '0');
            } else if (c == 'o' || c == 'O') {
                temNumero = true;
                resultado = resultado * 10;
            } else if (c == 'l') {
                temNumero = true;
                resultado = resultado * 10 + 1;
            } else if (c != ' ' && c != ',') {
                return "error";
            }
        }

        if (!temNumero) {
          return "error";
        }
      
        if (resultado > Integer.MAX_VALUE || resultado < 0) {
            return "error";
        } else {
            return String.valueOf(resultado);
        }
    }
}
