import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class GraphicsDrawLinMouseEx extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawLinMouseEx() {
		setTitle("drawing line by Mouse ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new GraphicsDrawLinMouseEx();
	}
	
	// �׷��� ���� ��� �����ϱ� ���� �������� vStart��
	// ������ vEnd ���Ϳ� ���� �����Ѵ�.
	class MyPanel extends JPanel {
		private Vector<Point> vStart = new Vector<Point>(); // Point�� �����ϴ� ���׸� ����
		private Vector<Point> vEnd = new Vector<Point>(); // Point�� �����ϴ� ���׸� ����
	}

}
