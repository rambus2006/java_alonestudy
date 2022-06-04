import java.util.Scanner;
public class num_2753_2{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		int year = scan.nextInt();
		System.out.print((year%4==0)?((year%400==0)?"1":(year%100==0)?"0":"1"):"0");
	}
}