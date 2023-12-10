import java.util.Scanner;

public class Main {
    public static void pontuaCompeticao(int submissoes, Scanner ler){
        int questoes = 0, tempoTotal = 0;
        int[] tempoIncorretoPorProblema = new int[26];

        for(int i = 0; i < submissoes; i++){
            char letra = ler.next().charAt(0);
            int tempo = ler.nextInt();
            String correcao = ler.next();

            if(correcao.equals("correct")){
                questoes++;
                tempoTotal += tempo + tempoIncorretoPorProblema[letra - 'A'];
                tempoIncorretoPorProblema[letra - 'A'] = 0;
            } else {
                tempoIncorretoPorProblema[letra - 'A'] += 20;
            }
        }

        System.out.println(questoes + " " + tempoTotal); 
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while(ler.hasNext()){
            int submissoes = ler.nextInt();

            if(submissoes == 0){
                break;
            } else {
                pontuaCompeticao(submissoes, ler);
            }
        }

        ler.close();
    }
}
