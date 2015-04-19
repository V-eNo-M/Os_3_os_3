
import java.util.concurrent.*;

public class Main {
    private static int MAX_AVAILABLE = 3;
    //private static ExecutorService executorService = Executors.newCachedThreadPool();
    private static final Semaphore semaphore = new Semaphore(MAX_AVAILABLE, true);

    public static void main(String[] args) {



        Thread A = new Thread(new MySem("A",30,semaphore));
        Thread D = new Thread(new MySem("D",40,semaphore));
        Thread E = new Thread(new MyThread("E",50));

        A.run();
        D.start();
        E.start();

      /*  Future<?> a = executorService.submit(new MyThread("A",30));
        Future<?> d = executorService.submit(new MyThread("D",60));

        // Блокировка
        try {
            a.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        // Запуск второй волны потоков.
            Future<?> h = executorService.submit(new MyThread("H",20));
            Future<?> g = executorService.submit(new MyThread("G",27));
            Future<?> b = executorService.submit(new MyThread("B",15));
            Future<?> c = executorService.submit(new MyThread("C",23));

        try {
            getOrWait(d);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Future<?> n = executorService.submit(new MyThread("N",14));

        try {
            getOrWait(g, b, c);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Запуск третьей волны.
            Future<?> k = executorService.submit(new MySem("K",30, semaphore));
            Future<?> i = executorService.submit(new MySem("I",25, semaphore));
            Future<?> f = executorService.submit(new MySem("F",55, semaphore));
            Future<?> e = executorService.submit(new MyThread("E",21));

        try {
            getOrWait(h);
        } catch (ExecutionException e1) {
            e1.printStackTrace();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        // Запуск потока M.
            Future<?> m = executorService.submit(new MySem("M",10, semaphore));

        try {
            getOrWait(m, e);
        } catch (ExecutionException e1) {
            e1.printStackTrace();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        Future<?> p = executorService.submit(new MyThread("P",30));
            executorService.shutdown();
        }*/
            // Выключение сервиса запуска.
          /*  private static void getOrWait(Future<?>... futures) throws ExecutionException, InterruptedException
            {
                for (Future f : futures)
                {
                    f.get();
                }*/
            }

    }
