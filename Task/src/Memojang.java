
import java.awt.*;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class Memojang extends JFrame{
	public Memojang() {
		setTitle("메모장");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar mb = new JMenuBar();
		JMenu FileMenu = new JMenu("파일(F)");
		JMenu EditMenu = new JMenu("편집(E)");
		JMenu FormMenu = new JMenu("서식(O)");
		JMenu ViewMenu = new JMenu("보기(V)");
		JMenu HelpMenu = new JMenu("도움말(H)");
		
		mb.add(FileMenu);
		mb.add(EditMenu);
		mb.add(FormMenu);
		mb.add(ViewMenu);
		mb.add(HelpMenu);
		mb.setBackground(Color.PINK);
		setJMenuBar(mb);
		
		
		Container c = getContentPane();
		c.setBackground(Color.PINK);
		c.add(new JTextArea());

		
		setSize(900,600);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Memojang();

	}

}
