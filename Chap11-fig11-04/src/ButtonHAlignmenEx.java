import javax.swing.*;
import java.awt.*;

public class ButtonHAlignmenEx extends JFrame{
	public ButtonHAlignmenEx () {
		setTitle("��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		// 3 ���� �̹����� ���Ϸκ��� �о���δ�.
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif"); // normalIcon�� �̹���
		
		// normalIcon�� ���� ��ư ������Ʈ ����
		JButton btn = new JButton("call~~", normalIcon);
		btn.setHorizontalAlignment(SwingConstants.LEFT);
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new ButtonHAlignmenEx();
	}

}
