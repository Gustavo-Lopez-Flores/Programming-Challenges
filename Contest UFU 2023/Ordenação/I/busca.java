import java.util.*;
import java.util.stream.Collectors;

public class busca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numeros = sc.nextLine().split(" ");
        String[] numerosBuscados = sc.nextLine().split(" ");

        List<Integer> busca = Arrays.stream(numeros).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numerosOrdenados = Arrays.stream(numerosBuscados).map(Integer::parseInt).collect(Collectors.toList());

        Collections.sort(numerosOrdenados);
      
        StringBuilder sb = new StringBuilder();  
        for(int num : numerosOrdenados){
            sb.append(num);
            if(busca.contains(num)){
                sb.append(" Está mapeado\n");
            }else{
                sb.append(" Não está mapeado\n");
            }
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
