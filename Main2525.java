/*
����, KOI ������ �ΰ����� ���� �ո鿡�� ����ڿ��� ������������ �丮�� ������ �ð��� �˷� �ִ� ������ �ð谡 �ִ�. 

�����������̸� �����ϴ� �ð��� ���챸�̸� �ϴ� �� �ʿ��� �ð��� �д����� �־����� ��, ���챸�̰� ������ �ð��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
//�����丮�� ������ �ð�
import java.util.Scanner;
public class Main2525{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
	
		//���� �ð� �Է�
		int H=scan.nextInt();
		int M=scan.nextInt();
		//�丮�ϴµ� �ʿ��� �ð�
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