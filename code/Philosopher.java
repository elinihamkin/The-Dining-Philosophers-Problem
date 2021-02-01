import java.util.Random;

/*philosopher thread*/
public class Philosopher extends Thread{
    Random random = new Random();

    private int id;
    private DinersMonitor monitor;

    /*philosopher constructor, creates new thread*/
    public Philosopher(int id, DinersMonitor monitor){
        this.id = id;
        this.monitor = monitor;
    }

    @Override
    /*main func of the thread*/
    public void run() {
        super.run();
        while (true){
            think();
            monitor.takeChopsticks(id);
            eat();
            monitor.putChopsticks(id);
        }
    }

    /*think func if the philosopher*/
    public void think(){
        try {
            sleep(random.nextInt(10000)+500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*eat func if the philosopher*/
    public void eat(){
        try {
            sleep(random.nextInt(10000)+500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
