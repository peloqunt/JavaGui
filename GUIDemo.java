import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Minimal Java Swing application.
 * 
 * @author Nathan Sprague
 * 
 */
public class GUIDemo extends JFrame
{
    private JPanel panel;
    private JButton biggerButton;
    private JButton smallerButton;
    private JButton changeTitleButton;

    /**
     * Set up the application.
     */
    public GUIDemo()
    {
	// CONSTRUCTOR NEEDS TO BE FINISHED!
	setTitle("Bigger/Smaller");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        biggerButton = new JButton("BIGGER");
        smallerButton = new JButton("SMALLER");
	changeTitleButton = new JButton("TITLE");
	changeTitleButton.addActionListener(new ButtonHandler());
        biggerButton.addActionListener(new ButtonHandler());
        smallerButton.addActionListener(new ButtonHandler());
        add(panel);
        panel.add(biggerButton);
        panel.add(smallerButton);
	panel.add(changeTitleButton);
        setVisible(true);
    }

    /**
     * This inner class exists to handle button events. There are other ways
     * this could have been done:
     * 
     * 1. GUIDemo could implement ActionListener itself. 
     * 2. Anonymous inner classes could be used to hand the events.
     */
    private class ButtonHandler implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            Dimension size = getSize();

            if (e.getSource().equals(changeTitleButton))
	    {
		setTitle("BOOOOOOOOOOOOOOOOM");
	    } 
	    else if (e.getSource().equals(biggerButton))
            {
                setSize(size.width + 10, size.height + 10);
            }
            else
            {
                setSize(size.width - 10, size.height - 10);
            }

        }
    }

    /**
     * Start the app by creating a GUIDemo object.
     */
    public static void main(String[] args)
    {
        GUIDemo app = new GUIDemo();
    }
}
