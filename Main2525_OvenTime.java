import java.util.Scanner;
public class Main2525_OvenTime{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		//���� �ð�
		//��
		int H= scan.nextInt();
		//��
		int M= scan.nextInt();
		//�丮�ϴµ� �ʿ��� �ð�
		int CookingTime=scan.nextInt();
	
		//�丮�ϴµ� �ɸ��� �ð�(�ʿ��� �ð�/60+1)
		H+=CookingTime/60;
		//�丮�ϴµ� �ɸ��� ��(�ʿ��� �ð�%60+1)
		M+=CookingTime%60;

		//���� 60 �Ѿ�� (�ð�+1)�� (60-��)
		if(M >= 60){
			H +=1;
			M-=60;
		}
		//�ð��� 24�� �Ѿ�� (�ð�-24) ����
		if(H >= 24) H-= 24;
		
		System.out.println(H+" "+M);
		
	}
}