
import java.util.Scanner;
public class Exam_15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 입력");
		int value = scn.nextInt();
		
		String str="";
		if(value>=80) {
			str="Pass";
		}else {
			str="No";
		}
		System.out.println(value + "=" + str);

	}

}
