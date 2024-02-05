import java.io.*;
import java.util.*;
import java.util.stream.*;

public class dudu {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());
            
            if (isCapicua(num)) {
                System.out.println(num);
            } else {
                int numReverso = 0;
                int soma = 0;

                boolean capicua = false;
                for(int i = 0; i < 4; i++) {
                    StringBuilder stringReversa = new StringBuilder(Integer.toString(num));            
                    numReverso = Integer.parseInt(stringReversa.reverse().toString());
                    soma = num + numReverso;

                    if(isCapicua(soma)) {
                        capicua = true;
                        System.out.println(soma);
                        break;
                    }
                    
                    num = soma;
                }

                if(!capicua) {
                    System.out.println("0");
                }
            }
        }
    }

    public static boolean isCapicua(int number) {
        String str = Integer.toString(number);
        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

