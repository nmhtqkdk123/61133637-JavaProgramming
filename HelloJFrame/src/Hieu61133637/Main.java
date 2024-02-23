package Hieu61133637;
import javax.swing.JButton;
import  javax.swing.JFrame;
import javax.swing.WindowConstants;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("123");
		f.setTitle("Vi du ve JFrame");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(200,200);
		JButton btnOK = new JButton("Yes");
		JButton btnNO = new JButton("No");
		f.add(btnOK);
		f.add(btnNO);
		f.setVisible(true);
	}

}