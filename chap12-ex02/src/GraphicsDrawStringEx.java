import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame{
	private MyPanel Panel = new MyPanel();
	
	public GraphicsDrawStringEx(){
		setTitle("drawString ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(Panel);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	// JPanel�� ��ӹ޴� �� �г� �ۼ�
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString("�ڹٴ� ��մ�.~~", 30, 30);
			g.drawString("�󸶳�? �ϴø�ŭ ����ŭ !!!!", 60, 60 );
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new GraphicsDrawStringEx();
	}

}
