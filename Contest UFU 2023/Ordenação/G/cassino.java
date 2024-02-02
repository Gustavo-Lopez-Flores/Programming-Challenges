import java.io.*;
import java.util.*;
import java.util.stream.*;

public class cassino {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> cartas = new HashMap<>() {
          {
              put(1, "A");
              put(2, "2");
              put(3, "3");
              put(4, "4");
              put(5, "5");
              put(6, "6");
              put(7, "7");
              put(8, "8");
              put(9, "9");
              put(10, "10");
              put(11, "J");
              put(12, "Q");
              put(13, "K");
          }
      };

        List<Integer> cartasNaMao = Arrays.stream(br.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.sort(cartasNaMao);

        StringBuilder sb = new StringBuilder();
        for (int carta : cartasNaMao) {
            sb.append(cartas.get(carta)).append(" ");
        }

        System.out.println(sb.toString().trim());

        br.close();
    }
}
