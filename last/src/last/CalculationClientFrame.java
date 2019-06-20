package last;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculationClientFrame extends JFrame{
	private JTextField startTf = new JTextField(10);
	private JButton calcBtn = new JButton("입력");
	private Socket socket = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;
	
	
	public CalculationClientFrame() {
		super("계산 클라이언트");
		setSize(410, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료 버튼(X)을 클릭하면 프로그램 종료
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(startTf);

		c.add(calcBtn);
		
		setVisible(true);
		
		setupConnection();
		
		calcBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String startText = startTf.getText().trim();
					String operatorText = startTf.getText().trim();
					String endText = startTf.getText().trim();
					
					if (startText.length() == 0 || operatorText.length() == 0 || endText.length() == 0) 
						
				return; // 입력되지 않았음
					
					out.write(startText+"\n");
					out.write(operatorText+"\n");
					out.write(endText+"\n");
					out.flush();
					
					String result = in.readLine();
					startTf.setText(result);
				} catch (IOException e) {
					System.out.println("클라이언트 : 서버로부터 연결 종료");
					return;
					// e.printStackTrace();
				}
			}
		});
		
	}
	
	public void setupConnection() {
		try {
			socket = new Socket("localhost", 9998);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new CalculationClientFrame();
	}

}
