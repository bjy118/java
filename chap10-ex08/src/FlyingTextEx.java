import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingTextEx extends JFrame{
	private final int FLYING_UnIT = 10; // ���̺��� �� �� �����̴� ������ 10�ȼ�
	private JLabel la = new JLabel("HELLO"); // Ű �Է¿� ���� ������ ���̺� ������Ʈ
	
	public FlyingTextEx() {
		setTitle("��,��,��.�� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); // ����Ʈ���� ��ġ������ ����
		c.addKeyListener(new MyKeylistener()); // ����Ʈ�ҿ� Key ������ �ޱ�
		la.setLocation(50,50); // 1a�� �ʱ� ��ġ��(50,50)
		la.setSize(100,20);
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus(); //����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		
		// ���� �ڵ�� ����Ʈ�ҿ� ��Ŀ���� ���� ��� ���콺�� Ŭ���ϸ� �ٽ� ��Ŀ���� ��� ��
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component c = (Component)e.getSource(); // ���콺�� Ŭ���� ������Ʈ
				c.setFocusable(true);
				c.requestFocus(); // ������Ʈ���� ��Ŀ�� ����
				
			}
		});
	}
	
	// Key ������ ����
	class MyKeyListener extends KeyAdapter {
		public void KeyPressed(KeyEvent e) {
			int KeyCode = e.getKeyCode(); // �Էµ� Ű�� Ű�ڵ带 �˾Ƴ���.
			
			// Ű �ڵ� ��(keyCode)�� ���� ��,��,��,�� Ű�� �Ǻ��ϰ� la�� ��ġ�� �̵���Ų��.
			switch(keyCode) {
			case
			}
			
		}
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
