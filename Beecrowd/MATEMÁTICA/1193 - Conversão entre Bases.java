import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int qtd = ler.nextInt();
    String num, tipo;
    for(int i=0; i<qtd; i++){
      num = ler.next();
      tipo = ler.next();
      System.out.printf("Case %d:%n", i+1);
      switch(tipo){
        case "bin":
          // dec
            System.out.printf("%d dec%n", Integer.parseInt(num, 2));
          // hex
            System.out.printf(Integer.toHexString(Integer.parseInt(num, 2)) + " hex%n%n");
        break;
        case "dec":
          // hex
            System.out.printf(Integer.toHexString(Integer.parseInt(num)) + " hex%n"); 
          // bin
            System.out.printf(Integer.toBinaryString(Integer.parseInt(num)) + " bin%n%n");
        break;
        case "hex":
          // dec
            System.out.printf(Integer.parseInt(num, 16) + " dec%n");          
          // bin
            System.out.printf(Integer.toBinaryString(Integer.parseInt(num, 16)) + " bin%n%n");
        break;
      }
    }    
    ler.close();
  }
}