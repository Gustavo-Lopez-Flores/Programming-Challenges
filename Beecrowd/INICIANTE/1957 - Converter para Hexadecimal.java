import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i = 0, t;
    long num;
    char caracter;
    String hxd = "";
    String hexadecimais = "0123456789ABCDEF";
    num = ler.nextLong();
    while(num != 0){
        caracter = hexadecimais.charAt((int)(num%16));
        hxd += caracter;
        num /= 16;
        i++;
    }
    t = hxd.length() - 1;
    for(i=0;i<(t+1)/2;i++){
        caracter = hxd.charAt(i);
        StringBuilder sb = new StringBuilder(hxd);
        sb.setCharAt(i, hxd.charAt(t-i));
        sb.setCharAt(t-i, caracter);
        hxd = sb.toString();
    }
    System.out.println(hxd);
    ler.close();
  }
}
