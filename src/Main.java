
import java.util.concurrent.*;

public class Main {
    private static int MAX_AVAILABLE = 3;
    private static final Semaphore semaphore = new Semaphore(MAX_AVAILABLE, true);

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        Thread A = new Thread(new MyThread("A", 30));
        Thread D = new Thread(new MyThread("D", 40));
        getOrWait(A,D);
        A.join();

        Thread E = new Thread(new MySem("E", 50,semaphore));
        E.run();
    }
            private static void getOrWait(Thread... th) throws ExecutionException, InterruptedException
            {
                for (Thread f : th)
                {
                    f.start();
                }
            }
    }
