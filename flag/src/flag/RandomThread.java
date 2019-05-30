package flag;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RandomThread extends Thread{
	private Container contentPane;
	private boolean flag=false; // 스레드의 종료 명령을 표시하는 플래그. true : 종료 지시
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	@Override
	public void run(){
		while(true){
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel label = new JLabel("java"); //새 레이블 생성
			label.setSize(80, 30);
			label.setLocation(x, y);
			contentPane.add(label);
			contentPane.repaint();
			try {
				Thread.sleep(300); // 0.3초 동안 잠을 잔다.
				if(flag==true){
					contentPane.removeAll();
					label = new JLabel("finish");
					label.setSize(80, 30);
					label.setLocation(100, 100);
					label.setForeground(Color.RED);
					contentPane.add(label);
					contentPane.repaint();
					return; // 스레드 종료
					
				}
			}
			catch(InterruptedException e) {return;}
		}
	}

}
