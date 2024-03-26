import java.io.*;
import java.util.*;
import java.math.*;
import java.util.stream.*;

public class latino {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int casos = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < casos; t++) {
            int n = Integer.parseInt(br.readLine());
            String[][] matriz = new String[n][n];
    
            for (int i = 0; i < n; i++) {
                String[] elementos = br.readLine().trim().split("\\s+");
                matriz[i] = elementos;
            }
    
            boolean quadradoLatino = true;
            for (int i = 0; i < n; i++) {
                if (!semRepeticao(matriz[i])) {
                    quadradoLatino = false;
                    break;
                }
    
                Set<String> linha = new HashSet<>();
                Set<String> coluna = new HashSet<>();
                for (int j = 0; j < n; j++) {
                    linha.add(matriz[i][j]);
                    coluna.add(matriz[j][i]);
                }
    
                if (linha.size() != n || coluna.size() != n) {
                    quadradoLatino = false;
                    break;
                }
            }
    
            if (quadradoLatino) {
                sb.append("sim\n");
            } else {
                sb.append("nao\n");
            }
        }
        System.out.print(sb.toString());
    }
    
    static boolean semRepeticao(String[] array) {
        Set<String> set = new HashSet<>();
        for (String str : array) {
            if (!set.add(str)) {
                return false;
            }
        }
        return true;
    }
}
