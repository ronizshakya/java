import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
class Search extends JFrame{

	public Search()
	{
		JPanel jp=new JPanel();
		JTextField txt=new JTextField(20);
		JButton btn=new JButton("ok");

		jp.add(txt);
		jp.add(btn);

		btn.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					try{}
					catch(Exception e)
					{
					System.out.println("e");
					}
				}					

			}		 
		 );
	add(jp);
	setVisible(true);
	setSize(300,300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public static void main(String args[])
	{
	new Search();
}

}