import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//±ôºıÀÌ´Â ·¹ÀÌºí »ı¼º
		FlickeringLabel flLabel = new FlickeringLabel("±ôºıÀÌ", 500);
		
		//±ôºıÀÌÁö ¾Ê´Â ·¹ÀÌºí »ı¼º
		JLabel label = new JLabel("¾È±ôºı");
		
		// ±ôºıÀÌ´Â ·¹ÀÌºí »ı¼º
		FlickeringLabel flLabel2 = new FlickeringLabel("¿©±âµµ ±ô¹Ú", 300);
		
		c.add(flLabel);
		c.add(label);
		c.add(flLabel2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new FlickeringLabelEx();
	}

}
