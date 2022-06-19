package eventdriven;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventDriven {

	public static void main(String[] args) {
	
		
		JFrame frame= new JFrame("Subha");
		frame.setSize(500,400);
		
		JButton button=new JButton("Subhan Allah"); //Button
		button.setBounds(300, 250, 140, 100);     // Button Bounds
		button.setForeground(Color.BLUE);    // Button text color
		button.setBackground(Color.green);    // Button color
		
		JLabel Label=new JLabel("Subha");     //Label
		Label.setBounds(30,20 , 40, 25);
		Label.setForeground(Color.BLACK);
		JLabel Label2=new JLabel("you have clicked = ");
		Label2.setBounds(150,150 , 120, 25);
		
		JLabel Label3=new JLabel("0");
		Label3.setBounds(260,150 , 150, 25);
		
		frame.add(button);
		frame.add(Label);         // add the Labels to the frame
		frame.add(Label2);
		frame.add(Label3);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { //action listener method 
				
				String num=Label3.getText();
				int num2=Integer.parseInt(num); //create a counter to the number of clicks, and add them in Label 3
				num2++;
				
				Label3.setText(""+num2  );
				
				
			}
		});
		
		
		
		//author : NaderDweik
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
}
}
