import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Registration
{
	public static void main(String[] args)
	{
		//For Dropdownlist
		String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
				
		String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
				
		String[] years = {"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2017","2018","2019","2020","2021","2022","2023"};
				//<!----------------------------------------!>
		//frame 
		JFrame jf = new JFrame();
		
		//Fields and labels
		JLabel fname = new JLabel("First Name:");
		JTextField fn = new JTextField();
		
		JLabel lname = new JLabel("Last Name:");
		JTextField ln = new JTextField();
		
		JLabel email = new JLabel("E-mail:");
		JTextField em = new JTextField();
		
		JLabel pass = new JLabel("Password:");
		JPasswordField key = new JPasswordField();
		
		JButton submit = new JButton("Submit");
		
		JRadioButton male = new JRadioButton("Male");
		male.setSelected(true);
		
		JRadioButton female = new JRadioButton("Female");
		female.setSelected(false);
		//Grouping Radio Buttons
		ButtonGroup bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		JComboBox dd = new JComboBox(days);
		JComboBox mm = new JComboBox(months);
		JComboBox yy = new JComboBox(years);
		
		//Setting components on frame
		jf.add(fname);
		jf.add(fn);
		
		jf.add(lname);
		jf.add(ln);
		
		jf.add(email);
		jf.add(em);
		
		jf.add(pass);
		jf.add(key);
		
		jf.add(male);
		jf.add(female);
		
		jf.add(dd);
		jf.add(mm);
		jf.add(yy);
		
		jf.add(submit);
		
		//Click Event
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//required variables
				String n1,n2,e1,p1,gender,dob;
				n1 = fn.getText();
				n2 = ln.getText();
				e1 = em.getText();
				p1 = key.getText();
				
				dob = ":"+(String)dd.getSelectedItem()+"/"+(String)mm.getSelectedItem()+"/"+(String)yy.getSelectedItem()+"\n";
				
				if(male.isSelected())
				{
					gender = "Male";
				}
				else
				{
					gender = "Female";
				}
				
				JOptionPane.showMessageDialog(email,"Hello Your details are:"+"\nFirst Name:"+n1+"\nLast Name:"+n2+"\nEmail:"+e1+"\nPassword:"+p1+"\nGender:"+gender+"\nDate Of Birth"+dob);
			}
		});
		
		//setting layout
		jf.setSize(1080,800);
		jf.setLayout(new GridLayout(9,3));
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	}
}