import java.util.*;

public class votacao {
    static class Voto implements Comparable<Voto> {
        String candidato;
        int qtdVotos;

        public Voto(String candidato, int qtdVotos) {
            this.candidato = candidato;
            this.qtdVotos = qtdVotos;
        }

        @Override
        public int compareTo(Voto o) {
            return Integer.compare(o.qtdVotos, this.qtdVotos);
        }

        @Override
        public String toString() {
            return this.candidato;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();
        Map<String, Integer> votacao = new LinkedHashMap<>();

        for (int i = 0; i < qtd; i++) {
            String voto = sc.next();
            votacao.put(voto, votacao.getOrDefault(voto, 0) + 1);
        }

        List<Voto> resultado = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : votacao.entrySet()) {
            resultado.add(new Voto(entry.getKey(), entry.getValue()));
        }

        Collections.sort(resultado);
        for (Voto voto : resultado) {
            System.out.println(voto);
        }

        sc.close();
    }
}
