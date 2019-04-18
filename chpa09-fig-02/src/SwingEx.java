import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class SwingEx extends JFrame{
	public SwingEx(){
		setTitle("스윙 컴포넌트 보이기 예제");
		createMenu();
		createToolBar();
		createSplitPane();
		setSize(500,400);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		mb.add(new JMenu("File"));
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		this.setJMenuBar(mb);	
	
	}
	
	private void createToolBar() {
		JToolBar Bar = new JToolBar("Kitae Menu");
		
		Bar.setBackground(Color.LIGHT_GRAY);
		Bar.add(new JButton("New"));
		Bar.add(new JButton(new ImageIcon("images/open.jpg")));
		Bar.addSeparator();
		Bar.add(new JButton(new ImageIcon("images/save.jpg")));
		Bar.add(new JLabel("search"));
		Bar.add(new JTextField("text field"));
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		Bar.add(combo);
		add(Bar, BorderLayout.NORTH);
	}
	
	private void createSplitPane() {
		String [] fruits= {"apple", "banana" , "kiwi", "mango", "pear",
						"peach", "berry", "strawberry", "blackberry"};
		
		JList<String> scrollList = new JList<String>(fruits);
		JSplitPane Pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
						new JScrollPane(scrollList), new JScrollPane(new JLabel(new ImageIcon("images/img1.jpg")))); // JTabbedPane.LEFT
		add(Pane, BorderLayout.CENTER);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx();

	}

}
