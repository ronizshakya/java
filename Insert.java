import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
class Insert extends JFrame{
	public Insert(){
	JPanel jp = new JPanel();
	JLabel l1 = new JLabel("Username");
	JLabel l2 = new JLabel("Firstname");
	JLabel l3 = new JLabel("Lastname");
	JLabel l4 = new JLabel("Password");
	JLabel l5 = new JLabel("Confirm Password");

	JTextField un = new JTextField(20);
	JTextField fn = new JTextField(20);
	JTextField ln = new JTextField(20);
	JPasswordField psw = new JPasswordField(20);
	JPasswordField cpsw = new JPasswordField(20);

	JButton log = new JButton("Log in");
	JButton can = new JButton("Cancel");

	jp.add(l1);
	jp.add(un);
	jp.add(l2);
	jp.add(fn);
	jp.add(l3);
	jp.add(ln);
	jp.add(l4);
	jp.add(psw);
	jp.add(l5);
	jp.add(cpsw);
	jp.add(log);
		log.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					try{
						String fname,lname,uname,pass,cpass;
						fname = fn.getText();
						lname = ln.getText();
						uname = un.getText();
						pass = psw.getText();
						cpass = cpsw.getText();


						
						Class.forName("com.mysql.jdbc.Driver");
						String path = ("jdbc:mysql://localhost:3306/hcoe");
						Connection con;
						Statement stmt;
						con = DriverManager.getConnection(path,"root","");
						stmt = con.createStatement();
						if(pass.equals(cpass)){
						stmt.executeUpdate("insert into `login` (`Username`,`Firstname`,`Lastname`,`Password`)values('"+uname+"','"+fname+"','"+lname+"','"+pass+"')");
						JOptionPane.showMessageDialog(null,"Logged in");
						}
						else{
							JOptionPane.showMessageDialog(null,"password doesn't match");
						}

					}
					catch(Exception e){
						System.out.println(e);
					}
				}
			}
			);
	jp.add(can);
	
	add(jp);

	setTitle("LOgin page");
	setVisible(true);
	setSize(300,300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);



	
}
public static void main(String [] args){
	new Insert();
}
	
}
