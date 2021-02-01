import javax.swing.*;
import java.awt.*;

/*main frame of the app*/
public class AppFrame extends JFrame{
    private int numOfPhilo;
    private PhilosopherPanel philosophersPanels[];
    private Philosopher philosophers[];
    private DinersMonitor monitor;

    /*frame constructor for the app*/
    public AppFrame(int numOfPhilo){
        this.numOfPhilo = numOfPhilo;
        philosophersPanels = new PhilosopherPanel[numOfPhilo];
        philosophers = new Philosopher[numOfPhilo];
        monitor = new DinersMonitor(numOfPhilo, this);

        setLayout(new GridLayout(1, numOfPhilo));

        for (int i=0; i<numOfPhilo; i++){
            philosophersPanels[i] = new PhilosopherPanel();
            add(philosophersPanels[i]);
            philosophers[i] = new Philosopher(i,monitor);
        }

        for (int i=numOfPhilo-1; i>=0 ;i--){
            philosophers[i].start();
        }

        setTitle("Philosophers Problem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250*numOfPhilo, 260);
        setResizable(false);
        setVisible(true);
    }

    /*get witch panel to update ad to what state*/
    public void updatePhilosopher(int id, int state){
        if (state == DinersMonitor.EATING){
            philosophersPanels[id].eating();
        }
        else if (state == DinersMonitor.THINKING){
            philosophersPanels[id].thinking();

        }
        else
            philosophersPanels[id].hungry();
    }
}
