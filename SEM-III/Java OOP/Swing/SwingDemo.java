import javax.swing.*;
import java.awt.*;
class SwingDemo
{
	public static void main(String args[])
	{
		JFrame jf = new JFrame();
		
		JButton b1 = new JButton("Button1");
		JButton b2 = new JButton("Button2");
		JButton b3 = new JButton("Button3");
		JButton b4 = new JButton("Button4");
		
		jf.add(b1,BorderLayout.NORTH);
		jf.add(b2,BorderLayout.WEST);
		jf.add(b3,BorderLayout.EAST);
		jf.add(b4,BorderLayout.SOUTH);
		
		jf.setSize(800,400);
		//jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	}
}