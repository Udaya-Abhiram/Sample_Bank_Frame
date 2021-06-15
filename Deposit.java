import java.awt.*;
import java.awt.event.*;
class Deposit extends Frame implements ActionListener
{
	Button e1;
	Label a1,a2,a3;
	TextField tf1,tf2,tf3;
	public Deposit()
	{
		setLayout(null);
		a1 = new Label("TotalBalance");
		tf1 = new TextField();
		a2 = new Label("Deposit_Amt");
		tf2 = new TextField();
		a3 = new Label("TotalAmount");
		tf3 = new TextField();
		e1 = new Button("Deposit");

		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf3.addActionListener(this);

		add(a1);
		add(tf1);
		add(a2);
		add(tf2);
		add(a3);
		add(tf3);
		add(e1);

		e1.addActionListener(this);

		a1.setBounds(75,100,100,20);
		tf1.setBounds(200,100,150,20);
		a2.setBounds(75,130,100,20);
		tf2.setBounds(200,130,150,20);
		a3.setBounds(75,160,100,20);
		tf3.setBounds(200,160,150,20);
		e1.setBounds(225,225,100,20);
		setForeground(Color.BLUE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int c,i,j;
		i = Integer.parseInt(tf1.getText());
		j = Integer.parseInt(tf2.getText());

		c = i+j;
		if(ae.getSource()==e1)
		{
			setBackground(Color.yellow);
			tf3.setText(c+"");
		}
		
	}
	


}