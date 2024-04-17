import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ColecoesParaConcorrencia {

    private static List<String> lista = new CopyOnWriteArrayList<>();
    // private static Map<Integer, String> mapa = new ConcurrentHashMap<>();
    // private static BlockingQueue<String> fila = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws InterruptedException {
        // Coleções que são Thread-safe

        MeuRunnable runnable = new MeuRunnable();
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t0.start();
        t1.start();
        t2.start();
        Thread.sleep(500);
//    System.out.println(lista);
//    System.out.println(mapa);
        System.out.println(lista);
    }

    public static class MeuRunnable implements Runnable {
        @Override
        public void run() {
//      lista.add("Inscreva-se no canal!");
//      mapa.put(new Random().nextInt(), "Curta esse vídeo!");
            lista.add("Se tiver condições, torne-se um apoiador do canal!");
            String name = Thread.currentThread().getName();
            System.out.println(name + " inseriu na lista!");
        }
    }
}
