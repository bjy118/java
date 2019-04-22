import javax.swing.*;
import java.awt.*;


public class CheckBoxEx extends JFrame{
	public CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 이미지 체크박스에 사용할 2개의 이미지 객체 생성
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg"); // 해체 상태 이미지
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherryIcon.jpg");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
