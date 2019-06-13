import java.awt.BorderLayout;
import java.awt.Container;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileReceiverFrame extends JFrame{
	private JTextArea log = new JTextArea();
	private JLabel imJLabel = new JLabel();
	
	public FileReceiverFrame() {
		super("���� �޴� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new JScrollPane(log), BorderLayout.NORTH);
		c.add(imJLabel, BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
		
		startService();
	
	}
	private void startService() {
		ServerThread server = new ServerThread();
		server.start();
	}
	
	private void drawImage(String file) {
		ImageIcon icon = new ImageIcon(file);
		imJLabel.setIcon(icon);
		this.pack();
	}
	
	private class ServerThread extends Thread {
		
		private int number;

		@Override
		public void run() {
			BufferedInputStream fin = null;
			BufferedOutputStream fout = null;
			ServerSocket listener = null;
			Socket socket = null;
			String saveFileName = null;
			try {
				listener = new ServerSocket(9999);
			} catch (IOException e1) {
				e1.printStackTrace();
			} // ���� ���� ����
			
			while(true){
				try {
					socket = listener.accept(); // waiting client connection
					log.setText("�����\n");
					fin = new BufferedInputStream(socket.getInputStream()); // Ŭ���̾�Ʈ�κ����� �Է� ��Ʈ��
					int cmd;
					String fileName = null;
					long length=0;
					
					cmd = fin.read();
					if (cmd == Command.FILE_NAME) { // FILE_NAME ���� ����
						int  nameSize = receiveInt(fin); // ���� �̸� ũ��
						log.append("���۹��� ���� �̸� ���� :" + nameSize +"\n");
						byte fname[] = new byte[nameSize];
						fin.read(fname);
						fileName = new String(fname);
						log.append("���۹��� ���� �̸�:" + fileName + "/n");
						saveFileName = "copy_" + fileName;
						log.append("������ ���� �̸�:" + saveFileName + "\n");
						fout = new BufferedOutputStream(new FileOutputStream(saveFileName));
					} else {
						log.append("���� ���� ����" + cmd + "\n");
						socket.close(); // Ŭ���̾�Ʈ�� ��ſ� ���� �ݱ�
						listener.close(); // ���� ���� �ݱ�
						return;
					}
					cmd = fin.read();
					if (cmd == Command.SEND_BEGIN) {
						int  numberToRead;
						while (length > 0) {
							byte b[] = new byte[2048];
							if (length < b.length)
								numberToRead = (int)length;
							else
								numberToRead = b.length;
							int numRead = fin.read(b, 0, numberToRead);
							if (number <= 0) {
								if (length > 0) { // �� �̻� ���� ���� ���µ� ���� ���� ũ�⸸ŭ �� ���� ���
									log.append("���� ������ �߻��߽��ϴ�. ���� ����Ʈ: " + numRead + "���� ����Ʈ:" + length + "\n");
									break;
								}
							} else {
								log.append("."); // ���� ���� ǥ��
								fout.write(b, 0, numRead);
								length -= numRead;
							}
						}
						cmd = fin.read();
						if (cmd == Command.SEND_END) { // SEND_END ����
							log.append("\n ���� ���� ����. ���� j���� ����Ǿ����ϴ�.\n");
						} else {
							log.append("\n ���� ���� ����" + cmd + "\n");
						}
						if (fout != null)
							fout.close();
						socket.close(); // Ŭ���̾�Ʈ�� ��ſ� ���� �ݱ�
						drawImage(saveFileName);
					} 
				} catch (IOException e) {
					e.printStackTrace();
					log.append("���� ���� �� ������ �߻��߽��ϴ�.");
				}
			} // end of while
		}
	}
	
	private int receiveInt(BufferedInputStream fin) throws IOException {
		int value;
		value = fin.read();
		value |= fin.read() << 8;
		value |= fin.read() << 16;
		value |= fin.read() << 24;
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new FileReceiverFrame();
	}

}