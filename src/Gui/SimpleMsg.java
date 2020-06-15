package Gui;
import javax.swing.JFrame;

public class SimpleMsg  {
public static  void main ( String args[]) {
	
	//Instructions ins = new Instructions();
	
	ActListner Act= new ActListner();
	Act.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Act.setSize(275, 180);
	Act.setVisible(true);
}
}
