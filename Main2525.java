/*
또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다. 

훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
*/
//훈제요리가 끝나는 시각
import java.util.Scanner;
public class Main2525{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
	
		//현재 시간 입력
		int H=scan.nextInt();
		int M=scan.nextInt();
		//요리하는데 필요한 시각
		int CookingTime=scan.nextInt();
		
		int Time=H+M;
		if(Time>=60){
			H+=CookingTime/60;
			CookingTime %=60;
			if(H>=24){
				 H-=24;
				System.out.println(H+" "+CookingTime);
			}
			else 
				System.out.println(H+" "+CookingTime);
		}	
		
	}
}