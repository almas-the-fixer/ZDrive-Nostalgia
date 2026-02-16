import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class NotePad
{
	public static void main(String[] args)
	{
		//Declaring Components
		JFrame frame = new JFrame();
		
		JTextArea area = new JTextArea();
		area.setBounds(5,5,800,400);
		//Menu bar
		JMenuBar mb = new JMenuBar();
		
		//Menu 
		JMenu edit = new JMenu("Edit");
		JMenu File = new JMenu("File");
		JMenu Help = new JMenu("Help");
		
		//Menu Items
		JMenuItem SelectAll = new JMenuItem("SelectALL");
		JMenuItem Cut = new JMenuItem("Cut");
		JMenuItem Copy = new JMenuItem("Copy");
		JMenuItem Paste = new JMenuItem("Paste");
		//Click Event
		SelectAll.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				area.selectAll();
			}
		});
		Cut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				area.cut();
			}
		});
		Copy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				area.copy();
			}
		});
		Paste.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				area.paste();
			}
		});
		//Adding Components to Frame
		//adding menuitems in `edit` menu
		edit.add(SelectAll);
		edit.add(Cut);
		edit.add(Copy);
		edit.add(Paste);
		//done
		//adding edit menu to menu bar
		mb.add(File);
		mb.add(edit);
		mb.add(Help);
		//finally adding menu bar in frame
		frame.setJMenuBar(mb);
		
		//frame.add(mb); // doesnt work on menu bar!!!
		frame.add(area);
		frame.setLayout(null);
		frame.setSize(800,800);
		
		
		//Setting Frame visibility and bounds
		frame.setVisible(true);
		
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}