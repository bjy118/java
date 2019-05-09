import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Math extends JFrame{
	
	private Math(){
	 	
	 		setTitle("계산기");
	 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		Container c = getContentPane();
	 		c.setBackground(Color.WHITE);
	 		c.setLayout(new FlowLayout(FlowLayout.LEFT));
	 		
	 		c.add(new Label("숫자 입력"));
	 		c.add(new JTextField(20));
	 		
	 		JButton a1 = new JButton("1");
	 		JButton b1 = new JButton("2");
	 		JButton c1 = new JButton("3");
	 		JButton d1 = new JButton("4");
	 		JButton e1 = new JButton("5");
	 		JButton f1 = new JButton("6");
	 		JButton g1 = new JButton("7");
	 		JButton h1 = new JButton("8");
	 		JButton i1 = new JButton("9");
	 		JButton p1 = new JButton("0");
	 		JButton j1 = new JButton("+");
	 		JButton k1 = new JButton("-");
	 		JButton l1 = new JButton("*");
	 		JButton m1 = new JButton("/");
	 		
	 		
	 		c.add(a1);
	 		c.add(b1);
	 		c.add(c1);
	 		c.add(d1);
	 		c.add(e1);
	 		c.add(f1);
	 		c.add(g1);
	 		c.add(h1);
	 		c.add(i1);
	 		c.add(p1);
	 		c.add(j1);
	 		c.add(k1);
	 		c.add(l1);
	 		c.add(m1);
	 		
	 		c.add(new Label("결과"));
	 		
	 		setSize(250,200);
	 		setVisible(true);
	 	}
	 	
	public static void main(String[] args) {
		
		new Math();
	}
	
	//class Add {
		//private int a, b;
		//public void setValue(int a, int b) {
		
		//this.a = a;
		//this.b = b;
		//}
		//public int calculate() {
			//return a+b;
		//}
	//}
	
	//char operator Scanner.next().charAt(0);
	//switch (operator) {case '+'; A d d 
	//add = new Add();
	//add.setValue(a,b);
	//System.out.println(add.claculate());
	//break;
	//case '-';
	//Sub sub
	//= new Sub();
	//sub.setValue(a, b);
	//System.out.println(sub.calculate());
	//break;
	//case '*'
	//Mul mul
	//= new Mul();
	//mul.setValue(a, b);
	//System.out.println(mul.calculate);
	//}
}
