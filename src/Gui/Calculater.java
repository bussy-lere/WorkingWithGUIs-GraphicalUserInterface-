package Gui;
import javax.swing.JOptionPane;
public class Calculater {

	public static void main(String[] args) {
		
String fn = JOptionPane.showInputDialog("Enter first number");
String sn = JOptionPane.showInputDialog("Enter second number");

int n1 = Integer.parseInt(fn);
int n2 = Integer.parseInt(sn);

int sum= n1 + n2;

JOptionPane.showMessageDialog(null,"The sum is "+ sum );

	}

}
