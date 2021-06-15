import java.awt.*;
import java.awt.event.*;

class BMS extends Frame implements ActionListener
{
	Label l,l1,l2,l3,l4,l5,l6,ll;
	Button b1,b2,b3,b4,b5,b6;
	public BMS()
	{
		setLayout(null);

		l = new Label("WELCOME TO OUR BANK");
		ll =new Label("SELECT YOUR CHOICE");

		l1 = new Label("Account opening ");
	
		l3 = new Label("Deposit");
		l4 = new Label("Withdraw ");

		l6 = new Label("Closing Account ");

		b1 = new Button(" Account Opening ");
		
		b3 = new Button("Deposit");
		b4 = new Button("Withdraw");
		
		b6 = new Button(" Closing Account ");

		add(l);
		add(ll);
		add(l1);
		add(b1);
		
		add(l3);
		add(b3);
		add(l4);
		add(b4);
		
		add(l6);
		add(b6);

		l.setBounds(160,50,150,20);
		ll.setBounds(160,350,150,20);

		l1.setBounds(75,100,100,20);
		l3.setBounds(75,130,100,20);
		l4.setBounds(75,160,100,20);
		l6.setBounds(75,190,100,20);

		b1.setBounds(250,100,100,20);
		b3.setBounds(250,130,100,20);
		b4.setBounds(250,160,100,20);
		b6.setBounds(250,190,100,20);

		b1.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b6.addActionListener(this);
		
		setForeground(Color.green);
		setBackground(Color.DARK_GRAY);
		b1.setBackground(Color.DARK_GRAY);
		b3.setBackground(Color.DARK_GRAY);
		b4.setBackground(Color.DARK_GRAY);
		b6.setBackground(Color.DARK_GRAY);
		

	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
			if(ae.getSource()==b1)
			{
				Opening o = new Opening();
				o.setSize(550,550);
				o.setTitle("AccountOpening");
				o.setVisible(true);
			
			}
			
			else if(ae.getSource()==b3)
			{
				Deposit d = new Deposit();
				d.setSize(500,500);
				d.setTitle("Deposit");
				d.setVisible(true);
			}
			else if(ae.getSource()==b4)
			{
				Withdraw w = new Withdraw();
				w.setSize(500,500);
				w.setTitle("Withdraw");
				w.setVisible(true);
			}
			else if(ae.getSource() == b6)
			{

				Closing c = new Closing();
				c.setSize(500,500);
				c.setTitle("Closing");
				c.setVisible(true);
			}

	}
	public static void main(String args[])
	{
		BMS f = new BMS();
		f.setSize(500,500);
		f.setTitle("BMS");
		f.setVisible(true);
	}
}