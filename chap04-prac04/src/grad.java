import java.util.Scanner;

class grade {
	private int math;
	private int science;
	private int english;
	
	public grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average(){
		return (math+science+english)/3;
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("����, ���� ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		grade me = new grade(math, science, english);
		System.out.println("����� " + me.average()); // average()�� ��� ����Ͽ� ����
		scanner.close();
	}
		
}
