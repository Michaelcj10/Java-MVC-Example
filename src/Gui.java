import javax.swing.*;

public class Gui extends JFrame
{
    private final Controller control;

    public Gui()
    {
        super("Swing Skeleton ");
        setSize(600,600);
        setResizable(false);
        setVisible(true);
        control = new Controller(this);
    }
    public static void main (String [] args) { new Gui(); }

}
