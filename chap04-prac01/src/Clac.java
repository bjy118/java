import java.util.Scanner;

public class Clac {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char operator = scanner.next().charAt(0); // �����ڸ� ���ڷ� ��ȯ
		switch (operator) {
			case '+':
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
				break;
			case '-':
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(sub.calculate());
				break;
			case '*':
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(mul.calculate());
				break;
			case '/':
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(div.calculate());
				break;
			default:
				System.out.println("�߸��� �������Դϴ�.");
		}
		
		scanner.close();
	}
}

