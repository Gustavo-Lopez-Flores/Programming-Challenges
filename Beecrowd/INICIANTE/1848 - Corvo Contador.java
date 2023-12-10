import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int soma = 0, grito = 0;
    String corvo;
    while (true) {
        corvo = ler.nextLine();
        if (corvo.equals("---")) {
            soma += 0;
        } else if (corvo.equals("--*")) {
            soma += 1;
        } else if (corvo.equals("-*-")) {
            soma += 2;
        } else if (corvo.equals("-**")) {
            soma += 3;
        } else if (corvo.equals("*--")) {
            soma += 4;
        } else if (corvo.equals("*-*")) {
            soma += 5;
        } else if (corvo.equals("**-")) {
            soma += 6;
        } else if (corvo.equals("***")) {
            soma += 7;
        } else if (corvo.equals("caw caw")) {
            System.out.println(soma);
            soma = 0;
            grito++;
            if (grito == 3) {
                break;
            }
        }
    }
    ler.close();
  }
}