
import java.util.concurrent.*;

public class Main {
    private static int MAX_AVAILABLE = 4;
    private static final Semaphore semaphore = new Semaphore(MAX_AVAILABLE, true);

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        Thread A = new Thread(new MyThread("A", 10));
        Thread D = new Thread(new MyThread("D", 50));
        Thread N = new Thread(new MyThread("N", 50));
        A.start();
        D.start();


        A.join();
        Thread C = new Thread(new MySem("C", 14,semaphore));
        Thread H = new Thread(new MySem("H", 34,semaphore));
        Thread G = new Thread(new MySem("G", 14,semaphore));
        Thread B = new Thread(new MySem("B", 10,semaphore));
        C.start();
        H.start();
        G.start();
        B.start();
        Thread F = new Thread(new MySem("F", 20,semaphore));
        startOrWait(B,F);
        Thread E = new Thread(new MyThread("E", 50));
        startOrWait(C,E);
        Thread I = new Thread(new MyThread("I", 20));
        startOrWait(G,I);
        Thread K = new Thread(new MyThread("K", 20));
        startOrWait(G,K);



        Thread M = new Thread(new MyThread("M", 15));
        I.join();
        K.join();
        H.join();
        F.join();
        M.start();

        startOrWait(D,N);

        Thread P = new Thread(new MyThread("P", 15));
        M.join();
        E.join();
        P.start();

        P.join();
        N.join();

    }
            private static void startOrWait(Thread th,Thread th2) throws ExecutionException, InterruptedException
            {
                if(th.isAlive()){
                th.join();}
                th2.start();
            }
    }
