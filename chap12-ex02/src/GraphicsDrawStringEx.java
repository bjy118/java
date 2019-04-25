import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame{
	private MyPanel Panel = new MyPanel();
	
	public GraphicsDrawStringEx(){
		setTitle("drawString 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(Panel);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	// JPanel을 상속받는 새 패널 작성
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString("자바는 재밌다.~~", 30, 30);
			g.drawString("얼마나? 하늘만큼 땅만큼 !!!!", 60, 60 );
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new GraphicsDrawStringEx();
	}

}
