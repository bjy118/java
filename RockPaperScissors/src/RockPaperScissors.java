import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
		System.out.print("������������ �Ͻÿ�:");
		int score = scanner.nextInt();
		
		System.out.print("my, ���� 1, ���� 2, ��3");
		int my = scanner.nextInt();
		
		System.out.print("you, ����1, ����2, ��3");
		int you = scanner.nextInt();
		
		if(my == 1) {
			System.out.println("����");
		} else if(my == 2) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}
		
		if(you == 1) {
			System.out.println("����");
		} else if(you == 2) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}
		System.out.print("���");
		}
	}

}
