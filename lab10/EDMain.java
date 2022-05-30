package Lab9;
import javax.swing.*;

import org.w3c.dom.css.RGBColor;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class EDMain {

	private static final KeyListener k = null;
	private static final Color RGBColor = null;

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("swing licture");//auto gene method
		frame.setSize(500, 500);//size
		frame.setVisible(true); // visibility
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
		

		
		JLabel label = new JLabel("welcome to HTU");
		frame.add(label);
		label.setBounds(333,330,500,30);
		label.setText("hi");
		frame.setLayout(null);//للتحكم 
		
		
		JButton btn1 =new JButton("click clack");
		frame.add(btn1);
		btn1.setBounds(250, 230, 100, 50);
		frame.setLayout(null);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setName("dfdfs");
			}
		});
		
	
		JColorChooser cl = new JColorChooser();
		frame.add(cl);
		cl.setBackground(RGBColor);
		cl.setBounds(100, 100, 100, 100);
		
		cl.setColor(111, 110, 110);
		
		
		
		JTextField tf = new JTextField();
		frame.add(tf);
		tf.setBounds(333, 333,110, 40);
		
		tf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				label.setText("hello  "+ tf.getText());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("keyReleased");
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			

		});
		
		
		
		
		frame.addMouseMotionListener(new MouseMotionListener() {
			
			
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
		
				btn1.setBounds(e.getXOnScreen(), e.getYOnScreen(), 100, 50);
			}
		});
		
		
		frame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		}}

}
