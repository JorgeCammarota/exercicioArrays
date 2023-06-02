package exerciciosarrays;
public class Exercicio10 {
    public static void main(String[] args) {
        int n = 10; // tamanho do vetor
        int a[] = new int[n]; // declarando o vetor de números inteiros "a" de tamanho "n"
        int i; // indice (ou posicao)
        int ctimpares = 0, smimpares = 0; // declarando e inicializando o contador e o somatorio dos nros impares
        float mdimpares; // media aritmetica dos números impares

        for (i = 0; i < n; i++) {
            a[i] = (int) Math.round(Math.random() * 100); // gera um nro aleatório no intervalo de 0 ate 100

            // verifica se o i-esimo elemento do vetor é um número impar
            if ((a[i] % 2) != 0) {
                ctimpares = ctimpares + 1; // contando os números impares
                smimpares = smimpares + a[i]; // somando os números impares
                System.out.printf("a[%d] = %2d <--- %do. número impar\n", i, a[i], ctimpares);


            }
        }
    }
}