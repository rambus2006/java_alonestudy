import java.util.Scanner;
public class num9498{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
		switch(score/10){
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7;
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
			default:
				System.out.println("F");
		}
	}
}