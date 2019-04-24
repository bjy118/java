import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickAndDoubleClickEx extends JFrame{
	public ClickAndDoubleClickEx() {
		setTitle("Click and DoubleClick ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener()); // Mouse ������ �ޱ�
		setSize(300,300);
		setVisible(true);
	}
	
	// MouseAdapter�� ��ӹھ� Mouse ������ ����
	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) { // ����Ŭ���� ���
				// [0, 255] ������ ������ r,g,b ���� �� ���
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				Component c = (Component)e.getSource(); // ���콺�� Ŭ���� ������Ʈ�� �˾Ƴ���.
				c.setBackground(new Color(r,g,b)); // ������Ʈ�� ����� r,g,b ������ ĥ�Ѵ�.
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new ClickAndDoubleClickEx();
	}

}
