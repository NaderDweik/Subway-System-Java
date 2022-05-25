package Lab9;
import javax.swing.*;


public class EDMain {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();//auto gene method
		frame.setSize(500, 500);//size
		frame.setVisible(true); // visibility
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
		

		
		JLabel label = new JLabel("welcome to HTU");
		frame.add(label);
		label.setBounds(250,250,500,30);
		label.setText("hi");
		frame.setLayout(null);
		
		
	
	}

}
