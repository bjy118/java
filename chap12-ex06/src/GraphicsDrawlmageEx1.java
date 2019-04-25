import javax.swing.*;
import java.awt.*;

public class GraphicsDrawlmageEx1 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawlmageEx1() {
		setTitle("���� ũ��� ���ϴ� ��ġ�� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 20, 20, this);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new GraphicsDrawlmageEx1();
	}

}