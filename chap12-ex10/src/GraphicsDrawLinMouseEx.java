import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class GraphicsDrawLinMouseEx extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawLinMouseEx() {
		setTitle("drawing line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new GraphicsDrawLinMouseEx();
	}
	
	// 그려진 선을 모두 저장하기 위해 시작점은 vStart에
	// 끝점은 vEnd 벡터에 각각 저장한다.
	class MyPanel extends JPanel {
		private Vector<Point> vStart = new Vector<Point>(); // Point만 저장하는 제네릭 벡터
		private Vector<Point> vEnd = new Vector<Point>(); // Point만 저장하는 제네릭 벡터
	}

}
