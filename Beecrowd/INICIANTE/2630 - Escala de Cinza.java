import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static class RGB {
        int r, g, b;
        String tipo;
    }

    public static void main(String[] args) {
        RGB[] rgb = new RGB[100];
        int qntd;
        Scanner ler = new Scanner(System.in);
        qntd = ler.nextInt();
        for(int i=0;i<qntd;i++){
            rgb[i] = new RGB();
            rgb[i].tipo = ler.next();
            rgb[i].r = ler.nextInt();
            rgb[i].g = ler.nextInt();
            rgb[i].b = ler.nextInt();
        }
        calculo(qntd, rgb);
    }

    static void calculo(int qntd, RGB[] rgb) {
        int p = 0;
        int[] v = new int[3];
        for(int i=0;i<qntd;i++){
            if(rgb[i].tipo.equals("eye")) {
                p = (int) (0.30*rgb[i].r + 0.59*rgb[i].g + 0.11*rgb[i].b);
            } else if(rgb[i].tipo.equals("mean")) {
                p = (int) ((rgb[i].r+rgb[i].g+rgb[i].b)/3.0);
            } else if(rgb[i].tipo.equals("min")) {
                v[0]= rgb[i].r; v[1] = rgb[i].g; v[2] = rgb[i].b;
                Arrays.sort(v);
                p = v[0];
            } else if(rgb[i].tipo.equals("max")) {
                v[0]= rgb[i].r; v[1] = rgb[i].g; v[2] = rgb[i].b;
                Arrays.sort(v);
                p = v[2];
            }
            System.out.printf("Caso #%d: %d%n", i+1, p);
        }
    }

    static int compara(int a, int b) {
        if(a == b){
            return 0;
        } else if(a < b) {
            return -1;
        } else {
            return 1;
        }
    }
}
