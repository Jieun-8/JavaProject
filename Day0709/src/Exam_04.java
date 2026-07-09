//연산자(++,--)
public class Exam_04 {
	public static void main(String[] args) {
		int a=5;
		int b=0;
		
		a++;
		++a;
		System.out.println("a=" + a);//7
		
		a = 5;
		b = a++; //대입후 연산
		System.out.printf("a=%d b=%d\n", a,b);
		
		

	}

}
