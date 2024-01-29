import java.util.*;

public class frequencia {
    static class Numeros implements Comparable<Numeros> {
        int numero;
        int frequencia;

        public Numeros(int numero, int frequencia) {
            this.numero = numero;
            this.frequencia = frequencia;
        }

        @Override
        public int compareTo(Numeros o) {
            if (this.frequencia == o.frequencia) {
                return Integer.compare(o.numero, this.numero);
            } else {
                return Integer.compare(o.frequencia, this.frequencia);
            }
        }

        @Override
        public String toString() {
            return this.numero + " " + this.frequencia;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();
        Map<Integer, Integer> numeros = new HashMap<>();

        for (int i = 0; i < qtd; i++) {
            int num = sc.nextInt();
            numeros.put(num, numeros.getOrDefault(num, 0) + 1);
        }

        List<Numeros> resultado = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numeros.entrySet()) {
            resultado.add(new Numeros(entry.getKey(), entry.getValue()));
        }

        Collections.sort(resultado);
        System.out.println(resultado.get(0));

        sc.close();
    }
}
