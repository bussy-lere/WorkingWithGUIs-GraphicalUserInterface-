package Gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ActListner  extends JFrame{
	JTextField item1;
	JTextField item2;
	JTextField item3;
	JPasswordField item4;
	
	public ActListner(){
		super("Your Biodata");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(20);
		add(item1);
		
		item2 = new JTextField("Enter your name here");
		add (item2);
	
		item3 = new JTextField("Part one", 15);
		item3.setEditable(false);
		add (item3);
		
		item4 = new JPasswordField("1234");
		add (item4);
		
		theHandler handler = new theHandler();
		
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		item4.addActionListener(handler);
	}
	
	 class theHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
		 String string= "";
		 
		 if (event.getSource()==item1)
			 string = String.format("you typed in %s",event.getActionCommand());

		 else if(event.getSource()==item2)
			 string = String.format("your name is %s", event.getActionCommand());
		 
		 else if(event.getSource()==item3)
			 string = String.format("for part one students only");
		 
		 else if(event.getSource()==item4)
			 string = String.format("your password is %s", event.getActionCommand());
		 
		 JOptionPane.showMessageDialog(null,string);
		}
	}
}
