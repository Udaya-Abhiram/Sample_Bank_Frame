import java.awt.*;
import java.awt.event.*;
class Closing extends Frame implements ActionListener
{
	Label l,l1;
	Button b1;
	TextField tf1,tf2;
	public Closing()
	{
		setLayout(null);
		l = new Label("Please Enter the reason for closing Account");
		l1 = new Label("ACCOUNT CLOSING");
		b1 = new Button("close");
		tf1 = new TextField();
		tf2 = new TextField();
		add(l1);
		add(l);
		add(b1);
		add(tf1);
		add(tf2);

		b1.addActionListener(this);

		l1.setBounds(165,25,150,20);
		l.setBounds(20,100,300,20);
		tf1.setBounds(70,150,250,20);
		b1.setBounds(350,200,50,20);
		tf2.setBounds(70,350,250,20);

		setForeground(Color.blue);

	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			
			setBackground(Color.cyan);
			tf2.setText("Thankyou! Your Account has closed");
		}
	}
}
	