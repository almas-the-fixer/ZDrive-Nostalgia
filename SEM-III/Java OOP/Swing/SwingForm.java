import javax.swing.*;
import java.awt.event.*;
class SwingForm
{
	public static void main(String[] args)
	{
		JFrame jf = new JFrame();
		jf.setSize(1080,800);
		
		JLabel title = new JLabel();
		title.setBounds(100,150,200,30);
		
		JLabel uname = new JLabel("Username:");
		uname.setBounds(50,200,200,30);
		
		JTextField userfield = new JTextField();
		userfield.setBounds(150,200,200,30);
		
		JLabel pass = new JLabel("Password:");
		pass.setBounds(50,300,200,30);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(150,300,200,30);
		
		JButton OK = new JButton("OK!!");
		OK.setBounds(100,400,200,30);
		
		OK.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String pass,uname;
				pass = password.getText();
				uname = userfield.getText();
				if(uname.equals("abc") == pass.equals("123"))
				{
					//title.setText("Valid User!!");
					JOptionPane.showMessageDialog(title,"Welcome");
				}
				else
				{
					//title.setText("Invalid User!!");
					JOptionPane.showMessageDialog(title,"Wrong Info");
				}
			}
		});
		
		jf.add(title);
		jf.add(uname);
		jf.add(userfield);
		jf.add(pass);
		jf.add(password);
		jf.add(OK);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	}
}