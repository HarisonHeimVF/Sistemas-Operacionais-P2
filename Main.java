import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int TAMANHO_ARRAY = 40;
        final int NUM_THREADS = 4;
        int[] numeros = new int[TAMANHO_ARRAY];
        Random random = new Random();


        for (int i = 0; i < TAMANHO_ARRAY; i++) {
            numeros[i] = random.nextInt(10) + 1;
        }

        int tamanhoPorThread = TAMANHO_ARRAY / NUM_THREADS;


        for (int i = 0; i < NUM_THREADS; i++) {
            int inicio = i * tamanhoPorThread;
            int fim = inicio + tamanhoPorThread;
            ThreadSum t = new ThreadSum(i, numeros, inicio, fim);
            t.start();
        }
    }
}

