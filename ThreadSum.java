public class ThreadSum extends Thread {
    private int id;
    private int[] array;
    private int inicio;
    private int fim;

    public ThreadSum(int id, int[] array, int inicio, int fim) {
        this.id = id;
        this.array = array;
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public void run() {
        int soma = 0;
        System.out.print("Thread " + id + " somando: ");
        for (int i = inicio; i < fim; i++) {
            soma += array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println("=> Soma: " + soma);
    }
}
