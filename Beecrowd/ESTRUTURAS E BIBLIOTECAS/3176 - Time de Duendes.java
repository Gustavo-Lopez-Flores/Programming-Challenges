import java.util.*;

class Duende implements Comparable<Duende> {
    public int idade;
    public String nome;

    public Duende(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Duende d) {
        if (this.idade > d.idade) {
            return -1;
        } else if (this.idade < d.idade) {
            return 1;
        } else {
            return this.nome.compareTo(d.nome);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numCasos = ler.nextInt();
        List<Duende> listaDuendes = new ArrayList<>();
        for (int i = 0; i < numCasos; i++) {
            String nome = ler.next();
            int idade = ler.nextInt();
            listaDuendes.add(new Duende(nome, idade));
        }

        Collections.sort(listaDuendes);

        int times = 1;
        int qtd = numCasos / 3;

        while (times <= qtd) {
            System.out.printf("Time %d%n", times);

            for (int i = (times - 1); i < numCasos; i += qtd) {
                System.out.printf("%s %d%n", listaDuendes.get(i).nome, listaDuendes.get(i).idade);
            }

            System.out.println(); // Adiciona uma linha em branco entre os times

            times++;
        }

        ler.close();
    }
}
