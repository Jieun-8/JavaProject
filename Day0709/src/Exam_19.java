import java.util.Scanner;
public class Exam_19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수 입력");
		int val = scn.nextInt();
		
		String str="";
		if(val>=80) {
			if(val<=90) {
				//System.out.println("80~90 Pass")
				str = "80~90 pass";
			}else {
				//System.out.println("80이상 90 초과 No");
				str = "80이상 90 초과 No";
			}
		}else{
			//System.out.println("80미만 No");
			str="80미만 No";
		}
		System.out.println(val + "점수의 결과는"+ str);

	}

}
