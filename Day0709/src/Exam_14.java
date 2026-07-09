import java.util.Scanner;
public class Exam_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 입력");
		int score = scn.nextInt();
		
		if(score>=80) {
			System.out.println("Pass");
		}
		System.out.println("Program End");
		
		
	}
}
