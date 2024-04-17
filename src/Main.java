public class Main {
    public static void main(String[] args) {
        // Thread atual
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        // Nova thread
        Thread t1 = new Thread(new MeuRunnable());
        // t1.run(); // Executando na mesma thread
        t1.start(); // Executando em uma nova thread

        // Runnable como lambda
        Thread t2 = new Thread(() ->
            System.out.println(Thread.currentThread().getName()));
        t2.start();
        // t2.start(); Iniciar duas vezes lança exceção

        // Várias threads
        Thread t3 = new Thread(new MeuRunnable());
        t3.start();
    }
}