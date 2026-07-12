import java.util.Scanner;
public class Exam_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("점수입력");
		int score = scn.nextInt();
		
		// 조건 연산자를 이용한 경우
		String pass = (score>=80)?"합격":"불합격";
		System.out.println(score + " : " + pass);
		
		//if()
		String pass2="";
		if(score>=80) {
			pass2="합격";
		}else {
			pass2="불합격";
		}
		System.out.println(score + " : " + pass2);

	}

}