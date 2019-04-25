import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public paintJPanelEx(){
	setTitle("JPanel의 paintComponent() 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setContentPane(panel);
	
	setSize(250,250);
	setVisible(true);
}
	// JPanel를 상속받는 새 패널 작성
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // JPanel의 paintComponent() 호출
			g.setColor(Color.BLUE); // 파란색 선택
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
