import java.util.Scanner;

public class Main {
  static final int MAX = 100;
  static final int NOTA = 7;
  static class Atletas {
      String nome;
      double dificuldade;
      double[] notas = new double[NOTA];
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Atletas[] a = new Atletas[MAX];
    int q, i, j;
    double nota, menor, maior, soma;
    
    q = ler.nextInt();
    for(i = 0; i < q; i++) {
        a[i] = new Atletas();
        a[i].nome = ler.next();
        a[i].dificuldade = ler.nextDouble();
        for(j = 0; j < NOTA; j++) {
            a[i].notas[j] = ler.nextDouble();
        }
    }
    
    for(i = 0; i < q; i++) {
        soma = 0.0;
        maior = a[i].notas[0];
        menor = a[i].notas[0];
        
        for(j = 0; j < NOTA; j++) {
            maior = a[i].notas[j] > maior ? a[i].notas[j] : maior;
            menor = a[i].notas[j] < menor ? a[i].notas[j] : menor;
        }
        
        for(j = 0; j < NOTA; j++) {
            if(a[i].notas[j] != menor && a[i].notas[j] != maior) {
                soma += a[i].notas[j];
            }
        }
        
        nota = soma * a[i].dificuldade;
        System.out.printf("%s %.2f%n", a[i].nome, nota);
    }
    ler.close();
  }
}
