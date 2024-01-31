import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class log {
    public static class Log {
        LocalDateTime data;
        String mensagem;

        public Log(String data, String mensagem) {
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            this.data = LocalDateTime.parse(data, formatador);
            this.mensagem = mensagem;
        }

        @Override
        public String toString() {
            DateTimeFormatter novoFormatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String dataFormatada = data.format(novoFormatador);
            return String.format("%s %s", dataFormatada, mensagem);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Log> logs = new ArrayList<>();
        String linha;

        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(" ", 3);
            String data = dados[0] + " " + dados[1];
            String mensagem = dados[2];
            logs.add(new Log(data, mensagem));
        }

        Collections.sort(logs, (a, b) -> a.data.compareTo(b.data));
        logs.forEach(System.out::println);

        br.close();
    }
}
