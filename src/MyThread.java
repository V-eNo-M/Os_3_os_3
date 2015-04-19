/**
 * Created by Иван on 15.04.2015
 */
public class MyThread implements Runnable{
    private String name;
    private int leng;
    public MyThread(String name,int leng){
        this.name = name;
        this.leng = leng;
    }

    @Override
    public void run() {

        System.out.println("Start thread " + name);
        try {
            Thread.sleep(leng*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Close thread " + name);
    }
}
