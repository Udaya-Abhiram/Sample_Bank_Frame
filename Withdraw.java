import java.awt.*;
import java.awt.event.*;
class Withdraw extends Frame implements ActionListener
{
	Button e1;
	Label a1,a2,a3;
	TextField tf1,tf2,tf3;
	public Withdraw()
	{              
		setLayout(null);
		a1 = new Label("TotalBalance");
		tf1 = new TextField();
		a2 = new Label("Withdraw_Amt");
		tf2 = new TextField();
		a3 = new Label("TotalAmount");
		tf3 = new TextField();
		e1 = new Button("Withdraw");
		add(a1);
		add(a2);
		add(a3);
		add(tf1);
		add(tf2);
		add(tf3);
		add(e1);

		e1.addActionListener(this);
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf3.addActionListener(this);


		
		a1.setBounds(75,100,100,20);
		a2.setBounds(75,130,100,20);
		a3.setBounds(75,160,100,20);

		tf1.setBounds(200,100,150,20);
		tf2.setBounds(200,130,150,20);
		tf3.setBounds(200,160,150,20);

		e1.setBounds(225,225,100,20);
		setForeground(Color.blue);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int c,i,j;
		if(ae.getSource()==e1)
		{
			
			setBackground(Color.MAGENTA);
			i = Integer.parseInt(tf1.getText());
			j = Integer.parseInt(tf2.getText());
			c = i-j;
			tf3.setText(c+" ");
		}
		
	}
	


}