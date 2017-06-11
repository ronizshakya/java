//user and password framepanel
import javax.swing.*;
class Login extends JFrame{
	public Login(){
	JPanel jp = new JPanel();
	JLabel jl = new JLabel("Username");
	JLabel jl2 = new JLabel("password");
	JTextField un = new JTextField(20);
	JPasswordField psw = new JPasswordField(20);
	JButton log = new JButton("Login");
	JButton can = new JButton("cancel");

	jp.add(jl);
	jp.add(un);
	jp.add(jl2);
	jp.add(psw);
	jp.add(log);
	jp.add(can);
	add(jp);
	setTitle("Login page");
	setVisible(true);
	setSize(300,300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);


	}
	public static void main(String args[]){
	new Login();

	}
	
}