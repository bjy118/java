import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
		System.out.print("가위바위보를 하시오:");
		int score = scanner.nextInt();
		
		System.out.print("my, 가위 1, 바위 2, 보3");
		int my = scanner.nextInt();
		
		System.out.print("you, 가위1, 바위2, 보3");
		int you = scanner.nextInt();
		
		if(my == 1) {
			System.out.println("가위");
		} else if(my == 2) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
		
		if(you == 1) {
			System.out.println("가위");
		} else if(you == 2) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
		System.out.print("결과");
		}
	}

}
