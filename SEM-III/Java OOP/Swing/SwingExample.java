import javax.swing.*;
import java.awt.event.*;
class SwingExample
{
	public static void main(String[] args)
	{
		JFrame jf = new JFrame();
		jf.setSize(600,600);
		
		JLabel jl = new JLabel();
		jl.setBounds(50,150,200,30);
		
		JTextField jt = new JTextField();
		jt.setBounds(50,200,200,30);
		
		/*JPasswordField jp = new JPasswordField();
		jp.setBounds(50,200,200,30);*/
		
		JButton jb = new JButton("Click me!");
		jb.setBounds(50,300,100,30);
		
		jb.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String message;
				message = jt.getText();
				jl.setText(message);
				//jl.setText(jp.getText());
			}
		});
		
		jf.add(jl);
		//jf.add(jp);
		jf.add(jt);
		jf.add(jb);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	}
}