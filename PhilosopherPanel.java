import javax.swing.*;

/*panel object of philosopher*/
public class PhilosopherPanel extends JPanel{
    private final JLabel stateLabel = new JLabel();
    private ImageIcon eatingIcon = new ImageIcon("eating.png");
    private ImageIcon thinkingIcon = new ImageIcon("thinking.png");
    private ImageIcon hungryIcon = new ImageIcon("hungry.png");

    private String eatingS = "Eating";
    private String hungryS ="Hungry";
    private String thinkingS ="Thinking";

    /*Philosopher Panel constructor*/
    public PhilosopherPanel(){
        thinking();
        stateLabel.setVerticalTextPosition(JLabel.NORTH);
        stateLabel.setHorizontalTextPosition(JLabel.CENTER);
        add(stateLabel);
    }

    /*changing the panel to eating state*/
    public void eating(){
        stateLabel.setIcon(eatingIcon);
        stateLabel.setText(eatingS);
    }

    /*changing the panel to thinking state*/
    public void thinking(){
        stateLabel.setIcon(thinkingIcon);
        stateLabel.setText(thinkingS);
    }

    /*changing the hungry to eating state*/
    public void hungry(){
        stateLabel.setIcon(hungryIcon);
        stateLabel.setText(hungryS);
    }
}
