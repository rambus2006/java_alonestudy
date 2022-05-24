import java.util.Scanner;
public class num_2753{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		import java.util.Scanner;
		//이해가 안가서 인터넷 봄 : https://st-lab.tistory.com/23
		if(year%400==0){
			if(year%100==0)System.out.println("1");
			else if(year%100) System.out.printl("0");
			else System.out.println("0");
		}
		else System.out.println("0");
	}
}