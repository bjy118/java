import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//�����̴� ���̺� ����
		FlickeringLabel flLabel = new FlickeringLabel("������", 500);
		
		//�������� �ʴ� ���̺� ����
		JLabel label = new JLabel("�ȱ���");
		
		// �����̴� ���̺� ����
		FlickeringLabel flLabel2 = new FlickeringLabel("���⵵ ����", 300);
		
		c.add(flLabel);
		c.add(label);
		c.add(flLabel2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new FlickeringLabelEx();
	}

}
