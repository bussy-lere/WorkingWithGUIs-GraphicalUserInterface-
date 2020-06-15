package Gui;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Instructions extends JFrame {
	JLabel item1;
	 
	public Instructions(){
		super("Highest Score");
		setLayout (new FlowLayout());
		
		item1 = new JLabel("The highest score is 50");
		item1.setToolTipText ("This gives the highest score for one player only");
		add (item1);
	}
}
