/* 1�������� 6������ ���� ���� 3���� �ֻ����� ������ ��Ģ�� ���� ����� �޴°���
	1.���� ���� 3���� ������ 10000+���� ��*1000���� ����� �ް� �ȴ�.
	2.���� ���� 2���� ������ ��쿡�� 1000��+���� ��*100���� ����� �޴´�
	3.��� �ٸ� ���� ������ ��쿡�� (�� �߿� ���� ū ��)*100���� ����� �ް� �ȴ�. 
	-->����� ���ؾ� �Ѵ�.
	-->���� : 1. ���� ���� 3�� �� ��
		2.���� ���� 2�� �� ��
		3. ��� �ٸ� ���� ���� �� 
	-->������ SpotOne���� ��� �񱳸� �Ѵٸ�
*/
import java.util.Scanner;
public class Main2480_DiceThree{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);

		//�ֻ��� �� ����
		int SpotOne=scan.nextInt();
		int SpotTwo=scan.nextInt();
		int SpotThree=scan.nextInt();
		//��ݺ���
		int PrizeMoney;

		if(SpotOne==SpotTwo){
			if(SpotTwo==SpotThree) PrizeMoney=10000+SpotTwo*1000;
			else PrizeMoney=1000+SpotTwo*100;
		}
		else {
			//SpotOne�� ���� Ŭ �� 
			if(SpotOne>SpotTwo){
				if(SpotOne>SpotThree) PrizeMoney=SpotOne*100;
				else PrizeMoney=SpotThree*100;
			}
			else{
				if(SpotTwo>SpotThree) PrizeMoney=SpotTwo*100;
				else PrizeMoney=SpotThree*100;
			}
		}
		System.out.print("��� : " + PrizeMoney);
	}
}