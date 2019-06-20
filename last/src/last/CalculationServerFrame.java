package last;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CalculationServerFrame extends JFrame{
	private JTextArea log = new JTextArea();
	public CalculationServerFrame() {
		super("멀티스레드 통신 서버");
		setSize(250, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료 버튼 (X)을 클릭하면 프로그램 종료
		Container c = getContentPane();
		c.add(new JLabel("통신 서버 입니다"));
		c.add(new JScrollPane(log), BorderLayout.CENTER);
		setVisible(true);
		
		new ServerThread().start(); // 서비스 시작
	}
	
	class ServerThread extends Thread {
		@Override
		public void run() {
			ServerSocket listener = null;
			Socket socket = null;
			try {
				listener = new ServerSocket(9998);
				while(true) {
					socket = listener.accept();
					log.append("클라이언트 연결됨\n");
					new  ServiceThread(socket).start();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if (listener != null) 
						listener.close();
				if(socket != null)
					socket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	class ServiceThread extends Thread {
		private Socket socket = null;
		private BufferedReader in = null;
		private BufferedWriter out = null;
		public ServiceThread(Socket socket) { // 클라이언트와 통신할 소켓을 전달받음
				this.socket = socket;
				try {
					in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
					
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		public void run() {
			while(true) {
				try{
					
					String first = in.readLine(); // 첫 수
					String operator = in.readLine(); // 첫수
					String second = in.readLine(); // 둚째 수
					int a = Integer.parseInt(first); // 정수로 변환
					int b = Integer.parseInt(second); // 정수로 변환
					
					
				} catch (IOException e) {
					log.append("연결 종료\n");
					System.out.println("연결 종료");
					return; // 스레드 종료
					//e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new CalculationServerFrame();
	}

}
