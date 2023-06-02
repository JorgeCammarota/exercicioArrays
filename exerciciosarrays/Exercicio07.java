package exerciciosarrays;
import java.util.*;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        System.out.println("Digite dois números inteiros quais quer: ");

        int numero1 = entrada_do_usuario.nextInt();
        int numero2 = entrada_do_usuario.nextInt();

        numeros.add(numero1);
        numeros.add(numero2);

        Collections.reverse(numeros);

        System.out.println(numeros);
    }
}