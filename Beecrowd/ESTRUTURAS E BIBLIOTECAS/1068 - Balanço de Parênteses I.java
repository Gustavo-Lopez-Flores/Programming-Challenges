import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a1, a2;
        String linha;
        while(ler.hasNextLine()){
            linha = ler.nextLine();
            a1 = 0;
            a2 = 0;
            for(int i = 0; i < linha.length(); i++){
                if(linha.charAt(i) == '('){
                    a1++;
                }else if(linha.charAt(i) == ')'){
                    a2++;
                    if(a2 > a1){
                        break;
                    }
                }
            }
            if(a1 == a2){
                System.out.println("correct");
            }else{
                System.out.println("incorrect");
            }
        }
        ler.close();
    }
}
