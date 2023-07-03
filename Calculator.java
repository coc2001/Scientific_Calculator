package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	
	private ImageIcon icon;
	private Container c;
	private JLabel label,numtoword;
	private Font h,f,subh;
	private JTextField tf;
	private JTextArea ta;
	private JScrollPane scroll;
	private JRadioButton on_button,off_button;
	private ButtonGroup bg;
	private JButton root_button,ex_button,sin_button,cos_button,tan_button,onedivx_button,log_button,sinh_button,cosh_button,tanh_button,xtothepowy_button,percent_button,C_button,B_button,plus_button,xtothepow3_button,minus_button,xtothepow2_button,multi_button,nfactorial_button,divide_button,dot_button,equal_button,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,plusminus_button,Convert_button,cl;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	Calculator()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		icon = new ImageIcon(getClass().getResource("calculator-icon-1.png"));
		this.setIconImage(icon.getImage());
		
		h = new Font("Times New Roman",Font.BOLD,22);
		f = new Font("Times New Roman",Font.BOLD,16);
		subh = new Font("Times New Roman",Font.BOLD,18);
		
		bg =  new ButtonGroup();
		
		label = new JLabel("Scientific Calculator");
		label.setBounds(100,3,200,50);
		label.setFont(h);
		c.add(label);	
		
		
		ta = new JTextArea();
		//ta.setBounds(40,100,350,40);
		ta.setFont(f);
		ta.setEditable(false);
		ta.setBackground(Color.WHITE);
		c.add(ta);
		
		scroll = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(30,120,350,40);
		c.add(scroll);
		
		
		
		tf = new JTextField();
		tf.setBounds(30,50,350,45);
		tf.setFont(h);
		tf.setEditable(false);
		tf.setBackground(Color.WHITE);
		c.add(tf);
		
		on_button = new JRadioButton("ON");
		on_button.setBounds(40,165,50,30);
		on_button.setFont(f);
		on_button.setBackground(Color.GREEN);
		on_button.setForeground(Color.WHITE);
		on_button.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				root_button.setEnabled(true);
				ex_button.setEnabled(true);
				sin_button.setEnabled(true);
				cos_button.setEnabled(true);
				tan_button.setEnabled(true);
				onedivx_button.setEnabled(true);
				log_button.setEnabled(true);
				sinh_button.setEnabled(true);
				cosh_button.setEnabled(true);
				tanh_button.setEnabled(true);
				xtothepowy_button.setEnabled(true);
				percent_button.setEnabled(true);
				C_button.setEnabled(true);
				B_button.setEnabled(true);
				plus_button.setEnabled(true);
				xtothepow3_button.setEnabled(true);
				minus_button.setEnabled(true);
				xtothepow2_button.setEnabled(true);
				multi_button.setEnabled(true);
				nfactorial_button.setEnabled(true);
				divide_button.setEnabled(true);
				dot_button.setEnabled(true);
				equal_button.setEnabled(true);
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);
				b0.setEnabled(true);
				plusminus_button.setEnabled(true);
				
			}
		});
		c.add(on_button);
		
		off_button = new JRadioButton("OFF");
		off_button.setBounds(300,165,60,30);
		off_button.setFont(f);
		off_button.setBackground(Color.RED);
		off_button.setForeground(Color.WHITE);
		off_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf.setText(null);
				root_button.setEnabled(false);
				ex_button.setEnabled(false);
				sin_button.setEnabled(false);
				cos_button.setEnabled(false);
				tan_button.setEnabled(false);
				onedivx_button.setEnabled(false);
				log_button.setEnabled(false);
				sinh_button.setEnabled(false);
				cosh_button.setEnabled(false);
				tanh_button.setEnabled(false);
				xtothepowy_button.setEnabled(false);
				percent_button.setEnabled(false);
				C_button.setEnabled(false);
				B_button.setEnabled(false);
				plus_button.setEnabled(false);
				xtothepow3_button.setEnabled(false);
				minus_button.setEnabled(false);
				xtothepow2_button.setEnabled(false);
				multi_button.setEnabled(false);
				nfactorial_button.setEnabled(false);
				divide_button.setEnabled(false);
				dot_button.setEnabled(false);
				equal_button.setEnabled(false);
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				b0.setEnabled(false);
				plusminus_button.setEnabled(false);
				
			}
		});
		c.add(off_button);
		
		bg.add(on_button);
		bg.add(off_button);
		
		root_button = new JButton("√");
		root_button.setBounds(30,200,65,40);
		root_button.setBackground(Color.GRAY);
		root_button.setForeground(Color.WHITE);
		root_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=Math.sqrt(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText()+a);
			}
		});
		c.add(root_button);
		
		ex_button = new JButton("ex");
		ex_button.setBounds(100,200,65,40);
		ex_button.setFont(f);
		ex_button.setBackground(Color.GRAY);
		ex_button.setForeground(Color.WHITE);
		ex_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=Math.exp(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText()+a);
			}
		});
		c.add(ex_button);
		
		sin_button = new JButton("sin");
		sin_button.setBounds(170,200,65,40);
		sin_button.setFont(f);
		sin_button.setBackground(Color.GRAY);
		sin_button.setForeground(Color.WHITE);
		sin_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=Math.sin(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText()+a);
			}
		});
		c.add(sin_button);
		
		cos_button = new JButton("cos");
		cos_button.setBounds(240,200,65,40);
		cos_button.setFont(f);
		cos_button.setBackground(Color.GRAY);
		cos_button.setForeground(Color.WHITE);
		cos_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=Math.cos(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText()+a);
			}
		});
		c.add(cos_button);
		
		tan_button = new JButton("tan");
		tan_button.setBounds(310,200,65,40);
		tan_button.setFont(f);
		tan_button.setBackground(Color.GRAY);
		tan_button.setForeground(Color.WHITE);
		tan_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=Math.tan(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText()+a);
			}
		});
		c.add(tan_button);
		
		onedivx_button = new JButton("1/x");
		onedivx_button.setBounds(30,245,65,40);
		onedivx_button.setFont(f);
		onedivx_button.setBackground(Color.GRAY);
		onedivx_button.setForeground(Color.WHITE);
		onedivx_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=1/(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText()+a);
			}
		});
		c.add(onedivx_button);
		
		log_button = new JButton("log");
		log_button.setBounds(100,245,65,40);
		log_button.setFont(f);
		log_button.setBackground(Color.GRAY);
		log_button.setForeground(Color.WHITE);
		log_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=Math.log(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText()+a);
			}
		});
		c.add(log_button);
		
		sinh_button = new JButton("sinh");
		sinh_button.setBounds(170,245,65,40);
		sinh_button.setFont(f);
		sinh_button.setBackground(Color.GRAY);
		sinh_button.setForeground(Color.WHITE);
		sinh_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=Math.sinh(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText()+a);
			}
		});
		c.add(sinh_button);
		
		cosh_button = new JButton("log");
		cosh_button.setBounds(240,245,65,40);
		cosh_button.setFont(f);
		cosh_button.setBackground(Color.GRAY);
		cosh_button.setForeground(Color.WHITE);
		cosh_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=Math.cosh(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText()+a);
			}
		});
		c.add(cosh_button);
		
		tanh_button = new JButton("tanh");
		tanh_button.setBounds(310,245,65,40);
		tanh_button.setFont(f);
		tanh_button.setBackground(Color.GRAY);
		tanh_button.setForeground(Color.WHITE);
		tanh_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=Math.tanh(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText()+a);
			}
		});
		c.add(tanh_button);
		
		xtothepowy_button = new JButton("x^y");
		xtothepowy_button.setBounds(30,290,65,40);
		xtothepowy_button.setFont(f);
		xtothepowy_button.setBackground(Color.GRAY);
		xtothepowy_button.setForeground(Color.WHITE);
		xtothepowy_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			first=Double.parseDouble(tf.getText());
			tf.setText(" ");
			operation="x^y";
			}
		});
		c.add(xtothepowy_button);
		
		percent_button = new JButton("%");
		percent_button.setBounds(100,290,65,40);
		percent_button.setFont(f);
		percent_button.setBackground(Color.ORANGE);
		percent_button.setForeground(Color.WHITE);
		percent_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			first=Double.parseDouble(tf.getText());
			tf.setText(" ");
			operation="%";
			}
		});
		c.add(percent_button);
		
		C_button = new JButton("C");
		C_button.setBounds(170,290,65,40);
		C_button.setFont(f);
		C_button.setBackground(Color.RED);
		C_button.setForeground(Color.WHITE);
		C_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf.setText(null);
			}
		});
		c.add(C_button);
		
		B_button = new JButton("B");
		B_button.setBounds(240,290,65,40);
		B_button.setFont(f);
		B_button.setBackground(Color.RED);
		B_button.setForeground(Color.WHITE);
		B_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String B_button=null;
				if(tf.getText().length()>0) {
					StringBuilder str = new StringBuilder(tf.getText());
					str.deleteCharAt(tf.getText().length()-1);
					B_button=str.toString();
					tf.setText(B_button);
				}
			}
		});
		c.add(B_button);
	
		
		plus_button = new JButton("+");
		plus_button.setBounds(310,290,65,40);
		plus_button.setFont(h);
		plus_button.setBackground(Color.ORANGE);
		plus_button.setForeground(Color.WHITE);
		plus_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			first=Double.parseDouble(tf.getText());
			tf.setText(" ");
			operation="+";
			}
		});
		c.add(plus_button);
	
		xtothepow3_button = new JButton("x3");
		xtothepow3_button.setBounds(30,335,65,40);
		xtothepow3_button.setFont(f);
		xtothepow3_button.setBackground(Color.ORANGE);
		xtothepow3_button.setForeground(Color.WHITE);
		xtothepow3_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=(Double.parseDouble(tf.getText()));
				a=a*a*a;
				tf.setText("");
				tf.setText(tf.getText()+a);
			}
		});
		c.add(xtothepow3_button);
		
		b7 = new JButton("7");
		b7.setBounds(100,335,65,40);
		b7.setFont(h);
		b7.setBackground(Color.BLUE);
		b7.setForeground(Color.WHITE);
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number=tf.getText()+b7.getText();
				tf.setText(number);
			}
		});
		c.add(b7);
		
		b8 = new JButton("8");
		b8.setBounds(170,335,65,40);
		b8.setFont(h);
		b8.setBackground(Color.BLUE);
		b8.setForeground(Color.WHITE);
		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number=tf.getText()+b8.getText();
				tf.setText(number);
			}
		});
		c.add(b8);
		
		b9 = new JButton("9");
		b9.setBounds(240,335,65,40);
		b9.setFont(h);
		b9.setBackground(Color.BLUE);
		b9.setForeground(Color.WHITE);
		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number=tf.getText()+b9.getText();
				tf.setText(number);
			}
		});
		c.add(b9);
		
		minus_button = new JButton("-");
		minus_button.setBounds(310,335,65,40);
		minus_button.setFont(h);
		minus_button.setBackground(Color.ORANGE);
		minus_button.setForeground(Color.WHITE);
		minus_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			first=Double.parseDouble(tf.getText());
			tf.setText(" ");
			operation="-";
			}
		});
		c.add(minus_button);
		
		xtothepow2_button = new JButton("x2");
		xtothepow2_button.setBounds(30,380,65,40);
		xtothepow2_button.setFont(f);
		xtothepow2_button.setBackground(Color.ORANGE);
		xtothepow2_button.setForeground(Color.WHITE);
		xtothepow2_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=(Double.parseDouble(tf.getText()));
				a=a*a;
				tf.setText("");
				tf.setText(tf.getText()+a);
			}
		});
		c.add(xtothepow2_button);
		
		b4 = new JButton("4");
		b4.setBounds(100,380,65,40);
		b4.setFont(h);
		b4.setBackground(Color.BLUE);
		b4.setForeground(Color.WHITE);
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number=tf.getText()+b4.getText();
				tf.setText(number);
			}
		});
		c.add(b4);
		
		b5 = new JButton("5");
		b5.setBounds(170,380,65,40);
		b5.setFont(h);
		b5.setBackground(Color.BLUE);
		b5.setForeground(Color.WHITE);
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number=tf.getText()+b5.getText();
				tf.setText(number);
			}
		});
		c.add(b5);
		
		b6 = new JButton("6");
		b6.setBounds(240,380,65,40);
		b6.setFont(h);
		b6.setBackground(Color.BLUE);
		b6.setForeground(Color.WHITE);
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number=tf.getText()+b6.getText();
				tf.setText(number);
			}
		});
		c.add(b6);
		
		multi_button = new JButton("*");
		multi_button.setBounds(310,380,65,40);
		multi_button.setFont(h);
		multi_button.setBackground(Color.ORANGE);
		multi_button.setForeground(Color.WHITE);
		multi_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			first=Double.parseDouble(tf.getText());
			tf.setText(" ");
			operation="*";
			}
		});
		c.add(multi_button);

		nfactorial_button = new JButton("n!");
		nfactorial_button.setBounds(30,425,65,40);
		nfactorial_button.setFont(f);
		nfactorial_button.setBackground(Color.ORANGE);
		nfactorial_button.setForeground(Color.WHITE);
		nfactorial_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=Double.parseDouble(tf.getText());
				double fact=1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}
				tf.setText("");
				tf.setText(tf.getText()+fact);
			}	
		});
						
		c.add(nfactorial_button);
		
		b3 = new JButton("3");
		b3.setBounds(100,425,65,40);
		b3.setFont(h);
		b3.setBackground(Color.BLUE);
		b3.setForeground(Color.WHITE);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number=tf.getText()+b3.getText();
				tf.setText(number);
			}
		});
		c.add(b3);
		
		b2 = new JButton("2");
		b2.setBounds(170,425,65,40);
		b2.setFont(h);
		b2.setBackground(Color.BLUE);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number=tf.getText()+b2.getText();
				tf.setText(number);
			}
		});
		c.add(b2);
		
		b1 = new JButton("1");
		b1.setBounds(240,425,65,40);
		b1.setFont(h);
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number=tf.getText()+b1.getText();
				tf.setText(number);
			}
		});
		c.add(b1);
		
		divide_button = new JButton("/");
		divide_button.setBounds(310,425,65,40);
		divide_button.setFont(h);
		divide_button.setBackground(Color.ORANGE);
		divide_button.setForeground(Color.WHITE);
		divide_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			first=Double.parseDouble(tf.getText());
			tf.setText(" ");
			operation="/";
			}
		});
		c.add(divide_button);
		
		plusminus_button = new JButton("+/-");
		plusminus_button.setBounds(30,470,65,40);
		plusminus_button.setFont(h);
		plusminus_button.setBackground(Color.ORANGE);
		plusminus_button.setForeground(Color.WHITE);
		plusminus_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a=Double.parseDouble(String.valueOf(tf.getText()));
				a=a*(-1);
				tf.setText(String.valueOf(a));
			}
		});
		c.add(plusminus_button);
		
		b0 = new JButton("0");
		b0.setBounds(100,470,135,40);
		b0.setFont(h);
		b0.setBackground(Color.BLUE);
		b0.setForeground(Color.WHITE);
		b0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number=tf.getText()+b0.getText();
				tf.setText(number);
			}
		});
		c.add(b0);
		
		dot_button = new JButton(".");
		dot_button.setBounds(240,470,65,40);
		dot_button.setFont(h);
		dot_button.setBackground(Color.ORANGE);
		dot_button.setForeground(Color.WHITE);
		c.add(dot_button);
		
		equal_button = new JButton("=");
		equal_button.setBounds(310,470,65,40);
		equal_button.setFont(h);
		equal_button.setBackground(Color.ORANGE);
		equal_button.setForeground(Color.WHITE);
		equal_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			second=Double.parseDouble(tf.getText());
			if(operation=="+") {
				result=first+second;
				answer=String.format("%.2f",result);
				tf.setText(answer);
			}
			else if(operation=="-") {
				result=first-second;
				answer=String.format("%.2f",result);
				tf.setText(answer);
			}
			else if(operation=="*") {
				result=first*second;
				answer=String.format("%.2f",result);
				tf.setText(answer);
			}
			else if(operation=="/") {
				result=first/second;
				answer=String.format("%.2f",result);
				tf.setText(answer);
			}
			else if(operation=="%") {
				result=first%second;
				answer=String.format("%.2f",result);
				tf.setText(answer);
			}
			else if(operation=="x^y") {
				double result=1;
				for(int i=0;i<second;i++) {
					result=first*result;
				}
				answer=String.format("%.2f",result);
				tf.setText(answer);
			}
			}
		});
		c.add(equal_button);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator frame = new Calculator();
	    frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400,50,425,570);
		frame.setTitle("Scientific Calculator");
		frame.setResizable(false);
		

	}
}
