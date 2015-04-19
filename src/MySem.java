import java.util.concurrent.Semaphore;

/**
 * Created by Иван on 15.04.2015.
 */
public class MySem extends MyThread{
    private Semaphore semaphore;
    private String name;
    private int leng;

    public MySem(String name,int leng, Semaphore semaphore)
    {   this.leng = leng;
        this.name = name;
        this.semaphore = semaphore;
    }
    @Override
    public void run()
    {
        System.out.println("Start thread "+ name);
        try
        {
            // Берем семафор
            semaphore.acquire();

            Thread.sleep(leng*100);

        }
        catch (InterruptedException e)
        {
            System.err.println("Some problems with executing.");
        }
        finally
        {
            // Освобождаем семафор
            semaphore.release();
        }
        System.out.println("Close thread " + name);
    }
}
