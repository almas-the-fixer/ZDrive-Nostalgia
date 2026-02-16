import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator
{
	public static void main(String[] args)
	{
		//Declaring Frame & Fields 
		JFrame jf = new JFrame();
		
		JLabel title = new JLabel();
		JLabel ans = new JLabel("Answer:-");
		
		JLabel Number1 = new JLabel();
		JLabel Number2 = new JLabel();
		
		JTextField n1 = new JTextField();
		JTextField n2 = new JTextField();
		
		JButton add = new JButton("+");
		JButton sub = new JButton("-");
		JButton multiply = new JButton("*");
		JButton divide = new JButton("/");
		
		
		//Click Events
		
		add.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				double number1,number2,result;
				number1 = Double.parseDouble(n1.getText());
				number2 = Double.parseDouble(n2.getText());
				
				result = number1 + number2;
				
				JOptionPane.showMessageDialog(ans,"Addition is : "+ result);
				//ans.setText(String.valueOf(result));
			}
		});
		
		sub.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				double num1,num2,subtraction;
				num1 = Double.parseDouble(n1.getText());
				num2 = Double.parseDouble(n2.getText());
				
				subtraction = num1 - num2;
				
				JOptionPane.showMessageDialog(ans,"Subtraction is : "+ subtraction);
				//ans.setText(String.valueOf(subtraction));
			}
		});
		
		multiply.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				double no1,no2,multi;
				no1 = Double.parseDouble(n1.getText());
				no2 = Double.parseDouble(n2.getText());
				
				multi = no1 * no2;
				
				JOptionPane.showMessageDialog(ans,"Multiplication is : "+ multi);
				//ans.setText(String.valueOf(multi));
			}
		});
		
		divide.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				double numb1,numb2,product;
				numb1 = Double.parseDouble(n1.getText());
				numb2 = Double.parseDouble(n2.getText());
				
				product = numb1 / numb2;
				
				JOptionPane.showMessageDialog(ans,"Division is : "+ product);
				//ans.setText(String.valueOf(product));
			}
		});
		
		//Adding Components on Frame
		
		jf.add(Number1);
		jf.add(Number2);
		
		jf.add(n1);
		jf.add(n2);
		
		jf.add(add);
		jf.add(sub);
		jf.add(multiply);
		jf.add(divide);
		
		jf.add(ans);
		jf.add(title);
		
		//Setting Size and Grid Layout
		jf.setLayout(new GridLayout(5,2));
		jf.setSize(1080,800);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	}
}