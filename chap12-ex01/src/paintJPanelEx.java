import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public paintJPanelEx(){
	setTitle("JPanel�� paintComponent() ����");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setContentPane(panel);
	
	setSize(250,250);
	setVisible(true);
}
	// JPanel�� ��ӹ޴� �� �г� �ۼ�
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // JPanel�� paintComponent() ȣ��
			g.setColor(Color.BLUE); // �Ķ��� ����
			g.drawRect(10,10,50,50);
			g.drawRect(90,90,50,50);
			
			g.setColor(Color.MAGENTA);
			g.drawRect(90,90,50,50);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new paintJPanelEx();
	}

}
