package flag;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ThreadFinishFlagEx extends JFrame{
	private RandomThread th; // 스레드 레퍼런스
	
	public ThreadFinishFlagEx(){
		setTitle("ThreadFinishFlagEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e){
				th.finish(); // RandomThread 스레드 종료 명령
			}
		});
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c); // 스레드 생성
		th.start(); // 스레드 동작시킴
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new ThreadFinishFlagEx();
	}

}
