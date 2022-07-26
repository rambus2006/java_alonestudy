/* 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 규칙에 따라 상금을 받는게임
	1.같은 눈이 3개가 나오면 10000+같은 눈*1000원의 상금을 받게 된다.
	2.같은 눈이 2개만 나오는 경우에는 1000원+같은 눈*100원의 상금을 받는다
	3.모두 다른 눈이 나오는 경우에는 (그 중에 가장 큰 눈)*100원의 상금을 받게 된다. 
	-->상금을 구해야 한다.
	-->조건 : 1. 같은 눈이 3개 일 때
		2.같은 눈이 2개 일 때
		3. 모두 다른 눈이 나올 떄 
	-->기준을 SpotOne으로 잡고 비교를 한다면
*/
import java.util.Scanner;
public class Main2480_DiceThree{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);

		//주사위 눈 변수
		int SpotOne=scan.nextInt();
		int SpotTwo=scan.nextInt();
		int SpotThree=scan.nextInt();
		//상금변수
		int PrizeMoney;

		if(SpotOne==SpotTwo){
			if(SpotTwo==SpotThree) PrizeMoney=10000+SpotTwo*1000;
			else PrizeMoney=1000+SpotTwo*100;
		}
		else {
			//SpotOne이 가장 클 때 
			if(SpotOne>SpotTwo){
				if(SpotOne>SpotThree) PrizeMoney=SpotOne*100;
				else PrizeMoney=SpotThree*100;
			}
			else{
				if(SpotTwo>SpotThree) PrizeMoney=SpotTwo*100;
				else PrizeMoney=SpotThree*100;
			}
		}
		System.out.print("상금 : " + PrizeMoney);
	}
}