import java.awt.*;
import java.awt.event.*;
class Opening extends Frame implements ActionListener,TextListener
{
	Label a,a1,a2,a3,a4,a5;
	TextField t1,t2,t3,t4,t5,tf1;
	Button e1,e2;

	
	Button d;

	public Opening()
	{
		
		setLayout(null);
		a = new Label("ACCOUNT OPENING && DISPLAYING");
		a1 = new Label("Account_holder ");
		a2 = new Label("Age ");
		a3 = new Label("Adhaar Number ");
		a4 = new Label("Address ");
		a5 = new Label("Gender ");

		
		
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		t4 = new TextField();
		t5 = new TextField();


		tf1 = new TextField();
	

		e1 = new Button("Create");
		e2 = new Button("Reset");
		
		
		add(a);
		add(a1);
		add(a2);
		add(a3);
		add(a4);
		add(a5);
	
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);

		add(e1);
		add(e2);

		add(tf1);

		a.setBounds(160,50,220,20);

		a1.setBounds(75,100,100,20);
		a2.setBounds(75,130,100,20);
		a3.setBounds(75,160,100,20);
		a4.setBounds(75,190,100,20);
		a5.setBounds(75,220,100,20);
		
		t1.setBounds(320,100,150,20);
		t2.setBounds(320,130,150,20);
		t3.setBounds(320,160,150,20);
		t4.setBounds(320,190,150,20);
		t5.setBounds(320,220,150,20);

		

		tf1.setBounds(120,400,250,20);
		

		setForeground(Color.blue);

		e1.setBounds(75,325,100,20);
		e2.setBounds(300,325,100,20);
	
		e1.addActionListener(this);
		e2.addActionListener(this);
		

	
		
		t1.addTextListener(this);
		t2.addTextListener(this);
		t3.addTextListener(this);
		t4.addTextListener(this);
		t5.addTextListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == e1)
		{
			tf1.setText("Your Account has been Successfully created");                                        
			setBackground(Color.green);
		}
		else if(ae.getSource() == e2)
		{
			tf1.setText("Please check your details");
			setBackground(Color.red);
		}

		
	}
	public void textValueChanged(TextEvent te)
	{
				repaint();
	}
	public void paint(Graphics g)
	{
				

				g.drawString("Account_holder: "+t1.getText(),20,450);
				g.drawString("Age: "+t2.getText(),20,470);
				g.drawString("Adhaar Number: "+t3.getText(),20,490);
				g.drawString("Address: "+t4.getText(),20,510);
				g.drawString("Gender: "+t5.getText(),20,530);
	}
}

