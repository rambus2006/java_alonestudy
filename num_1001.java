import java.util.Scanner;
public class num_1001{
	public static void main(String args[]){

		//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
		Scanner scan=new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();

		System.out.print(A-B);
	}
}