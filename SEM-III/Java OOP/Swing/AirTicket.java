import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AirTicket
{
	public static void main(String[] args)
	{
		String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
				
		String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
				
		/* year not required XDXDXD
		String[] years = {"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2017","2018","2019","2020","2021","2022","2023"};
		*/
		//Declaring Components
		
		//Frame
		JFrame frame = new JFrame();
		
		//Labels
		JLabel name = new JLabel("Name: ");
		JLabel email = new JLabel("E-Mail: ");
		JLabel Pno = new JLabel("Phone: ");
		
		JLabel Date = new JLabel("Date of booking: ");
		JLabel Month = new JLabel("Month: ");
		//JLabel Year = new JLabel("Year: ");
		
		JLabel nt = new JLabel("No of Tickets: ");
		JLabel cmt = new JLabel("Additional Comments: ");
		
		//Fields
		JTextField fullname = new JTextField();
		JTextField mail = new JTextField();
		JTextField phone = new JTextField();
		JTextField notick = new JTextField();
		
		//Combobox for date
		JComboBox dd = new JComboBox(days);
		JComboBox mm = new JComboBox(months);
		//JComboBox yy = new JComboBox(years);
		
		//Radio buttons
		JRadioButton std = new JRadioButton("Standard");
		JRadioButton vip = new JRadioButton("V.I.P");
		//Grouping
		ButtonGroup bg = new ButtonGroup();
		bg.add(std);
		bg.add(vip);
		
		//Text Area
		JTextArea comment = new JTextArea();
		
		//Buttons
		JButton submit = new JButton("Submit");
		JButton reset = new JButton("Reset");
		
		//Click events //incomplete
		
		
		
		//<!___DOne___!>
		
		//Adding Components on frame
		frame.setVisible(true);
		frame.setSize(1080,800);
		frame.setLayout(new GridLayout(9,2));
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		frame.add(name);
		frame.add(fullname);
		
		frame.add(email);
		frame.add(mail);
		
		frame.add(Pno);
		frame.add(phone);
		
		frame.add(Date);
		frame.add(dd);
		
		frame.add(Month);
		frame.add(mm);
		
		frame.add(std);
		frame.add(vip);
		
		frame.add(nt);
		frame.add(notick);
		
		frame.add(cmt);
		frame.add(comment);
		
		frame.add(submit);
		frame.add(reset);
	}
}